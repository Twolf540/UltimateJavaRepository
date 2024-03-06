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
doing 'arrayName.length' displays the length of the array

doing 'arrayName[place].length' displays the length of the element at that index in the array
### 6_2 P3
```java
public class PalindromicNumbers {
    private int[] list;
    public PalindromicNumbers(int numPalindromes, int start){
        list = new int[numPalindromes];
        int i = 0;
        while(i < list.length){
            if(isPalindromic(start)){
                list[i] = start;
                i++;
            }
            else{
                i--;
                start++;
            }
        }
    }
    public int getSum(){
        int sum = 0;
        for(int x=0; x < list.length; x++){
            sum += (list[x]);
        }
        return sum;
    }
    private boolean isPalindromic(int num){
        //implementation not shown
    }
}
```
## 6.3 - Enhanced for Loop for Arrays
### 6_3 P1
"Enhanced" for-loop: for loop with two parameters that are seperated by a colon

Enhanced for-loops take the type and name of the array and then a variable

You can access the value stored in the variable, but cannot assign into it. You also cannot access the indices of an array or use subscript notation.

The enhanced for loop will traverse the array and can print out the values within it.
```java
int[] a1 = {1, 2, 3, 4, 5};
int[] a2 = {1, 2, 3, 4, 5};
// for loops can modify arrays
for (int i = 0; i < a1.length; i++) {
    a1[i] = 99;
}

System.out.println(Arrays.toString(a1));

// enhanced for loops can't modify arrays
for (int num : a2) {
    System.out.println("num is: " + num);
    num = 99;
    System.out.println("now num is: " + num);
}

System.out.println(Arrays.toString(a2));

//printing an array directly is gross...
System.out.println(a1);

// printing using an enhanced for loop
for (int item : a1) {
System.out.println(item);
}

// printing using the Arrays.toString() method
Arrays.toString(a1);
```
## 6.4 - Developing Algorithms Using Arrays
### 6_4 P1
