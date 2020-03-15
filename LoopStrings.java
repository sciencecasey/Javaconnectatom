

public class LoopStrings {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      String skipName = new String();
      String name = "Bob";
      
      for (int index = 0; index<name.length(); index++) {
         skipName += name.charAt(index) + "";
         System.out.println("Name is " +skipName);
      }
      
      System.out.println("Name is " +skipName);

   }

}
