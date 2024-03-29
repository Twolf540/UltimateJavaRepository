package ProgrammingProjects.TextSimilarity;

import java.util.Locale;
import java.util.Scanner;
import org.apache.commons.text.similarity.FuzzyScore;
import org.apache.commons.text.similarity.LevenshteinDistance;

public class GettingStarted {
    public static void main(String[] args) {
        // to create a new FuzzyScore object you need to pass in a Locale object.
        // You can get a Locale object with
        // Locale.getDefault()
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your first word:");
        String firstWord = scan.next();
        System.out.println("Please enter your second word:");
        String secondWord = scan.next();
        FuzzyScore f = new FuzzyScore(Locale.getDefault());
        LevenshteinDistance l = new LevenshteinDistance();
        System.out.println("The fuzzy score between '" + firstWord + "' and '"+ secondWord + "' is: " + f.fuzzyScore(firstWord, secondWord));
        System.out.println("The Levenshtein Distance between '" + firstWord + "' and '"+ secondWord + "' is: " + l.apply(firstWord, secondWord));
    }
}
