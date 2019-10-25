
public class Sequential_Search {

	public  Sequential_Search( int abc [] , int a1 ) {
		
		for (int a : abc)
		{
			if (a1 == a)
			System.out.println("yes");
		}
		
	}

	public static void main(String[] args)
	{
		 
		int[] abc = {1,2,3,4,5,6,7,8,9};
		
		Sequential_Search a = new Sequential_Search( abc , 9 );
		
	}

}
