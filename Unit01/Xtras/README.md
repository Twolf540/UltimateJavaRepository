# Command Line Arguments

So far in this course, we have been running our programs with no input. Command line arguments are one way to pass input to the program. This allows us to change parameters in our program without having to re-type and recompile each time.

Command line arguments are strings (aka text) that come after the name of the program when it is run. For example, to run `RandomInt` with command line arguments of 2 and 7:

```
java Unit01.Xtras.RandomInt 2 7
```

## Demos

1. `TrigIdentity`

   Write a program that uses `Math.sin()` and `Math.cos()` to check that the value of sin^2 x + cos^2 x is approximately 1 for any x entered as a command-line argument. Just print the value. Why are the values not always exactly 1?

1. `RandomInt`

   Write a program that takes two integer command-line arguments `lo` and `hi` and prints a random integer between `lo` and `hi`, inclusive.

## Exercises

1. `DistanceFormula`

   Write a program that takes four integer command-line arguments `x1`, `y1`, `x2`, and `y2` and prints the distance between the points (`x1`, `y1`) and (`x2`, `y2`) using the [distance formula](https://www.geogebra.org/resource/ndGhcZzg/AgiboXtqEj8nyKmf/material-ndGhcZzg.png)

1. `TwoDSix`

   Write a program that prints the sum of two random integers between 1 and 6 (such as you might get when rolling dice).

1. `RandomStats`

   Write a program that prints five random `double` values between 0 and 1, their average value, and their minimum and maximum values. Use `Math.random()`, `Math.min()`, and `Math.max()`.
