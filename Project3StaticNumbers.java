
// the import keyword is used to load in additional Java PACKAGE code for our programs
// in this case, we are loading in the standard "util" package for the Scanner class
import java.util.*; // anything after the // is a comment


// we use the class keyword to denote an OBJECT
// an object is simply a collection of PROPERTIES (variables)
// and METHODS (functions) that relate to each other
public class Project3StaticNumbers {

    //First Static method, it calculates sum of two integers and returns sum.
    //It takes those numbers as parameters
    public static int addNumbers(int a, int b)
    {
        return a+b;
    }
    //Second Static method, it calculates Difference of two integers and returns difference.
    //It takes those numbers as parameters,
    public static int subtractNumbers(int a, int b)
    {
        return a-b;
    }
    //This method utilizes addNumbers and subtractNumbers methods to get sum and
    // difference of two numbers and print that on console.
    public static void displaySumAndDifference(int a, int b)
    {
        int sum = addNumbers(a,b);
        int difference = subtractNumbers(a,b);
        System.out.println("Sum of "+a+" and "+b+" is:"+sum);
        System.out.println("Difference of "+a+" and "+b+" is:"+difference);
    }
    public static void main(String[] args) {

    int a =10, b=20;  //setting values for a and b
      //calling static method to print sum and difference
      displaySumAndDifference(5,10);



      // initialize a variable of type OBJECT Scanner and call its CONSTRUCTOR with the System.in parameter)
    Scanner user_input = new Scanner(System.in);

    // a standard Java method for output of a STRING LITERAL
    // the \n denotes a "carriage return" - or blank line
    System.out.println("LiberateToAutomate\n\n");

    System.out.println("Enter a number from 1-8:");
    // initialize a STRING VARIABLE and call the Scanner.nextLine() of user_input
    String raw_value = user_input.nextLine();

    System.out.println("\n\n\n\n");
    if (raw_value.matches("^[1-8]$") ) {
       int option = Integer.parseInt(raw_value);
        System.out.println("You Entered: a valid number!");
        System.out.println("That number will work!");
    } else {
        System.out.println("You Entered:" + raw_value);
        System.out.println("Restart and try again!");
    }
  }
}