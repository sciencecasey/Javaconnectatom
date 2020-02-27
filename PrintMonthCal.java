package calendarView;

import java.util.Scanner;

public class PrintMonthCal {

   public static void main(String[] args) {
      //declare variables:
      int monthNum = 0;
      int yearNum = -10001;
      try (//Setup Scanner
      Scanner input = new Scanner(System.in)) {
         //Explain use of program
         System.out.println("This program displays a  Gregorian calendar output "
             + "of the desired year.");
         System.out.println(" \n\n\nPlease note- the Gregorian Calendar is not "
             + "historically significant before 1600 in most of the world. \nThis "
             + "program should not be used for historically accurate back-dating.");

         //prompt user for Month and year with error catch
         do{
            System.out.println("\n\nWhat month would you like to view? Please enter "
                + "an integer (1 - 12): ");
            monthNum = input.nextInt();
         } while((monthNum < 1) || (monthNum > 12));
         do{
            System.out.println("\n\nWhat year would you like to view?");
            System.out.println("Please enter an astronomical year as a whole "
                + "integer (-1000 to 2500)");
            yearNum = input.nextInt();
         } while((yearNum < -1000) || (yearNum > 2500));
      }

      //Call Calendar Cascading methods
      //Call Instance
      CalendarFunctions monthprint = new CalendarFunctions();
      monthprint.printMonthCalendar(monthNum, yearNum);
      }
}
