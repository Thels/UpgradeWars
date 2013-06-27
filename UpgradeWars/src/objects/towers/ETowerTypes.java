package objects.towers;

public enum ETowerTypes 
{
	BASIC("Basic Tower",0.0,.1,1, false);
	
	
	private int towerCost;
	private String towerName;
	private double fireSpeed, towerRange;
	private boolean isPassable;
	
	ETowerTypes(String towerName, double towerRange, double towerFiringSpeed, int towerCost, boolean isPassable)
	{
		this.towerName = towerName;
		this.fireSpeed = towerFiringSpeed;
		this.towerRange = towerRange;
		this.towerCost = towerCost;
		this.isPassable = isPassable;
	}
	
	public String getTowerName()
	{
		return this.towerName;
	}
	
	public int getTowerCost()
	{
		return this.towerCost;
	}
	
	public double getTowerFiringSpeed()
	{
		return this.fireSpeed;
	}
	
	public double getTowerRange()
	{
		return this.towerRange;
	}
	
	public boolean getIsPassable()
	{
		return this.isPassable;
	}
}
