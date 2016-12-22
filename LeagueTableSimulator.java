// Created by Matthew Bierman
public class LeagueTableSimulator 
{
	// For toString, the first line changes depending on the league
	private String print;
	
	// All teams in an array
	private Team[] allTeams;
	
	// User specified number of weeks in the season
	private int numWeeks;
	
	// Entire league schedule, first column indicates which week that row is
	private String[][] arrScheduleT1, arrScheduleT2;
	
	//Which weeks to display
	private int startingWeek, endingWeek;
	
	// Puts all of the teams of the selected league into the allTeams array to be used
	public LeagueTableSimulator(int num, Team[] arr, String p, String dS)
	{
		allTeams = arr;
		print = p;
		if (dS.length() == 1)
		{
			startingWeek = Integer.valueOf(dS) - 1;
			endingWeek = Integer.valueOf(dS) - 1;
		}
		
		else if (dS.equals("all"))
		{
			startingWeek = 0;
			endingWeek = (allTeams.length * 2) - 2;
		}
		
		else
		{
			startingWeek = Integer.valueOf(dS.substring(0, dS.indexOf("-"))) - 1;
			endingWeek = Integer.valueOf(dS.substring(dS.indexOf("-") + 1)) - 1;
		}
		
		if (num == 0)
			numWeeks = (allTeams.length * 2) - 2;
		else
			numWeeks = num;
		
		arrScheduleT1 = new String[numWeeks][(allTeams.length / 2) + 1];
		arrScheduleT2 = new String[numWeeks][(allTeams.length / 2) + 1];
	}
	
	// Sets two teams against each other
	public void games(int x, int y, int r, int c)
	{
		// Probabilities based on FIFA 15 ratings
		int aGoals = 0;
		int bGoals = 0;
		
		// Team A's attackers compared to Team B's defenders
		if (allTeams[x].att > allTeams[y].def)
		{
			if (Math.random() >= .2)
			{
				aGoals++;
				if (Math.random() >= .75 && (allTeams[x].att - allTeams[y].def) > 5)
					aGoals++;
			}
			else if (Math.random() >= .9)
				bGoals++;
		}
		else
		{
			if (Math.random() >= .2)
			{
				bGoals++;
				if (Math.random() >= .1 && (allTeams[y].def - allTeams[x].att) > 5)
					bGoals++;
			}
			else if (Math.random() >= .9)
				bGoals++;
		}
		
		// Team A's midfielders compared to Team B's midfielders
		if (allTeams[x].mid > allTeams[y].mid)
		{
			aGoals++;
			if (Math.random() >= .9)
				bGoals++;
		}
		
			
		else
		{
			bGoals ++;
			if (Math.random() >= .9)
				aGoals++;
		}
		
		// Team A's defenders compared to Team B's attackers
		if (allTeams[x].def > allTeams[y].att)
		{
			if (Math.random() > .75 && (allTeams[x].def - allTeams[y].att) > 5 && bGoals > 1)
				bGoals -= 2;
		}
		else 
		{
			if (Math.random() >= .75 && (allTeams[y].def - allTeams[x].att) > 5 && bGoals > 1)
				aGoals -= 2;
		}	
			
		// Team A vs. Team B
		allTeams[x].setMatchesPlayed();
		allTeams[y].setMatchesPlayed();
		
		if (aGoals < bGoals)
		{
			if (Math.random() >= .1)
				aGoals += 1;
		}
		
		else if (bGoals < aGoals)
		{
			if (Math.random() >= .1)
				bGoals += 1;
		}
		
		if (Math.random() <= .1 && aGoals > bGoals)
			bGoals = aGoals + 1;
		
		else if (Math.random() <= .1 && aGoals < bGoals)
			aGoals = bGoals + 1;
		
		allTeams[x].setFAD(aGoals, bGoals, (aGoals - bGoals));
		allTeams[y].setFAD(bGoals, aGoals, (bGoals - aGoals));
		
		// if Team A wins 
		if (aGoals > bGoals)
		{
			allTeams[x].setWDL(1, 0, 0);
			allTeams[y].setWDL(0, 0, 1);
			allTeams[x].setPoints(3);
		}
		
		// if Team B wins 
		else if (bGoals > aGoals)
		{
			allTeams[x].setWDL(0, 0, 1);
			allTeams[y].setWDL(1, 0, 0);
			allTeams[y].setPoints(3);
		}
		
		// if Team A and B draw
		else
		{
			allTeams[x].setWDL(0, 1, 0);
			allTeams[y].setWDL(0, 1, 0);
			allTeams[x].setPoints(1);
			allTeams[y].setPoints(1);
		}
		
		arrScheduleT1[r][c] = allTeams[x].getName() + ": " + aGoals;
		arrScheduleT2[r][c] = allTeams[y].getName() + ": " + bGoals;
	}
		
	// Takes parts of the String returned in fixtures() to find the two teams to play each other
	public void weeks()
	{
		// An algorithm that creates the season's fixtures
		int teams = allTeams.length;
		int b = allTeams.length / 2;
		String[][] rounds = new String[numWeeks][b];

		for (int round = 0; round < numWeeks; round++) 
		{
			for (int match = 0; match < b; match++) 
			{
				int home = (round + match) % (teams - 1);
				int away = (teams - 1 - match + round) % (teams - 1);
        	
				// Last team stays in the same place while the others rotate around it.
				if (match == 0)
					away = teams - 1;
        	
				rounds[round][match] = home + "," + away;
			}
		}
		
		
		for (int a = 0; a < numWeeks; a++)
		{
			for (int z = 0; z < (allTeams.length / 2); z++)
			{
				String team1 = rounds[a][z];
				String team2 = team1.substring(team1.length() - 2);
				
				team1 = team1.substring(0, 2);
				if (team1.indexOf(",") == 1)
					team1 = team1.substring(0, 1);
				if (team2.indexOf(",") == 0)
				{
					team2 = team2.substring(1);
					if (team2.indexOf(",") == 0)
						team2 = team2.substring(1);
				}
							
				int x = Integer.parseInt(team1);
				int y = Integer.parseInt(team2);
			
				games(x, y, a, (z + 1));
			}
		}
		
	}
	
	// Sorts all teams by Points
	public void sort() 
	{
	    for (int a = 1; a < allTeams.length; a++) 
	    {
	        for (int b = 0; b < allTeams.length - a; b++) 
	        {
	            if ( allTeams[b].getIntPoints() < allTeams[b + 1].getIntPoints() ) 
	            {
	                Team temp = allTeams[b];
	                allTeams[b] = allTeams[b + 1];
	                allTeams[b + 1] = temp;
	            }
	        }
	    }
	}
	
	// Swaps teams if equal in Points but different in Goal Difference
	public void swap()
	{
		for (int x = 1; x < allTeams.length; x++)
		{
			if ( x > 1 && 
				 allTeams[x-1].getIntPoints() == allTeams[x].getIntPoints() && 
				 allTeams[x-2].getIntPoints() == allTeams[x].getIntPoints() )
			{
				if (allTeams[x-2].diff < allTeams[x].diff)
				{
					Team temp = allTeams[x-2];
					allTeams[x-2] = allTeams[x];
					allTeams[x] = temp;
				}
			}
			
			if ( allTeams[x-1].getIntPoints() == allTeams[x].getIntPoints() )
			{	
				if ( allTeams[x-1].diff < allTeams[x].diff )
				{
					Team temp = allTeams[x-1];
					allTeams[x-1] = allTeams[x];
					allTeams[x] = temp;
				}
			}
		}
	}
	
	// Removes extra spaces in names of teams in arrSchedule
	public String[][] removeSpaces()
	{
		String[][] newSchedule = new String[arrScheduleT1.length][arrScheduleT1[0].length];
		for (int x = 0; x < arrScheduleT1.length; x++)
		{
			newSchedule[x][0] = "Week " + (x + 1) + ": ";
			for (int y = 1; y < arrScheduleT1[x].length; y++)
			{
				int colonT1 = arrScheduleT1[x][y].indexOf(":");
				while (arrScheduleT1[x][y].substring(colonT1 - 1, colonT1).equals(" "))
				{
					arrScheduleT1[x][y] = arrScheduleT1[x][y].substring(0, colonT1 - 1) + arrScheduleT1[x][y].substring(colonT1);
					colonT1 = arrScheduleT1[x][y].indexOf(":");
				}
				
				int colonT2 = arrScheduleT2[x][y].indexOf(":");
				while (arrScheduleT2[x][y].substring(colonT2 - 1, colonT2).equals(" "))
				{
					arrScheduleT2[x][y] = arrScheduleT2[x][y].substring(0, colonT2 - 1) + arrScheduleT2[x][y].substring(colonT2);
					colonT2 = arrScheduleT2[x][y].indexOf(":");
				}
				
				newSchedule[x][y] = arrScheduleT1[x][y] + "    " + arrScheduleT2[x][y];
			}
		}
		return newSchedule;
	}
	
	public String toString()
	{
		weeks();
		sort();
		swap();
		String[][] arrSchedule = removeSpaces();
		
		if (startingWeek != -1)
		{
			for (int x = startingWeek; x <= endingWeek; x++)
			{
				for (int y = 0; y < arrSchedule[0].length; y++)
				{
					System.out.println(arrSchedule[x][y]);
					if (y != 0)
					{
						String str = arrSchedule[x][y];
						String team1Name = str.substring(0, str.indexOf(":"));
						str = str.substring(str.indexOf(":") + 2);
						int team1Goals = Integer.valueOf(str.substring(0, str.indexOf(" ")));
						str = str.substring(str.indexOf(" "));
					
						while (str.substring(0, 1).equals(" "))
							str = str.substring(1);
					
						String team2Name = str.substring(0, str.indexOf(":"));					
						str = str.substring(str.indexOf(":") + 2);
						int team2Goals = Integer.valueOf(str.substring(0));
					
						while (team2Name.length() < team1Name.length())
							team2Name += " ";
						while (team1Name.length() < team2Name.length())
							team1Name += " ";
					
						Match m1 = new Match(team1Name, team2Name, team1Goals, team2Goals);
						System.out.println(m1.events());
					}
				}
			}
		}
		
		
		for (int i = 1; i <= allTeams.length; i++)
		{
			if (i > 9)
				print += "\n" + i + ")  " + allTeams[i-1].toString();
			else
				print += "\n" + i + ")   " + allTeams[i-1].toString();
		}
		
		return print;
	}
}