import java.util.Scanner;

public class PrintCalYear {

	public static void main(String[] args) {
		//declare variables:
		int yearNum = -10001;
		  
		//Setup Scanner
		Scanner input = new Scanner(System.in);

		//Explain use of program
		System.out.println("This program displays a  Gregorian calendar output "
			+ "of the desired year.");
		System.out.println(" \n\n\nPlease note- the Gregorian Calendar is not "
			+"historically significant before 1600 in most of the world. This "
			+"program should not be used for historically accurate dating.");

		  //prompt user for year with error catch
		do{
		   System.out.println("\n\nWhat year would you like to view?");
		   System.out.println("Please enter an astronomical year as a whole "
		   		+ "integer (-1000 to 2500)");
		   yearNum = input.nextInt();
		} while((yearNum < -1000) || (yearNum > 2500));
	}
	
	public static void printYearCalendar(int year) {
		//create a for loop to print entire year beginning in 
		//January
		for (int i = 1; i<=12; i++) {
			CalendarView.printMonthCalendar(i, year);
		}
	}

}
