
public class Practice_Traversal {

	Practice_Traversal(int[] arr, int low, int high) {
		quickSort(  arr, low, high  );
	}



	public void quickSort( int[] arr, int low, int high ) 
	{
		if (low < high)
	    {
	        /* pi is partitioning index, arr[pi] is now
	           at right place */
			
	       int  pi = partition(arr, low, high);

	        quickSort(arr, low, pi - 1);  // Before pi
	        quickSort(arr, pi + 1, high); // After pi
	    }
		
		
		
		
     }

	
	
	
	public int partition( int[] arr, int low, int high ) 
	{
		int temp = 0; int temp1 = 0;
		
		int pivot =  arr[high]; 
		
		
		int i = low -1 ;
		
		for( int j = low ; j < high ; j++)
		{
			if( arr[j] <= pivot)
			{
				++i;
				
				temp= arr[i] ;
				arr[i] = arr[j];
				arr[j]= temp ;
			}
		}
		
		
		temp1 = arr[i+1] ;
		arr[i+1] = arr[high];
		arr[high] = temp1 ;
		
		return i+1;
		
		
	}
	 

	public static void main(String[] args) {
		
		int[] abc = {11,2,33,445,5,6,17,89,900};
		
		Practice_Traversal a = new Practice_Traversal( abc ,0 , 8  );
		
		 
		for( int b : abc)
		{
			System.out.println(b);
		}
		 
	}

}
