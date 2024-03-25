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
### 7_4 P1
```java
private double findMax(ArrayList<Double> values){
    double max = values.get(0);
    for(int index = 1; index < values.size(); index++){
        if(values.get(index) > max){
        max = values.get(index);
        }
    }
    return max;
}
```
```java
private double findMin(ArrayList<Double> values){
    double min = Integer.MAX_VALUE;
    for(Double currentValue : values){
        if(currentValue < min){
            min = currentValue;
        }
    }
    return min;
}
```
```java
private Integer findSum(ArrayList<Integer> values){
    int sum = 0;
    for(Integer currentValue : values){
        sum += currentValue;
    }
    return sum;
}
```
## 7.5 - Searching
### 7_5 P1
Linear Searching - Searching one element at a time from left to right or right to left. There is no need to track the index since you search every element. You compare each element one at a time until an element matches your desired element.
+ Linear Searching can be used in both arrays and ArrayList
+ Typically Linear Searching is done by a for loop
### 7_5 P2
When comparing an integer or double, use ==

When comparing an object, use .equals

```java
 public int whereIsMyNumber(int magicNumber, int[] myNumbers){
        for(int index = 0; index < myNumbers.length; index++){
            if(myNumbers[index] == magicNumber){
                return index;
            }
        }
        return -1;
    }
```
```java
public int where(double magicNumber, ArrayList<Double> realNumbers, double delta){
        for (int index = 0; index < realNumbers.size(); index++){
            if(Math.abs(magicNumber - realNumbers.get(index)) < delta){
                return index;
            }
        }
        return -1;
    }
```
```java
public int findTheWord(String searchedPhrase, ArrayList<Book> myBooks){
    for(int index = 0; index < myBooks.size(); index++){
        Book currentBook = myBooks.get(index);
        String currentPhrase = currentBook.getDescription;
        if(currentPhrase.equals(searchedPhrase)){
            return index;
        }
    }
    return -1;
}
```
### 7_5 P3
Order: You need to adjust within the loop when removing values from an array or arrayList and searching from left to right

EFL: You can use enhanced for loops, but only if you're checking for the existence of an element, not its index

Going Faster: Making assumptions about unsorted data can result in errors. If you know how the data is sorted, you can make some modifications to make the loop faster
## 7.6 - Sorting
### 7_6 P1
Selection Sort: Finds the max or min of compared values and swaps or doesn't swap them accordingly
```java
public void sortArray(double[] myDucks)
for(int outerLoop = 0; outerLoop < myDucks.length; outerLoop++){
    int minIndex = outerLoop;
    for(int inner = outerLoop + 1; inner < myDucks.length; inner++){
        if(myDucks[inner].compareto(myDucks[minIndex]) < 0){
            minIndex = inner;
        }
    }
    if(minIndex != outerLoop){
        swapItems(minIndex, outerLoop, myDucks);
    }
}
public void swapItems(int mi, int ol, Object[] arrayOfStuff){
    Object thirdHand = arrayOfStuff[mi];
    arrayOfStuff[mi] = arrayOfStuff[ol];
    arrayOfStuff[ol] = thirdHand;
}
```
### 7_6 P2
Insertion Sort: Builds a sorted structure as it proceeds. It inserts each value it finds at the appropriate location in the data structure. Often done by a while loop
```java
for(int outer = 1; outer < randomList.size(); outer++){
    DebugDuck tested = randomList.get(outer);
    int inner = outer - 1;
    while(inner >= 0 && tested.compareTo(randomList.get(inner)) < 0){
        randomList.set(inner + 1, randomList.get(inner));
        inner--;
    }
    randomList.set(inner + 1, tested);
}
```
Insertion sorts can be stopped, unlike a selection sort.
### 7_6 P3
Counting steps - checks the efficiency of a code segment based on the number of lines and how many times that the segment iterates

Efficieny is NOT always better
## 7.7 - Ethical Issues Around Data Collection
### 7_7 P1
Removing data - You can remove data as you go that you dont need in order to seperate different pieces of a users data. This will make it harder for someone to connect that data to the person or to even find the data in general

.hashCode() returns the value of a string in hashcode