package app;

/**
 * This Gun class, extending the Weapon class, represents
 * a gun weapon.
 */
public class Gun extends Weapon {
	
	/**
	 * This method overrides the method inherited from
	 * Weapon class and fires the Gun with a specified power.
	 * @param power, the power of the gun when fired
	 */
	public void fireWeapon(int power) {
		System.out.println("In Gun.fireWeapon() with a power of " + power);
	}
	
	/**
	 * This is a overloaded method that fires the gun.
	 */
	public void fireWeapon() {
		System.out.println("In overloaded Gun.fireWeapon()");
		super.fireWeapon(5);
	}

	/**
	 * This method activates or deactivates the gun.
	 * @param enable, True to activate, false to deactivate the gun.
	 */
	@Override
	public void activate(boolean enable) {
		System.out.println("In the Gun.activate() with an enable of " + enable);		
	}
}
 