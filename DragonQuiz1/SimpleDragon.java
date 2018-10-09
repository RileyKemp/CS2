package DragonQuiz1;

public class SimpleDragon {
	private String name;
	private int attackBite;
	private int armor;
	private double healthPoints;
	
	// name based constructor
	SimpleDragon(String construcorName){
		this.name = construcorName;
	}

	public SimpleDragon(int i) {
		this.name = "dragon" + String.valueOf(i);
		this.attackBite = 21;
		this.armor = 42;
		this.healthPoints = 100;
	}

	// getters and setters
	public int getAttackBite() {
		return attackBite;
	}

	public void setAttackBite(int attackBite) {
		this.attackBite = attackBite;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public double getHealthPoints() {
		return healthPoints;
	}

	public void setHealthPoints(double healthPoints) {
		this.healthPoints = healthPoints;
	}

	public String getName() {
		return this.name;
	}
	
	// battle attack bite
	public double battleAttackBite(){
		double battleAttackBite;
		battleAttackBite = Math.random()*(double)(this.attackBite) 
				* this.healthPoints/100;
		return battleAttackBite;
	}
	
	// battle defend
	public void battleDefend(double attack){
		System.out.printf("Health points from: %3.2f",
	this.healthPoints);
		
		this.healthPoints = this.healthPoints - Math.random() * attack;
		System.out.printf(" to %3.2f", this.healthPoints);
	}

}
