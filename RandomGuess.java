import java.util.Scanner;
   
public class RandomGuess {
   //Setup Guess Method
   //public void setGuess(int guess) {
      //this.guess = guess; //define as instance variable
   //}
   public static void main(String args[]) {
      int topValue = 0; //to set max for random generator
      int numberOfGuesses = 5; //to set number of guesses by person
      int guessMeNumber = 0; //to name the integer generated!
      int guess = 0; //the users guess
      
      //Explain the program
      System.out.println("\n\n");
      System.out.print("This game chooses a random number for you to guess.");
      System.out.print("\nThe value of the random number will be between 1 ");
      System.out.print("and an integer of your choice. You can also choose");
      System.out.println(" the number of tries you have to guess correctly.\n");
      System.out.println("You will recieve feedback for each of your guesses.");
      
      //get input max value
      Scanner input = new Scanner( System.in ); //initialize capture System
      System.out.println("\n\n");
      System.out.println("What would you like as the maximum guess number?");
      System.out.println("Enter a whole integer (100, 56, 32, etc.): ");
      topValue = input.nextInt();
      
      //generate random number 
      guessMeNumber = (int) (topValue * Math.random()) + 1;
      
      //get input max guesses
      System.out.println("\n\n");
      System.out.println("How many tries would you like to have to guess?");
      System.out.println("Enter a whole integer (4, 6, 12, etc.): ");
      numberOfGuesses = input.nextInt();
      
      //Setup Guess Method
      //public void setGuess(int guess) {
         //this.guess = guess; //define as instance variable
      //SetupGuess Loop
      guessLoop :{ //name for a breakout upon correct
         for (int i = numberOfGuesses; i>0; i--) {
            //Capture user guess
            System.out.println("\n\n");
            System.out.println("Type your best guess?: ");
            guess = input.nextInt();
            if (guess == guessMeNumber) { //correct answer
               System.out.println("You guessed correctly!");
               break guessLoop;
            }
            else if ((guess != guessMeNumber) && (i == 1)) {
               //if the guess was wrong and no more guesses
               System.out.println("That's not right & you're out of Guesses.");
               System.out.println("Sorry, better luck next round!");
            }
            else if (guess > guessMeNumber) { //guess too high
               System.out.println("Nope-- too high. Try again!");
            }
            else {
               System.out.println("You must be too low. Try again!");
            } //end if ladder
         } //end for loop countdown
      } //end guessLoop
      
      //Farewell
      System.out.println("\n\n");
      System.out.println("Good Game!");
   }
}
