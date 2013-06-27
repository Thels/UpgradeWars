package level;

import objects.towers.BasicTower;
import objects.towers.ETowerTypes;
import objects.towers.Tower;

public class TowerFactory 
{

	
	public Tower createTower(int x, int y,ETowerTypes towerType)
	{
		switch(towerType)
		{
		case BASIC: return new BasicTower(x, y);
		default : return null;
		}
	}
}
