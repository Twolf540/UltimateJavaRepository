# 2.9 Using the Math Class
## 2_9 P1
Math Class methods - pre-defined, return numeric values, and act upon the given parameters
+ Math Class methods are static - methods are of the class, not an object
+ Math Class methods don't require instance variable creation
+ You can skip adding the (Math.) if you import the math class using (import static java.lang.Math.*;)

## 2_9 P2
Math Class methods:
+ Math.abs(x); (double and int) - Absolute Value
+ Math.pow(val,pow); - Power of
+ Math.sqrt(x); - Square Root

## 2_9 P3
Math.random(); - Random value (Greater than/equal to 0, less than 1)
+ **HAS TO BE A DOUBLE IF ASSIGNED TO A VARIABLE**
```
System.out.println((int)(Math.random()*100 + 1));
```
The 100 is the maximum, 1 is the minimum.

Maximum value is found by taking max-min, and then adding 1

The Minimum value is just the minimum
