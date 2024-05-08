package SideProjects.APPractice;

import java.util.Scanner;

public class Calculator {
    private double num1;
    private double num2;
    private String operation;
    private double finValue;

    public Calculator(double num1, String operation, double num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
    }

    public void doOperation() {
        if (this.operation.equals("+")) {
            finValue = (num1 + num2);
        }
        if (this.operation.equals("-")) {
            finValue = (num1 - num2);
        }
        if (this.operation.equals("x")) {
            finValue = (num1 * num2);
        }
        if (this.operation.equals("/")) {
            finValue = (num1 / num2);
        }
    }

    public double getValue() {
        return finValue;
    }
    public double getFirstNum() {
        return num1;
    }
    public double getSecondNum() {
        return num2;
    }
    public String getOperation() {
        return operation;
    }
    public String toString() {
        return "Calculator with numbers: " + num1 + " and " + num2 + " and operation " + operation + " and finValue " + finValue;
    }

   public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please input your first number");
        double in1 = Double.parseDouble(s.nextLine());
        System.out.println("Please input your second number");
        double in2 = Double.parseDouble(s.nextLine());
        System.out.println("Please input the operation you would like to make: +, -, x, /");
        String op1 = s.next();
        s.close();
        Calculator calc1 = new Calculator(in1, op1, in2);
        calc1.doOperation();
        System.out.println(calc1.getFirstNum() + " " + calc1.getOperation() + " " + calc1.getSecondNum() + " = " + calc1.getValue());
    }
}