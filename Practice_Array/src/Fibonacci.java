import java.util.*;

public class Fibonacci {

	static Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	
	static int f ;
	
	public static int fib(int n)
	{
		if(n == 1)
		    return 1;
		
		if(n == 2)
			return 1;
		
		else
			return ( fib(n-1) + fib(n-2) );
		
		 
	}
	
	
	
	public static int fibo(int n)
	{
		if( map.containsKey(n)) 
		  return map.get(n);
		
		if(n <= 2) 
		  f=1;
		else 
		  f = fibo(n-1) + fibo(n-2);
		
		map.put( n , f );
		  return f;
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println( fib(5) );

	}

}
