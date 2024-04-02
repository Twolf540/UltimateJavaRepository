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
        String[] allFonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for(int x = 0; x < allFonts.length; x++){
            System.out.println(allFonts[x]);
        }
        System.out.println("Choose a font: ");
        String font = scan.next();
        double fuzzyS1 = 0;
        double fuzzyS2 = 0;
        double fuzzyS3 = 0;
        String fuzzyN1 = "";
        String fuzzyN2 = "";
        String fuzzyN3 = "";
        int firstIndex = 0;
        int secondIndex = 0;
        int thirdIndex = 0;
        for(int i = 0; i < allFonts.length; i++){
            if(f.fuzzyScore(font, allFonts[i]) > fuzzyS1){
                fuzzyS1 = f.fuzzyScore(font, allFonts[i]);
                firstIndex = i;
                fuzzyN1 = allFonts[i];
            }
            if(f.fuzzyScore(font, allFonts[i]) > fuzzyS2
                && !allFonts[i].equals(fuzzyN1)){
                fuzzyS2 = f.fuzzyScore(font, allFonts[i]);
                secondIndex = i;
                fuzzyN2 = allFonts[i];
            }
            if(f.fuzzyScore(font, allFonts[i]) > fuzzyS3
                && !allFonts[i].equals(fuzzyN1)
                && !allFonts[i].equals(fuzzyN2)){
                fuzzyS3 = f.fuzzyScore(font, allFonts[i]);
                thirdIndex = i;
                fuzzyN3 = allFonts[i];
            }
        }
       
        System.out.println("Top 3 Matches: \n" + fuzzyN1 + " (index " + firstIndex + ")\n" + fuzzyN2 + " (index " + secondIndex + ")\n" + fuzzyN3 + " (index " + secondIndex + ")");
    }

}