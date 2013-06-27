package objects.mobs;

public enum EMobTypes 
{
	CRAWLER("Crawler", 10, 1.1, 1),
	FAST_CRAWLER("Fast Crawler", 10, 1.6, 2),
	DURABLE_CRAWLER("Durable Crawler", 15, 1.1, 2),
	ULTIMATE_CRAWLER("Ultimate Crawler",15, 1.6, 4);
	
	private int mobCost, mobMaxHP;
	private String mobName;
	private double mobMovementSpeed;
	
	EMobTypes(String mobName, int mobHP, double mobMovementSpeed, int mobCost)
	{
		this.mobName = mobName;
		this.mobMaxHP = mobHP;
		this.mobMovementSpeed = mobMovementSpeed;
		this.mobCost = mobCost;
	}
	
	public String getMobName()
	{
		return this.mobName;
	}
	
	public int getMobCost()
	{
		return this.mobCost;
	}
	
	public double getMobMovementSpeed()
	{
		return this.mobMovementSpeed;
	}
	
	public int getMobMaxHP()
	{
		return this.mobMaxHP;
	}
}
