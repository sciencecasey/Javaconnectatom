
public class rangeSum {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      int low = 3;
      int high = 22;
      System.out.println("The sum of " +low+ " to " +high+ " is "+ sum(low, high));
   }
   
   /**
    * This method sums the integers of each value between 2 ordered values 
    * and returns the result
    * 
    * @param low is the first value in range
    * @param high is the second value
    * @return result is returned
    * 
    * precondition: low, high, and result are integer values
    * precondition: low is less than high
    * postcondition: sum of all integers in the range returned as integer
    * 
    * @author CaseyJayne
    */
        
   
   public static int sum(int low, int high) {
      
      int result = 0;
      for (int i = low; i<=high; i++) {
         result +=i; //starting at low, add each integer until greater than high
      }
      return result;
   }

}
