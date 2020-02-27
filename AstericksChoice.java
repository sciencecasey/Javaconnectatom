import java.util.Scanner;

public class AstericksChoice {
   public static void main(String args[]) {
      //Declare Variables
       char ast = '*';  //dislay character
       String example = "l"; //choice to see example
       int maxAst = 0; //updated by choice of * number
       int growOrShrink = 0; //updated by view choice
       int i; //declare loop line counter
       int j; //declare loop character counter
       
       //Explain output
       Scanner input = new Scanner( System.in ); //initialize capture System
       System.out.print("\n\n\tIn this program user chooses ");
       System.out.print("a display of growing number of ***");
       System.out.println(" per line or a shrinking number of **.");
       System.out.print("\tUser also chooses the total number of ** to display");
       System.out.print("\n\tWould you like to see an example?");
       System.out.println(" (type 'y' for yes or 'n' for no) : ");
       example = input.nextLine();
       
       switch (example) {
          case "n": {
             break; //do nothing
          }
          default: {//default to showing example if y or invalid input
             System.out.println("\n\t This is growing: ");
             System.out.println("\t*");
             System.out.println("\t**");
             System.out.println("\t***");
             System.out.println("\n\t This is shrinking: ");
             System.out.println("\t***");
             System.out.println("\t**");
             System.out.println("\t*");
          }
       }
       
       //Ask for growing or shrinking tree:
       do { //error handling for invalid input
          System.out.println("\n\tWould you like to make a : ");
          System.out.println("\t\t\t1. Growing ** tree ");
          System.out.println("\t\t\t2. Shrinking ** tree");
          System.out.println("\n\t(Please type '1' or '2')");
          growOrShrink = input.nextInt();
       }while((growOrShrink<1) || (growOrShrink>2));
       
       //Ask how many Asterisks
       do {
          System.out.println("\n\tHow many ** would you like to display?");
          System.out.println("\tType an integer value less than 101");
          maxAst = input.nextInt();
       }while((maxAst<1) ||(maxAst>100));
       
       //Print Tree!
       if (growOrShrink == 1) { //Growing choice!
          for (i = 1; i <= maxAst; i++) { //print tree
             System.out.print("\n"); //print new line
             j = 1; //always set j to 1 so that each output grows
             while (j <= i) {
                System.out.print("" + ast);
                j++; //keep incrementing until j>i then, back to i
             }
          }
       } //End grow choice
       else {//Shrinking choice
          for (i = maxAst; i >= 1; i--) { //print tree
             System.out.print("\n\t"); //print new line
             j = i; //always set j to 1 so that each output grows
             while (j >= 1) {
                System.out.print("" + ast);
                j--; //keep incrementing until j>i then, back to i
             }
          }
       }//end shrink choice
       
       
       System.out.println("\n\n\t\t Hooray! \n");
       }//end main
   }
