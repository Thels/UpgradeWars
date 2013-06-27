package pathing;

import java.awt.Point;

public class Node 
{
	private Point.Double nodeLocation;
	
	public Node(double xLoc, double yLoc)
	{
		this.nodeLocation = new Point.Double(xLoc,yLoc);
	}
}
