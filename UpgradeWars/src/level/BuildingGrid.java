package level;

import objects.IObject;
import objects.towers.ETowerTypes;
import objects.towers.Tower;
import pathing.IPath;

public class BuildingGrid implements IBuildingGrid 
{
	
	private IObject[][] grid;
	private TowerFactory towerFactory;
	
	public BuildingGrid(int gridSize)
	{
		grid = new IObject[gridSize][gridSize];
		
		clearTiles();
		
		towerFactory = new TowerFactory();
	}
	
	
	@Override
	public int getGridSize() 
	{
		return grid.length;
	}

	@Override
	public boolean isTileInUse(int x, int y) 
	{
		return grid[x][y] != null;
	}

	@Override
	public void placeTower(int x, int y, ETowerTypes towerToPlace) 
	{
		grid[x][y] = towerFactory.createTower(x,y,towerToPlace);
		
	}


	@Override
	public void upgradeTower(int x, int y)
	{
		// TODO Upgrade tower back-end.
		
	}


	@Override
	public void clearTiles() 
	{
		for(int i = 0 ; i < grid.length;i++)
		{
			for(int j = 0; j < grid.length; j++)
				grid[i][j] = null;
		}
	}


	@Override
	public void sellTower(int x, int y) 
	{
		// TODO Auto-generated method stub
		
	}


	@Override
	public IPath getPathFromSpawnToExit() {
		// TODO Auto-generated method stub
		return null;
	}

}
