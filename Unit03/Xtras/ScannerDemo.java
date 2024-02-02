package Unit03.Xtras;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        // Using command line arguments
        // String name = args[0];
        // double num1 = Double.parseDouble(args[1]);
        // double num2 = Double.parseDouble(args[2]);

        // Using Scanner
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter your name");
        String name = s.nextLine();

        System.out.println("Please enter first number");
        double num1 = s.nextDouble();

        System.out.println("Please enter second number");
        double num2 = s.nextDouble();

        s.close();

        System.out.println("Hello " + name);
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

    }
}
// Running the program interactively
// javac Unit03/Xtras/ScannerDemo.java
// java Unit03.Xtras.ScannerDemo

// Running the program with piped input from command line
// echo "Mr Scislowski\n5\n3" | java Unit03.Xtras.ScannerDemo

// Running the program with piped input from a file
// cat Unit03/Xtras/calculator_input.txt | java Unit03.Xtras.ScannerDemo
