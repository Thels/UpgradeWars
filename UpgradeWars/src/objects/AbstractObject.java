package objects;

import java.awt.Point;
import java.awt.geom.Point2D.Double;

public abstract class AbstractObject implements IObject
{
	private int health;
	private Point.Double objectLocation;
	private double objectAngle;
	
	
	public AbstractObject(double xLoc, double yLoc , double angle, int maxHP)
	{
		this.objectLocation = new Point.Double(xLoc,yLoc);
		this.health = maxHP;
		this.objectAngle = angle;
	}
	
	public AbstractObject(double xLoc, double yLoc)
	{
		this(xLoc,yLoc,0,0);
	}
	
	@Override
	public int getHealth() 
	{
		return this.health;
	}

	@Override
	public boolean isObjectAlive() 
	{
		return this.health > 0;
	}

	@Override
	public void changeObjectHealth(int amount) 
	{
		this.health += amount;	
	}

	@Override
	public Double getObjectLocation() 
	{
		return objectLocation;
	}
	
	@Override
	public double getAngle() 
	{
		return objectAngle;
	}

	@Override
	public abstract void tickObject();

	

}
