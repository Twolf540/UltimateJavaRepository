# Unit 8 - 2D Array

## 8.1 - 2D Array
### 8_1 P1
2D Array - Array of arrays
Ex:
```java
{
    Student0 = {100,  85,  95,  96},
    Student1 = { 98, 100, 100,  95},
    Student2 = { 92, 100,  98, 100},
    Student3 = {100,  95,  97,  99},
    Student4 = {100, 100, 100,  70},
    Student5 = {100,  98,  99,  98},
    Student6 = {100,  94, 100,  93}
}

grades = {Student0, Student1, Student2, Student3, Student4, Student5, Student6}
```
Non-rectangular 2D arrays are possible

Declaring a 2D Array:
```java
DataType [][] name;
```
Initializing a 2D Array:
```java
DataType [rows][columns] name;
```
name.length finds the # of rows, name[0].length finds the # of columns
### 8_1 P2
Accessing an element in a 2D Array:
```java
name[row][column]
```
Updating an element in a 2D Array:
```java
name[row][column] = newValue;
```
### 8_1 P3
Answers:
B
D
```java
String[][] = new String[10][3];
```
## 8.2 - Transversing 2D Arrays
### 8_2 P1
Traversing using nested for loops
```java
for(int r = 0; r < arr.length; r++){
    for(int c = 0; c < arr[0].length; c++){
        System.out.println(arr[r][c]);
    }
}
```
Traversing using nested enhanced for loop
```java
for(String[] r : arr){
    for(String c : row){
        System.out.println(c);
    }
}
```
### 8_2 P2
Column Major Order
```java
for(int c = 0; c < arr[0].length; c++){
    for(int r = 0; r < arr.length; r++){
        System.out.println(arr[r][c]);
    }
}
```
### 8_2 P3
```java
public static boolean search(String [][] chart, String name){
    for(int r = 0; r < chart.length; r++){
        for(int c = 0; c < chart[0].length; c++){
            if(chart.equals(name)){
                return true;
            }
        }
    }
    return false;
}
```
```java
public static int findFirstNonBlueColumn(Color [][] picture){
    for (int c = 0; c < picture[0].length; c++){
        for (int r = 0; r < picture.length; r++){
            if(!picture[r][c].equals(Color.BLUE)){
                return c;
            }
        }    
    }
    return -1;
}
```