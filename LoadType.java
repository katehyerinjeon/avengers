package weapons;
import java.util.ArrayList;

import interfaces.Loadable;
import interfaces.Shootable;

public abstract class LoadType extends Weapon implements Loadable, Shootable {
	ArrayList<Component> container;

	public LoadType() {
		super();
	}

	public LoadType(String name, int power) {
		super(name, power);
		this.container = null;
	}
	
	public void load() {
		if (container == null) {
			ArrayList<Component> container = new ArrayList<Component>();
			this.container = container;
		}
	}
	
	public int shoot() {
		if (container.size() > 0) {
			int attackPower = 8 * container.get(container.size() - 1).getPower();
			container.remove(container.size() - 1);
			return attackPower;
		}
		return 0;
	}

}
