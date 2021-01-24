package tricky.constructor;
/*
 * Why Constructors are not inherited in Java?
 * Constructor is a block of code that allows you to create an object of class and has same name as class with no explicit return type.
 *
 * Whenever a class (child class) extends another class (parent class), the sub class inherits state and behavior in the form of variables and methods from its super class but it does not inherit constructor of super class because of following reasons:
 *
 *
 * Constructors are special and have same name as class name. So if constructors were inherited in child class then child class would contain a parent class constructor which is against the constraint that constructor should have same name as class name. For example see the below code:
 *
 * */

public class Child {
    public static void main(String[] args) {
        Child c1 = new Child(); // allowed
     //   Child c2 = new Parent(); // not allowed
    }

    /* A constructor cannot be called as a method.
    It is called when object of the class is created so it does not make sense of creating child class object using parent class constructor notation.
     i.e. Child c = new Parent();
    *
    * */
/*
    public Parent()
    {

    }*/
/*
    A parent class constructor is not inherited in child class and this is why super() is added automatically in child class constructor if there is no explicit call to super or this*/

    public void print() {
    }

}
