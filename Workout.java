/**
 * Discussion 3 Submission
 * 
 * Problem : 
 * I can't decide what to do for a workout schedule, 
 * so I will have a program decide that for me!
 * 
 * @Author : Joseph Hanlon
 * @Last_Modified : 2/12/2020
 */

import java.lang.Math;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap; // Needed because Map is an abstract interface
import java.util.List;
import java.util.Map; // <Key, Value> pairs, but can't instantiate
import java.util.Random;

public class Workout {

   enum DAYS_OF_WEEK {
      SUNDAY,
      MONDAY,
      TUESDAY,
      WEDNESDAY,
      THURSDAY,
      FRIDAY,
      SATURDAY
   }

   enum WORKOUT_TYPES {
      BIKE(0),
      LIFT(1),
      RUN(2),
      SWIM(3)
      ;
   
      // Java generics only work with reference types
      // Primitive types (i.e. int) won't work
      private Integer workout; 
   
      // Instantiate a Map to provide a 'lookup' functionality 
      private static final Map<Integer,WORKOUT_TYPES> WORKOUT_MAP;
   
      // Constructor for the enum
      WORKOUT_TYPES (Integer workout) {
         this.workout = workout;
      }
   
      // Getter for the workout attribute
      public Integer getWorkout() {
         return this.workout;
      }
   
      // Build an immutable map of Integer workout to enum pairs.
      // NOTE: Any Map implementation can be used.
      static {
         Map<Integer,WORKOUT_TYPES> map = new ConcurrentHashMap<Integer, WORKOUT_TYPES>();

         for (WORKOUT_TYPES instance : WORKOUT_TYPES.values()) {
            map.put(instance.getWorkout(),instance);
         }

         WORKOUT_MAP = Collections.unmodifiableMap(map);
      }
   
      public static WORKOUT_TYPES get (int i) {
         // Create an Integer out of the provided int
         // The constructor 'new Integer(int)' is deprecated
         Integer workout = Integer.valueOf(i); 

         return WORKOUT_MAP.get(workout);
      }
   }

   // Decide how hard to push yourself, within reason
   static String intensityLevel(int numHardWorkouts) {

      // 50 / 50 odds of a getting a difficult workout
      boolean level = Math.random() > 0.5 ? true : false;

      int maxHardWorkouts = 4;

      if (level && (numHardWorkouts < maxHardWorkouts)) {
         return "HARD";
      } else {
         return "EASY";
      }
   } 

   public static void main(String[] args) {

      // local variable to store the hard workout weekly total
      int numHardWorkouts = 0;

      // Randomly select a workout
      Random rand = new Random();

      // Randomly set a REST day 
      Random randRest = new Random();

      // Obtain a number between [0 - 6].
      System.out.print(DAYS_OF_WEEK.values().length);
      int d = randRest.nextInt(DAYS_OF_WEEK.values().length);

      // Get an array of workouts
      WORKOUT_TYPES[] workouts = WORKOUT_TYPES.values();

      // Will be used to keep track of loop & rest day
      int counter = 0; 

      // Loop thru to get the schedule
      for (DAYS_OF_WEEK day : DAYS_OF_WEEK.values()) {

         // Tell the user the day
         System.out.print(day + " : " );

         // Get the LOE for the day
         String levelOfEffort = intensityLevel(numHardWorkouts);

         // Limit the LOE 
         if (d == counter) {
            levelOfEffort = "REST"; 
         } else if (levelOfEffort == "HARD") {
            numHardWorkouts++;
         }

         System.out.print(levelOfEffort + " ");
         
         // Get a random workout type to cross-train
         int randomNumber = rand.nextInt(WORKOUT_TYPES.values().length);
         
         // Lookup the workout by the generated number
         if (levelOfEffort != "REST") {
            System.out.println(WORKOUT_TYPES.get(randomNumber));
         } else {
            System.out.println();
         }

         counter++;
      }
   } // end main()
}