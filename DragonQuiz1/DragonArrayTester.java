package DragonQuiz1;

public class DragonArrayTester {

	/** Main method */
	public static void main(String[] args) {
		System.out.println("Hello Dragon Array");
		
		int dragonCount = 6;
		
		// working through Listing 9.11 with dragons.
		
		// Declare array: name of class followed immediatly by a bracket followed by a space
		// 	and then followed by the name of the array.
		SimpleDragon[] dragonArray;
		
		
		/** Create an array of objects */
		// this method does not exist, so I will need to go create it.
		dragonArray = createDragonArray(dragonCount);
		
		

	}
	
	/** Create an array of objects */
	public static SimpleDragon[] createDragonArray(int dragonCount) {
		SimpleDragon[] dragonArray = new SimpleDragon[dragonCount];
		
		for (int i =0; i < dragonArray.length; i++) {
			new SimpleDragon(i);
		}
		// return array
		return dragonArray;
	}

}
