## Scanner

### Demo

1. [ScannerDemo.java](ScannerDemo.java)

   Prompt the user for their name, then say hello to them. Then ask them to input two numbers they'd like to add together, then print the sum of those two numbers in a nice format.

### Exercises

1. [QuadraticSolver.java](QuadraticSolver.java)

   Prompt the user for the coefficients of a quadratic equation (`a`, `b`, and `c` in the equation `a x^2 + b x + c = 0`), then print the two solutions to the equation. If there are no real solutions, tell them this.

   Some examples:

   - The solutions to `2 x^2 + 9 x - 5 = 0` are `x = 0.5` and `x = -5`.

   - The solutions to `x^2 - 2 x - 1 = 0` are `x = 1 + sqrt(2) = 2.414...` and `x = 1 - sqrt(2) = -0.414...`.

   - The equation `x^2 + x + 1 = 0` has no real solutions.

1. [DiscordTagGenerator.java](DiscordTagGenerator.java)

   Prompt the user for their desired username. Generate a random 4-digit number and append it to the end of their username with a "#" sign. Print the result. For example, a user named "Bob" might get the tag "Bob#8311".

1. [BasicTextAnalysis.java](BasicTextAnalysis.java)

   Prompt the user to type in some text. Print the following information about the text they entered:

   - The number of characters in the text
   - The first word in the text (words are separated by spaces)
   - The first sentence in the text (sentences are separated by periods)

   Using the `Scanner` class, you can read multiple lines of text (until the user enters Ctrl-d) by using the following code:

   ```
   scan.useDelimiter("\\Z");
   String textLines = scan.next();
   ```

   Run these programs on the "Gettysburg Address" and "I Have a Dream" text files to give output like:

   ```
   cat Unit03\Xtras\gettysburg.txt | java Unit03.Xtras.BasicTextAnalysis
   ```

   To give something like:

   ```
   Enter your text: Your text is 1439 characters long.
   The first word is: Four
   The first sentence is: Four score and seven years ago our fathers brought forth on this
   continent a new nation, conceived in liberty and dedicated to the
   proposition that all men are created equal.
   ```
