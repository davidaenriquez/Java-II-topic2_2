package app;

/**
 * This Game class simulates a game scenario with different
 * weapons being activated and fired.
 */
public class Game {

	/**
	 * This main method is the entry point of the program.
	 * @param args
	 */
	public static void main(String[] args) {
		Bomb weapon1 = new Bomb();
		Gun weapon2 = new Gun();
		weapon1.activate(true);
		weapon2.activate(true);
		weapon1.fireWeapon(10);
		weapon2.fireWeapon(5);
		weapon1.fireWeapon();
		weapon2.fireWeapon();
	}
}
