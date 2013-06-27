package level;

import java.util.List;

import objects.mobs.EMobTypes;
import objects.mobs.Mob;

public interface IMobGrid 
{
	public List<Mob> getActiveMobs();
	
	public void checkForDeadMobs();
	
	public void setSpawnDelay(int delayTime);
	
	public int getSpawnDelay();
	
	public void addEnemy(EMobTypes mobType, double x, double y);
	
	public void addEnemyMultiple(EMobTypes mobType, double x, double y, int quantity);
	
	public void applyDamageToArea(double x, double y, double damageRadius, double damage);
	
	public void tick();
}
