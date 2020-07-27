package weapons;

public abstract class Component {
    private int power;
    
    public Component() {
    	
    }

    public Component(int power) {
    	this.setPower(power);
    }

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

}
