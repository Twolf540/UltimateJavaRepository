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
Binary search v. Linear Search

Linear Search starts at the beginning of the array and moves to the end

Linear searches are iterative and not recursive

Binary searches can be either iterative (example below) or recursive
```java
public static int binarySearch(int [] intArray, int lowPosition, int highPosition, int target){
    int midposition;
    while(lowPosition <= highPosition){
        midPosition = (highPosition + lowPosition) / 2;
        if(intArray[midPosition] < target){
            lowPosition = midPosition + 1;
        }
        else if(intArray[midPosition] > target){
            highPosition = midPosition - 1;
        }
        else{
            return midPosition;
        }
    }
    return -1;
}
```
Binary searches adjust the range that the search looks for the target in based on the element that is located at midPosition.

Binary searches are faster because they do not check every single value. They elimate half of the elements within the range each time they are called.

Recursive Binary Search Example:
```java
public static int binarySearch(int [] intArray, int lowPosition, int highPosition, int target){
    int midPosition = -1;
    if(lowPosition <= highPositon){
        return -1;
    }
    else{
        midposition = (highPosition + lowPosition) / 2;
        if(intArray[midPosition] < target){
            return binarySearch(intArray, (midPositon + 1), highPosition, target);
        }
        else if(intArray[midPosition] > target){
            return binarySearch(intArray, lowPosition, (midPosition - 1), target);
        }
    }
    return midPosition;
}
```
### 10_2 P2
Merge Sort - Sorts the values on the left half and right half of the list seperately and then merges the results together

The rest of the video was just explaining the merge sort. No code.
### 10_2 P3
```java
public void merge(int [] myArray, int low, int high, int middle){
    int [] sortedArray = [high - low];
    for(int x = low; x < high; x++){
        sortedArray[x] = myArray[x];
    }
    if(low < high){
        middle = (low + high) / 2;
        mergeSort(myArray, low, middle);
        mergeSort(myArray, middle + 1, high);
        merge(myArray, low, middle, high);
    }
    int 
}
public void mergeSort(int myArray, int low, int high){
    for(y = 0; y < sortedArray.length - 1; y++){
        for(z = 1; z < sortedArray.length; z++){        
            if(sortedArray[y] > sortedArray[z]){
                int temp = sortedArray[y];
                sortedArray[y] = sortedArray[z];
                sortedArray[z] = temp;
            }
        }
    }
}
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
```