# 3.4 - 'else-if' Statements
## 3_4 P1
else-if statements allow you sort through statements that don't sastify the if statement. This allows you to ouput things for specific inputs the if-statement considers false

```
if(dogAge < 2){
System.out.println("Your dog is a puppy");
}

else if (dogAge < 1){
System.out.println("Your dog is a newborn")
}

else{
System.out.println("Your dog is an adult");
}
```

## 3_4 P2
use "findKeyword(var, "text") >= #place" to find keywords in inputs

```
public String getResponse(String statement){
    String response = "";
    
    if(statement.length == 0){
       response = ("Say something, please.");
    }

    else if (findKeyword(statement, "no") >= 0){
        response = "Why so negative?";
    }

    else if (findKeyword(statement, "mother") >=0 )
        || findKeyword(statement, "father") >= 0
        || findKeyword(statement, "brother") >= 0
        || findKeyword(statement, "sister") >= 0
    {
        response = "Tell me more about your family";
    }
}
```