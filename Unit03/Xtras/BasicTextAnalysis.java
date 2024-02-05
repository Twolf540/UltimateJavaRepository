package Unit03.Xtras;
import java.util.Scanner;
public class BasicTextAnalysis {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your text");
        s.useDelimiter("\\Z");
        String anTxt = new String(s.next());

        int firstSpace = anTxt.indexOf(" ");
        int firstPeriod = anTxt.indexOf(".");

        int numOfChar = anTxt.length();
        System.out.println("about to get the substring up to " + firstSpace);
        String firstWord = anTxt.substring(0, firstSpace);
        String firstSentence = anTxt.substring(0, (firstPeriod + 1));

        System.out.println("Your text is " + numOfChar + " characters long.");
        System.out.println("The first word is: " + firstWord);
        System.out.println("The first sentence is: " + firstSentence);
        s.close();
    }
}

// Enter your text interactively
// javac Unit03/Xtras/BasicTextAnalysis.java
// java Unit03.Xtras.BasicTextAnalysis

// Use a file as input
// javac .\Unit03\Xtras\BasicTextAnalysis.java; cat Unit03/Xtras/gettysburg-address.txt | java Unit03.Xtras.BasicTextAnalysis
