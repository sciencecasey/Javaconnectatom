public static CalendarView(){
   public static void main(String args[]){
      //declare variables:
      int monthNum = 0;
      int yearNum = -10001;
      //Setup Scanner
      Scanner input = new Scanner(System.in);

      //Explain use of program
      System.out.println("This program displays a  Gregorian calendar output  +of the desired year.");
      System.out.println(" \n\n\nPlease note- the Gregorian Calendar is not  +historically significant before 1600 in most of the world.  This  +program should not be used for historically accurate back-dating.");

      //prompt user for Month and year with error catch
      do{
         System.out.println("\n\nWhat month would you like to view? Please +enter + an integer (1 - 12): ");
         monthNum = input.nextInt();
      } while((monthNum < 1) || (monthNum > 12);
      do{
         System.out.println("\n\nWhat year would you like + to view?");
         System.out.println("Please enter an astronomical year as a whole +integer (-1000 to 2500)");
         yearNum = input.nextInt();
      } while((yearNum < -1000) || (yearNum > 2500));

      //Call Calendar Cascading methods
      printMonthCalendar(monthNum, yearNum);
   }
   /**
   * Print the Calendar View fully by calling other methods
   * @param input input month as integer
   * @return output
   *
   * precondition: input and output are doubles
   * precondition: user input value is Celsius
   * postcondition: the output value is in Farhenheit
   *
   * @author CaseyJayne
   */
   public static void printMonthCalendar(int month, int year){

      //rename using instance variables for clarity
      this.month = month;
      this.year = year;

      //Print header
      printMonthHeader(month, year);
      //Printbody
      printMonthBody(month, year);
   }

   public static void printMonthHeader(int month, int year){
      this.month = month;
      this.year = year;

      //grab the name of month from getMonthName methods
      //input the monthnumber that's passed through & save as new variable
      String this.monthName = getMonthName(month);

      //Print header using input year and returned monthName and passed year
      System.out.println("\t\t " + monthName + "\t" + year);
      System.out.println("_________________________________");
      System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
   }

   public static String getMonthName(int month){
      String monthName;//declare return variable

      //use input to initialize the monthName variable
      switch(this.month){
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

   public static void printMonthBody(int month, int year){
      //save instance variable inputs
      int monthNum = month;
      this.year = year;

      //get days in the month
      //this will set the stopping point for month
      getNumDays(monthNum, year);
      totalDays = getNumDays();

      //print first line based on start days
      getStartDay(monthNum, totalDays, year);
      int startDay = dayNum;

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
         }
         case 3:{
            System.out.println("           1   2   3   4   5");
            System.out.println("   6   7   8   9  10  11  12");
            System.out.println("  13  14  15  16  17  18  19");
            System.out.println("  20  21  22  23  24  25  26");
         }
         case 4:{
            System.out.println("               1   2   3   4");
            System.out.println("   5   6   7   8   9  10  11");
            System.out.println("  12  13  14  15  16  17  18");
            System.out.println("  19  20  21  22  23  24  25");
         }
         case 5:{
            System.out.println("                   1   2   3");
            System.out.println("   4   5   6   7   8   9  10");
            System.out.println("  11  12  13  14  15  16  17");
            System.out.println("  18  19  20  21  22  23  24");
         }
         case 6:{
            System.out.println("                       1   2");
            System.out.println("   3   4   5   6   7   8   9");
            System.out.println("  10  11  12  13  14  15  16");
            System.out.println("  17  18  19  20  21  22  23");
         }
         case 7:{
            System.out.println("                           1");
            System.out.println("   4   3   4   5   6   7   8");
            System.out.println("   9  10  11  12  13  14  15");
            System.out.println("  16  17  18  19  20  21  22");
         }

      }

      //use if loop for last rows
      //Start Sunday
      if(startDay==1){
         if (totalDays ==29){
         System.out.println("  29");
         }
         else if (totalDays ==30){
            System.out.println("  29  30");
         }
         else if (totalDays ==31){
            System.out.println("  29  30  31");
         }
         else{
            break;
         }//if 28 days, fully printed
      //Start Monday
      else if(startDay ==2){
         if (totalDays == 28){
            System.out.println("  28");
         }
         else if (totalDays == 29){
            System.out.println("  28  29");
         }
         else if (totalDays ==30){
            System.out.println("  28  29  30");
         }
         else {
            System.out.println("  28  29  30  31");
         }
      }
      //Start Tuesday
      else if(startDay == 3){
         if (totalDays == 28){
            System.out.println("  27  28");
         }
         else if (totalDays == 29){
            System.out.println("  27  28  29");
         }
         else if (totalDays ==30){
            System.out.println("  27  28  29  30");
         }
         else {
            System.out.println("  27  28  29  30  31");
         }
      }
      //Start Wednesday
      else if(startDay == 4){
         if (totalDays == 28){
            System.out.println("  26  27  28");
         }
         else if (totalDays == 29){
            System.out.println("  26  27  28  29");
         }
         else if (totalDays ==30){
            System.out.println("  26  27  28  29  30");
         }
         else {
            System.out.println("  26  27  28  29  30  31");
         }
      }
      //Start Thursday
      else if(startDay == 5){
         if (totalDays == 28){
            System.out.println("  25  26  27  28");
         }
         else if (totalDays == 29){
            System.out.println("  25  26  27  28  29");
         }
         else if (totalDays ==30){
            System.out.println("  25  26  27  28  29  30");
         }
         else {
            System.out.println("  25  26  27  28  29  30  31");
         }
      }
      //Start Friday
      else if(startDay == 6){
         if (totalDays == 28){
            System.out.println("  24  25  26  27  28");
         }
         else if (totalDays == 29){
            System.out.println("  24  25  26  27  28  29");
         }
         else if (totalDays ==30){
            System.out.println("  24  25  26  27  28  29  30");
         }
         else {
            System.out.println("  24  25  26  27  28  29  30");
            System.out.println("  31")
         }
      }
      //Start Saturday
      else if(startDay == 7){
         if (totalDays == 28){
            System.out.println("  23  24  25  26  27  28");
         }
         else if (totalDays == 29){
            System.out.println("  23  24  25  26  27  28  29");
         }
         else if (totalDays ==30){
            System.out.println("  23  24  25  26  27  28  29");
            System.out.println("  30");
         }
         else {
            System.out.println("  23  24  25  26  27  28  29  30");
            System.out.println("  30  31")
         }
      }// end of loop setting last calendar line
   }

   public static int getNumDays(int month, int year){
      int monthNum = month;
      this.year = year;
      int daysInMonth = 0;

      switch(monthNum){
         case 1:
         case 3:
         case 5:
         case 7:
         case 8:
         case 10:
         case 12://all 31 day months
            daysInMonth = 31;
            break;
         case 2: //February;
            //invoke isLeapYear method to set numdays
            if(isLeapYear(year)){
               daysInMonth = 29;
            };
            else{
               daysInMonth = 28;
            }
         default:
            daysInMonth = 30;
            break;
      }//end switchcase

      //return value
      return daysInMonth;
   }

   public static boolean isLeapYear(int year){
      this.year = year; //save instance variables
      boolean isLeapy;

      if (year % 400 == 0){
         //years divisible by 400 are leap years
         isLeapy = True;
      }
      else if (year % 100 == 0){
         //all other years divisible by 100 not leap years
         isLeapy = False;
      }
      else if (year % 4 ==0){
         //all other years divisible by 4 are leap years
         isLeapy == True;
      }
      else{
         isLeapy == False;
      }
      //return the boolean
      return isLeapy;
   }

   /** getStartDay
    * The method getStartDay() implements Zeller's Algorithm for determining the
    * day of the week the first day of a month is. The method adjusts Zeller's
    * numbering scheme for day of week ( 0=Saturday, ..., 6=Friday ) to conform
    * to day of week number that corresponds to ISO conventions (i.e.,
    * 1=Monday, ..., 7=Sunday)
    *
    * Pre-Conditions: The month value, m, is 1-12 The day value, d, is 1-31, or
    * 1-28, 1-29 for February The year value, y, is the full year (e.g., 2012)
    *
    * Post-Conditions: A value of 1-7 is returned, representing the first day of
    * the month 1 = Monday, ..., 7 = Sunday
    *
    * Reference: https://codereview.stackexchange.com/questions/67722/its-friday-zellers-congruence-revisited
    *
    * @param month
    * @param year
    * @return dayNum (1 = Mon, ... , 7 = Sun )
    *
    * precondition: month, year, and day are integer types
    *
    * @author: rolfl, modified by Josh Lafond
    */
   public static int getStartDay(int month, int year) {
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
