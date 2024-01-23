# 2.6 String Objects - Concatenation, Literals, and More
## 2_6 P1
```
public class stringObjects2_6 {
    public static void main(String[]) {
        String name1 = "Jadon Java";
        String name2 = new String("Jessica Java");
        String name3 = new String(name1);
        
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
    }
}
```
Creation of a String object:
```
class variableName = new class("value");
```
String objects cannot be changed after they are defined. (Immutable)
## 2_6 P2
Concatenation - The joining of data
Operators - + an +=
```
public class stringObjects2_6 {
    public static void main(String[]) {
        String name1 = "Jadon Java";
        String name2 = new String("Jessica Java");
        String name3 = new String(name1);
        int jadAge = 17;
        int jesAge = 16;
        String Jadon = name1 + " " + jadAge;
        name2 += JesAge
    }
}
```
/\ Outputs \/
```
Jadon Java 17
Jessica Java16
```
When combining strings and other data types, data will act like its class before a string is introduced, but every piece of data after a string is introduced will act like a string

Ex:
```
public class stringObjects2_6 {
    public static void main(String[]) {
        System.out.println("name " + true + 0);
    }
}
```
This will output "name true0"
## 2_6 P3
Escape Sequences - allow the output of special characters and insertion of actions

Sequences start with a backslash (\\)

Escape Sequences:
+ \\" - Prints a quotation mark
+ \\\\ - Prints a backslash
+ \\n - Prints a new line



