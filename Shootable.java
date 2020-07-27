package interfaces;

import weapons.LoadType;

public interface Shootable {
	
	default int shoot(LoadType weapon) {
		int attackPower = weapon.shoot();
		return attackPower;
	}

}
