package player;

public interface IPlayer 
{

	
	
	public String getPlayerName();
	
	public int getCoinCount();
	
	public void alterCoinCoint(int amount);
	
	public int getMaxMobTokenCount();
	
	public void alterMaxMobTokenCount(int amount);
}
