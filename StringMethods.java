package practicingJava;

import java.util.Date;

public class StringMethods {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
      //Declare object type variables
      //new: initialize with default values (null)
      Date timeDate = new Date(); 
      String timeStr = new String();
      //print Date so can see before converting
      System.out.println(timeDate);
      
      //declare primitive age
      int age = 20;
      //reference to the object type Date @ location timeDate + prim type age
      timeStr = "Start: " + timeDate + " age: " + age;
      //print re-valued variable
      System.out.println(timeStr);
      //try again declaring the methods direcly
      timeStr = "Start2: " + timeDate.toString() + " age: " + String.valueOf(age);
      String.valueOf(age);
      System.out.println(timeStr);
      
      
      
      //Copy String into Array
      String speech = "This is a little confusing, potentially fun ";
      char [] speechPart = new char[10];
      
      speechPart[0]= speech.charAt(3);
      System.out.println("3rd character is: " + speechPart[0]);
      speech.getChars(14, 20,  speechPart, 0);
      
      for (int index = 0; index<6; index ++) {
         System.out.println(speechPart[index]);
      }
      
      //Search string for character
      int firstSpace = speech.indexOf(" ");
      System.out.println(firstSpace);
      
      //separate by substring
      String name = "Casey Jayne";
      String firstName;
      String lastName;
      int spaceIndex;
      
      spaceIndex = name.indexOf(' ');
      
      if (spaceIndex>=0) {
         firstName = name.substring(0, spaceIndex);
         lastName = name.substring(spaceIndex+1);
         System.out.println("First Name: " +firstName + 
               "\nLastName: " +lastName);
      }
      
      //Comparing Strings
      String name2 = "casey jayne";
      String name3 = "C Jayne";
      
      if (name == name2) {
         System.out.println("CaseyJayne?");
      }
      if(name.equals(name2)) {
         System.out.println("Casey Jayne!");
      }
      if(name.equalsIgnoreCase(name2)) {
         System.out.println("shall we call you cummings?");
      }
      int whatsthis = name.compareTo(name2);
      System.out.println("" + whatsthis);// value is -32
      whatsthis = name.compareToIgnoreCase(name2);
      System.out.println("" + whatsthis); //value is 0
      whatsthis = name.compareTo(name3); //value is 65
      System.out.println("" + whatsthis);
      
      
      
      //Modifying strings
      String street = "12135 Valley Spring Ln.";
      String city = "Los Angeles";
      String state = "CA";
      String zip = "9____";
      String mailing = "PO Box 10101, Napa, CA, 94581";
      String home = new String();
      
      home = String.join(",", street, city, state, zip);
      System.out.println("Home Add " +home);
      mailing = mailing.replace(',', '/');
      System.out.println("Mailing Add " + mailing);
      
      //create temporary string to print only
      //grab substring of mail add from next position from 
      //first / to the end of the string
      //within that substring, replace all the / with spaces
      //print the string (after it's deleted)
      System.out.println("Display only City State Zip: " +mailing.substring(
            mailing.indexOf('/') +1).replace('/', ' '));
      //Show that it was deleted
      System.out.println("Still saved as "+mailing);
   
   }

}
