import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class AppleandOrange {

	public static void main(String[] args) 
	{
		int s = 2; 
		int t = 3; 
		int a = 1; 
		int b = 5; 
		int[] apples = { 2};
		int[] oranges = { -2 };
		
		int appleHit = 0;
		int orangeHit = 0;
		
		int check = 0;
		
		for (int i = 0; i < apples.length; i++)
		{
			check = apples[i] + a;
			if (check >= s && check <= t)
			{
				appleHit++;
			}
			
			check = 0;
			//System.out.println(appleHit);
		}
		
		System.out.println(appleHit);
		
		for (int i = 0; i < oranges.length; i++)
		{
			check = oranges[i] + b;
			if (check >= s && check <= t)
			{
				orangeHit++;
			}
			
			check = 0;
			//System.out.println(appleHit);
		}
		
		System.out.println(orangeHit);

	}

}
