package SideProjects.APPractice;

public class NewMaxMinRunner {
    public static void main(String[] args) {
        int num1 = ((int)((Math.random()*10)+1));
        int num2 = ((int)((Math.random()*10)+1));
        int num3 = ((int)((Math.random()*10)+1));
        int num4 = ((int)((Math.random()*10)+1));
        int num5 = ((int)((Math.random()*10)+1));
        int [] arr = {num1, num2, num3, num4, num5};
        System.out.println("Your random values are " + num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5);
        System.out.println("Your max value is " + NewMaxMin.findMax(arr));
        System.out.println("Your min value is " + NewMaxMin.findMin(arr));
    }
}
