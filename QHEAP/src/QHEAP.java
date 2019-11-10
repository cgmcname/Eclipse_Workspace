import java.io.*;
import java.util.*;
public class QHEAP {

	public static void main(String[] args) 
	{
		  PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
		  int value = 0;
		  
		  Scanner in = new Scanner(System.in);
		  
		  int queries = in.nextInt();
		  for (int q=0; q<queries; q++) 
		  {
		      int op = in.nextInt();
		      
		      if(op == 1)
		      {
		    	  value = in.nextInt();
		    	  pQueue.add(value);
		      }
		      else if(op == 2)
		      {
		    	  value = in.nextInt(); 
		    	  pQueue.remove(value);
		      }
		      else if(op == 3)
		      {
		    	  System.out.println(pQueue.peek());
		      }
		  }

	}

}
