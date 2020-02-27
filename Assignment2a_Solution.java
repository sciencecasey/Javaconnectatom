import java.util.Scanner;

public class Assignment2a_Solution
{
  public static void main( String [] args )
  {
    // Define and initialize variables for values to be input
    int v1 = 0;      // First value to be input
    int v2 = 0;      // Second value to be input
    int v3 = 0;      // Third value to be input
    int v4 = 0;      // Fourth value to be input
    int v5 = 0;      // Fifth value to be input
    int v6 = 0;      // Sixth value to be input
    int col1 = 0;    //calculate after input
    int col2 = 0;    //calculate after input
    int row1 = 0;    //calculate after input
    int row2 = 0;    //calculate after input
    int row3 = 0;    //calculate after input
    int gtotal = 0; //calculate grand total after input

    // Use a Scanner to input integer values
    Scanner input = new Scanner( System.in );
    System.out.println( "\n\n" );
    System.out.print( "Enter 6 integers separated by a blank space:" );
    v1 = input.nextInt();     // Input first value
    v2 = input.nextInt();     // Input second value
    v3 = input.nextInt();     // Input third value
    v4 = input.nextInt();     // Input fourth value
    v5 = input.nextInt();     // Input fifth value
    v6 = input.nextInt();     // Input sixth value

    // Calculate Totals
    col1 = v1+v3+v5; // add odd inputs in col1
    col2 = v2+v4+v6; // add even inputs in col2
    row1 = v1+v2;  //add first row
    row2 = v3+v4;  //add second row
    row3 = v5+v6;  //add third row
    gtotal = col1+col2; //grand total

    // Output using System.out.println()
    System.out.println( "\n\n" );
    System.out.println( "\t" + "Value" + "\t" + "Value" + "\t" + "Total");
    System.out.println( "\t" + v1 + "\t" + v2 + "\t" + row1);
    System.out.println( "\t" + v3 + "\t" + v4 + "\t" + row2);
    System.out.println( "\t" + v5 + "\t" + v6 + "\t" + row3);
    System.out.println( "\t___\t___\t___");
    System.out.println( "Total   " + col1 + "\t" + col2 + "\t" +gtotal);
    System.out.println( "\n\n" );
  }
}
