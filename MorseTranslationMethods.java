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
      StringBuffer translation = new StringBuffer(30);
      //loop through characters one by one
      for (int i = 0; i<input.length(); i++) {
         char unitCharacter = input.charAt(i);//separate the input by character
         //send the input to returnMatch method & append the match to output
         translation = translation.append(returnMatch
               ("&&", unitCharacter));
         if (i == input.length()) { //when at end of input
            System.out.println(input + " : " + translation); 
         }
      }
      
   }
   
   public void morseToEnglish(String userInput) {
      StringBuffer translation = new StringBuffer();
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
         //send with 'default' input for charIn
         translation = translation.append
               (returnMatch(morseUnit, '#'));
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
        //char [] english = "ABCDEFGHIJKLMNOPQRSTUVWXYZ 0123456789".toCharArray();
        char [] english = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 
              'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W',
              'X', 'Y', 'Z', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', 
              '9'};
        String match = new String();
        nest: { if (characterIn == '#') {//Morse to English
         //search substring in array
           for (int tempInd=0; tempInd<37; tempInd++) {
              if (stringIn.equals(morse[tempInd])) {
                 match = String.valueOf(english[tempInd]);
                 break nest;
              }
           }
        }
        else {//english to Morse
           //convert Character to String
           String tempChar = new String();
           tempChar = String.valueOf(characterIn);
           for (int tempInd=0; tempInd<37; tempInd++) {
              //if (characterIn == english[tempInd])
              if (tempChar.equals(String.valueOf(english[tempInd])))
              {
                 match = morse[tempInd];
                 break nest;
              }
           }}
        }//end nest
        
        return match; //return morse value of same index
     }
}
   
