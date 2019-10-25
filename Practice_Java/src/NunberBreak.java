
public class NunberBreak {

	
	
	public static void main(String[] args) {
		
		int number = 1096;
		
		while(number > 0)
		{
			System.out.println( number%10 + "," );
			
			number = number/10;
			
		}
		

	}

}
