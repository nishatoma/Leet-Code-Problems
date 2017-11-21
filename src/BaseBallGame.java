import java.util.Stack;

public class BaseBallGame
{
	
	public static void main(String[] args)
	{
		String[] in = {"5","-2","4","C","D","9","+","+"};
		int result = calPoints(in);
		System.out.println(result);
		
	}
	
	
	
	public static int calPoints(String[] ops)
	{
		
		String p = "+";
		String d = "D";
		String c = "C";
		int result = 0;
		// We make a stack to keep trace
		// of the last and second last round
		Stack<Integer> round = new Stack<>();
		
		for (String str: ops)
		{
			if (str.equals(p))
			{
				int top = round.pop();
				int newTop = round.peek() + top;
				round.push(top);
				round.push(newTop);
				result += newTop;
			} else if (str.equals(c))
			{
				result -= round.pop();
			} else if (str.equals(d))
			{
				round.push(2*round.peek());
				result += round.peek();
			} else 
			{
				round.push(Integer.valueOf(str));
				result += round.peek();
			}
		}
		
		return result;
	}
}
