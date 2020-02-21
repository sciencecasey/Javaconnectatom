
public class DoWhileExample {
   public static void main(String args []) {
      int j = 5;
      int somthing = 0;
      
      do {
         
         
         somthing += j;
         
         j--;
      
      } while (j>0);
      
      System.out.println("The sum of 1 through 5 is " + somthing); 
   }

}
