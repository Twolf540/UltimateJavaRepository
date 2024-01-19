package Unit02.Topic2_3;

public class Something {
    public static void doSomething() {
        System.out.println("Something has happened");
    }

    public static void main(String[] args) {
        doSomething();
        // NOT VALID:
        // String output = doSomething();
        // System.out.println(doSomething());
    }
}
