package morseCode;

public class MorseTranslationMethods {
 //separate methods
   public void parseTranslation(String input, String startLang) {
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
   
   public void morseToEnglish(String userInput) {
      //group letters of input
    //if null character used, Morse to English
      //add a space to end of string so that loop functions for last unit
      userInput = userInput+' ';
      //loop to separate Morse units by spaces
      int begin = 0;
      while(begin<userInput.length()) {
         //find the next space and save as end
         int end = userInput.indexOf(' ', begin);
         String morseUnit = 
               userInput.substring(begin,end);
         String translation = translation+returnMatch(morseUnit);
         begin = end+1;
         if (begin == userInput.length()) {
            //reached end of translation unit
            System.out.println(userInput + " : " + translation);
         }
      }
   }
   public String returnMatch(String stringIn, char characterIn) {
      //Create 2, 1D arrays
        //index English array: letters=0-25, space=26, 0-9=27-36
        //index of Morse array matches the array of English
        String [] morse= {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
              "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", 
              ".-.", "...", "-", "..-", "...-", ".--", "-.-", "-.--", "--..", 
              "|", ".----", "..---", "..---", ""};
        char [] english = "ABCDEFGHIJKLMNOPQRSTUVWXYZ 0123456789".toCharArray();
        
        if (characterIn == '#') {//Morse to English
         //search substring in array
           for (int tempInd=0; tempInd<37; tempInd++) {
              if (stringIn.equals(morse[tempInd])) {
                 String match = String.valueOf(english[tempInd]);
                 return match;//return english value
                 }
           }
        }
        else {//english to Morse
           for (int tempInd: english) {
              if (characterIn == english[tempInd]) {
                 String match = morse[tempInd];
                 return match; //return morse value of same index
              }
           }
           
        }
     }
   
   private boolean stringIn(String string) {
      // TODO Auto-generated method stub
      return false;
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
}
   
