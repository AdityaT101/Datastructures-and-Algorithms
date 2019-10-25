
import java.util.*;

public class Parenthesis {

	public Parenthesis() {
		 
	}

	public static void main(String[] args) {
		 
		Stack<Character> st = new Stack<>();
		
		char[] arr = { '{','(',')','}','{','{','}','}' };
		
		int count=0;
		
		for(int i =0; i< arr.length;i++)
		{
			
			if (arr[i] == '{' || arr[i] == '('  ) 
	            st.push(arr[i]); 
			
			
			else if (arr[i] == '}' || arr[i] == ')' ) 
	          { 

				char temp = st.pop();
				
				if( temp == '{' && arr[i] == '}'  )
				 {
					 count++;
				 }
				   
	             
				  if( temp == '(' && arr[i] == ')'  )
				 {
					 count++;
				 }
				 
				 
				  
				 
	          } 
			
		}
		
		
		if(count==arr.length/2)
			System.out.println("Yes");
		else
			System.out.println("No");
		

	}

}
