# 2.4 Calling a Void Method with Parameters
## 2_4 P1
Methods use "Method Signatures" which includes the name of the method and the parameters it uses
```
public class Calculator {
    
    public void calcAverage(int num1, double num2) {
        //ACTIONS GO HERE
    }
}
```
Parameters are variables such as integers, doubles, booleans, and strings that the method will use in its output.

Multiple methods of the same name with different parameters can be used. The program will use the method whose parameters match the given data, allowing different actions to be performed based on the amount and type of information being provided.

Void methods **do not** return a value, only output what they are programmed to

## 2_4 P2
Example: A frog can move forward a given number of hops or a predefined number of hops if it is not specified. A frog can also move either to the left or to the right a given number of hops.
+ Method A - Allows the frog to move forward the given number of hops
+ Method B - Sets the predefined value of hops if no value is given
+ Method C - Allows the frog to hop left or right the given number of hops

Information needed:
+ How many hops forward?
+ If no value is given, what is the predefined number of hops the frog will make?
+ What direction is the frog hopping in side to side?
+ How many hops is the frog moving side to side

```
public void move(String direction, int hops) {
    //ACTIONS GO HERE
}
```


