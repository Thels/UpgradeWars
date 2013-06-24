package objects;

import java.awt.Point;
import java.awt.geom.Point2D.Double;

/**
 * Abstract class housing all objects common behavior and their constructors.
 * @author Ross.
 */
public abstract class AbstractObject implements IObject
{
	public Point.Double location;
	public int health;
	
	/**
	 * Abstract object constructor, basics such as the objects location etc.
	 * @param xLoc x Location of the object.
	 * @param yLoc y Location of the object.
	 * @param maxHP Maximum HP of the object.
	 */
	public AbstractObject(double xLoc, double yLoc, int maxHP)
	{
		this.location = new Point.Double(xLoc,yLoc);
		this.health = maxHP;
	}

	@Override
	public int getHealth() 
	{
		return this.health;
	}

	@Override
	public boolean isObjectAlive() 
	{
		return (this.health > 0);
	}

	@Override
	public void changeObjectHealth(int amount) 
	{
		this.health += amount;
	}

	@Override
	public Point.Double getObjectLocation() 
	{
		return this.location;
	}

	@Override
	public abstract void tickObject();
}
