import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
public class EqualStacks 
{
	
	
	static int equalStacks(int[] h1, int[] h2, int[] h3) 
	{
		
		int [] copy1 = new int[h1.length];
		int [] copy2 = new int[h2.length];
		int [] copy3 = new int[h3.length];
		
		int [] copyA = new int[h1.length];
		int [] copyB = new int[h2.length];
		int [] copyC = new int[h3.length];
		
		/*copy1[0] = h1[h1.length-1];
		copy2[0] = h2[h2.length-1];
		copy3[0] = h3[h3.length-1];
		

		copyA[0] = h1[h1.length-1];
		copyB[0] = h2[h2.length-1];
		copyC[0] = h3[h3.length-1];*/
		
		int index1 = 0;
		int index2 = 0;
		int index3 = 0;
		
		int indexA = 0;
		int indexB = 0;
		int indexC = 0;
		
		int hold1 = 0;
		int hold2 = 0;
		int hold3 = 0;
		
		
		for(int i = h1.length-1; i >= 0; i--)
		{
			
			copy1[index1] = h1[i] + hold1;
			hold1 += h1[i];
			
			index1++;
		}
		
		for(int i = h1.length-1; i >= 0; i--)
		{
			
			copyA[indexA] = copy1[i];
			indexA++;
		}
		
		for(int i = h2.length-1; i >= 0; i--)
		{
			copy2[index2] = h2[i] + hold2;
			hold2 += h2[i];
			
			index2++;
		}
		
		for(int i = h2.length-1; i >= 0; i--)
		{
			
			copyB[indexB] = copy2[i];
			indexB++;
		}
		
		for(int i = h3.length-1; i >= 0; i--)
		{
			copy3[index3] = h3[i] + hold3;
			hold3 += h3[i];
			
			index3++;
		}
		
		for(int i = h3.length-1; i >= 0; i--)
		{
			
			copyC[indexC] = copy3[i];
			indexC++;
		}
		
		if(h1.length < h2.length && h1.length < h3.length)
		{
			for(int i = 0; i < h1.length; i++)
			{
				
			}
		}
		
		if(h2.length < h1.length && h2.length < h3.length)
		{
			for(int i = 0; i < h2.length; i++)
			{
				
			}
		}
		
		if(h3.length < h1.length && h3.length < h2.length)
		{
			for(int i = 0; i < h3.length; i++)
			{
				
			}
		}
		return 1;
	}
	
	
	
	/*static int equalStacks(int[] h1, int[] h2, int[] h3) 
	{
		Stack<Integer> stack_h1 = new Stack<Integer>();
		Stack<Integer> stack_h2 = new Stack<Integer>();
		Stack<Integer> stack_h3 = new Stack<Integer>();
		
		int total_h1 = 0;
		int total_h2 = 0;
		int total_h3 = 0;
		
		int h1_index = 0;
		int h2_index = 0;
		int h3_index = 0;
		
		
		for(int i = h1.length-1; i >= 0; i--)
		{
			//stack_h1.add(h1[i]);
			total_h1 += h1[i];
		}
		
		for(int i = h2.length-1; i >= 0; i--)
		{
			//stack_h2.add(h2[i]);
			total_h2 += h2[i];
		}
		
		for(int i = h3.length-1; i >= 0; i--)
		{
			//stack_h3.add(h3[i]);
			total_h3 += h3[i];
		}
		
		if(total_h1 == total_h2 && total_h2 == total_h3 )
		{
			return total_h1;
		}
		
		
		
		while(total_h1 != total_h2 || total_h2 != total_h3)
		{
			if(total_h1 > total_h2 && total_h1 > total_h3 )
			{
				total_h1 -= h1[h1_index++];
				//System.out.println(1);
			}
			
			if(total_h2 > total_h1 && total_h2 > total_h3 )
			{
				//System.out.println(h2[h2_index]);
				total_h2 -= h2[h2_index++];
				//System.out.println(2);
			}
			
			if(total_h3 > total_h1 && total_h3 > total_h2 )
			{
				total_h3 -=  h3[h3_index++];
				//System.out.println(3);
			}
			//System.out.println(total_h1 + " " + total_h2 + " " + total_h3);
		}
		
		return total_h1;
	}*/
	
	

	public static void main(String[] args) 
	{
		int [] h1 = {3, 2, 1, 1, 1};
		int [] h2 = {4, 3, 2};
		int [] h3 = {1, 1, 4, 1,};
		
		int check = 0;
		
		check = equalStacks(h1, h2, h3);
		
		//System.out.println(check);
		

	}

}
