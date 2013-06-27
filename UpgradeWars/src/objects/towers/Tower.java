package objects.towers;

import objects.AbstractObject;
import objects.towers.firemodes.IFiringAlgorithm;

public abstract class Tower extends AbstractObject 
{
	private IFiringAlgorithm firingAlgorithm;
	
	public Tower(int xLoc, int yLoc) 
	{
		super(xLoc, yLoc);
	}

	@Override
	public abstract void tickObject();

}
