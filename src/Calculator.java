public class Calculator extends Object { //hierarchy - inheritance in OOP, encapsulation/ information hiding
    //oop - Object Oriented Programming
    //hierarchy
    //encapsulation
    //polymorphism

    private String name; //field for calculator name
    public int year; //year created

    public String showMessage() { //public method that returns a hi message
        return "hi";
    }

    public Calculator() {//parameterless constructor
        this("");
        System.out.println("Calculator constructor invoked");
    }

    public Calculator(String name) { //constructor overloaded, initializes the name with the given value
        //initialize the field
        this.name = name; //this refers to the current instance
        this.year = 2000; //default year
    }

    public String getName(){
        return changeName();
    }

    public void setName(String name) {
        this.name = name;
    }

    private String changeName() {
        return this.name + "!";
    }
}
