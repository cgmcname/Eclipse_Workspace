
public class Arrays 
{

	public static void main(String[] args) 
	{
		int[] a = {9,4,8,3,7,1,200};
		
		int n = a.length;
		
		int temp;
		
		  for (int i = 0; i < n / 2; i++) 
		  { 
	            temp = a[i]; 
	            a[i] = a[n - i - 1]; 
	            a[n - i - 1] = temp; 
	      } 
		  
		    System.out.println("Reversed array is: \n"); 
	        for (int k = 0; k < n; k++) 
	        { 
	            System.out.println(a[k]); 
	        } 
	     
	        System.out.println(9/2); 

	}

}
