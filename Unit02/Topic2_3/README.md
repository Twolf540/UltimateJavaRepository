# 2.3 Calling a Void Method
## 2_3 P1
Methods define the behaviors of all objects in a class
+ They consist of a set of instructions for executing the behavior

Methods exist inside of a class, and can use the output of other methods in their output.
```
public class Dog{
    public void Bark() {
        System.out.print("Woof!");
    }

    public void speak() {
        Bark();
        System.out.println("Woof!");
    }
}
```
Writing a letter:
```
public class letter {
    public void writeletter() {
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
        Letter friendletter = new Letter();
        friendLetter.writeLetter();
    }
}
```

## 2_3 P2
When defining a method or class, you have to brainstorm qualities that it might be affected by.

For a lamp:
+ Is the lamp on?
+ What color is the base of the lamp?
+ What type of bulb is the lamp using?

Methods can be used to perform actions after an object is modified.

Example: When turning on a lamp, a method might set a variable representing the power state of the lamp to true and print text telling the user that the lamp is on.

When you call a null object in a method, it will result in a "NullPointerException", as the program can't change the state of an object without knowing what its current state is.
