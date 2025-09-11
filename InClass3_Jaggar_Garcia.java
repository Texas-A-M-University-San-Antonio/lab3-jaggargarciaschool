/**
 * Name: Jaggar Garcia
 * Date: 09/10/25
* Purpose: InClass 3 - 
* This class is to implement the math functions and manipulate user data through formula's for finding 
* the area of a square and parsing the result back out to the user.
 */

// Don't forget to import and declare a Scanner for user input.
//Importing the scanner class to be use in this assignment
import java.util.Scanner;
public class InClass3_Jaggar_Garcia
{
    public static void main(String[] args) 
    {
        // In-Class 3 Example:
        // Declaring a variable for the scanner class
        Scanner newScanVariable = new Scanner(System.in);        
        
        // Step 1: Prompt the user to enter the length of the side of a cube.
        System.out.println("Enter the length of the side of your cube..");
        
        // Step 2: Read the user's input and store it in a variable.
        double lengthVar = newScanVariable.nextDouble();

        // Step 3: Use an appropriate method to determine the volume of the cube.
        //Math.pow function to get the volume of a cube passing two variables
        const int volumeParam = 3;
        double varVol = Math.pow(lengthVar,volumeParam);

        // Step 4: Use an appropriate method to determine the surface area of the cube.
        //Match.pow function use to find the volume of a cube using a constant int
        const int sfParam = 2;
        double varSF = 6 * Math.pow(lengthVar,sfParam);
        // HINT: Steps 3 and 4 will use the Math.pow(a, b) method
        // Step 5: Print the volume and surface area in clear sentences.

        //Volume and Suface area printed on two lines using the variables
        System.out.println("The Volume of your cube is : " + varVol);
        System.out.println("The Surface Area of your cube is : " + varSF);
    }
}