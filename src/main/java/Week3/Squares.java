package Week3;

import static input.InputUtils.doubleInput;

public class Squares {

    //This is the main method - the first code to run
    public static void main(String[] args) {

        double number = doubleInput("Please enter a number and I'll square it");
        square(number);

        //Also could use, then replace the print line (28) with a return for the value
            //double number = doubleInput("Please enter a number and I'll square it");
            //double squaredNumber = square(number);
            //System.out.println("The square of " + number + " is " + squaredNumber);


    }    // This is the end of the main method.


    // This method takes one argument, a number
    // It calculates the square of that number (by multiplying it by itself)
    // and prints the number and its square value
    public static void square(double n) {

        double sq = n * n;   // The square of a number is that number multiplied by itself
        System.out.println("The square of " + n + " is " + sq);

    }    // The end of the squares method

} // End of the Squares class