
public class Selection_Sort {

	public Selection_Sort(int [] arr) {
		
		for( int i = 0 ; i< arr.length-1 ; i++)
		{
			int temp = 0 ;
			
			int min = 10000; int minIndex = 0;
			
			for( int j = i ; j< arr.length ; j++ )
			{
				if( arr[j] < min )
				{
					min = arr[j] ;
					minIndex = j;
					
				}
				
			}
			
			temp= arr[i] ;
			arr[i] = arr[minIndex];
			arr[minIndex]= temp ;
			
		}
		
		for( int a : arr)
		{
			System.out.println(a);
		}
		
	}

	
	
	public static void main(String[] args) {
		 
         int[] abc = {11,2,13,40,25,6,17,8121,9};
		
		
         Selection_Sort a = new Selection_Sort( abc);

	}

}
