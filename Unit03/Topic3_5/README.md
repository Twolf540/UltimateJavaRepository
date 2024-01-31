# 3.5 - Compound Boolean Expressions
## 3_5 P1
```
int number = 40;

if(number > 20){
    if(number % 6 == 0){
        System.out.println("System is greater than 20 and divisible by 6");
    }
    else{
        System.out.println("System is greater than 20 but NOT divisible by 6")
    }
}

else{
    System.out.println("number is not grater than 20")
}
```
else-statements always belong to the closest if-statement if there is more than one if (if nested, it won't belong to any outside of the statement it is nested in)

## 3_5 P2
Logical (Boolean) Operators
+ && - will evaluate to true if both condtions are true
+ || - will evaluate to true if either condition is true
+ ! - evaluates to the opposite of the output of the condition

```
boolean partyHasCake = true;
boolean partyHasIceCream = false;

if (partyHasCake && partyHasIceCream){
    System.out.print("This is a great party");
}

else{
    System.out.println("I'm not staying);
}
```

## 3_5 P3
If a condition causes an if-statement to become true or false (EX: first condition using && is a boolean that outputs false) then the statement will not check the remaining conditions
