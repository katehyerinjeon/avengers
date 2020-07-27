package players;
import java.util.Scanner;

import interfaces.Shootable;
import players.*;
import weapons.*;
import windows.*;

public class Battleground {
	
	// Creating game characters
	public static Warrior captainAmerica = new Warrior("Captain America", 300, 30);
	public static Archer hawkeye = new Archer("Hawkeye", 300, 10);
	public static Warrior blackWidow = new Warrior("Black Widow", 300, 25);
	public static Monster hulk = new Monster("Hulk", 300, 10, 50);
	public static Asgardian thor = new Asgardian("Thor", 300, 20);
	public static Asgardian loki = new Asgardian("Loki", 1500, 25);
	public static Player [] players = {captainAmerica, hawkeye, blackWidow, hulk, thor, loki};
	
	// Creating signature weapons
	public static Shield capAmerShield = new Shield("Captain America's shield", 55);
	public static Bow hawkeyeBow = new Bow("Hawkeye's bow", 10);
	public static Gun glock26 = new Gun("Glock 26", 13);
	public static Hammer mjolnir = new Hammer("Mjolnir", 60);
	public static Staff scepter = new Staff("Scepter", 40);

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Press enter to start game.");
		s.nextLine();
		System.out.println("==================== WELCOME TO AVENGERS VS. LOKI GAME ====================");
		System.out.println("Creating game characters and game window...");
		System.out.println();
		
		// Loading Hawkeye's bow and Black Widow's gun
		hawkeyeBow.load();
		glock26.load();
		
		// Setting main weapons for some characters
		hawkeye.setMainWeapon(hawkeyeBow);
		loki.setMainWeapon(scepter);
		thor.setMainWeapon(mjolnir);
		blackWidow.setMainWeapon(glock26);
		captainAmerica.setMainWeapon(capAmerShield);
		
		// Opening game window
		new StartScreen(players).setVisible(true);
	}
	
	public void printPlayers() {
		System.out.println("---------- Avengers ----------");
		captainAmerica.printPlayer();
		System.out.println();
		hawkeye.printPlayer();
		System.out.println();
		blackWidow.printPlayer();
		System.out.println();
		hulk.printPlayer();
		System.out.println();
		thor.printPlayer();
		System.out.println();
		System.out.println("---------- The Villain ----------");
		loki.printPlayer();
		System.out.println();
	}
	
	public static int getRandomNumber(int min, int max) {
		int rand;
		rand = (int) (Math.random() * ((max - min) + 1)) + min;
		return rand;
	}

}
