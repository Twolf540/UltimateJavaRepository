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
