import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class SparseArrays 
{

	public static void main(String[] args) 
	{
		
		
		String[] strings = { "aba", "baba", "aba", "xzxb"};
				
		
		String[] queries = { "aba", "xzxb", "ab" };
		
		List<Integer> occurances = new ArrayList<Integer>();
		
		int hit = 0;
		
		for (int i = 0; i <  queries.length; i++)
		{
			hit = 0;
			
			for (int j = 0; j < strings.length; j++)
			{
				if(queries[i].equals(strings[j]))
				{
					hit++;
				}
			}
			
			occurances.add(hit);
		}
		
			int [] arr = new int[occurances.size()]; 
	        
			for (int i = 0; i < occurances.size(); i++)
			{
				arr[i] = occurances.get(i);
				System.out.println(arr[i]);
			}
			
	        
	       // return arr;

	}

}
