package practicingJava;

public class StringConcatAndCompare {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      String catName = "Mac"; //initialized to a literal string constant
      String catName2 = "Mac";
      String catName3 = new String("Mac");
      //creates a new object and then initializes with the constant string
      int macAge = 13;
      
      
      System.out.println(catName + " is " + macAge + " years old.");
      
      if (catName == "Mac") { //== compares references, not content
         System.out.println("catName is equal to 'Mac'.");
         //same object, has the same reference as the string literal
      } else {
         System.out.println("caName is not equal to 'Mac'.");
      }
      
      if (catName == catName2) { //again compares references not content
         System.out.println("catName equal to catName2");
         //also works! References the same literal value
      } else {
         System.out.println("catName not equal to catName2");
      }
      
      if (catName == catName3) { //comparing object references which aren't equal
         System.out.println("catName equal to catName3");
      } else {
         System.out.println("catName not equal to catName3");
      }
      
      if (catName.equals(catName3)) {//compares the sequence of characters
         System.out.println("catName has same value as catName3");
      } else {
         System.out.println("catName has different value than catName3");
      }

   }

}
