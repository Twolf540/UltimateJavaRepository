package Unit03.Xtras;
import java.util.Scanner;
public class DiscordTagGenerator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("What would you like your username to be?");
        String username = s.nextLine();

        s.close();

        int tag = (int) (Math.random()*10000);

        System.out.println("Your username and tag is " + username + tag);
    }
}
// javac Unit03\Xtras\DiscordTagGenerator.java
// java Unit03.Xtras.DiscordTagGenerator