
public class IfSwitchExamples {

	public static void main(String[] args) {
		boolean result = true;
		int int1 = 10, int2 = 20;
		float float1 = 10f, float2 = 20f;
		String string1 = "US";
		
		if (result) { //this tests whether the bool is true
			System.out.println( "True!" );
		}
		
		if (!result) { //this will be false, because it's saved as true
			System.out.println("True!");
		}
		else {//this well evaluate because above was false
			System.out.println("False!");
		}
		
		if (int1 ==int2) { //not true, won't evaluate
			System.out.println("int1 equals int2");
		}
		if ((int1<int2) && (float1<float2)) { //true, this will evaluate
			System.out.println("Both conditions must be true!");
		}
		else {
			System.out.println("At least one condition must be false");
		}
		
		if ((result) ^ (int1 ==int2)) {//tests if only one true, so evaluates
			System.out.println("^ works and true! Only one true condition");
		}
		else {
			System.out.println("^ works but false! Either both True or False!");
		}
		
		
		//Start switch statements
		switch (int1) { //checks a case that handles value 10
		   case 10: {
		      System.out.println("10!");
		      break;
		   }
		   case 20: { 
		      System.out.println("20!");
		      break;
		   }
		   default : {
		      System.out.println("Not certain!");
		      break;
		   }
		}
		
		switch (string1) {
		   case "UK": {
		      System.out.println("UK!");
		      break; //didn't match so keeps looking
		   }
		   case "US": {
		      System.out.println("US!");
		      // without breakstatment it will test again
		   }
		   case "CA": {
		      System.out.println("No break, but it's still US!");
		      break;
		   }
		   
		}

	}

}
