## 5.6 - Writing Methods
### 5_6 P1
```
public class Dog{
    private String breed;
    // rest not shown
}
```
if you used the dog class for a dogCompetition class like this:
```
public class DogCompetition{
    public boolean doBreedsMatch(dog1, Dog dog2){
        return dog1.breed == dog2.breed;
    }
}
```
This would not work. You would need to use an accessor method, like 'getBreed':
```
public class DogCompetition{
    public boolean doBreedsMatch(dog1, Dog dog2){
        return dog1.getBreed() == dog2.getBreed();
    }
}
```
You could also check it inside of the Dog class:
```
public class Dog{
    // rest shown above
    public boolean isSameBreed(Dog otherDog){
        return breed.equals(otherdog.breed);
    }
}
```
Since you are doing the check inside of the class, it can use the private variables.
### 5_6 P2
Method Headr:
+ Access Level - public or private
+ Ownership - set by the use or omission of static
+ Return type - the data type that will be returned by the method
+ Identifier - the name of the method
+ Parameter list - list of information used by a method to complete its task
```
public class Sample{
    private String text;
    private Sample(String t){
        text = t;
    }
    public boolean method1(int x, String y){
        return ((text.length() + y.length()) > x);
    }
}
```
You can use methods inside of other methods
### 5_6 P3
Formal Parameter - Paremeter used in the method declaration
Actual Parameter - Parameter used in method call
```
public class LogicErrors{
    public static void incrementParam(int a){
        a++;
        System.out.println(a);
    }
    public static void main(String[] args){
        int x = 33;
        incrementParam(x);
        System.out.println(x);
    }
}
```
This will not change x. It will create a variable 'a', set its value to x, and then add 1.
```
public class Mutable{
    private int value;
    public Mutable(int start){
        value = start;
    }
    public void incrementValue(){
        value++;
    }
    public int getValue(){
        return value;
    }
}
```
```
public static void incrementParam(Mutable a){
    a.incrementValue();
}
public static void main(String[] args){
    Mutable x = new Mutable(33);
    incrementParam(x);
    System.out.println(x.getValue);
}
```
This will change x. a references x, making them the same object just with two names. This means any changes to a will affect x.
## 5.7 - Static Variables and Methods
### 5_7 P1
Static methods/variables:
+ Methods cannot change or use instance variables or non-static methods
+ Variables cannot be used in non static methods
```
public class Assignment {
    private static int nextClassworkID = 1;
    private static int nextHomeworkID = 1;
    private String name;
    private int pointValue;

    public double getGrade(int score){
        return (double)(score / pointValue);
    }

    public static int numAssignments(){
        return ((nextClassworkID + nextHomeworkID) - 2); 
    }
}
```
Constructors can access all variables
### 5_7 P2
```
public class Assignment {
    private static int nextClassworkID = 1;
    private static int nextHomeworkID = 1;
    private String name;
    private int pointValue;
    private String type;

    public Assignment(int pv, String t){
        pointValue = pv;
        type = t;
        if(type == "Classwork"){
            name = type + " " + nextClassworkID;
            nextClassworkID++;
        }
        if(type == "Homework"){
            name = type + " " + nextHomeworkID;
            nextHomeworkID++;
        }
    }
    public double getGrade(int score){
        return (double)(score / pointValue);
    }

    public static int numAssignments(){
        return ((nextClassworkID + nextHomeworkID) - 2); 
    }
}
```
Since constructors can access both static and non static variables, you change instance variables while also incrmenting the classwork/homework IDs with each assignment created
## 5.8 - Scope and Access
### 5_8 P1
local variables are ONLY accesible where they are declared

if you redeclare an instance variable like this
```
public class Bowler{
    private int pins;
    public Bowler{
        int pins = 3;
    }
}
```
it will create a local variable with the same name as the instance variable. Any changes made to the local variable will not affect the instance variable

Parameters are also considered local variables. They can only be accesed in the method they are declared in.

Method Decomposition - breaking a large problem into smaller parts
### 5_8 P2
Common Errors:
+ Trying to access parameters in a different method
+ Trying to use local variables in a different method without declaring them again
+ Declaring a local variable as private or public
+ Redeclaring an instance variable in a method, creating an instance variable thot won't affect the instance variable
## 5.9 - `this` Keyword
### 5_9 P1
'this' is used to improve readability of code

It DOES NOT affect the code

Ex:
```
public class Dog{
    private String name;
    private String breed;
    public Dog(String n, String b){
        name = n;
        breed = b;
    }
    public String getBreed(){
        return breed;
    }
    public boolean breedsMatch(Dog dog2){
        return this.breed.equals(dog2.breed)
    }
}
```
```
public class Dogs{
    public boolean doBreedsMatch(Dog dog2){
        return this.getBreed().equals(dog2.getBreed())
    }
}
```
'this' simply is a stand-in for the object calling the method. i.e., if dog1 calls breedsMatch, 'this' will stand in for dog1

'this' could also be used in constructors in front of instance variables. It can either make the code more readable or allow you to use parameters with the smae name as instance variables.

Ex:
```
public class Dog{
    private String name;
    private String breed;
    public Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }
}
```
this is the one of the few times 'this' will hava an effect on the code

'this' can be used in a method call inside of a method. Ex: using 'this' in an awardPoints call inside of an updateScore call by a Dog object
## 5.10 - Ethical and Social Implications of Computing Systems
### 5_10 P1
Golden Rule: Do unto others as you would have them do unto you
