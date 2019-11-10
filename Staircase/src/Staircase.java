
public class Staircase 
{
	
	public static void main(String[] args) 
	{
		int size = 3;
		char [][] arr = new char[size][size];
		
		int spaces = size;
		
		
		int save = 0;
		
		for (int i = 0; i < size; i++)
		{
			
			save = spaces;
			
			for (int j = 0; j < size; j++)
			{
				
				
				if(save > 0)
				{
					
					arr[i][j] = ' ';
					save--;
					
				}
				
				
				
				if (save == 0)
				{
					arr[i][j] = '*';
					
				}
				
				System.out.print(arr[i][j]);
			}
			
			
			spaces--;
			System.out.println();
			
		}
		
		/*for (int i = 0; i < size; i++)
		{
			for (int j = 0; j < size; j++)
			{
				
				System.out.print(arr[i][j]);
				System.out.println();
			}
			
			
		}*/
		
		
	}

}
