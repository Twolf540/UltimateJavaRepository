# 2.5 Calling a Non-void Method
## 2_5 P1
Non-Void Methods can return values, unlike void methods.
```
public double calcAverage(int num1, double num2){
    double average = (num1 + num2);
    return average;
}
```
"return" returns the value to main as the signature, in this case "calcAverage", which can then be used in main essentially as a variable

Non-void methods will return a value that is the same type as their signature
## 2_5 P2
```
public double divideBill(int numFriends, double billAmount) {
    personPays = (billAmount / numFriends);
    return double;
}
```