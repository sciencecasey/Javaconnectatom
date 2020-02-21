
public class GoToBreakContinue {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      outer: for(int i = 0; i<3; i++) {
         System.out.print( "\n\nPass " + i + ": ");
         inner: for (int j = 0; j<100; j++) {
            if(j ==10) {
               break outer; //exit both loops
            }
         //inner won't evaluate
         }
      //outer won't evaluate
      }
   System.out.println("\nWe Broke Free!");
   
   
   System.out.println("\n\n");
   another: for(int i = 0; i<3; i++) {
      System.out.print( "Pass " + i + ": ");
      System.out.println("We're continuing another..");
      inside: for (int j = 0; j<100; j++) {
         if(j == 10) {
            continue another; //exit both loops
         }
      //inside won't evaluate
      }
      //another will but not at this point- only until the if
   }
   System.out.println("\n\nNow we're done");
   }
}
