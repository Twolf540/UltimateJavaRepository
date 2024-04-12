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
### 9_3 P1
Inheriting methods - public methods in the superclass are available in the subclass

Writing methods - the subclass can have its own methods that are independent of the superclass

Ovveride methods - Write a new, different implementation of a method already in the superclass
```java
public class Performer{
    private String name;
    private int age
    
    public String getName(){} //comedian inherits all of these public methods
    
    public void practice(){}
    
    public void perform(){
        System.out.println("Performing for an audience");
    }

}
```
```java
public class Comedian extends Performer{
    private ArrayList<String> jokes;

    public Comedian(String n, int a){}
    
    public void writeJokes(){} //new method

    public void perform(){ //overridden method
        for (String joke : jokes){
            System.out.println(joke);
        }
    } 
}
```
using perform() for a comedian object will use the perform() in the comedian class and ignore the perform() in the performer class
### 9_3 P2
No notes. Just examples
## 9.4 - super Keyword
### 9_4 P1
using 'super.method' calls the superclass version of an overidden method.

example: perform() in the ballet dancer class calls the perform() in that class. super.perform() calls the perform() in the Dancer superclass

using super can only access the closest superclass. In order to use a method from a different superclass, you need to write super in a method in the closest subclass.

Ex: BalletDancer can only use super to access the Dancer class, and not the Performer class.
### 9_4 P2
Answers:
+ C
+ B
## 9.5 - Creating References Using Inheritance Hierarchies
### 9_5 P1
Subclasses "are" something from the superclass (is-a)

Superclass arrays/arraylists can contain objects from subclasses

Ex: pencil case class uses an array with pen, pencil, and crayon subclass objects
### 9_5 P2
```java
public class Dwelling{
    private int numBedrooms;
    private int numBaths;
    public Dwelling(int bed, int bath){
        numBedrooms = bed;
        numBaths = bath;
    }
}
```
```java
public class Apartment{
    private int leaseLength;
    public Apartment(int lease, int bed, int bath){
        super(bed, bath);
        leaseLength = lease;
    }
}
```
Answers
+ D
+ E
## 9.6 - Polymorphism
### 9_6 P1
A reference variable is polymorphic when it can refer to objects from different classes at different points in the code

A method is considered polymorphic when it is overridden in at least one subclass

An superclass not implicitly extending another class extends the object class

Superclass objects cannot access methods from a subclass

Ex 'Entertainer sally = new Comedian("satire", oneLiners);' can only access methods in the entertainer class. Overridden methods from the comedian class will be used, however. To use a comedian method, sally must be cast as a comedian - '(comedian)sally'

### 9_6 P2
Answers:
+ C
+ B
### 9_6 P3
Answers:
```java
public double getCost(){
    return (COST_PER_OZ * weight);
}
```
```java
public insuredShippingItem(double w, double iamt){
    super(w);
    insuredAmt = iamt;
}
```
```java
public double getCost(){
    return (super.getCost() + insuredAmt);
}
```
## 9.7 - Object Superclass
### 9_7 P1
Classes that do not implicitly extend another class extend the object class

Object has a toString but it uses hexadecimal values instead of real values, so it needs to be overridden

```java
public String toString(){
    System.out.println("size: " + size + ", material: " + material);
}
```
### 9_7 P2
The object class has a .equals() method that checks if two objects refer to the same object

.equals() can be overridden in a class to check different things

ex:
```java
public class WritingUtensil(){
    private int tipSize;
    public WritingUtensil(int pixels){
        tipSize = pixels;
    }
    
    public boolean equals(Object other){
        if(!(other.instanceOf WritingUtensil)){
            return false;
        }
        WritingUtensil that = (WritingUtensil) other;
        return this.tipSize == that.tipSize;
    }
}
```