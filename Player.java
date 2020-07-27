package players;
import interfaces.Attackable;
import interfaces.Hurlable;
import interfaces.Punchable;
import weapons.Weapon;
import windows.MainScreen;

public class Player implements Attackable, Hurlable, Punchable {
    public String name;
    protected int hp;
    protected int power;
    protected Weapon mainWeapon;
    protected Weapon subWeapon;

    // Constructors
    public Player() {
    	
    }
    
    public Player(String name, int hp, int power) {
		this.name = name;
		this.hp = hp;
		this.power = power;
	}
    
    // Getters and setters
    public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public Weapon getMainWeapon() {
		return mainWeapon;
	}
	
	public void setMainWeapon(Weapon mainWeapon){
		this.mainWeapon = mainWeapon;
    }

	public Weapon getSubWeapon() {
		return subWeapon;
	}
	
	public void setSubWeapon(Weapon subWeapon) {
		this.subWeapon = subWeapon;
	}
	
	// Various methods for attack
	public int hurl() {
		int attackPower = (int) (power * 1.5);
		return attackPower;
	}
	
	public int hurl(Weapon weapon) {
		int attackPower = hurl() + weapon.hurl();
		return attackPower;
	}
	
	public int punch() {
		int attackPower = (int) (power * 1.8);
		return attackPower;
	}
	
	public int punch(Weapon weapon) {
		int attackPower = punch() + weapon.punch();
		return attackPower;
	}
	
	// Attacking with given weapon using random attack method (punch/hurl)
	public int attackWithWeapon(Weapon weapon) {
		int attackPower = 0;
		int rand = Battleground.getRandomNumber(1, 2);
		switch (rand) {
		case 1:
			attackPower = punch(weapon);
			MainScreen.textArea.append(name + " punched with ");
			break;
		case 2:
			attackPower = hurl(weapon);
			MainScreen.textArea.append(name + " hurled ");
			break;
		}
		return attackPower;
	}
	
	// Getting attack power by randomly choosing what weapon to use (main/sub/no weapon)
	public int getAttackPower() {
		int attackPower = 0;
		int rand = Battleground.getRandomNumber(1, 4);
		switch (rand) {
		case 1:
			attackPower = attackWithWeapon(mainWeapon);
			MainScreen.textArea.append(mainWeapon.name + "!\n");
			break;
		case 2:
			attackPower = attackWithWeapon(mainWeapon); // Setting probability of using main weapon to 50%
			MainScreen.textArea.append(mainWeapon.name + "!\n");
			break;
		case 3:
			attackPower = attackWithWeapon(subWeapon); // Using sub weapon happens by 25% chance
			MainScreen.textArea.append(subWeapon.name + "!\n");
			break;
		case 4:
			attackPower = punch(); // Attacking without weapon is to just punch with bare hands
			MainScreen.textArea.append(name + " threw a punch!\n");
			break;
		}
		return attackPower;
	}
	
	// Checking if the player can continue playing
	public boolean stillAlive() {
		if (hp <= 0) {
			return false;
		}
		return true;
	}
	
	// Checking if player's weapons are all set
	public boolean allSet() {
		if (mainWeapon != null && subWeapon != null) {
			return true;
		}
		return false;
	}
	
	// Printing weapons that hasn't been set
	public void printNullWeapons() {
		if (mainWeapon == null) {
			MainScreen.textArea.append(name + "'s main weapon is not selected.\n");
		}
		if (subWeapon == null) {
			MainScreen.textArea.append(name + "'s sub weapon is not selected.\n");
		}
	}
	
	// Printing player information
	public void printPlayer() {
		MainScreen.textArea.append("Name: " + name + "\n");
		MainScreen.textArea.append("HP: " + hp + "\n");
		MainScreen.textArea.append("Power: " + power + "\n");
		MainScreen.textArea.append("Main weapon: " + mainWeapon.name + "\n");
		MainScreen.textArea.append("Sub weapon: " + subWeapon.name + "\n");
	}

}
