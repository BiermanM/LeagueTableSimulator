// Created by Matthew Bierman
import java.util.*;
public class Match 
{
	private String nmT1;
	private int goalsT1;
	private Player[] team1 = {new Player(true), new Player(true), new Player(true), new Player(true), new Player(true), new Player(true), 
							  new Player(true), new Player(true), new Player(true), new Player(true), new Player(true)};
	private Player[] team1Subs = {new Player(false), new Player(false), new Player(false)};
	private int numSubsUsedT1;
	
	private String nmT2;
	private int goalsT2;
	private Player[] team2 = {new Player(true), new Player(true), new Player(true), new Player(true), new Player(true), new Player(true), 
							  new Player(true), new Player(true), new Player(true), new Player(true), new Player(true)};
	private Player[] team2Subs = {new Player(false), new Player(false), new Player(false)};
	private int numSubsUsedT2;
	
	public Match(String t1Name, String t2Name, int gT1, int gT2)
	{
		numSubsUsedT1 = 0;
		numSubsUsedT2 = 0;
		nmT1 = t1Name;
		nmT2 = t2Name;
		goalsT1 = gT1;
		goalsT2 = gT2;
	}
	
	public void substitution(int team, int subPos)
	{
		if (team == 1)
		{
			team1[subPos].substitution();
			team1Subs[numSubsUsedT1].substitution();
			Player temp = team1Subs[numSubsUsedT1];
			team1Subs[numSubsUsedT1] = team1[subPos];
			team1[subPos] = temp;
			numSubsUsedT1++;
		}
		
		else if (team == 2)
		{
			team2[subPos].substitution();
			team2Subs[numSubsUsedT2].substitution();
			Player temp = team2Subs[numSubsUsedT2];
			team2Subs[numSubsUsedT2] = team2[subPos];
			team2[subPos] = temp;
			numSubsUsedT2++;
		}
	}
	
	public int remainingSubs(int team)
	{
		if (team == 1)
			return 3 - numSubsUsedT1;
		else
			return 3 - numSubsUsedT2;
	}

	public String events()
	{
		Random ran = new Random();
		int numEvents = ran.nextInt(7) + 1;
		if (numEvents < (goalsT1 + goalsT2))
			numEvents += (goalsT1 + goalsT2);
		
		// Creates an array, lists minute each event occurred
		String[] arrEvents = new String[numEvents];
		for (int x = 0; x < numEvents; x++)
		{
			int num = ran.nextInt(90) + 1;
			if (num < 10)
				arrEvents[x] = "0" + num + "'   ";
			else
				arrEvents[x] =  num + "'   ";
		}
		
		// Bubble sort
		for(int i = 0; i < arrEvents.length; i++)
        {
			for(int j = 0; j < arrEvents.length - 1; j++)
			{
				if (Integer.valueOf(arrEvents[j].substring(0, 2)) > Integer.valueOf(arrEvents[j+1].substring(0, 2)))
				{
					String temp = arrEvents[j];
					arrEvents[j] = arrEvents[j+1];
					arrEvents[j+1] = temp;
				} 
			} 
        }
		
		// Assigns goals in random cells
		for (int x = 0; x < goalsT1; x++)
		{
			int num = ran.nextInt(numEvents);
			int chance = (int) (Math.random() * 100);
			if (!(arrEvents[num].length() > 8))
			{
				if (chance > 80)
					arrEvents[num] += nmT1 + "   Penalty Kick - Goal!";
				else
					arrEvents[num] += nmT1 + "   Goal!";
			}
			else
				x--;
		}
		for (int x = 0; x < goalsT2; x++)
		{
			int num = ran.nextInt(numEvents);
			int chance = (int) (Math.random() * 100);
			if (!(arrEvents[num].length() > 8))
			{
				if (chance > 80)
					arrEvents[num] += nmT2 + "   Penalty Kick - Goal!";
				else
					arrEvents[num] += nmT2 + "   Goal!";
			}
			else
				x--;	
		}
		
		// Assigns other random events in cells
		for (int x = 0; x < arrEvents.length; x++)
		{
			if (!(arrEvents[x].length() > 8))
			{
				int team = ran.nextInt(2);
				int num = (int) (Math.random() * 100);
				int player = ran.nextInt(11);
				
				// Team 1
				if (team == 0)
				{
					// Foul
					if (num < 50)
					{
						int sev = ran.nextInt(6);
						if (sev == 0 || sev == 1 || sev == 2)
							arrEvents[x] += nmT1 + "   Foul";
						else if (sev == 3 || sev == 4)
						{
							team1[player].yellowCarded();
							if (team1[player].checkRedCarded() == false)
								arrEvents[x] += nmT1 + "   Foul - Yellow Card";
							else
								arrEvents[x] += nmT1 + "   Foul - Second Yellow Card, Red Card!";
						}
						else
						{
							team1[player].redCarded();
							arrEvents[x] += nmT1 + "   Foul - Red Card!";
						}
					}
					
					// Penalty Kick Miss
					else if (num > 90)
						arrEvents[x] += nmT1 + "   Penalty Kick - Miss!";
					
					// Substitution
					else
					{
						if (numSubsUsedT1 < 3)
						{
							if (num > 50 && num < 56)
								arrEvents[x] += nmT1 + "   Injury - Substitution";
							else
								arrEvents[x] += nmT1 + "   Substitution";
							substitution(1, player);
						}
						
						else
							x--;
					}
				}
				
				// Team 2
				else if (team == 1)
				{
					// Foul
					if (num < 50)
					{
						int sev = ran.nextInt(6);
						if (sev == 0 || sev == 1 || sev == 2)
							arrEvents[x] += nmT2 + "   Foul";
						else if (sev == 3 || sev == 4)
						{
							team2[player].yellowCarded();
							if (team2[player].checkRedCarded() == false)
								arrEvents[x] += nmT2 + "   Foul - Yellow Card";
							else
								arrEvents[x] += nmT2 + "   Foul - Second Yellow Card, Red Card!";
						}
						else
						{
							team2[player].redCarded();
							arrEvents[x] += nmT2 + "   Foul - Red Card!";
						}
					}
					
					// Penalty Kick Miss
					else if (num > 90)
						arrEvents[x] += nmT2 + "   Penalty Kick - Miss!";
					
					// Substitution
					else
					{
						if (numSubsUsedT2 < 3)
						{
							arrEvents[x] += nmT2 + "   Substitution";
							substitution(2, player);
						}
						
						else
							x--;
					}
				}
			}
		}
		
		
		String print = "";
		for (String temp : arrEvents)
			print += "   " + temp + "\n";
		
		return print;
	}
}
