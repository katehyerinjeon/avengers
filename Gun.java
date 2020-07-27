package weapons;

import windows.MainScreen;

public class Gun extends LoadType {

    public Gun() {
    	
    }

    public Gun(String name, int power) {
		super(name, power);
	}

    public void load() {
		super.load();
		for (int i = 0; i < 10; i++) {
			Bullet b = new Bullet(4);
			container.add(b);
		}
	}
    
	public int shoot() {
		int attackPower = super.shoot();
		if (attackPower == 0) {
			MainScreen.textArea.append("Uh oh! No more bullet left! Loading cartridge.\n");
			load();
		}
		return attackPower;
	}

}
