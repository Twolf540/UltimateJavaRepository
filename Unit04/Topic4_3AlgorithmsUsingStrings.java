package Unit04;
import java.util.Scanner;
public class Topic4_3AlgorithmsUsingStrings {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       String original = scan.next();
       String reversed = "";
       scan.close();
       for (int i = 0; i < original.length(); i++){
            String single = original.substring(i, i+1);
            reversed = (single + reversed);
       }
       System.out.println(reversed);
    }
}

// javac Unit04\Topic4_3AlgorithmsUsingStrings.java
// java Unit04.Topic4_3AlgorithmsUsingStrings