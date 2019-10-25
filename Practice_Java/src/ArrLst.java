import java.util.*;


public class ArrLst {

	
	public static void operations()
	{
		 ArrayList<Integer> list = new ArrayList<Integer>();
					        list.add(10);
					        list.add(20);
					        list.add(30);
					        list.add(40);
					        list.add(50);
					        list.add(60);
		
					        
		
		if(list.contains(10))
			System.out.println( list.indexOf(10) );
		
		
		/*
		 * for( int i : list ) System.out.println( i );
		 */
		
	}

	public static void main(String[] args) {
		 
		operations();
	}

}
