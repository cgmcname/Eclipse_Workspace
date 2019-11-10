import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PlusMinus {

	public static void main(String[] args) 
	{
		int[] arr = { 0,123,11,1567,-1,-13 };
		
		double zeroSum = 0;
		double posSum = 0;
		double negSum = 0;
		
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] > 0)
			{
				posSum++;
			}
			
			if (arr[i] < 0)
			{
				negSum++;
			}
			
			if (arr[i] == 0)
			{
				zeroSum++;
			}
		}
		
		System.out.println((posSum/(double)arr.length));
		System.out.println((negSum/(double)arr.length));
		System.out.println((zeroSum/(double)arr.length));
		
		

	}

}
