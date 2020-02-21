/*The following program prompts a user to enter temperatures in degrees 
Fahrenheit or Celsius. It then converts the entered temperature to the other 
measurement scale and displays both the entered temperature and the equivalent 
temperature in the other measurement scale.*/

import java.util.Scanner;

public class TempConversionSwitch {
   public static void main( String args[] ) {
    int userChoice = 0; // User selection: 1, 2, 3
    float temperatureFahrenheit = 0; // Fahrenheit temperature
    float temperatureCelsius = 0; // Celsius temperature
 // Create a Scanner to obtain user input
    Scanner input = new Scanner( System.in );    
    
    while( userChoice != 3 ) {
      System.out.print( "Enter 1 to convert F->C, 2 to convert C->F, 3 to quit: " );
      userChoice = input.nextInt();// Read user input
      switch( userChoice ) {
        case 1:// Convert Fahrenheit to Celsius
                    System.out.print( "Enter a Fahrenheit temperature: " );
                    temperatureFahrenheit = input.nextFloat();
                    temperatureCelsius = 5F/9F * ( temperatureFahrenheit - 32F );
                    System.out.println( temperatureFahrenheit + " degrees Fahrenheit is " + temperatureCelsius + " degrees Celsius" );
                    break;
        case 2:// Convert Celsius to Fahrenheit
                    System.out.print( "Enter a Celsius temperature: " );
                    temperatureCelsius = input.nextFloat();
                    temperatureFahrenheit = 9F/5F * temperatureCelsius + 32F;
                    System.out.println( temperatureCelsius + " degrees Celsius is " + temperatureFahrenheit + " degrees Fahrenheit" );
                    break;
        case 3:// End Program
                    System.out.println( "Bye Bye" );
                    break;
        default:// Invalid Data Entered
                    System.out.println( "Invalid Data: You must enter 1, 2, or 3" );           
      }
    }
  }
}
//Re-design this program using methods. 
//Explain the justification behind your re-design and why using 
//methods is advantageous.