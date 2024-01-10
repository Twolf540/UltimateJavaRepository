# 1.1 Why Programming? Why Java? 

## Leaving Notes in README.md Files

Leave notes here of things you learn while watching the videos. This file is in Markdown format, which allows you to include **bold** and _italic_ text, as well as lists, links, and images. An information-dense cheatsheet for Markdown can be found [here](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet)

## Trying Out Code in Main.java Files

The `Main.java` files in each folder are meant to be used to try out the code you see in the videos, to experiment with your own code, and to explore the code referenced in the assigned questions. 

There should be a "Run" button at the top of the editor window that will compile and run the code in the `Main.java` file. I also encourage you to occasionally compile and run the code from the command line as this offers additional flexible ways of running the code (more details later). If your terminal is at the base directory (`UltimateJavaRepository`), you can compile and run the files like so:

```
javac Unit01/Topic1_1/Main.java
java Unit01.Topic1_1.Main
```

Sorry about the more complicated syntax for running the code from the command line; it's a necessary Java thing if you're going to keep your code organized in a big repository like this.

**Notes - 1_1 P1:**
Must have Class Declaration and Method
```
public class (FileName){

      public static void main(String[] args) {

        }
    }
```
All code must be in Main /\
Outputs from system - print and println
print - Prints text
println - Prints text, moves cursor to next line

Example
```
public class Main {
  public static void main(String[] args) {
    System.out.print("AP ");
    System.out.print("CS ");
    System.out.print("A ");
    System.out.println("Rocks!");
    System.out.println("Hello World");
  }
}
```
**Notes - 1_1 P2:**
String Literal - Exact sequence of characters(letters, numbers) which are enclosed by two quotation marks

**Notes - 1_1 P3:**
**3 Types of Errors**
**Syntax/Compiler Error** - Occurs when code is written incorrectly, such as a missing letter, which causes the code to fail when compiling. These errors can be identified either while writing the code or when compiling it.

**Exception** - Program attempts to do things it can't, such as divide by 0

**Logic Error** - Occurs when the code is written incorrectly. The code uses correct syntax, allowing it to compile, but the expected output differs from the actual output.

Syntax Errors:
Missing quotation mark - ln 2
Missing i - ln 2
Missing period - ln 4
Lowercase S in System - ln 6
Missing semicolon - ln 6

Logic Errors:
Missing Space - ln 4
print instead of println - ln 2
println instead of print - ln 3
println instead of print - ln 4
println instead of print - ln 5