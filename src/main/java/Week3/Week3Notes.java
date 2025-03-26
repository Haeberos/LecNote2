package Week3;

public record Week3Notes() {
    // Java Methods are basically Python Functions
    // Methods are called in other parts of the program to return a variable
    // Often used for validation or just performing tasks that need to be blocked off
    // This allows them to be called multiple times for multiple reasons following user input

    // Remember that we're manipulating the pom.xml file to import input.utils for user input
    // this is calling a method that is precompiled and imported using java and github

    // TODO The most important function of a Method is to 'get' a value.
    // TODO More often then not you need to return a value, even if that value is null.
    // TODO Every argument called in the Method must be used in the Method syntax

    // TODO Method Syntax:
        // TODO: public static String makeGreeting(String n) {
        // TODO: String greeting = "Hello" + n + "!";
        // TODO: return greeting;
        // TODO: }

        // public static is the modifier (Public, Private, Class, Static)
            // Public is accessible to all non-child parts of the package (week3 for example)
            // Private can only be accessed in the file
            // Class is a template
                // Object is an instance of that template
            // Static is a method attached to the Class template
        // String is the return type  -  void can be used if you don't want to return anything
        // makeGreeting is the name of the Method being called. Referenced elsewhere to start the block
        // String n is the argument : type and name. Use commas to separate multiple arguments
            // If you use multiple arguments, provide multiple variables
        // return is used to give the specified greeting value back to the referencing call

    // We often use the public static void method that is baked into Java helper,
    // and its a void because we don't want to return any kind of data type
    // However we very often use it to call OTHER methods, other static doubles, static strings, etc
    // Public Class refers to the class (aka the template) and Objects are
    //  -instances of that class.
    // A Static essentially becomes part of the Class instead of an Instance

    // You could choose to print in the method, or return the value of a method then print it

    // TODO Keep in mind that the Scope of a variable means it can exist in multiple places in the code
    // TODO If you define a variable 'Gas' in the main method, you could define 'Gas' in a private method
    // TODO -and the two names wouldn't conflict

    // TODO Something very neat is that you can put formatting into a method to save you some time
    // Refer to StringFormatting

    // TODO REMEMBER that primitive data types of variables in main cannot be modified in a method
    // TODO Arrays, however, can. If you modify a list in a a method, that list will change in main
}