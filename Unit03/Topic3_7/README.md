# 3.7 - Comparing Objects
## 3_7 P1
```
House myHouse = new House("Green", 1850, 3);
House annasHouse = new House("Green", 1850, 3);
if(myHouse == annasHouse){
    code
}
else{
 code
}
```
Though they have the same attributes, the comparison will not evaluate as true unless they are the **same** object

You can also do comparisons between objects and **null**

Ex:
```
House gregsHouse = new House;
if(gregsHouse == null){
    code
}
else{
    code
}
```
## 3_7 P2
class.equals compares the attributes of two objects, unlike "=="

Ex:
```
Rectangle box = new Rectangle(10, 10, 200, 200);
Rectangle fourSides = new Rectangle(10, 10, 200, 200);

System.out.print(" " + box.equals(fourSides));
```
/\ Outputs " true"