import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class DayoftheProgrammer 
{

	public static void main(String[] args) 
	{
		//int year = 1700;
		//int year = 1918;
		int year = 1980;
		
		//dd.mm.yyyy
		String date = "";
		
		if(year >= 1700 && year <= 1917)
		{
			if ((year % 4) == 0) 
			{
				date  = "12.09." + Integer.toString(year);
			}
			
			if ((year % 4) != 0)
			{
				date  = "13.09." + Integer.toString(year);
			}
		}
		
		if(year == 1918)
		{
			date  = "26.09." + Integer.toString(year);
		}
		
		if(year >= 1919 && year <= 2700)
		{
			if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
			{
				date  = "12.09." + Integer.toString(year);
			}
			else
			{
				date  = "13.09." + Integer.toString(year);
			}
		}
		
		System.out.println(date);
		//return date;
	}

}
