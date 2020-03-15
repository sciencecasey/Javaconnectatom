

public class ConfusingArrayAssignment {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      int myIntArrayA[] = {0,1,2,3,4,5};
      int myIntArrayB[] = {6,7,8,9,10};
      String arrayA = String.valueOf(myIntArrayA);
      
      System.out.println(" "+ arrayA + "" + myIntArrayB);
      myIntArrayB = myIntArrayA; //now B references A!!!
      System.out.println(" "+ myIntArrayA + "" + myIntArrayB);
      myIntArrayA[0] = 100; //since B references A, this updates BOTH arrays
      System.out.println(" "+ myIntArrayA + "" + myIntArrayB);
      if (myIntArrayA[0] == myIntArrayB[0]){
         //this will be true!
         System.out.println("Opps! I wanted to copy");
      }

   }

}
