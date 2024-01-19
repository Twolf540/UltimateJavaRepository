# 1.5 Casting and Ranges of Variables
## 1_5 P1
Casting - temporarily treat a variable as another type
+ Ex - treat int as a double
```
double number = 11.0/4;
int roundedNumber = (int)(number + 0.5);
System.out.println("11.0 / 4 = " + number);
System.out.println("11 / 4 = " + (int)number);
System.out.println("11 / 4 rounded = " + roundedNumber);
```
/\ Subtract 0.5 instead of adding for negatives

Changing double to int rounds the number

Changing int to double adds the decimal places

## 1_5 P2
Integers have maximum and minimum values - 2147483647 to -2147483648

There is a way to write the max/min without remembering it
```
int posInt = Integer.MAX_VALUE;
int negInt = Integer.MIN_VALUE;
```
Adding to MAX_VALUE or subtracting from MIN_VALUE will make the int roll over
+ ex - (MIN_VALUE - 1) = 2147483647

Assigning the value of operations using two integers that result in a double to an int will automatically cast the value
```
int value = 1;
int value2 = (value / 2);
System.out.println(value2);
```
/\This will output 0 instead of 0.5, as the 0.5 is automatically cast, rounding it.
