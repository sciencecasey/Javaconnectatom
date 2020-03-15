public class Example{
   int var1;
   int var2;

   public void method1(){
      int change = 2;
      this.var1+=change;
      method2();
   }

   public void method2(){
      this.var2=3;
      System.out.println("What is var2? "+ var2+" var1? "+ var1);
   }

   public static void main(String args[]){
      //instantiate
      Example firstattempt = new Example();
      firstattempt.method1();
   }
}
