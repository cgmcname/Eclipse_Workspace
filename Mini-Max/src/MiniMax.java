import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class MiniMax {
	
	

	public static void main(String[] args) 
	{
		
		
		
		int [] arr = { 256741038, 623958417, 467905213, 714532089, 938071625};
		
		long total1 = (long) ((long) arr[0] + (long) arr[1] + (long) arr[2] + (long) arr[3]);
		
		long total2 = (long) ((long) arr[4] + (long) arr[1] + (long) arr[2] + (long) arr[3]);
		
		long total3 = (long) ((long) arr[0] + (long) arr[4] + (long) arr[2] + (long) arr[3]);
		
		long total4 = (long) ((long) arr[0] + (long) arr[1] + (long) arr[4] + (long) arr[3]);
		
		long total5 = (long) ((long) arr[0] +(long)  arr[1] + (long) arr[2] + (long) arr[4]);
		
		
		
		long maxF = 0;
		
		
		long minF = 0;
		
	
		
		minF = Math.min(total1, Math.min(total2, Math.min(total3, Math.min(total4, total5))));
		maxF = Math.max(total1, Math.max(total2, Math.max(total3, Math.max(total4, total5))));
		
		System.out.println(minF + " " + maxF);

	}
	
	static long maxL (long a, long b)
	{
		if (a > b)
		{
			return a;
		}
		if (b > a)
		{
			return b;
		}
		else return a;
	}
	
	static long minL (long a, long b)
	{
		if (a < b)
		{
			return a;
		}
		if (b < a)
		{
			return b;
		}
		else return a;
	}
	

}
