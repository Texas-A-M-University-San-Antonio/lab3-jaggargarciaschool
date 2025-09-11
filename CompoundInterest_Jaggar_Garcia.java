
import java.util.Scanner;
public class CompoundInterest_Jaggar_Garcia
{
    public static void main(String[] args)
    {
        //Declaration of variables used throughout this program
        double initialHomeValue;
        int numOfElapsedYears;
        double interestRate;
        double finalHomeValue;

        //Declaring new scanner variable 
        Scanner inputVariable = new Scanner(System.in);

        //Print to user instructions to enter value of house
        System.out.println("Enter the initial value of the home: ");
        
        //Capture input of user
        initialHomeValue = inputVariable.nextDouble();

        //Print to user instructions to number of elapsed years
        System.out.println("Enter the number of elapsed years...:");
        
        //Capture input of user
        numOfElapsedYears = inputVariable.nextInt();

        //Print to user instructions to enter value of the interest rate
        System.out.println("Enter the interest rate your up against...:");
        
        //Capture input of user
        interestRate = inputVariable.nextDouble();

        //Convert interest rate to decimals
        interestRate /= 100.0;
        System.out.println(interestRate);

        //Final formula with consideration to pemdas
        finalHomeValue = initialHomeValue * Math.pow((1.00 + interestRate), numOfElapsedYears);

        //Printing final calculation.
        System.out.println("The final value of the home is : " +finalHomeValue);



    }
    
}