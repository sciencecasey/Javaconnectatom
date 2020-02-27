import java.util.Scanner;

public class BMICalc{
   public static void main(String args[]){
      //Define Input variables
      //stored as doubles to allow for precise calculations
      double weight;
      double height;
      double total;
      //BMI stored as float to keep output clear to User
      float BMI;

      //Prompt for Inputs
      Scanner input = new Scanner( System.in );
      System.out.println( "\n\n" );
      System.out.print( "Enter weight in lbs (ie: 125.2): " );
      weight = input.nextDouble();  // Input first value
      System.out.println( "\n\n" );
      System.out.print( "Enter height in inches (ie: 55.5): " );
      height = input.nextDouble();     // Input second value
      System.out.println( "\n\n" );

      //Inform User
      System.out.println( "The purpose of this program is to calculate your");
      System.out.println( "Body Mass Index (BMI), as defined by the NIH. " );
      System.out.println( "\n" );
      System.out.println( "It can not be used to diagnose or evaluate " );
      System.out.println( "a users health.  Please seek medical advice for " );
      System.out.println( "individualized information. " );
      System.out.println( "\n" );
      //as user to participate to encourage reading disclaimer
      System.out.println( "Press enter to continue." );
      var key = input.nextLine();
      key = input.nextLine();

      //Calculate BMI
      weight *= .45359273;
      height *= .0254;
      total = weight/(height*height);
      BMI = (float)total;
      System.out.println("BMI is " + BMI);

      //Output individualized information
      //use most precise measure stored in "total" to categorize
      if( total < 18.50 ){
         System.out.println(" Which is considered \"Underweight\" by the NIH ");
      }
      if(18.50 <= total && total <= 24.999){
         System.out.println(" Which is considered \"Normal\" by the NIH ");
      }
      if(24.999 < total && total <=29.999){
         System.out.println(" Which is considered \"Overweight\" by the NIH ");
      }
      if( total > 29.999 ){
         System.out.println(" Which is considered \"Obese\" by the NIH ");
      }

      //Output Final and More Info
      System.out.println( "\n\n" );
      System.out.print( "\tThe Department of Health and Human Services " );
      System.out.print( "\n\tclasses a BMI of less than 18.5 Underweight,  " );
      System.out.print( "\n\t18.5-24.9 Normal, 25-29.9 Overweight, and  " );
      System.out.print( "\n\t30 or greater Obese." );
      System.out.print( "\n\n\tPlease visit the NIH  website" );
      System.out.print( "for more information." );
      System.out.println( "\n\n\tThank you, your program is complete.\n\n");
   }
}
