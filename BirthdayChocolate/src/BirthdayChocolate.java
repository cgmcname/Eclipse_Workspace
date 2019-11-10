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




public class BirthdayChocolate 
{

	public static void main(String[] args) 
	{
		
		List<Integer> s =  new ArrayList<Integer>(); 
		
		s.add(2);   
		s.add(5);
		s.add(1);
		s.add(3);
		s.add(4);
		s.add(4);
		s.add(3);
		s.add(5);
		s.add(1);
		s.add(1);
		s.add(2);
		s.add(1);
		s.add(4);
		s.add(1);
		s.add(3);
		s.add(3);
		s.add(4);
		s.add(2);
		s.add(1);
		
		int d = 18; 
		int m = 7;
		
		int hold = 0;
		int sum = 0;
		
		int save = m - 1;
		int j = 0;
		
		int segmentValid = 0;
		
		
		if (m < s.size())
		{
			hold = (s.size()+ 1) - m;
		}
		
		if (m > s.size())
		{
			//return 0;
			System.out.println(0);
		}
		
		if (s.size() == 1)
		{
			sum = s.get(0);
			
			if (sum == d)
			{
				segmentValid++;
				
			}
		}
		
		
		for (int i= 0; i < hold; i++)
		{
			
			sum += s.get(i);
			j = i + 1;
			//System.out.println(hold);
			
			while(save > 0)
			{
				sum += s.get(j++);
				save--;
				//System.out.println(sum);
			}
			
			//System.out.println(sum);
			
			if (sum == d)
			{
				segmentValid++;
				
			}
			
			
			save = m - 1;
			sum = 0;
		}
		
		System.out.println(segmentValid);
		//return segmentValid;
	}

}
