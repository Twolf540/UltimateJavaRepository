# 2.8 Wrapper Classes - Integer and Double
## 2_8 P1
Classes - int is a data type of the class Integer

Integer is a "wrapper class"

```
Integer num1 = new Integer(6);
System.out.print(num1);
```
Using Integer instead of int creates an object instead of a primitive data type

## 2_8 P2
Double is another "wrapper class" - not primitive data like double

```
Double score1 = new Double(2.145);
System.out.print(score1)
```

```
public class Wrapper2_8b {
    public static void main(String[] args) {
        Double score1 = new Double(89.45);
        System.out.println("Score1: " + score1);
        Double score2 = new Double(92.38);
        Double score3 = new Double(101.0);
        Double meanScore = (score1 + score2 + score3) / 3
        System.out.println("Double meanScore: " + meanScore);

        double mean2 = meanScore.doubleValue();
        System.out.println("double mean2: " = mean2);
    }
}
```

## 2_8 P3
Autoboxing and Unboxing - Autoboxing takes primitive data and makes the data into its wrapper-class counterpart. Unboxing does the reverse.

Primitiva data types store only single values - 1, 2, 3.5

Reference types store only references - Ex: String

Wrapper classes convert primitive data into reference types

Example of autoboxing:
```
Integer num1 = new Integer(num);
Integer integerNum = num;
```
Example of unboxing:
```
int unNum1 = num1
```
Operations, such as adding Integer objects and then dividing to find the average, and then assigning it to an int will result in unboxing