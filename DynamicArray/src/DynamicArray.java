import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class DynamicArray 
{

	public static void main(String[] args) 
	{
		int n = 2;
	
		//ArrayList<Integer> arr = new ArrayList<Integer>(n);
		
		List<List<Integer>> queries = new ArrayList<List<Integer>>();
		
		List<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(0);
		a.add(5);
		List<Integer> b = new ArrayList<Integer>();
		b.add(1);
		b.add(1);
		b.add(7);
		
		List<Integer> c = new ArrayList<Integer>();
		c.add(1);
		c.add(0);
		c.add(3);
		
		List<Integer> d = new ArrayList<Integer>();
		d.add(2);
		d.add(1);
		d.add(0);
		
		List<Integer> e = new ArrayList<Integer>();
		e.add(2);
		e.add(1);
		e.add(1);
		
	
		
		queries.add(a);
		queries.add(b);
		queries.add(c);
		queries.add(d);
		queries.add(e);
		
		//System.out.println(queries);
		
		int seq = 0;
		
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		List<Integer> output = new ArrayList<Integer>();
		
		
		for (int i = 0; i < n; i++)
		{
			arr.add(i, new ArrayList<Integer>());
		}
		
		int lastAnswer = 0;
		
		
		
		for (int i=0; i < queries.size(); i++)
		{
			if (queries.get(i).get(0) == 1) 
			{
				//seq = queries.get(i).get(1) ^ lastAnswer % n;
				//System.out.println(queries.get(i).get(1) ^ lastAnswer % n);
				
				arr.get(((queries.get(i).get(1) ^ lastAnswer) % n)).add(queries.get(i).get(2));
			
				
			}
				
			
			
			if (queries.get(i).get(0) == 2) 
			{
				seq = (queries.get(i).get(1) ^ lastAnswer) % n;
				
				lastAnswer = arr.get(seq).get((queries.get(i).get(2) % arr.get(seq).size()));
				output.add(lastAnswer);
				System.out.println(lastAnswer);
			}
			
			
		}
            
		
		
		
		
		//System.out.println("Endcap : " + arr);
		return output;
	}

	
	
}
