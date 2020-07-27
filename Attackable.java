package interfaces;
import players.Player;
import windows.MainScreen;

public interface Attackable {

	default void attack(Player target, int attackPower) {
		int targetHp = target.getHp();
		targetHp -= attackPower;
		target.setHp(targetHp);
		if (!target.stillAlive()) {
			MainScreen.textArea.append(target.name + " dead!\n");
			MainScreen.disable(target);
		}
	}

}
