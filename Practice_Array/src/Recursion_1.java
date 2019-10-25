
public class Recursion_1 {

	static int count=0;
	
	public static int Recursion_1(int num) {
		 
		 
		int a = num+1;
		
		if  (a < 10)
		{
			count++;
			return Recursion_1(a);
			
		}
		else   
		{
			count++;
	        return count;
		}
	}

	
	
	public static void main(String[] args) {
		 
		System.out.println( Recursion_1(1)  );
		
	}

}
