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

### 7_3 P2

### 7_3 P3
## 7.4 - Developing Algorithms Using `ArrayList`s

## 7.5 - Searching

## 7.6 - Sorting

## 7.7 - Ethical Issues Around Data Collection
