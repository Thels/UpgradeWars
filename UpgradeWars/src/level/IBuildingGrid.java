package level;

import objects.towers.ETowerTypes;
import pathing.IPath;

public interface IBuildingGrid
{
	public int getGridSize();
	
	public boolean isTileInUse(int x, int y);
	
	public void placeTower(int x, int y, ETowerTypes towerToPlace);
	
	public void upgradeTower(int x, int y);
	
	public void clearTiles();
	
	public void sellTower(int x, int y);
	
	public IPath getPathFromSpawnToExit();
	
}
