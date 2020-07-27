package weapons;
import interfaces.Hurlable;

public abstract class Weapon implements Hurlable {
    public String name;
    protected int power;

    // Constructors
    public Weapon() {
    }

    public Weapon(String name, int power) {
		this.name = name;
		this.power = power;
	}

    // Getters and setters
	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
	
	// Attack methods
	public int hurl() {
		return (int) (power * 1.5);
	}
	
	public int punch() {
		return (int) (power * 1.1);
	}

}
