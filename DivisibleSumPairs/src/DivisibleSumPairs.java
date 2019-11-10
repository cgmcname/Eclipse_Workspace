import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class DivisibleSumPairs 
{

	public static void main(String[] args) 
	{
		int n;
		int k = 2; 
		int[] ar = {5, 9, 10, 7, 4};
		
		int count = ar.length -1 ;
		int save = count;
		int sum = 0;
		int valid = 0;
		int j = 0;
		
		for (int i = 0; i < ar.length; i++)
		{
			sum = ar[i];
			j = i + 1;
			
			//System.out.println("Outer Loop: " + sum);
			
			while(count > 0)
			{
				sum += ar[j++];
				
				//System.out.println("Inter Loop 1: " + sum);
				
				if(sum % k == 0)
				{
					valid++;
				}
				
				sum = ar[i];
				
				//System.out.println("Inter Loop 2: " + sum);
				count--;
			}
			
			save--;
			count = save;
		}
		
		System.out.println(valid);
		//return valid;
	}

}
