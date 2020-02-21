import java.util.Scanner;

public class TempConversionMethods {
   public static void main(String args[]) {
      int userChoice = 0;
      double userStart = 0;
      double userEnd;
      Scanner input = new Scanner(System.in);
      
    //use a do-while to catch invalid entry by user
      do {
         System.out.println("Is your starting Temperature Value in Farhenheit or "
               + "Celsius?");
         System.out.println("Enter 1 for Farhenheit or 2 for Celsius: ");
         userChoice = input.nextInt();
         System.out.println("Enter the temperature your starting temperature: ");
         userStart = input.nextDouble();
         
         if (userChoice == 1) {
            userEnd = ftoCelsius(userStart);
            System.out.println( userStart + " degrees Fahrenheit is " + userEnd +
                  " degrees Celcius");
         }
         else if(userChoice == 2) {
            userEnd = ctoFarhenheit(userStart);
            System.out.println( userStart + " degrees Celsius is " + userEnd +
                  " degrees Fahrenheit");
         }
         else {
            System.out.println("I didn't understand your input.");
         }
      } while(userChoice>2 || userChoice<1); 
   }    
      
   /**
    * Convert temperature from Farhenheit to Celcius and return results.
    * @param input input temperature
    * @return output temperature
    * 
    * precondition: input and output are doubles
    * precondition: user input value is Farhenheit
    * postcondition: the output value is in Celcius
    * 
    * @author CaseyJayne
    */
   public static double ftoCelsius(double input) {
      double output = 5/9 * ( input - 32 );
      return output;
   }
      /**
    * Convert temperature from Celsius to Farhenheit and return results.
    * @param input input temperature
    * @return output temperature
    * 
    * precondition: input and output are doubles
    * precondition: user input value is Celsius
    * postcondition: the output value is in Farhenheit
    * 
    * @author CaseyJayne
    */
   public static double ctoFarhenheit(double input) {
      double output = 9/5 * input + 32;
      return output;
   }  
}