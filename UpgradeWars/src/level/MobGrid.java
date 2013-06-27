package level;

import java.awt.Point;
import java.util.List;

import objects.mobs.EMobTypes;
import objects.mobs.Mob;

public class MobGrid implements IMobGrid 
{

	private List<Mob> mobsStillToAdd, activeMobs, mobsToDelete;
	private int spawnDelay;
	private MobFactory mobFactory;

	
	public MobGrid(Point.Double mobSpawnPoint)
	{
		
	}
	@Override
	public List<Mob> getActiveMobs() 
	{
		return activeMobs;
	}

	@Override
	public void checkForDeadMobs() 
	{
		for(Mob i : activeMobs)
		{
			if(!i.isObjectAlive())
				mobsToDelete.add(i);
		}	
	}

	@Override
	public void setSpawnDelay(int delayTime) 
	{
		this.spawnDelay = delayTime;
	}

	@Override
	public int getSpawnDelay() 
	{
		return spawnDelay;
	}

	@Override
	public void addEnemy(EMobTypes mobType, double x, double y) 
	{
	
		
	}

	@Override
	public void addEnemyMultiple(EMobTypes mobType, double x, double y, int quantity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void applyDamageToArea(double x, double y, double damageRadius,
			double damage) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	
}
