import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BalancedBrackets 
{
	static boolean compare(char one, char two)
	{
		if (one == '}')
		{
			if (two == '{')
			{
				return true;
			}
		}
		
		if (one == ']')
		{
			if (two == '[')
			{
				return true;
			}
		}
		
		if (one == ')')
		{
			if (two == '(')
			{
				return true;
			}
		}
		
		return false;
	}
	
	

	public static void main(String[] args) 
	{
		String s = "{[(])}";
		
		Stack<Character> stack = new Stack<Character>();
		
		List<String> arr = new ArrayList<String>();
		
		char[] parse = s.toCharArray();
		
		boolean isRight = true;
		
		for (int i = 0; i < s.length(); i++)
		{
			
			
			isRight = false;	
				
				
				if( parse[i]== '{' ||  parse[i]== '[' ||  parse[i]== '(' )
				{
					stack.push(parse[i]);
				}
				
				if( parse[i]== '}' ||  parse[i]== ']' ||  parse[i]== ')' )
				{
					if(stack.isEmpty())
					{
						
						return "NO";
					}
					
					if(!(stack.isEmpty()))
					{
						isRight = compare(parse[i], stack.pop());
						if (isRight == false)
						{
							
							return "NO";
						}
					}
				}
				
				
			
			
			
			
		}
		
		if(stack.isEmpty() && isRight == true)
		{
			
			
			return "YES";
		}
		
		if((!(stack.isEmpty())))
		{
			
			
			return "NO";
		}
		
		return "NO";
		
	}
	
	

}
