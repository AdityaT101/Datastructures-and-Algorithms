
public class Bubble_Sort {

	public Bubble_Sort(int[] arr) {
		 
		
		for( int i = 0 ; i< arr.length-1 ; i++)// outer loop for adjusting the length of inner loop.
		{
			int temp = 0 ;
			
			for( int j = 0 ; j < (arr.length-1) - i ; j++ )// Inner loop for always starting from 0th element.  
			{                                              // Elements are always sorted towards the end 
				 										   // of an array.
				if( arr[j] > arr[j+1] )
				{
					temp= arr[j] ;
					arr[j] = arr[j+1];
					arr[j+1]= temp ;
				}
				
			}
			
		}
		
		
		for( int a : arr)
		{
			System.out.println(a);
		}
		
		
	}

	public static void main(String[] args) 
	{
		int[] abc = {11,2,13,40,25,6,17,8121,9};
			
		Bubble_Sort a = new Bubble_Sort( abc);
    
	}

}
