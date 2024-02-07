# Unit 4 - Iteration

## 4.1 - `while` Loops
### 4_1 P1
while loops - run through commands in the loop while a condition is true, and ends when the condition becomes false

```
while(**condition**){
    // code goes here
}
```

Loop control variable - variable made exclusively for controlling a loop. Might be changed inside the loop at some point to exit out of the loop

Putting your LCV change before your code allows it to run for one more loop than it should. It also will skip the "first" loop

ex: x < 100 is the condition, adding 5 to x after the rest of the code prints 5, 10, 15, 20... 95. Adding 5 before makes it print 10, 15, 20, 25... 100.

### 4_1 P2
infinite loop - condition inside will always evaluate to true, regardless of changes

infinite loops can also occur when the changes made to a LCV will never make the statement untrue
ex: condition is x >= 0, x=10, change is x++

### 4_1 P3
```
int number = 5384
int sum = 0;
while(number > 0){
    int lastDigit = (number % 10);
    sum += lastDigit;
    number = (number / 10);
}
System.out.println ("The sum of the digits is " + sum);
```

```
double accountBalance = 200.0;
int years = 0;
while(accountBalance < 1000){
    accountBalance = (accountBalance*1.1);
    years++;
}
System.out.println("It will take " + years + " years for you to have $1000");
```

```
int multipleValue = 4;
int multipleNum = 1;

while(multipleNum <= 10){
    System.out.print((multipleValue*multipleNum) + " ");
    multipleNum++;
}
```
## 4.2 - `for` Loops

## 4.3 - Developing Algorithms Using Strings

## 4.4 - Nested Iteration

## 4.5 - Informal Code Analysis
