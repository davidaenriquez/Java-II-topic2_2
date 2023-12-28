package app;

/**
 * This Bomb class, extending Weapon class, represents
 * a bomb weapon.
 */
public class Bomb extends Weapon {
	
	/**
	 * This method overrides the method inherited from
	 * Weapon class and fires the bomb with a specified power.
	 * @param power, the power of the bomb when fired
	 */
	public void fireWeapon(int power) {
		System.out.println("In Bomb.fireWeapon() with a power of " + power);
	}
	
	/**
	 * This is a overloaded method that fires the bomb.
	 */
	public void fireWeapon() {
		System.out.println("In overloaded Bomb.fireWeapon()");
		super.fireWeapon(10);
	}

	/**
	 * This method activates or deactivates the bomb.
	 * @param enable, True to activate, false to deactivate the bomb.
	 */
	@Override
	public void activate(boolean enable) {
		System.out.println("In the Bomb.activate() with an enable of " + enable);		
	}
}
