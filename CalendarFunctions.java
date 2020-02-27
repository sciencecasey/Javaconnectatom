package calendarView;

public class CalendarFunctions {
   /**
   * Print the Calendar View fully by calling other methods
   * @param month input month as integer
   * @param year input year as integer (negative for BCE)
   *
   * precondition: month and year are integer values
   * precondition: year is between -1000 and 2500
   * precondition: the chosen month/year is useable with Zellers formula
   * postcondition: print the month of the Gregorian calendar overlaid
   * postcondition: leap years are imposed as they are currently used, not historically accurate
   *
   * @author CaseyJayne
   */
   public void printMonthCalendar(int month, int year){
   //Print header
   printMonthHeader(month, year);
   //Printbody
   printMonthBody(month, year);
   }

   /**
   * Print the Header of the month
   * @param month insert the month integer
   * @param year insert the year integer
   *
   * precondition: month and year are integers
   * precondition: month is in 1-12 range
   * postcondition: month and year output on a line with a line beneath
   * postcondition: calendar header has week beginning Sunday on left side
   *
   * @author CaseyJayne
   */
   public void printMonthHeader(int month, int year){
      //Print header using input year and returned monthName and passed year
      System.out.println("\t" + getMonthName(month) + "   " + year);
      System.out.println("_________________________________");
      System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
   }

   /**
   * get the month name based on integer month value
   * @param month input the month integer 1-12
   * @return name of the month in typed form
   *
   * precondition: month is 1-12 integer number
   * postconditon: string returned with fully typed MonthName in English
   *
   * @author CaseyJayne
   */
   public String getMonthName(int month){
      String monthName= "Null";//declare return variable

      //use input to initialize the monthName variable
      switch(month){
         case 1:
            monthName = "January";
         break;
         case 2:
            monthName = "February";
            break;
         case 3:
            monthName = "March";
            break;
         case 4:
            monthName = "April";
            break;
         case 5:
            monthName = "May";
            break;
         case 6:
            monthName = "June";
            break;
         case 7:
            monthName = "July";
            break;
         case 8:
            monthName = "August";
            break;
         case 9:
            monthName = "September";
            break;
         case 10:
            monthName = "October";
            break;
         case 11:
            monthName = "November";
            break;
         case 12:
            monthName = "December";
               break;
         } //end switchcase

         //output monthName to print;
             return monthName;
   }

   /**
   * print the body of the calendar adjusted for leap years
   * @param month insert month as integer
   * @param year insert year as integer
   *
   * precondition: year is an integer between -1000 and 2500
   * precondition: month is an integer between 1 and 12
   * postcondition: calendar applied with Gregorian calendar leap years
   * postcondition: calendar body shows Sundays on the left
   *
   * @author CaseyJayne
   */
   public void printMonthBody(int month, int year) {
      //get days in the month
      //this will set the stopping point for month
      int totalDays = getNumDays(month,year);
      //print first line based on start days
      int startDay = getStartDay(month, year);

      //use Switch case based on start day to set first rows
      switch(startDay){
         case 1:{
            System.out.println("   1   2   3   4   5   6   7");
            System.out.println("   8   9  10  11  12  13  14");
            System.out.println("  15  16  17  18  19  20  21");
            System.out.println("  22  23  24  25  26  27  28");
            break;
            }
         case 2:{
            System.out.println("       1   2   3   4   5   6");
            System.out.println("   7   8   9  10  11  12  13");
            System.out.println("  14  15  16  17  18  19  20");
            System.out.println("  21  22  23  24  25  26  27");
            break;
            }
         case 3:{
            System.out.println("           1   2   3   4   5");
            System.out.println("   6   7   8   9  10  11  12");
            System.out.println("  13  14  15  16  17  18  19");
            System.out.println("  20  21  22  23  24  25  26");
            break;
            }
         case 4:{
            System.out.println("               1   2   3   4");
            System.out.println("   5   6   7   8   9  10  11");
            System.out.println("  12  13  14  15  16  17  18");
            System.out.println("  19  20  21  22  23  24  25");
            break;
            }
         case 5:{
            System.out.println("                   1   2   3");
            System.out.println("   4   5   6   7   8   9  10");
            System.out.println("  11  12  13  14  15  16  17");
            System.out.println("  18  19  20  21  22  23  24");
            break;
            }
         case 6:{
            System.out.println("                       1   2");
            System.out.println("   3   4   5   6   7   8   9");
            System.out.println("  10  11  12  13  14  15  16");
            System.out.println("  17  18  19  20  21  22  23");
            break;
            }
         case 7:{
            System.out.println("                           1");
            System.out.println("   4   3   4   5   6   7   8");
            System.out.println("   9  10  11  12  13  14  15");
            System.out.println("  16  17  18  19  20  21  22");
            break;
            }
      }

      //use if loop for last rows
      //Start Sunday
      if(startDay== 1){
         if (totalDays ==29){
            System.out.println("  29");
         } else if (totalDays ==30){
            System.out.println("  29  30");
         } else if (totalDays ==31){
            System.out.println("  29  30  31");
         } else{}//if 28 days, fully printed
      } //Start Monday
      else if(startDay ==2){
         if (totalDays == 28){
            System.out.println("  28");
         } else if (totalDays == 29){
            System.out.println("  28  29");
         } else if (totalDays ==30){
            System.out.println("  28  29  30");
         } else {
            System.out.println("  28  29  30  31");
         }
      }//Start Tuesday
      else if(startDay == 3){
         if (totalDays == 28){
            System.out.println("  27  28");
         } else if (totalDays == 29){
            System.out.println("  27  28  29");
         } else if (totalDays ==30){
            System.out.println("  27  28  29  30");
         } else {
            System.out.println("  27  28  29  30  31");
         }
      }//Start Wednesday
      else if(startDay == 4){
         if (totalDays == 28){
            System.out.println("  26  27  28");
         } else if (totalDays == 29){
            System.out.println("  26  27  28  29");
         } else if (totalDays ==30){
            System.out.println("  26  27  28  29  30");
         } else {
            System.out.println("  26  27  28  29  30  31");
         }
      }//Start Thursday
      else if(startDay == 5){
         if (totalDays == 28){
            System.out.println("  25  26  27  28");
         } else if (totalDays == 29){
            System.out.println("  25  26  27  28  29");
         } else if (totalDays ==30){
            System.out.println("  25  26  27  28  29  30");
         } else {
            System.out.println("  25  26  27  28  29  30  31");
         }
      } //Start Friday
      else if(startDay == 6){
         if (totalDays == 28){
            System.out.println("  24  25  26  27  28");
         } else if (totalDays == 29){
            System.out.println("  24  25  26  27  28  29");
         } else if (totalDays ==30){
            System.out.println("  24  25  26  27  28  29  30");
         } else {
            System.out.println("  24  25  26  27  28  29  30");
            System.out.println("  31");
         }
      }//Start Saturday
      else if(startDay == 7){
         if (totalDays == 28){
            System.out.println("  23  24  25  26  27  28");
         } else if (totalDays == 29){
            System.out.println("  23  24  25  26  27  28  29");
         } else if (totalDays ==30){
            System.out.println("  23  24  25  26  27  28  29");
            System.out.println("  30");
         } else {
            System.out.println("  23  24  25  26  27  28  29");
            System.out.println("  30  31");
         }
       }// end of loop setting last calendar line
   }

   /**
   * output the number of days in a given month and year
   * @param month input the month
   * @param year input the year
   * @return the number of days int the month as an integer
   *
   * precondition: month and year are ingegers
   * precondition: year expressed as astrological value with negative for BCE
   * precondition: year input is between -1000 and 2500
   * postcondition: Gregorian leap year values back-applied through all time,
   * even when Gregorian calendar not in effect historically
   *
   * @author CaseyJayne
   */
   public int getNumDays(int month, int year){
      int daysInMonth = 0;

      switch(month){
         case 1:
         case 3:
         case 5:
         case 7:
         case 8:
         case 10:
         case 12:{//all 31 day months
            daysInMonth = 31;
            break;
         }
         case 2:{ //February;
            //invoke isLeapYear method to set daysInMonth
            if(isLeapYear(year)){
               daysInMonth = 29;
            }
            else{
               daysInMonth = 28;
            }
         }
         default:{
            daysInMonth = 30;
            break;
         }
      }//end switchcase

      //return value int number of days
      return daysInMonth;
    }

   /**
   * Output True False for Leap Year
   * @param year input year as integer
   * @return boolean True if a leap year
   *
   * precondition: year input as integer in the astrological format
   * precondition: year between -1000 and 2500
   * precondition: years in BCE expressed with negative value
   * postcondition: Gregorian calendar leap years applied to all inputs
   * postcondition: leap year exported not histroically accurate before 1582
   */
   public boolean isLeapYear(int year){
      boolean isLeapy;

      //set boolean value
      if (year % 400 == 0){
         //years divisible by 400 are leap years
         isLeapy = true;
      } else if (year % 100 == 0){
         //all other years divisible by 100 not leap years
         isLeapy = false;
      } else if (year % 4 ==0){
          //all other years divisible by 4 are leap years
         isLeapy = true;
       } else{
         isLeapy = false;
       }//end set boolean if loop

      //return the boolean
      return isLeapy;
   }


   /** getStartDay
   * The method getStartDay() implements Zeller's Algorithm for determining
   * day of the week the first day of a month is. The method adjusts Zeller's
   * numbering scheme for day of week ( 0=Saturday, ..., 6=Friday ) to conform
   * to day of week number that corresponds to ISO conventions (i.e.,
   * 1=Monday, ..., 7=Sunday)
   *
   * Pre-Conditions: The month value, m, is 1-12 The day value, d, is 1-31, or
   * 1-28, 1-29 for February The year value, y, is the full year (e.g., 2012)
   *
   * Post-Conditions: A value of 1-7 is returned, representing the first day
   * of the month 1 = Monday, ..., 7 = Sunday
   *
   * https://codereview.stackexchange.com/questions/67722/its- friday-zellers-congruence-revisited
   * @param month
   * @param year
   * @return dayNum (1 = Mon, ... , 7 = Sun )
   *
   * precondition: month, year, and day are integer types
   *
   * @author: rolfl, modified by Josh Lafond
   */
   public int getStartDay(int month, int year) {
      // Adjust month number & year to fit Zeller's numbering system
      if (month < 3) {
         month += 12;
         year -= 1;
      }

      int centuryYear = year % 100;    // Calculate year within century
      int centuryTerm = year / 100;    // Calculate century term
      int firstDayInMonth = 0;         // Day number of first day in month 'm'

      firstDayInMonth = (1 + // to shift index 0 to the 1-7 return range
         (13 * (month + 1) / 5)
         + centuryYear +
         (centuryYear / 4) +
         (centuryTerm / 4) +
         (5 * centuryTerm)) % 7;

      // Convert Zeller's value to ISO value (1 = Mon, ... , 7 = Sun )
      int dayNum = ((firstDayInMonth + 5) % 7) + 1;

      return dayNum;
   } // end getStartDay()
}
