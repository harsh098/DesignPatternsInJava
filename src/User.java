/*
* Notes for Using This Keyword in Java
*
* Definition and Usage
* The this keyword refers to the current object in a method or constructor.
* The most common use of the this keyword is to eliminate the confusion between
* class attributes and parameters with the same name
* (because a class attribute is shadowed by a method or constructor parameter).
* this can also be used to:
*       - Invoke current class constructor
*       - Invoke current class method
*       - Return the current class object
*       - Pass an argument in the method call
*       - Pass an argument in the constructor call
* */

public class User {
    //Fields
    public String name;

    //Methods
    //Constructor
    public User(String name){
        this.name = name;
    }
    public void sayHello(){
        System.out.println("Hi! My Name is "+ name);
    }
}
