package pathing.exceptions;

public class NoSuchNodeException extends RuntimeException 
{
	public NoSuchNodeException(String errorMessage) 
	{
		super(errorMessage);
	}
}
