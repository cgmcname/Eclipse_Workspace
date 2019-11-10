
public class BirthdayCakeCandles 
{

	public static void main(String[] args) 
	{
		int [] ar = {7,1,1,4,2,6,7,7,7,7};
		
		int putOut = 0;
		
		int save = ar[0];
		
		for(int i = 0; i < ar.length; i++)
		{
			if(ar[i] > save)
			{
				save = ar[i];
			}
		}
		
		for(int i = 0; i < ar.length; i++)
		{
			if(ar[i] == save)
			{
				putOut++;
			}
		}
		
		System.out.println(putOut);

	}

}
