import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class OddNumbers 
{

	public static void main(String[] args) 
	{
		int l= 2;
		int r = 5;
		
		List<Integer> arr = new ArrayList<Integer>();
		
		while (l <= r)
		{
			if (l % 2 != 0)
			{
				arr.add(l);
			}
			
			l++;
		}
		
		//System.out.println(arr);
		return arr;

	}

}
