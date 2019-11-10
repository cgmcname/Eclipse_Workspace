import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class GradingStudents 
{

	public static void main(String[] args) 
	{
		List<Integer> grades = new ArrayList<Integer>();
		
		grades.add(73);
		grades.add(67);
		grades.add(38);
		grades.add(33);
		
		grades.add(93);
		grades.add(92);
		grades.add(0);
		grades.add(12);
		
		
		
		
		
		for (int i = 0; i < grades.size(); i++)
		{
		
			if (grades.get(i)<= 100 && grades.get(i)>= 91)
			{
				if(100 - grades.get(i) >= 0 && 100 - grades.get(i) < 3)
				{
					grades.remove(i);
					grades.add( i, 100);
				}
				
				if(95 - grades.get(i) >= 0 && 95 - grades.get(i) < 3)
				{
					grades.remove(i);
					grades.add( i, 95);
				}
			}
			if (grades.get(i)<= 90 && grades.get(i)>= 81)
			{
				if(90 - grades.get(i) >= 0 && 90 - grades.get(i) < 3)
				{
					grades.remove(i);
					grades.add( i, 90);
				}
				
				if(85 - grades.get(i) >= 0 && 85 - grades.get(i) < 3)
				{
					grades.remove(i);
					grades.add( i, 85);
				}
			}
			if (grades.get(i)<= 80 && grades.get(i)>= 71)
			{
				if(80 - grades.get(i) >= 0 && 80 - grades.get(i) < 3)
				{
					grades.remove(i);
					grades.add( i, 80);
				}
				
				if(75 - grades.get(i) >= 0 && 75 - grades.get(i) < 3)
				{
					grades.remove(i);
					grades.add( i, 75);
				}
			}
			if (grades.get(i)<= 70 && grades.get(i)>= 61)
			{
				if(70 - grades.get(i) >= 0 && 70 - grades.get(i) < 3)
				{
					grades.remove(i);
					grades.add( i, 70);
				}
				
				if(65 - grades.get(i) >= 0 && 65 - grades.get(i) < 3)
				{
					grades.remove(i);
					grades.add( i, 65);
				}
			}
			if (grades.get(i)<= 60 && grades.get(i)>= 51)
			{
				if(60 - grades.get(i) >= 0 && 60 - grades.get(i) < 3)
				{
					grades.remove(i);
					grades.add( i, 60);
				}
				
				if(55 - grades.get(i) >= 0 && 55 - grades.get(i) < 3)
				{
					grades.remove(i);
					grades.add( i, 55);
				}
			}
			if (grades.get(i)<= 50 && grades.get(i)>= 41)
			{
				if(50 - grades.get(i) >= 0 && 50 - grades.get(i) < 3)
				{
					grades.remove(i);
					grades.add( i, 50);
				}
				
				if(45 - grades.get(i) >= 0 && 45 - grades.get(i) < 3)
				{
					grades.remove(i);
					grades.add( i, 45);
				}
			}
			if (grades.get(i)<= 40 && grades.get(i)>= 38)
			{
				if(40 - grades.get(i) >= 0 && 40 - grades.get(i) < 3)
				{
					grades.remove(i);
					grades.add( i, 40);
				}
				
				
			}
		}
		
		System.out.println(grades);
		
	}

}
