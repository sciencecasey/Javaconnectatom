
public class TwoDArray {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
   int twoD[][] = new int [4][5];
   int k = 0;
   
   //manual fill
   for (int i = 0; i<4; i++) {
      for (int j = 0; j<5; j++) {
         twoD[i][j] = k;
         k++;
      }
   }
   
   //Print out
   for (int i = 0; i<4; i++) {
      for (int j = 0; j<5; j++) {
         System.out.print( twoD[i][j] + " " ); //print each element in a row
      }
      System.out.println(); //print new line only every 5 elements (new column)
   }
   
   //Second Option- dynamic initialization:
   double mat1[][]= {
         {0,0,0,0}, //col0
         {1,1,1,1}, //col1
         {2,2,2,2}, //col2
         {3,3,3,3}, //col3
         {4,4,4,4}, //col4
         {5,5,5,5} //col5
   };
   
   System.out.println("\n\n");
   for (int i = 0; i<6; i++) { //colnums
      for (int j = 0; j<4; j++) { //rownums
         System.out.print( mat1[i][j] + " " ); //print each element in a row
      }
      System.out.println(); //print new line only every 0-4 elements (new column)
   }
   }
}
