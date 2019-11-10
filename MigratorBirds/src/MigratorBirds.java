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


public class MigratorBirds 
{

	public static void main(String[] args) 
	{
		
		List<Integer> arr = new ArrayList<Integer>();
		
		
		arr.add(1);      
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(4);
		arr.add(3);
		arr.add(2);
		arr.add(1);
		arr.add(3);
		arr.add(4);
		
		Stack<Integer> stack = new Stack<Integer>();
		
		int oneBucket = 0;
		int twoBucket = 0;
		int threeBucket = 0;
		int fourBucket = 0;
		int fiveBucket = 0;
		
		int hold = 0;
		int save = hold;
		
		int lowNum = 0;
		
		
		
		for (int i = 0; i < arr.size(); i++)
		{
			if(arr.get(i) == 1)
			{
				oneBucket++;
			}
			if(arr.get(i) == 2)
			{
				twoBucket++;
			}
			if(arr.get(i) == 3)
			{
				threeBucket++;
			}
			if(arr.get(i) == 4)
			{
				fourBucket++;
			}
			if(arr.get(i) == 5)
			{
				fiveBucket++;
			}
		}
		
		stack.push(oneBucket);
		stack.push(twoBucket);
		stack.push(threeBucket);
		stack.push(fourBucket);
		stack.push(fiveBucket);
		
		
		
		for(int i = 5; i > 0; i--) 
        { 
			
			
			hold =  stack.pop(); 
			
			if (hold >= save)
			{
				save = hold;
				System.out.println("i : " + i);
				lowNum = i;
			}
			
			
        } 
		
		System.out.println(lowNum);
		//return lowNum ;
	}

}
