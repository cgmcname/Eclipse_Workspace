import java.util.ArrayList;
import java.util.List;
import java.math.*;

public class Test 
{

	public static void main(String[] args) 
	{
		List<List<Integer>> arr = new ArrayList<>();
		
		List<Integer> row1 = new ArrayList<>();
		List<Integer> row2 = new ArrayList<>();
		List<Integer> row3 = new ArrayList<>();
		List<Integer> row4 = new ArrayList<>();
		
		row1.add(4);
		row1.add(4);
		row1.add(2);
		row1.add(0);
		
		row2.add(4);
		row2.add(6);
		row2.add(4);
		row2.add(5);
		
		row3.add(1);
		row3.add(1);
		row3.add(10);
		row3.add(1);
		
		row4.add(1);
		row4.add(1);
		row4.add(14);
		row4.add(30);
		
		arr.add(row1);
		arr.add(row2);
		arr.add(row3);
		arr.add(row4);
		
		
		
		//System.out.println(arr.get(3).get(2));
		
		int firstSum = 0;
		int secondSum = 0;
		
		
		//First Diagonal
		for (int i = 0; i < arr.size(); i++)
		{
			if ( i == 0)
			{
				firstSum = arr.get(0).get(0);
				i++;
			}
			
			firstSum += arr.get(i).get(i);
		}
		
		//Second Diagonal
		for (int i = 0; i < arr.size(); i++)
		{
			if ( i == 0)
			{
				secondSum = arr.get(0).get(arr.size()-1);
				i++;
			}
			
			
			secondSum += arr.get(i).get(arr.size()-(i+1));
		}
		
		System.out.println(Math.abs(firstSum-secondSum));
		
		//Math.abs(firstSum-secondSum);
	}

}
