package pathing.exceptions;

public class NodeAlreadyExistsException extends RuntimeException 
{

	
	public NodeAlreadyExistsException(String errorMessage) 
	{
		super(errorMessage);
	}
}
