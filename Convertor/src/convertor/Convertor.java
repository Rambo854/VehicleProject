
package convertor;
import java.util.*;
//This is my assessment on the Covertor
//Cosimo Ricupero

//Methods:
//Scanner(System.in)
//System.out.println()
//scan.nextInt()
//scan.nextDouble()
//case
//switch
//while


//Purpose ----------------------------------------------
//This is my convertor, it performs two main functions.
//Converting measurements that are entered in from centimeters to Inches.
//Converting measuremenst that are enetered in from Meters to Feet.
//from the single screen, you can either use one of the main functions or
//exit the program completely. I assigned switch with cases to each of these.
//Case 1 for cm to inches, case 2 for m to feet, and finally case 3 for exiting
//the program.

public class Convertor 
{
    private static Scanner scan = new Scanner(System.in);
    
    public static void main (String[] args)
    { 
        //choice is declared to the variable int 
        //for users to input their data
		int choice;
		do
		{
			System.out.println("1 = Centimeters to inches"
				+ " \n2 = Meters to feet" + "\n3 = Exit"+"\nSelect your choice");
			choice = scan.nextInt();
			//This is the user can choose a function either 1 or 2
				switch(choice)
			{
			case 1:
				convertCMToInches();
				break;

			case 2:
				convertMToFeet();
				break;
			}
				//This will loop everytime through either of the two 
				//main functions until 3 is entered.
		}while(choice !=3);
    }
    
    //This is function "1" or case 1
    //This is a block of code for coverting centimeters to inches
    public static void convertCMToInches()
    {
		double value, answer;

		System.out.println("Enter a value to convert");

		value = scan.nextDouble();

		answer = value*0.393701;

		System.out.println("The answer is "+ answer);
    }
    
    //This is function "2" or case 2
    //This is a block of code for coverting meters to feet
    public static void convertMToFeet()
    {
		double value, answer;

		System.out.println("Enter a value to convert");

		value = scan.nextDouble();

		answer = value*3.28084;

		System.out.println("The answer is "+answer);
    }
}
