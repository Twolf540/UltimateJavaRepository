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
### 4_3 P1
```
public class sunflower{
    public static void main(String[] args){
        String word = "sunflower";
        String sub = "low";
        boolean found = false;
    
        for(int i = 0; i <+ word.length() - sub.length; i++){
            String portion = word.substring(i,i + sub.length());
            if(portion.equals(sub)){
            found = true;
            }
        }
    
        if (found){
            System.out.println("We found the string");
        }
    
        else{
            System.out.println("We did not find the string");
        }
    }
}
```
make sure to avoid going under/over the length of a string when using ".substring"
### 4_3 P2
```
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str = scan.next();
    int count = 0;
    for(int i = 0; i < str.length(); i++){
        String letters = str.substring(i, i + 1);
        if(letters.equals("a") || letters.equals("e") || letters.equals("i") || letters.equals("o") || letters.equals("u")){
                count++;
        }
    }
    System.out.println("There are " + count + " vowels");
    scan.close();
}
```
### 4_3 P3
```
public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       String original = scan.next();
       String reversed = "";
       scan.close();
       for (int i = 0; i < original.length(); i++){
            String single = original.substring(i, i+1);
            reversed = (single + reversed);
       }
       System.out.println(reversed);
}
```
## 4.4 - Nested Iteration
### 4_4 P1
Nested Iterations - loops in a loop. The inner loop must complete all iterations before the outer loop can run. In for, statements, the LCV of outer statements can be be used in inner statements, but you cannot do the reverse.

With nested for loops, when the outside loop runs again, it will change the LCV back to the value defined in the for loop
```
for(int k= 0; k< 5; k++;){
    for(int x = 0; x <5; x++;){
    // code goes here
    }
}
```
each time the loop with k runs, x will be set to 0 again

Example of nested iteration - clock, seconds hand moves 59 times, and on the final time, the minute hand moves. minutes hand moves 59 times, and on the final time, the hour hand moves

```
int h;
for(h = 0; h < 24; h++){
    for(int m = 0; m < 60; m++){
        for(int s = 0; s < 60; s++){
            System.out.print(h + " ");
            System.out.print(m + " ");
            System.out.println(s);
        }
    }
}
if(h == 24){
    System.out.println("0 0 0");
    h = 0;
}
```
### 4_4 P2
Video 2 was just examples of how nested iterations work

Answer to example was C. The loop needed to have outer = 1, so it could not be D, which was x > 1, so C with x >= 1 had to be the answer.
### 4_4 P3
```
for(int outer = 0; outer < 3; outer++){
    for(int inner = 0; inner < 5; inner++;){
        System.out.print(inner + " ");
    }
    System.out.println();
}
```
This will output:
```
0 1 2 3 4
0 1 2 3 4
```
## 4.5 - Informal Code Analysis
### 4_5 P1
Analyzing code

Line 2: 3 6 9 12 15 18 21 24 27
+ Line 2 will run 9 times

Line 3: 0 3 6 9 12 15 18 21 24 27
+ Line 3 will run 10 times
### 4_5 P2
Times loops will run (in order in the video)
+ 99
+ 99
+ 1000
+ 44
+ Min = 0, Max = infinite
### 4_5 P3
