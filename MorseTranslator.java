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
      
      //separate methods
      if (startLang.equals("E")) {
         englishToMorse(input);
      }
      else {
         morseToEnglish(input);
      }

   }
   
   public void englishToMorse(String input) {
      String output = new String();
      for (int i = 0; i<input.length(); i++) {
         char unitCharacter = input.charAt(i);//separate the input by character
         //send the input to returnMatch method & append the match to output
         output+=returnMatch(unitCharacter)+" ";//separate each by a space
      }
      System.out.println(""+input+" : "+output);
   }
   
   public void returnMatch(String stringIn, char characterIn) {
    //Create 2, 1D arrays
      //index English array: letters=0-25, space=26, 0-9=27-36
      //index of Morse array matches the array of English
      String characterOut= new String();
      String [] morse= {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
            "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", 
            ".-.", "...", "-", "..-", "...-", ".--", "-.-", "-.--", "--..", 
            "|", ".----", "..---", "..---", ""};
      char [] english = "ABCDEFGHIJKLMNOPQRSTUVWXYZ 0123456789".toCharArray();
      
      if (characterIn == '#') {
         //if null character used, Morse to English
         //add a space to end of string so that loop functions for last unit
         stringIn = stringIn+' ';
         //loop to separate Morse units by spaces
         int begin = 0;
         while(begin<stringIn.length()) {
            //find the next space and save as end
            int end = stringIn.indexOf(' ', begin);
            String morseUnit = 
                  stringIn.substring(begin,end);
            //search substring in array
            nest: {
               for (int tempInd=0; tempInd<37; tempInd++) {
               if (morseUnit == morse[tempInd]) {
                  String match = String.valueOf(english[tempInd]);//save as match
                  morseToEnglish(match);//pass the match to output methods
                  break nest; //break when match found
               }
            }}//end of nested loop, while loop continues
            begin = end+1;
         }
      }
   }
   public void returnMatch(String passMe) {
      //Method Overload so that character in above is optional
      //if this method is called, the input value is Morse (not parsed by 
      //character
      char noCharacter = '#';//an unused character in Translator
      returnMatch(passMe, noCharacter);
   }
   public void returnMatch(char passMe) {
      //Method Overload so that String in method is optional
      //creates a "default" String with only characters not within either array
      //if this method is used, the input type is English
      String noString = new String("&&");
      returnMatch(noString, passMe);
   }
   public void morseToEnglish(String input) {
      String output = new String();
      //group letters of input
      
      
      for (int i = 0; i<input.length(); i++) {
         char unitCharacter = input.charAt(i);//separate the input by character
         //send the input to returnMatch method & append the match to output
         output=output+returnMatch(unitCharacter);//separate each by a space
      }
   }

}
