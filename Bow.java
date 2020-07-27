package weapons;

import windows.MainScreen;

public class Bow extends LoadType {
    
    public Bow() {
    	
    }

	public Bow(String name, int power) {
		super(name, power);
	}
	
	public void load() {
		super.load();
		for (int i = 0; i < 10; i++) {
			Arrow a = new Arrow(3);
			container.add(a);
		}
	}
	
	public int shoot() {
		int attackPower = super.shoot();
		if (attackPower == 0) {
			MainScreen.textArea.append("Uh oh! No more arrow left! Loading quiver.\n");
			load();
		}
		return attackPower;
	}

}
