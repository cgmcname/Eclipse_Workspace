import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class JumpingontheClouds 
{

	public static void main(String[] args) 
	{
		
		int eDrain = 0;
		int k = 3;
		
		int i = 0;
		
		int[] c = {1, 1, 1, 0, 1, 1, 0, 0, 0, 0};
		
	
		
		i = (i + k) % c.length;
		
		
		while (i != 0)
		{
			
			//System.out.println("Check: " + i);
			
			if (i < c.length)
			{
				
			
				if (c[i] == 0)
				{
					eDrain += 1;
					//System.out.println("eDrain zero c["+ i + "]: " + eDrain);
				}
				
				if (c[i] == 1)
				{
					eDrain += 3;
					//System.out.println("eDrain one c["+ i + "]: " + eDrain);
				}
				
			}	
			
			i = (i + k) % c.length;
		}
		
		if(c[0] == 1)
		{
			eDrain += 3; 
		}
		
		if(c[0] == 0)
		{
			eDrain += 1; 
		}
		
		
		System.out.println(100 - eDrain);

	}

}
