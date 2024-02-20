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
## 5.3 - Documentation with Comments

## 5.4 - Accessor Methods

## 5.5 - Mutator Methods

## 5.6 - Writing Methods

## 5.7 - Static Variables and Methods

## 5.8 - Scope and Access

## 5.9 - `this` Keyword

## 5.10 - Ethical and Social Implications of Computing Systems
