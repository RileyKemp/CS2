package DragonQuiz1;

public class DragonTesterVer1 {

	public static void main(String[] args) {
		System.out.println("Hello, simple dragons.");
		/**UML Diagram: (The SimpleDragon Class)
		 * 
		 * Data
		 * private int attackBite
		 * private int armor;
		 * private double healthPoints
		 * private String name
		 * 
		 * Methods
		 * Constructor method accepts name.
		 * getters and setters for all data
		 * a method battleAttackBite that returns a 
		 * 	double representing attack strength based on the attack bite and health
		 * a method battleDefendBite that returns a
		 * 	double based on healthPoints - attack strength
		 * 
		 *  Create a tester class and generate two dragons, steve and martin.
		 *  Put the dragons in a loop and have them bite each-other until 
		 *  one has a negative health.
		 *  The last dragon standing wins.
		 *  */

		SimpleDragon steve = new SimpleDragon("steve");
		System.out.println("Hello " + steve.getName());
		steve.setAttackBite(21);
		steve.setArmor(42);
		steve.setHealthPoints(100);


		SimpleDragon martin = new SimpleDragon("martin");
		System.out.println("Hello " + martin.getName());
		martin.setAttackBite(21);
		martin.setArmor(42);
		martin.setHealthPoints(100);

		//System.out.println(steve.battleAttackBite());

		while(true){

			System.out.print("\nAttack steve, ");
			steve.battleDefend(martin.battleAttackBite());

			System.out.print("\nAttack martin, ");
			martin.battleDefend(steve.battleAttackBite());
			
			if(martin.getHealthPoints() > 0 && steve.getHealthPoints() > 0){
				System.out.println("\nContinue");
			} else {
				if (martin.getHealthPoints() > 0){
					System.out.println("\n\nMartin wins!");
				} else {
					System.out.println("\n\nSteve wins!");
				}
				break;
			}
		}




	}

}
