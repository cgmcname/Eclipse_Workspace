import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;


public class TimeConversion 
{

	public static void main(String[] args) 
	{
		
		String s = "06:40:03PM";
		
		String hold = s.substring(8, 10);
		
		String check = s.substring(0, 1);
		
		String twelve = s.substring(0, 2);
		
		int add12 = 0;
		
		if (hold.equals("PM"))
		{
			if (twelve.equals("12"))
			{
				hold = "12" + s.substring(2, 8);
				System.out.println(hold);
				//return hold;
			}
			
			if (check.equals("0"))
			{
				add12 = Integer.parseInt(s.substring(1, 2));
				add12 += 12;
				hold = Integer.toString(add12) + s.substring(2, 8);
				System.out.println(hold);
				//return hold;
			}
			else if(check.equals("0") == false)
			{
				add12 = Integer.parseInt(s.substring(0, 2));
				add12 += 12;
				hold = Integer.toString(add12) + s.substring(2, 8);
				System.out.println(hold);
				//return hold;
			}
			
		}
		
		if (hold.equals("AM"))
		{
			if (twelve.equals("12"))
			{
				hold = "00" + s.substring(2, 8);
				System.out.println(hold);
				//return hold;
			}
			
			if (check.equals("0"))
			{
				add12 = Integer.parseInt(s.substring(1, 2));
				
				hold = "0" + Integer.toString(add12) + s.substring(2, 8);
				System.out.println(hold);
				//return hold;
			}
			else if(check.equals("0") == false)
			{
				add12 = Integer.parseInt(s.substring(0, 2));
				
				hold = Integer.toString(add12) + s.substring(2, 8);
				System.out.println(hold);
				//return hold;
			}
			
		}
		

	}

}
