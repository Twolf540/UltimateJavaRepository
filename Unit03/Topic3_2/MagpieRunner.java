package Unit03.Topic3_2;
import java.util.Scanner;
public class MagpieRunner {
    public static void main(String[] args) {
        Magpie maggie = new Magpie();

        System.out.println(maggie.getGreeting());
        Scanner in = new Scanner (System.in);
        String statement = in.nextLine();

        while (!statement.equals("Bye")){
            System.out.println(maggie.getResponse(""));
            statement = in.nextLine();
        }
        
        while (statement.equals("Bye")){
            System.out.println(maggie.getResponse2("Bye"));
            statement = in.nextLine();
        }
        }
    }
