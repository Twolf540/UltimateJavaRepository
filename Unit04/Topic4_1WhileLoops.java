package Unit04;

public class Topic4_1WhileLoops {
    public static void main(String[] args) {
    // finds how long it will take to get x money from a certain principle amount
        double accountBalance = 200.0;
        int years = 0;
        while(accountBalance < 1000){
            accountBalance = (accountBalance*1.1);
            years++;
        }
        System.out.println("It will take " + years + " years for you to have $1000");
        // finds the first 10 multiples of a number
        int multipleValue = 4;
        int multipleNum = 1;

        while(multipleNum <= 10){
            System.out.print((multipleValue*multipleNum) + " ");
            multipleNum++;
    }
    }
}
// javac Unit04\Topic4_1WhileLoops.java; java Unit04.Topic4_1WhileLoops