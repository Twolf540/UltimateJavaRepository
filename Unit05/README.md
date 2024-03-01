# Unit 05 - Writing Classes

## 5.1 - Anatomy of a Class
### 5_1 P1
Class Constructors
```
public Class (filename){

}
```
Variable Constructors
+ Instance Variable
```
private *varType* *name*;
```
+ Constructor
```
public *name*{

}
```
+ Overloaded Constructor
```
public *varType* *name*(*condtions*){

}
```
+ Accessor Methods
```
public *varType* *name*(){

}
```
+ Mutator Methods
```
public void *name*(*conditions*){
    
}
```
### 5_1 P2
private variables can only be accessed inside of their class

public variables can be accessed inside any class

### 5_1 P3
Encapsulation
+ Part of Object Oriented Programming
+ Wrap the data and code into one unit(class)
+ Done by:
    + Writing a class
    + Declaring instance variables as private
    + Providing accessor and mutator methods to the view and modify variables outside of the class

Why make variables private:
+ Restrict access
+ Option to provide validation checks

```
public class Book{
    private String title;
    private String genre;
    private String author;
    private int pages;
}
```
## 5.2 - Constructors
### 5_2 P1
```
public class Book{
    private String title;
    private String genre;
    private String author;
    private int pages;
    
    //default constructor
    public Book(){
        title = "";
        genre = "";
        author = "";
        pages = 0;
    }

    // overloaded constructor
    public Book (String t, String g, String a, int np){
        title = t;
        genre = g;
        author = a;
        pages = np;
    }
}
```
```
public class Snack{
    private String name;
    private int numCalories;

    public Snack{
        name = "";
        numCalories = 0;
    }

    public Snack(String n, int nc){
        name = n;
        numCalories = nc;
    }
}
```
### 5_2 P2
```
public class Sport

    private String name;
    private int numAthletes;

    public Sport(){
        name = "";
        numAthletes = 0;

    public Sport(string n, int numAth){
        name = n;
        numAthletes = numAth;
    }

    public Sport(String n){
        name = n;
        numAthletes = 0;
    }

    public Sport(int numAth){
        name = "";
        numAthletes = numAth;
    }
}
```
If no constructor is created, the class will use default values

Default values:
+ int - 0
+ double - 0.0
+ Strings/others - null
### 5_2 P3
```
public class Cow{
    private String sound;
    private String type;
    private int numMilkings

    public Cow{
        sound = "moo";
        type = "holstein"
        numMilkings = 0;
    }

    public Cow(String s, int nm, String t){
        sound = s;
        type = t;
        numMilkings = nm;
    }
}

public class Car{
    private int day;
    private int month;
    private int year;
    public Car{
        make = "hyundai"
        model = "sonata"
    }
}
```
## 5.3 - Documentation with Comments
### 5_3 P1
Comments are inserted into the code to explain the function of certain segments

Single line comments start with two slashes \/
```
// this is a comment
```

Multi-line comments start and end with and asterick and a slash
```
/*
this is
a comment
    */
```

Documentation comments start with a slash and two astericks, and end with a slash and an asterick
```
/**
* this is
* a
* comment
    */
```
### 5_3 P2
Precondition: something that is already true before a condition can execute. Its value does not matter once the method starts

Postcondition: a value that is checked inside of a method. This must remain the same or change in a specific way for the method to work.

Code:
All but C would work
## 5.4 - Accessor Methods
### 5_4 P1
Accessor methods allow you to access things in a class

Accessor methods do not have parameters

Ex:
```
public class Car{
    private String make;
    private String model;

    public String getMake(){
        return make;
    }
    public String getModel(){
        return make;
    }
}
```
```
public class Pet{
    private String name;
    private String typeOfPet;
    private int age;

    public String getName(){
        return name;
    }
    public String getTypeOfPet(){
        return typeOfPet;
    }
    public String getAge(){
        return age;
    }
}
```
### 5_4 P2
toString returns the instance variables used in an object

```
public String toString{}

System.out.println(object);
```

The println will use toString to compile the objects data as a string and then print it.

Ex:
```
public class Sport{
    private string name;
    private int numAthletes;

    public String toString(){
        return "Sport: " + name + "\nNumber of Athletes: " + numAthletes;
    }
}

public static void main(String[] args) {
    Sport volleyball = new Sport("Volleyball", 12);
    System.out.println(Volleyball)        
}
```

This will print:
```
Sport: Volleyball
Number of Athletes: 12
```
## 5.5 - Mutator Methods
### 5_5 P1
Mutator Methods - Allow you to change the values of instance variables outside of the class they are defined in.

Ex:
```
public class Snack{
    private String name;
    private int calories;

    public Snack(){
        name = "";
        calories = 0;
    }

    public void setName(string n){
        name = n;
    }

    public void setCalories(int c){
        calories = c;
    }
}
```

Mutator Methods:
+ Must be public
+ Usually named set(nameOfVariable)
+ Parameter type must match the instance variable the method modifies

Cow Code:
```
public class Cow {
    // instance variables
        private int numMilkings;
        private String name;
        private String type;
        private String sound;
    // constructor and overloaded constructor
        public Cow(){
            numMilkings = 0;
            name = "bessie";
            type = "holstein";
            sound = "moo";
        }

        public Cow(int nm, String n, String t){
            numMilkings = nm;
            name = n;
            type = t;
        }
    // Accessor methods
        // returns a cow's number of milkings
        public int getNumMilkings(){
            return numMilkings;
        }

        // returns a cow's type
        public String getType(){
            return type;
        }

        // returns a cow's name
        public String getName(){
            return name;
        }
    // Mutator methods
        // milks cow once
        public void milkCow(){
            numMilkings++;
        }

        // sets the number of milkings for a cow
        public void setMilkings(int nm){
            numMilkings = nm;
        }
        
        // adds a specified number of milkings to a cow
        public void addMilking(int nma){
            numMilkings += nma;
        }
}
```
### 5_5 P2
Common Errors:
+ Setting a local variable to an instance variable rather than the other way around
+ Attempting to use a local variable in another method
+ Not defining a local variable in a method
+ Using accesor methods like variables
+ Attempting to set an instance variable without a mutator method, i.e. 'two.age = 8'
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
