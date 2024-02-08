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
### 4_2 P1
for loop - while loop but it sets the LCV, checks it, and updates it, rather than you having to write in the LCV intialization and update manually.

```
for (initialization; Boolean expression; update){
    //code goes here
}
```
ex:
```
for (x=0; x<10; x++)
```
for loops will run the loop once if the LCV meets the conditions before updating it.

### 4_2 P2
for loops - good for loops that need to run a defined number of times

while loops - better for loops that run a random number of times or are based on complex boolean expressions/variables

off by one error - a statement runs one time too many or one time less than it should

### 4_2 P3
```
double principal = 200.0;
for (years = 1; years <= 50; x++){
    principal *= 1.1;
}
System.out.println("You have $" + principal + " dollars);
```
## 4.3 - Developing Algorithms Using Strings

## 4.4 - Nested Iteration

## 4.5 - Informal Code Analysis
