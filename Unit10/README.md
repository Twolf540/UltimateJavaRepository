# Unit 10 - Recursion
## 10.1 - Recursion
### 10_1 P1
Recursive Method - A method that calls itself

Recursive methods will contain a condition that will halt the recursion at some point

Recursive calls are nested inside of an if statement that will halt the recursion at some point

Recursive calls are indpendent of eachother. Local variables are seperated from the same variable in other calls

Each time a recursive method does a call, that new call must be completed before the call that called it can be completed

Ex:
```java
public static void simpleRecur(int n){
    System.out.println(n);
    if(n > 2){
        simpleRecur(n-1);
    }
    System.out.println(n);
}
```
Creating an infinitely recurring loop will eventually result in an error as the program will run out of memory

Ex:
```java
public static int simpleRecur3(int n){
    if (n==0){
        return 0;
    }
    return n + simpleRecur3(n/2)
}
```
This method will iterate until n = 0.
### 10_1 P2
Tracing recursion - Following each time the method iterates and determining its output

Recursive methods can contain two or more calls

Answers:
+ D - eumc
+ D - # of times num occured, list empty

Traversing w/ recursion:
```java
public static int mystery(ArrayList <Integer> list, Integer num, int index){
    Integer current;
    if(index == list.size){
        return 0;
    }
    current = list.get(index);
    if(current.equals(num)){
        return 1 + mystery(list, num, index + 1);
    }
    return mystery(list, num, index + 1);
}
```
## 10.2 - Recursive Searching and Sorting
### 10_2 P1

### 10_2 P2

### 10_2 P3
