import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class JesseandCookies 
{

	
	
	  static int cookies(int k, int[] A) 
	  {
		  
		  PriorityQueue<Integer> pQueue = 
                  new PriorityQueue<Integer>(); 
		  
		 
		  
		  	
		  for (int i = 0; i < A.length; i++)
		  {
			  pQueue.add(A[i]); 
		  }
		  
		  	
		  	int operations = 0;
		  	
		  	int cookie1 = 0;
		  	int cookie2 = 0;
		  	
		 
		  	
		  	while (pQueue.size() > 1 && pQueue.peek() < k)
		  	{
		  		
		  		
		  		cookie1 = pQueue.poll();
		  		
		  	

		  		cookie2 =  pQueue.poll();
		  		
		  		
		  		pQueue.add(cookie1 + (2 * cookie2));
		  		operations++;
		  		
		  		
		  	}
		  	
		  	if(pQueue.peek() < k) {
	            return -1;
	        } else {
	        	return operations;
	        }
			
			
			
	      
	  }
	
	
	public static void main(String[] args) 
	{
		
		int sweet = 3581;
		
		int report = 0;
		
		int [] arr ={6214, 8543, 9266, 1150, 7498, 7209, 9398, 1529, 1032, 7384, 6784, 34, 1449, 7598, 8795, 756, 7803, 4112, 298, 4967, 1261, 1724, 4272, 1100, 9373};
		
		report = cookies(sweet, arr);
		
		System.out.println(report);
	}
}
