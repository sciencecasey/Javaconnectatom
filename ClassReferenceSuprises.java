
@SuppressWarnings("javadoc")
public class ClassReferenceSuprises {
  
   /**
    * creates one variable, myClassNum and initializes it to 0
    * creates a toString method for the class
    * @author Intro to Java
    *
    */
   public class MyClass {
      public int myClassNum;
      
      //constructor
      MyClass() {
         this.myClassNum = 0;
      }
      //toString Override
      public String toString() {
         return "myClassNum: " +this.myClassNum;
      }
   }
   
   
   /**
    * 
    * @author Intro to Java
    *
    */
   public static class ReferenceExample{
      ClassReferenceSuprises myClassRef;
      /**
       * modifies an instance of myClassRef to value 100 and returns the object
       * @param myClassRef takes an instance reference of MyClass object 
       * @return returns the initialized myClassRef without any modifications
       * (default construction)
       * @author Intro to Java
       */
      private static MyClass setMyClassnum(MyClass myClassRef) {
         //myClassRef =  ClassReferenceSuprises.new MyClass();
         myClassRef.myClassNum = 100; 
         return myClassRef;
      }
      
      /**
       * creates 2 myClass references.  MyClass1 is initialized with the default
       * constructor (value 0).  MyClass2 then re-references with the private
       * setter and puts the Class1 as it's reference, changes the value to 100,
       * and returns it to myClass2. 
       * Prints out values: Class1 is 0 and Class2 is 100
       * @param args
       */
      public static void main(String [] args) {
         ClassReferenceSuprises init = new ClassReferenceSuprises();
         MyClass myClass1 = init.new MyClass();
         MyClass myClass2;
         
         myClass2 = setMyClassnum(myClass1);
         System.out.println("myClass1: " +myClass1.toString());
         System.out.println("myClass2: " +myClass2.toString());
      }
   }
}
