// Class:
// Class is a blueprint to create an objects

// Object:
// Object is an instance of class

// For ex:
// Factory contains the blueprint of cars so it is class
// Whereas the cars manufactured by that factory is an object
// And these cars are instance of the class because this cars are created by the class factory

// Class Structure:
class class_name{
    code block
}
// here 'class' is a keyword (syntax)
// class_name is the name of the class
// code block is the lines of codes


// Methods:
// Group of instructions to do specific tasks
// For ex:
// A method to add two numbers
// A method to say Hi to the user
// A method to get the user's name
// In Java we have a special method called "main"

// Method Structure:
// each methods consists of 4 main parts
return_type method_name( parameters ){
    code block
}
// return_type the type which we want to be returned
// method_name is a name of the method
// parameters is data that are given to the method and method uses this data inside the code block
// code block is the lines of codes

// Every methods are written inside the class
// So the class is the container of the methods

// Calling A Method:
// is basically using the method
method_name( give parameters );
// the code block of this method will be executed
// the main() method is automatically called when we run our Java program 
// It is the first method that is called
// It is the starting point of execution of our program

// Access Modifiers:
// These are the keywords that specify how to access classes and methods
// Public
// Private
// Protected
// Default

// Naming Conventions:
// 1.Pascal case convention:
// Ex: ThisIsAName , JavaProgram
// It is used in class in Java
// 2.Camel case convention:
// Ex: thisIsAName , javaProgram
// It is used in variable and methods in Java
// 3.Snake case convention:
// this_is_a_name , java_program

// Java Program Structure:
public class Main{

    public static void main(String[] args){

    }

}

// Package:
// A container for classes
// Package can have a multiple classes
// Inside the classes there are lot of methods