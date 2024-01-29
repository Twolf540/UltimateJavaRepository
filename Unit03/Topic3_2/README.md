# 3.2 - `if` Statements and Control Flow
## 3_2 P1
"if" statements evaluate to true or false based on conditions in the statement
```
public class Main {
  public static void main(String[] args){
    
    int myAge = 16;
    System.out.println("Current age: " + myAge);
    
    if(myAge >= 16){
      System.out.println("You can learn to drive a car.");
      myAge++;
    }
    
    if(myAge <= 15){
      System.out.println("You cannot drive a car");
      myAge++;
    }
    
    System.out.println("On your next birthday, you will be " + myAge + ".");
  }

}
```
## 3_2 P2

