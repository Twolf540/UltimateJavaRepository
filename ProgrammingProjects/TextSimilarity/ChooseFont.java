package ProgrammingProjects.TextSimilarity;

import java.awt.*;
import java.util.Locale;
import java.util.Scanner;

import org.apache.commons.text.similarity.FuzzyScore;
import org.apache.commons.text.similarity.LevenshteinDistance;

public class ChooseFont {
    public static void main(String[] args) {
        // your code here
        Scanner scan = new Scanner(System.in);
        FuzzyScore f = new FuzzyScore(Locale.getDefault());
        LevenshteinDistance l = new LevenshteinDistance();
        System.out.println("Choose a font: ");
        String font = scan.next();
        String[] allFonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        int firstIndex = 0;
        int secondIndex = 0;
        int thirdIndex = 0;
        double fuzzyS1 = 0;
        double fuzzyS2 = 0;
        double fuzzyS3 = 0;
        double levenshteinS = l.apply(font, allFonts[0]) + 1;
        for(int i = 0; i < allFonts.length; i++){
            if(f.fuzzyScore(font, allFonts[i]) > fuzzyS1){
                fuzzyS1 = f.fuzzyScore(font, allFonts[i]);
                firstIndex = i;
            }
            if(f.fuzzyScore(font, allFonts[i]) > fuzzyS2){
                fuzzyS2 = f.fuzzyScore(font, allFonts[i]);
                secondIndex = i;
            }
            if(f.fuzzyScore(font, allFonts[i]) > fuzzyS3
                && f.fuzzyScore(font, allFonts[i]) != fuzzyS1){
                fuzzyS3 = f.fuzzyScore(font, allFonts[i]);
                thirdIndex = i;
            }
        }
        System.out.println("Top 3 Matches: \n" + allFonts[firstIndex] + "\n" + allFonts[firstIndex] + "\n" + allFonts[thirdIndex]);
    }

}