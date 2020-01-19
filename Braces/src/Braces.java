import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Braces {

	static boolean compare(char one, char two) {
		if (one == '}') {
			if (two == '{') {
				return true;
			}
		}

		if (one == ']') {
			if (two == '[') {
				return true;
			}
		}

		if (one == ')') {
			if (two == '(') {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		String[] values = { "{[(])}", "{{}[](){[()]}", "{[()]}" };

		// "{}[]()", "{[()]}"
		// String[] list = new String [values.length];

		List<String> arr = new ArrayList<String>();

		Stack<Character> stack = new Stack<Character>();

		boolean isRight = true;
		
		
		
				
		
		for (int i = 0; i < values.length; i++)
		{
			char[] parse = values[i].toCharArray();
			isRight = false;
			//System.out.println(i);
			for (int j = 0; j < values[i].length(); j++)
			{
				
				
				
				if( parse[j]== '{' ||  parse[j]== '[' ||  parse[j]== '(' )
				{
					stack.push(parse[j]);
				}
				
				if( parse[j]== '}' ||  parse[j]== ']' ||  parse[j]== ')' )
				{
					if(stack.isEmpty())
					{
						arr.add("NO");
						break;
					}
					
					if(!(stack.isEmpty()))
					{
						//System.out.println(parse[j] + " " + stack.peek());
						isRight = compare(parse[j], stack.pop());
						
						if(isRight == false)
						{
							arr.add("NO");
							stack.clear();
							break;
						}
					}
				}
				
				
				
				
			}
			
			if(stack.isEmpty() && isRight == true)
			{
				arr.add("YES");
				
			}
			
			if((!(stack.isEmpty())))
			{
				arr.add("NO");
				stack.clear();
			}
			
			
		}
		
		
		System.out.println(arr);
		
		//arr.toArray(list);
		
		//System.out.println(list);
	}

}
