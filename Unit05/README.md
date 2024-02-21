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
## 5.5 - Mutator Methods

## 5.6 - Writing Methods

## 5.7 - Static Variables and Methods

## 5.8 - Scope and Access

## 5.9 - `this` Keyword

## 5.10 - Ethical and Social Implications of Computing Systems
