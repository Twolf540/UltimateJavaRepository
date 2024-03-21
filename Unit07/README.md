# Unit 7 - `ArrayList`

## 7.1 - Introduction to `ArrayList`
### 7_1 P1
The size of an array cannot be changed.

The size of an arraylist can be changed at any time.

Arrays are objects with no methods. Arraylists are a class and have methods.

Arrays can store primitive data, arraylists can't.

Arrays are a little faster than arraylists

Arraylists need an import statment to be used.
### 7_1 P2
Framework - Prewritten, efficient code that can handle and use objects of groups of data

To use primitive data in an arraylist, you can use a wrapper class when declaring the primitive data.
```java
import java.util.ArrayList;
public class Topic7_1IntroductionToArrayList {
    ArrayList<String> a = new ArrayList<String>(5);

    ArrayList<Boolean> b = new ArrayList<Boolean>(2);
    ArrayList<Turtle> c = new ArrayList<Turtle>(2);
    ArrayList<String> d = new ArrayList<String>(10);
}
```
## 7.2 - `ArrayList` Methods
### 7_2 P1
ArrayList Methods:
+ size()
+ add(obj) & add(index, obj)
+ remove(index)
+ get(index)
+ set(index, obj)
ArrayList methods, such as add and remove, return values when used. You could use this to, for example, create a new object that is a copy of an object in an ArrList while removing it using the remove method.
```java
public static void main(String args[]){
        System.out.println(a1.size());
        ArrayList<String> a1 = new ArrayList<String>(2);
        a1.add("str");
        a1.add("str");
        String a = a1.remove(2);
        System.out.println(a1.size())
}
```
### 7_2 P2
When writing a method, declare the type of ArrayList when one is used as a parameter

(ArrayList<String> a1) vs (ArrayList a1)
### 7_2 P3
```java
public ArrayList<String> getDelimitersList (String[] tokens){
    ArrayList<String> d = new ArrayList<String>();
    for(String str: tokens){
        d.add(str);
    }
    return d;
}
```
## 7.3 - Traversing `ArrayList`s
### 7_3 P1
```java
public static void main(String[] args) {
        ArrayList<String> roster = new ArrayList<String>();
        int sum = 0;
        for (int i = 0; i <= roster.size() - 1; i++){
            sum = sum + roster.get(i).length();
        }
        System.out.println(sum);
    }
```
```java
public static void main(String[] args) {
    ArrayList<Double> grades = new ArrayList<Double>();
    for (int i = 0; i <= grades.size() - 1; i++){
        if(grades.get(i) < 70.0){
            grades.remove(i);
            i--;
        }
    }
}
```
### 7_3 P2
```java
public static void main(String[] args) {
    ArrayList<String> roster = new ArrayList<String>();
    int sum = 0;
    for(String t : roster){
        sum += t.length();
    }
    System.out.println("You need" + sum + " characters");
}
```
### 7_3 P3
Common Mistakes:
+ Forgetting to import ArrayList
+ Declaring an ArrayList with a primitive date type
+ Forgetting to include ()
+ Not specifying the data type for the ArrayList

Common Mistakes when Traversing an ArrayList:
+ Attempting to update ArrayList while in an enhanced for loop
+ Changing the size of an ArrayList while in an enhanced for loop
+ Removing an element from ArrayList without correcting the for loop to account for the change

Mistakes:
+ Confusing an array with an ArrayList
    + Using Brackets
    + .length() vs .size()
    + Trying to access an element without using .get()
```java
public static void swapConsecutive(ArrayList<Double> myList){
    for(int i = 0; i <= myList.size() - 1; i = i + 2){
        double u = myList.get(i);
        myList.set(i, myList.get(i + 1));
        myList.set(i + 1, u);
    }
}
```
```java
public static void display(ArrayList<String> myList){
        System.out.println(myList);
    }
```
```java
public static ArrayList<Integer> duplicate(ArrayList<Integer> myList, int n){
    ArrayList<Integer> temp = new ArrayList<Integer>();
    for(int i = 1; i <= n; i++){
        for(int u = 0; u <= myList.size(); u++){
            temp.add(myList.get(u));
        }
    }
    return temp;
}
```
## 7.4 - Developing Algorithms Using `ArrayList`s

## 7.5 - Searching

## 7.6 - Sorting

## 7.7 - Ethical Issues Around Data Collection
