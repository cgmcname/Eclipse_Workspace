import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class BetweenTwoSets 
{

	public static void main(String[] args) 
	{
		
		
		List<Integer> a = new ArrayList<Integer>();
		List<Integer> b = new ArrayList<Integer>();
		
		//a.add(1);
		a.add(2);
		a.add(4);
		//a.add(9);
		
		
		
		b.add(16);
		b.add(32);
		b.add(96);
		//b.add(100);
		
		
		
		
		int lcm = a.get(0);
		int gcd = b.get(0);
		
		int factors = 0;
		int hold = 0;
		
		
		if (a.size() > 1)
		{
			
			for(int i = 1; i < a.size(); i++)
			{
				hold = lcm(a.get(i),lcm);
				lcm = Math.max(lcm, hold);
			}
		}
		
	
		
		if (b.size() > 1)
		{
			
			for(int i = 1; i < b.size(); i++)
			{
				hold = gcd(b.get(i),gcd);
				gcd = Math.min(gcd, hold);
			}
		}
		
		
		
		hold = lcm;
		
		 
		 
	   while(lcm <= gcd)
	   {
		   if(gcd % lcm == 0)
		   {
			   
			   System.out.println(lcm);
			   factors++;
		   }
		   
		   lcm = lcm + hold;
	   }
		
		
		System.out.println(factors);
		
		
	}
	
	 
    static int gcd(int a, int b) 
    { 
        if (a == 0) 
            return b; 
              
        return gcd(b % a, a); 
    } 
      
   
    static int lcm(int a, int b) 
    { 
        return (a * b) / gcd(a, b); 
    }

}
