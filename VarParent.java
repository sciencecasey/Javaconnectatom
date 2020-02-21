
public class VarParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VarParent varpar = new VarParent(); //instance varpar of type VarParent
		varpar.child();

		int firstInt = 7;
	
		System.out.print("\nBut parent thinks firstInt is " + firstInt);
	
		//create nested method

	private void child() {
		// TODO Auto-generated method stub
		System.out.print("Main sets firstInt as " + firstInt);
		
		firstInt = 9;
		System.out.print("\nBut child sets firstInt " + firstInt);
	}
	}
}
