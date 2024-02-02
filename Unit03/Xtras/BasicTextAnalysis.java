package Unit03.Xtras;
import java.util.Scanner;
public class BasicTextAnalysis {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your text");
        String anTxt = new String(s.nextLine());
        s.close();

        int firstSpace = anTxt.indexOf(" ");
        int firstPeriod = anTxt.indexOf(".");

        int numOfChar = anTxt.length();
        String firstWord = anTxt.substring(0, firstSpace);
        String firstSentence = anTxt.substring(0, firstPeriod);

        System.out.println("Your text is " + numOfChar + " characters long.");
        System.out.println("The first word is: " + firstWord);
        System.out.println("The first sentence is: " + firstSentence);
    }
}

// Enter your text interactively
// javac Unit03/Xtras/BasicTextAnalysis.java
// java Unit03.Xtras.BasicTextAnalysis

// Use a file as input
// javac Unit03/Xtras/BasicTextAnalysis.java
// cat Unit03/Xtras/gettysburg-address.txt | java Unit03.Xtras.BasicTextAnalysis
