package players;
import interfaces.Shootable;
import weapons.LoadType;
import weapons.Weapon;
import windows.MainScreen;

public class Archer extends Player implements Shootable {

	public Archer() {
	}
	
	public Archer(String name, int hp, int power) {
		super(name, hp, power);
	}
	
	public int shoot(LoadType weapon) {
		int attackPower = weapon.shoot();
		return attackPower;
	}
	
	public int attackWithWeapon(Weapon weapon) {
		int attackPower = 0;
		if (weapon instanceof LoadType) {
			attackPower = shoot((LoadType) weapon);
			MainScreen.textArea.append(name + " shot ");
		}
		else {
			attackPower = super.attackWithWeapon(weapon);
		}
		return attackPower;
	}

}
