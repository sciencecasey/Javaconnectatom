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
      printMonthBody(month, year);
   }

   public static void printMonthHeader(int month, int year){
      this.month = monthNum;
      this.year = year;

      //grab the name of month from getMonthName methods
      getMonthName(month);
      String this.monthName = getMonthName(return); //save the variable

      //Print header using input year and returned month Name
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
      getNumDays(monthNum, year);
      totalDays = getNumDays();

      //print first line based on start days
      getStartDay(monthNum, totalDays, year);

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
}
