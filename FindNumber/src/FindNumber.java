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

public class FindNumber 
{

	public static void main(String[] args) 
	{
		List<Integer> arr = new ArrayList<Integer>();
		
		arr.add(0);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		
		
		int k = 1;
		
		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i) == k)
			{
				//System.out.println("YES");
				return "YES";
			}
		}
		
		return "NO";
	}

}
