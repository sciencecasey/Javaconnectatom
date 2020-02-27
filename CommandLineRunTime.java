package practicingJava;

public class CommandLineRunTime {

   public static void main(String [] args) {
      //within args array
      if (args.length >0) {
         for (String id: args) {
            //loop through all of the arguments in arg array
            System.out.println("Send invite to: " +id);
         }
      }
      else {
         //no arguments
         System.out.println("No one invited");
      }
      
      //now when we run from command line, supply parameters 1 and 2!!!
      //this is how we use the input within the program as example 
      //to process different files, etc
      
      //let's try saving parameters into program
      
      String student1 = args[0];
      //clean up whitespace with the Trim
      //change to lowercase
      student1 = student1.trim().toLowerCase();
      //return the value
      System.out.println(""+student1);
   }
}
