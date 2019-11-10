import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;




public class BreakingtheRecords 
{

	public static void main(String[] args) 
	{
		int[] scores = {10, 5, 20, 20, 4, 5, 2, 25, 1};
		
		
		int[] report = new int [2];
		
		int highs = scores[0];
		int lows = scores[0];
		
		int numHighs = 0;
		int numLows = 0;
		
		for(int i = 1; i < scores.length; i++)
		{
			if(scores[i] > highs)
			{
				highs = scores[i];
				numHighs++;
			}
			
			if(scores[i] < lows)
			{
				lows = scores[i];
				numLows++;
			}
		}
		
		report[0] = numHighs;
		report[1] = numLows;
		
		System.out.println(report[0] + " " + report[1]);
		//return report;

	}

}
