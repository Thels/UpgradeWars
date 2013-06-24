package objects;

import java.awt.Point;

/**
 * Interface that every object in the game will implement , each tower/enemy/bullet etc.
 * @author Ross
 */
public interface IObject 
{
	/**
	 * Get the health of the object.
	 * @return Integer value of the health.
	 */
	public int getHealth();
	
	/**
	 * Get whether or not the object is alive ( health > 0 )
	 * @return Whether or not current health is greater than 0.
	 */
	public boolean isObjectAlive();
	
	/**
	 * Increment/decrement the current objects health.
	 * @param amount Amount to +/- ( int ).
	 */
	public void changeObjectHealth(int amount);
	
	/**
	 * Get the location of this object.
	 * @return Point.Double of the objects location.
	 */
	public Point.Double getObjectLocation();
	
	/**
	 * Tick the object. Game loop will call this.
	 */
	public void tickObject();
}
