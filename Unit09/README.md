# Unit 9 - Inheritance
## 9.1 - Creating Superclasses and Subclasses
### 9_1 P1
Inheritance - hierarchy of classes that have similair characteristics

Superclasses - 'Parent' classes with attributes or behaviors that are inheritable by subclasses

Subclasses - 'Child' classes that can inherit attributes or behaviors from a superclass

Reasons to use super/subclasses
+ Code reusability
+ Prevents repeating code
+ Readability and organization
+ Ease of maintanance

A subclass can only have one **direct** superclass. A subclass can be used as a superclass for another subclass, and in this case the subclass would inherit the traits of both its superclass and that superclass's superclass.
### 9_1 P2
```java
public class Performer{
    public string getName(){}
    public void practice(){}
    public void perform(){}
}
```
```java
public class Musician extends Performer{
    public String getInstrument(){}
    public void playInstrument(){}
}
```
An object must be created as an object of the subclass (ex: musician) for it to be able to access any of the new attributes of that subclass

extends must be used directly with the superclass that the subclass is related to.
(Ex: burger subclass extends sandwich superclass. doubleburger subclass must extend burger, not sandwich)
## 9.2 - Writing Constructors for Subclasses
### 9_2 P1
```java
public class Performer{
    private String name;
    private int age;

    public Performer(){
        name = "Ima Performer";
        age = 16;
    }
    public Performer(String n, int a){
        name = n;
        age = a;
    }
}
```
```java
public class Musician extends Performer{
    private String instrument;

    public Musician(){
        instrument = "piano"
    }

    public Musician(String inst){
        instrument = inst;
    }
}
```
Constructors are not inherited

Ex:'new Performer("brent", 19);' would not work, as this constructor is only available to the performer class, not the musician class
### 9_2 P2
When creating an object in a subclass, the no-argument constructor of the superclass is called to establish the attributes defined in the superclass unless a constructor using the keyword 'super' is created

If super is not used, java will automatically insert 'super();' into all constructors in the subclass

To use a superclass constructor w/ parameters instead of the no-argument constructor, you must write 'super(parameters);'

Ex: 
```java
public Musician(String n, int a, String inst){
super(n, a);
instrument = inst;
}
```
## 9.3 - Overriding Methods

## 9.4 - super Keyword

## 9.5 - Creating References Using Inheritance Hierarchies

## 9.6 - Polymorphism

## 9.7 - Object Superclass
