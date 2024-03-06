# Unit 6 - Array
## 6.1 - Array Creation and Access
### 6_1 P1
Array - Data structure used to implement a collection(list) of primitive or object reference data

Element - a single value in the array

Index - Position of an element in an array
+ First element will be at index 0
+ Last element will be at (index list.length - 1), or 1 less than the length of the array

Length - the number of elements in the array
+ Length is public
+ Length is *final*. It **CAN NOT** be changed after the array is created.

Declaring an array:
```
int [] listOne = new int[5];
listOne[2] = 33;
```
The value inside of the brackets when declaring a list sets its length

Doing 'listName[place] = value;' sets the element in that spot in the array to the value in the brackets

Declaring an array w/ objects:
```
public class Mutable{
    //code
}
public class Example{
    Mutable [] listTwo = new Mutable[3];
    listTwo[1] = new Mutable(33);
}
```
You can use any methods in the object's class on it

Initial values:
int - 0
double - 0.0
Reference Elements - null\
booleans - false

You can use braces({}) instead of brackets([]) and declare the values of elements in an array when declaring it
```
int [] listThree = new int{1, 2, 3, 4};
```
### 6_1 P2
No notes. Video was examples/analyzing code.
### 6_1 P3
```
public class ArrayManipulator{
    private int [] list;

    public ArrayManipulator(int numElements){
        list = new int[numElements];
    }

    public int getMiddleIndex(){
        if((list.length % 2) == 0){
            return list[(list.length / 2) - 1];
        }
        else{
            return list[list.length / 2];
        }
    }

    public double getAvg(){
        return (double) ((list[0] + list[getMiddleIndex()] + list[list.length - 1]) / 3)
    }
}
```
## 6.2 - Traversing Arrays
### 6_2 P1
Traversing an array - Accessing (and possibly changing) each element in an array

All examples of accessing/setting indexes. Just different variations each time.
### 6_2 P2

## 6.3 - Enhanced for Loop for Arrays

## 6.4 - Developing Algorithms Using Arrays
