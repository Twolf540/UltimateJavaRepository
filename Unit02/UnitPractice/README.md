# Unit 2 Coding Practice

These all use `String` methods in the Java Quick Reference, so are testable in the AP Exam. They are adapted from [CodingBat](https://codingbat.com/java).

1. [helloName](https://codingbat.com/prob/p171896)

   Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

   ```
   helloName("Bob") → "Hello Bob!"
   helloName("Alice") → "Hello Alice!"
   helloName("X") → "Hello X!"
   ```

1. [firstHalf](https://codingbat.com/prob/p172267)

   Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

   ```
   firstHalf("WooHoo") → "Woo"
   firstHalf("HelloThere") → "Hello"
   firstHalf("abcdef") → "abc"
   ```

1. [endsLy](https://codingbat.com/prob/p103895)

   Given a string of length 2 or longer, return true if it ends in "ly".

   ```
   endsLy("oddly") → true
   endsLy("oddy") → false
   ```

1. [makeAbba](https://codingbat.com/prob/p161056)

   Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".

   ```
   makeAbba("Hi", "Bye") → "HiByeByeHi"
   makeAbba("Yo", "Alice") → "YoAliceAliceYo"
   makeAbba("What", "Up") → "WhatUpUpWhat"
   ```

1. [withoutEnd](https://codingbat.com/prob/p130896)

   Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.

   ```
   withoutEnd("Hello") → "ell"
   withoutEnd("java") → "av"
   withoutEnd("coding") → "odin"
   ```

1. [nTwice](https://codingbat.com/prob/p174148)

   Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.

   ```
   nTwice("Hello", 2) → "Helo"
   nTwice("Chocolate", 3) → "Choate"
   nTwice("Chocolate", 1) → "Ce"
   ```

1. [makeTags](https://codingbat.com/prob/p147483)

   The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".

   ```
   makeTags("i", "Yay") → "<i>Yay</i>"
   makeTags("i", "Hello") → "<i>Hello</i>"
   makeTags("cite", "Yay") → "<cite>Yay</cite>"
   ```

1. [middleTwo](https://codingbat.com/prob/p137729)

   Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.

   ```
   middleTwo("string") → "ri"
   middleTwo("code") → "od"
   middleTwo("Practice") → "ct"
   ```
