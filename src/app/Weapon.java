package app;

/**
 * This abstract Weapon class represents
 * a generic Weapon.
 */
public abstract class Weapon {

	/**
	 * This method fires the weapon with
	 * a specified power.
	 * @param power
	 */
	public void fireWeapon(int power) {
		System.out.println("In Weapon.fireWeapon() with a power of " + power);
		}
	
	/**
	 * This abstract method activates or deactivates
	 * the weapon.
	 * @param enable, True to activate, false to deactivate
	 */
	public abstract void activate(boolean enable);
}