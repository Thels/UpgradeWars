package pathing;

import java.util.ArrayList;
import java.util.List;

import pathing.exceptions.NoSuchNodeException;
import pathing.exceptions.NodeAlreadyExistsException;

public class Path implements IPath
{
	private List<Node> path;

	public Path()
	{
		path = new ArrayList<Node>();
	}
	@Override
	public int getPathComplexity() 
	{
		return path.size();
	}

	@Override
	public void addNodeToPath(Node node) 
	{
		if(path.contains(node))
			throw new NodeAlreadyExistsException("Node already exists in current path");
		else
			path.add(node);
	}

	@Override
	public List<Node> getPath() 
	{
		return path;
	}

	@Override
	public void removeNodeFromPath(Node node) 
	{
		if(!path.contains(node))
			throw new NoSuchNodeException("No such node exists in the current path");
		else
			path.remove(node);
	}

	@Override
	public void clearPath() 
	{
		path = new ArrayList<Node>();

	}

}
