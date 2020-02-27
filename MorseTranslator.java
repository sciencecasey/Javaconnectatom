package practicingJava;

import java.util.Scanner;

public class MorseTranslator {

   public static void main(String[] args) {
      //Option to input arguments
      //to use this option, arg[0] is the starting language, arg[1] the input to 
      //translate.
      //ex: java MorseTranslator M '-... .'
      
      //Create Variables
      String startLang= new String();
      String input = new String();
      //Setup Scanner
      Scanner scan = new Scanner(System.in);
      
      //grab input
      if (args.length>0) {
         startLang = args[0].trim().toUpperCase();
         input = args[1].trim().toUpperCase();
      } 
      else {//user didn't input args, prompt
         System.out.println("What language would you like to translate from?");
         System.out.println("enter M for Morse Code and E for English");
         startLang = scan.nextLine().trim().toUpperCase();
         System.out.println("Enter the sentence you'd like to translate, "
               + "without puncutuation. \nIf translating from Morse Code, "
               + "Please use a period ('.') as a 'dot' and a hyphen ('-') "
               + "as a 'dash'");
         input = scan.nextLine().trim().toUpperCase();
      }//end getting input
      scan.close();
      
      //Call Morse Cascading methods
      //Call Instance
      MorseTranslationMethods translate = new MorseTranslationMethods();
      translate.parseTranslation(input, startLang);
   }
}
