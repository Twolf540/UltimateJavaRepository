package ProgrammingProjects.TextSimilarity;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import org.apache.commons.text.similarity.FuzzyScore;
import org.apache.commons.text.similarity.LevenshteinDistance;

public class UsingDictionary {

    public static String[] getEnglishWords() {
        ArrayList<String> words = new ArrayList<String>();

        try (BufferedReader br = new BufferedReader(new FileReader("ProgrammingProjects/TextSimilarity/words.txt"))) {
            String curLine;
            while ((curLine = br.readLine()) != null) {
                words.add(curLine);
            }
        } catch (IOException e) {
            System.out.println("Exception occurred");
            System.err.println(e);
        }
        return words.toArray(new String[0]);
    }

    public static void main(String[] args) {
        // Your code here
        Scanner scan = new Scanner(System.in);
        FuzzyScore f = new FuzzyScore(Locale.getDefault());
        LevenshteinDistance l = new LevenshteinDistance();
        System.out.println("Please enter your word:");
        String word = scan.next();
        String[] allWords = getEnglishWords();
        int fuzzyIndex = 0;
        int levenshteinIndex = allWords.length - 1;
        double fuzzyS = 0;
        double levenshteinS = l.apply(word, allWords[0]) + 1;
        for(int i = 0; i < allWords.length; i++){
            if(f.fuzzyScore(word, allWords[i]) > fuzzyS){
                fuzzyS = f.fuzzyScore(word, allWords[i]);
                fuzzyIndex = i;
            }
            if(l.apply(word, allWords[i]) < levenshteinS){
                levenshteinS = l.apply(word, allWords[i]);
                levenshteinIndex = i;
            }
        }
        System.out.println("Closest word using fuzzy algorithm was: " + allWords[fuzzyIndex]);
        System.out.println("Closest word using Levenshtein algorithm was: " + allWords[levenshteinIndex]);
    }
}
