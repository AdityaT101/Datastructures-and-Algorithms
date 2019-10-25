
public class Quick_Sort {

	public Quick_Sort(int[] arr, int low, int high) {
		
		Quick_Sort_1( arr, low, high);
	}

	
	
    private void Quick_Sort_1(int[] arr, int low, int high)
    {
	
    	if( low <high )
    	{
    		int pi = partition(arr, low, high);
    		
    		Quick_Sort_1(arr , low, pi-1 );
    		
    		Quick_Sort_1(arr , pi+1, high );
    	}
		
	}

	 
    public int partition(int[] arr, int low, int high)
    {
    	int i = low-1;
    	
    	int pivot = arr[high];
    	
    	
    	for(int j = low ; j < high ; j++)
    	{
    		if(arr[j] < pivot)
    		{
    			int temp;
    			i++;
    			
    			temp= arr[i] ;
				arr[i] = arr[j];
				arr[j]= temp ;
    		}
    		
    	}
    	
    	int temp1 = arr[i+1] ;
		arr[i+1] = arr[high];
		arr[high] = temp1 ;
    	
    	return i+1;
    	
    	
    }
    
    
    
	
	public static void main(String[] args) {
	
		int[] abc = {11,2,33,445,5,6,17};
		
		Quick_Sort a = new Quick_Sort( abc , 0 , 6 );
		
		
		for( int b : abc)
		{
			System.out.println(b);
		}
		 
	
	}

}
