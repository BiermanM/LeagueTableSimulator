// Created by Matthew Bierman
public class Player 
{
	private int yc;
	private boolean rc;
	private boolean starting;
	
	public Player(boolean s)
	{
		yc = 0;
		rc = false;
		starting = s;
	}
	
	public void yellowCarded()
	{
		yc++;
		if (yc == 2)
			redCarded();
	}
	
	public void redCarded()
	{
		rc = true;
		starting = false;
	}
	
	public void substitution()
	{
		if (starting == false)
			starting = true;
		else
			starting = false;
	}
	
	public boolean checkRedCarded()
	{
		return rc;
	}
	
	public boolean checkStarting()
	{
		return starting;
	}
}
