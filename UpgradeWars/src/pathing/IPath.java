package pathing;

import java.util.List;

public interface IPath 
{
	public int getPathComplexity();
	
	public void addNodeToPath(Node node);
	
	public List<Node> getPath();
	
	public void removeNodeFromPath(Node node);
	
	public void clearPath();
	
}
