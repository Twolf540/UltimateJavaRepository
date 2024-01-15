package Unit01.Xtras;

public class RandomStats {
    public static void main(String[] args) {
        // Declares five doubles labled value(1-5), and sets their value equal to five different random numbers
        double value1 = (Math.random() * 1);
        double value2 = (Math.random() * 1);
        double value3 = (Math.random() * 1);
        double value4 = (Math.random() * 1);
        double value5 = (Math.random() * 1);
        //finds the average of the five values, and sets the double averageValue to the average
        double averageValue = ((value1 + value2 + value3 + value4 + value5) / 5);
        //finds the lowest values between the five doubles value(1-5)
        double minimum1 = Math.min(value1, value2);
        double minimum2 = Math.min(value2, value3);
        double minimum3 = Math.min(value3, value4);
        double minimum4 = Math.min(value4, value5);
        double minimum5 = Math.min(value5, value1);
        //lowers the possible lowest values down to two
        double minimum6 = Math.min(minimum1, minimum2);
        double minimum7 = Math.min(minimum3, minimum4);
        double minimum8 = Math.min(minimum7, minimum5);
        //finds the lowest value for value(1-5)
        double minimumEnd = Math.min(minimum6,minimum8);
        //finds the highest values between the five doubles value(1-5)
        double maximum1 = Math.max(value1, value2);
        double maximum2 = Math.max(value2, value3);
        double maximum3 = Math.max(value3, value4);
        double maximum4 = Math.max(value4, value5);
        double maximum5 = Math.max(value5, value1);
        //lowers the possible highestvalues values down to two
        double maximum6 = Math.max(maximum1, maximum2);
        double maximum7 = Math.max(maximum3, maximum4);
        double maximum8 = Math.max(maximum7, maximum5);
        //finds the highest value for value(1-5)
        double maximumEnd = Math.max(maximum6,maximum8);
        //Prints the five values, their average, and the maximum and minimum values in the set
        System.out.print("The five values are: ");
        System.out.print(value1);
        System.out.print(", " + value2);
        System.out.print(", " + value3);
        System.out.print(", " + value4);
        System.out.println(", " + value5);
        System.out.print("The average of these values is: ");
        System.out.println(averageValue);
        System.out.print("Their minimum and maximum values are: ");
        System.out.print(minimumEnd + ", ");
        System.out.print(maximumEnd);





    }
}
