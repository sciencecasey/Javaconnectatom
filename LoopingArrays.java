package practicingJava;

public class LoopingArrays {

   public static void main(String[] args) {
      int intSum = 0;
      int [] intArray = {1,2,4,5,6,7,8,3};
      
      //for loop over whole thing
      for (int tempInt: intArray) {
         intSum+=tempInt;
      }
      
      System.out.println("Sum of Array is " +intSum);
      intSum = 0;
      
      
      //loop over some of the Array;
      for (int index = 0; index <3; index ++) {
         intSum += intArray[index];
      }
      System.out.println("Sum of Array is " +intSum);
      intSum = 0;
      
      
      //loop over whole array
      int index = 0;
      while (index < intArray.length) {
         intSum += intArray[index];
         index ++;
      }
      System.out.println("Sum of Array is " +intSum);
      intSum = 0;
      
      //another option
      index = 0;
      do {
         intSum += intArray[index];
         index ++;
      } while(index<intArray.length);
      System.out.println("Sum of Array is " +intSum);
      
      //while until reach a number
      //even though we are using sum as the condition, we still need to 
      //increment index as we loop so we don't sum the same one each time
      intSum = 0;
      index = 0;
      while(intSum < 30) {
         intSum +=intArray[index++];
      }
      
      //find the 3 within array
      index = -1;//start at -1 so it stops at 3
      int location3=0;
      do{
         index++;
         location3 = index;
      }while(intArray[index]!=3); 
      System.out.println("The 3 is located at index: "+location3);
   }

}
