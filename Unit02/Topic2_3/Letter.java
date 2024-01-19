package Unit02.Topic2_3;

public class Letter {
    public void writeLetter() {
        greeting();
        specialMessage();
        specialMessage();
        closing();
    }

    public void greeting() {
        System.out.println("Hi, friend!");
    }

    public void specialMessage() {
        System.out.println("Computer science is awesome!");   
    }

    public void closing() {
        System.out.println("See you soon!");
    }

    public static void main(String[] args) {
        Letter friendLetter = new Letter();
        friendLetter.writeLetter();
    }
}