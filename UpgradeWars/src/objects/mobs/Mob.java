package objects.mobs;

import objects.AbstractObject;
import pathing.IPath;

public class Mob extends AbstractObject
{
	private IPath mobPath;
	private double mobSpeed;
	private int pathProgress;
	
	public Mob(IPath mobPath,double xLoc, double yLoc, double angle, EMobTypes mobType) 
	{
		super(xLoc, yLoc,angle, mobType.getMobMaxHP());
		this.mobPath = mobPath;
		this.mobSpeed = mobType.getMobMovementSpeed();
		this.pathProgress = 0;
	}

	@Override
	public void tickObject() 
	{
		// TODO Auto-generated method stub
		
	}

}
