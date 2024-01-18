# 2.2 Creating and Storing Objects (Instantiation)
## 2_2 P1
+ Constructors are used to initialize the attributes for an object

```
public Person(String nm, int ag, boolean ad) {
    name = nm;
    age = ag;
    isAdult = ad;
}
```
To create an object, you use "**new**" followed by the class name
```
Person grace = new Person("Grace", 42, true);
```
You can have multiple constructors for one object - called overloading the constructor

A "no-argument" constructor has no parameters and sets the instance variables for the object to default values
## 2_2 P2
Creating an Employee - name, ID, and pay rate
```
public Employee(string nm, string ID, int payRate){
    name = nm;
    empID = ID;
    pay = 20;
}

Employee person1 = new Employee("Simon", "7628", 60000);
Employee person2 = new Employee("Simone", "7628");
Employee person3 = new Employee("Dave", "7628", 40000);
Employee person4 = new Employee();
```

## 2_2 P3
Default Value - **null**

You can create an object with **null** attributes, and assign values to it later
