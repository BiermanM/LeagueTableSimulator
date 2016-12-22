// Created by Matthew Bierman
public class Team 
{
	int pl, mp, w, d, l, f, a, diff, p, att, mid, def = 0;
	String nm = "";
	
	public Team(String name, int a, int m, int d)
	{
		nm = name;
		att = a;
		mid = m;
		def = d;
	}
	
	public void setName(String name)
	{
		nm = name;
	}
	
	public void setMatchesPlayed()
	{
		mp++;
	}
	
	public void setWDL(int win, int draw, int loss)
	{
		w += win;
		d += draw;
		l += loss;
	}
	
	public void setFAD(int forGoals, int againstGoals, int difference)
	{
		f += forGoals;
		a += againstGoals;
		diff += difference;
	}
	
	public void setPoints(int points)
	{
		p += points;
	}
	
	public String getName()
	{
		return nm;
	}
	
	public int getIntPoints()
	{
		return p;
	}
	
	public String toString()
	{
		String print = nm + "  " + mp + "  ";
		
		if (Integer.toString(mp).length() == 1)
			print += " ";
		
		print += w;
		if (Integer.toString(w).length() == 2)
			print += "   ";
		else if (Integer.toString(w).length() != 2)
			print += "    ";
		
		print += d;
		if (Integer.toString(d).length() == 2)
			print += "    ";
		else if (Integer.toString(d).length() != 2)
			print += "     ";
		
		print += l;
		if (Integer.toString(l).length() == 2)
			print += "    ";
		else if (Integer.toString(l).length() != 2)
			print += "     ";
		
		print += f;
		if (Integer.toString(f).length() == 2)
			print += "   ";
		else if (Integer.toString(f).length() == 3)
			print += "  ";
		else
			print += "    ";
		
		print += a;
		if (Integer.toString(a).length() == 2)
			print += "       ";
		else if (Integer.toString(a).length() == 3)
			print += "      ";
		else
			print += "        ";
		if (diff > 0)	
			print += "+";
		else if (diff == 0)
			print += " ";
		
		print += diff;
		if (diff > 99 || diff < -99)
			print += "        ";
		else if (diff > 9 || diff < -9)
			print += "         ";
		else
			print += "          ";
		
		print += p;
		
		return print;
	}
}