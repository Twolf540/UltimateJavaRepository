package Unit03.Xtras;
import java.util.Scanner;
public class QuadraticSolver {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Please enter the value of a");
        double a = s.nextDouble();
        
        System.out.println("Please enter the value of b");
        double b = s.nextDouble();

        System.out.println("Please enter the value of c");
        double c = s.nextDouble();

        s.close();

        double discriminate = (Math.sqrt(Math.pow(b,2) - (4*a*c)));

        if (discriminate > 0){
            double sol1 = ((-b + discriminate) / (2*a));
            double sol2 = ((-b - discriminate) / (2*a));
            System.out.println("The solutions to '" + a + "x^2 + " + b + "x + " + c + " = 0'" + " are 'x = " + sol1 + "' and 'x = " + sol2 + "'.");
        }
        else{
            System.out.println("The equation '" + a + "x^2 + " + b + "x + " + c + " = 0'" + " has no real solutions");
        }
    }
}
// javac Unit03\Xtras\QuadraticSolver.java
// java Unit03.Xtras.QuadraticSolver