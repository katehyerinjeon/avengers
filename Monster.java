package players;

import weapons.Weapon;
import windows.MainScreen;

public class Monster extends Player {

	private int superPower;
	
	public Monster() {
	}

	public Monster(String name, int hp, int power, int superPower) {
		super(name, hp, power);
		this.setSuperPower(superPower);
	}

	public int getSuperPower() {
		return superPower;
	}

	public void setSuperPower(int superPower) {
		this.superPower = superPower;
	}
	
	public int hurl() {
		int totalPower = power + superPower;
		int attackPower = (int) (totalPower * 1.7);
		return attackPower;
	}
	
	public int punch() {
		int totalPower = power + superPower;
		int attackPower = (int) (totalPower * 1.3);
		return attackPower;
	}
	
	public void printPlayer() {
		super.printPlayer();
		MainScreen.textArea.append("Super power: " + superPower + "\n");
	}

}
