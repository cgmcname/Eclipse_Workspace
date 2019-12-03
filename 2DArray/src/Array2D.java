import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Array2D
{
	public static void main(String[] args) 
	{
		int[][] arr = 
			{ 
				{0, -4, -6, 0, -7, -6}, 
				{-1, -2, -6, -8, -3, -1}, 
				{-8, -4, -2, -8, -8, -6}, 
				{-3, -1, -2, -5, -7, -4},
				{-3, -5, -3, -6, -6, -6}, 
				{-3, -6, 0, -8, -6, -7}
			};
		
		int total = Integer.MIN_VALUE;
		int save = 0;
		
		for (int i = 0; i < (arr.length - 2); i++)
		{
			
			
			for(int j = 0; j < arr[i].length; j++)
			{
				
				
				if (j+2 < arr[i].length)
				{
					save = 	arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j]
							+ arr[i+2][j+1] + arr[i+2][j+2];
					
					total = Math.max(total, save);
				}
				
				
				
			}
			
			
		}
				
				
				System.out.println(total);	
					
	}
}
