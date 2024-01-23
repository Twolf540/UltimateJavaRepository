# 2.7 String Methods
## 2_7 P1
API - Application-Program Interface - Provides the syntax a programmer can use and what it does

int indexOf(String str); - reutrns the index(value) of the first occurrence of str; returns -1 if there is no occurrences found

```
String wordofDay = new String("computational");
System.out.print(wordofDay.indexOf("n"));
```

"import java.lang.String" allows you to use string outside of an IDE - I.E. Notepad

## 2_7 P2
String substring(from, to); - returns the section of a string from the starting point (from) to the end point (to) - does not include the "to" value, only up to the number before it (not inclusive)

("overloaded") String susbstring(from); - returns the section of a string after and including the "from" value

## 2_7 P3
int length() - returns the length of a string

boolean equals(String1.equals(other)) - checks to see if two strings are the same, and returns true or false based on that check\

String.compareTo - compares two strings, and returns an int based on where the letters in a string sit in the alphabet



