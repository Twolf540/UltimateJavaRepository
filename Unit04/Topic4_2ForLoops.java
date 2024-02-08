package Unit04;

public class Topic4_2ForLoops {
    public static void main(String[] args) {
    double principal = 200.0;
    for (int years = 1; years <= 50; years++){
        principal *= 1.1;
    }
    
    System.out.println("You have $" + principal + " dollars");
    }
}

// javac Unit04\Topic4_2ForLoops.java; java Unit04.Topic4_2ForLoops