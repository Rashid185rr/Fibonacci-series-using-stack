import java.util.Stack;
/*
 * @Author : Rashid
 * @Description : Implement Fibonacci series using STACK - no recursive function.
 * 
*/

public class FibonacciStack {
	
		// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 
		public static void fibonacciCreating(int size)
		{
			//creating stack
			
			Stack<Integer> stack=new Stack<>();
			
			//entering two elements
			
			stack.push(0);
			stack.push(1);
			
			
			for(int i=0; i<size; i++)
			{
				//using first and second element, for applying operation
				
				int first=stack.pop();
				int second=stack.pop();
				
				System.out.print(second+"   ");
				
				//swaping
				
				int nextTerm=first+second;
				stack.push(first);
				stack.push(nextTerm);
			}
		}
		public static void main(String [] args)
		{
			
			//size of loop, elements size defined (5)
			
			FibonacciStack.fibonacciCreating(5);
			
			
		}
	}


