import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Kangaroo 
{

	public static void main(String[] args) 
	{
		int x1 = 4523;     
		int v1 = 8092; 
		int x2 = 9419; 
		int v2 = 8076;
		
		int distance1 = x1;
		int distance2 = x2;
		
		int jumpCount1 = 0;
		int jumpCount2 = 0;
		
		//String result = "";
		
		while(distance1 <= 10000000 && distance2 <= 10000000 )
		{
			distance1 += v1;
			jumpCount1++;
			
			distance2 += v2;
			jumpCount2++;
			
			if(distance1 == distance2 && jumpCount1 == jumpCount2)
			{
				System.out.println("YES");
				//return "YES";
			}
			
		}
		
				System.out.println("NO");
				//return "NO";
	}

}
