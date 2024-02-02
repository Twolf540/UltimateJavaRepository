# Ultimate Java Repository

1. [Course Timing / Planning](#course-timing--planning)
1. [Unit Outlines](#unit-outlines)
1. [Course Calendar](#course-calendar)
1. [Compiling / Running Java Code](#compiling--running-java-code)
1. [Markdown Quick Reference](#markdown-quick-reference)
1. [Using Git](#using-git)

## Course Timing / Planning

| Unit                                      | Suggested # blocks |
| ----------------------------------------- | ------------------ |
| 1 - Primitive Types                       | 5                  |
| 2 - Using Objects                         | 7                  |
| 3 - Boolean Expressions & `if` Statements | 6                  |
| 4 - Iteration                             | 8                  |
| 5 - Writing Classes                       | 7                  |
| 6 - Array                                 | 4                  |
| 7 - `ArrayList`                           | 6                  |
| 8 - 2D Array                              | 6                  |
| 9 - Inheritance                           | 7                  |
| 10 - Recursion                            | 3                  |

## Unit Outlines

### Unit 1 - Primitive Types

- [1.1 Why Programming? Why Java?](Unit01/Topic1_1/README.md)
- [1.2 Variables and Data Types](Unit01/Topic1_2/README.md)
- [1.3 Expressions and Assignment Statements](Unit01/Topic1_3/README.md)
- [1.4 Compound Assignment Operators](Unit01/Topic1_4/README.md)
- [1.5 Casting and Ranges of Variables](Unit01/Topic1_5/README.md)

### Unit 2 - Using Objects

- [2.1 Objects - Instances of Classes](Unit02/Topic2_1/README.md)
- [2.2 Creating and Storing Objects (Instantiation)](Unit02/Topic2_2/README.md)
- [2.3 Calling a Void Method](Unit02/Topic2_3/README.md)
- [2.4 Calling a Void Method with Parameters](Unit02/Topic2_4/README.md)
- [2.5 Calling a Non-void Method](Unit02/Topic2_5/README.md)
- [2.6 String Objects - Concatenation, Literals, and More](Unit02/Topic2_6/README.md)
- [2.7 String Methods](Unit02/Topic2_7/README.md)
- [2.8 Wrapper Classes - Integer and Double](Unit02/Topic2_8/README.md)
- [2.9 Using the Math Class](Unit02/Topic2_9/README.md)

### Unit 3 - Boolean Expressions & `if` Statements

- [3.1 Boolean Expressions](Unit03/Topic3_1/README.md)
- [3.2 `if` Statements and Control Flow](Unit03/Topic3_2/README.md)
- [3.3 `if-else` Statements](Unit03/Topic3_3/README.md)
- [3.4 `else if` Statements](Unit03/Topic3_4/README.md)
- [3.5 Compound Boolean Expressions](Unit03/Topic3_5/README.md)
- [3.6 Equivalent Boolean Expressions](Unit03/Topic3_6/README.md)
- [3.7 Comparing Objects](Unit03/Topic3_7/README.md)

## Course Calendar

| Mon                                                       | Tue                                                      | Wed                                                          | Thu                                                                | Fri                                                                   |
| --------------------------------------------------------- | -------------------------------------------------------- | ------------------------------------------------------------ | ------------------------------------------------------------------ | --------------------------------------------------------------------- |
| **1st Jan**                                               | **2**                                                    | **3** <br> Install Java on computers                         | **4** <br> Sign up for Github / AP Classroom                       | **5** <br> SNOW DAY                                                   |
| **8** <br> Videos & MCQs on 1.1 <br> Videos & MCQs on 1.2 | **9** <br> SNOW DAY                                      | **10** <br> Videos & MCQ on 1.3 <br> Videos & MCQ on 1.4     | **11** <br> Videos & MCQ on 1.5 <br> Command line assignment       | **12** <br> Catch up on videos/MCQs <br> Command line args assignment |
| **15** <br> MLK Day                                       | **16** <br> COLD WEATHER DAY                             | **17** <br> Unit 1 MCQ Progress Check                        | **18** <br> Videos & MCQ on 2.1 <br> Videos & MCQ on 2.2           | **19** <br> Videos & MCQ on 2.3 <br> Videos & MCQ on 2.4              |
| **22** <br> Videos & MCQ on 2.5 <br> Videos & MCQ on 2.6  | **23** <br> Videos & MCQ on 2.7 <br> Videos & MCQ on 2.8 | **24** <br> Videos & MCQ on 2.9 <br>Unit Practice Assignment | **25** <br> Unit 2 MCQ Progress Check<br> Unit Practice Assignment | **26** <br> Unit 2 FRQ Progress Check                                 |
| **29** <br> Videos & MCQ on 3.1 <br> Videos & MCQ on 3.2  | **30** <br> Videos & MCQ on 3.3 <br> Videos & MCQ on 3.4 | **31** <br> Videos & MCQ on 3.5 <br> FRQ on 3.5              | **1st Feb** <br> Videos & MCQ on 3.6 <br> Videos & MCQ on 3.7      | **2** <br> `Scanner` assignment <br> FRQ on 3.7                       |
| **5** <br> _Unit 3 MCQ Progress Check_                    | **6** <br> _Unit 3 FRQ Progress Check_                   | **7** <br>                                                   | **8** <br>                                                         | **9** <br>                                                            |

## Gradebook Categories

| Type                                                               | Weight |
| ------------------------------------------------------------------ | ------ |
| Notes on topic from videos/questions/code (edit `README.md` files) | 25%    |
| Multiple Choice Questions on AP Classroom                          | 25%    |
| Programming Assignments                                            | 20%    |
| Quizzes                                                            | 30%    |

## Compiling / Running Java Code

Use the "Run" button to compile and run the code, or do it from a terminal:

```
javac Unit01/Topic1_1/Main.java
java Unit01.Topic1_1.Main
```

## Markdown Quick Reference

To learn how to do fancy formatting using Markdown, see [here](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet)

## Using Git

### Sync-ing your work

- commit all your changes ("source control" tab on left, enter a short message)
- click the "Sync Changes" button

### Sync-ing my updates (to assignments / calendars / etc)

- "source control" tab on left, three dots, "Fetch", then choose upstream
- "source control" tab on left, three dots, "Pull, push" > "Pull from..."
- select "origin/upstream" from the dropdown palette
- select the "main" branch
- "source control" tab on left, three dots, "Pull, push" > "Sync"
