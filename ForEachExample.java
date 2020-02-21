
public class ForEachExample {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      int nums[] = {1,2,3,4,5,6,7,8,9,10};
      int sum = 0;
      
      for (int x: nums) {
         sum +=x;
      }
      System.out.println("Sum of 1-10 is "+ sum);
      
      int nums2[][] = new int [3][5];
      sum = 0;
      
      //add values into nums2
      //first on row index i
      //then on col index j
      for (int i = 0; i<3; i++) {
         for(int j = 0; j< 5; j++) {
            nums2[i][j] = (i+1)*(j+1);
         }
      }
      System.out.println("\n\n");
      //display and sum the values of nums2
      for(int x[] : nums2) { //delcare an indexvar with index
         for (int y : x) {//index the x index
            System.out.println("Value is " +y);
            sum +=y;
         }
      }
      System.out.println("______________");
      System.out.println("Total is " +sum);
   }

}
