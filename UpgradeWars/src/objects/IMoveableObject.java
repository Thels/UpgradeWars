package objects;

import java.awt.Point;

/**
 * Interface that any moving object ( enemies, bullets etc ) have to implement.
 * @author Ross
 */
public interface IMoveableObject 
{
	/**
	 * Gets the objects current speed in pixels/tick. 
	 * @return Pixels moving per second.
	 */
	public double getObjectSpeed();
	
	/**
	 * Set the speed of the object in pixels/tick.
	 * @param speed Speed the object should be moving.
	 */
	public void setObjectSpeed(double speed);
	
	/**
	 * Move this object by a given dx/dy.
	 * @param dx Distance to travel horizontally.
	 * @param dy Distance to travel vertically.
	 */
	public void moveObject(double dx, double dy);
	
	/**
	 * Set a new location for this object.
	 * @param Point.Double showing new location of the object.
	 */
	public void setNewLocation(Point.Double newLoc);
	
}
