
public class Merge_Sort {
	
	
	public void Merge( int[] arr , int low, int middle, int high ) 
	{
	 
	   int arr_length_left = middle-low +1;
	   int arr_length_right = high - middle;
	   
	   int[] left = new int[arr_length_left];
	   int[] right = new int[arr_length_right];
	   
	   for(int i = 0 ; i < arr_length_left; i++)
	   {
		   left[i] = arr[ low+i ];
	   }
	   
	   for(int j = 0 ; j < arr_length_right; j++)
	   {
		   right[j] = arr[ middle+1+j ];
	   }
	   
	   int i=0; int j=0; int k=low;
	   
	
	   while( i< arr_length_left && j < arr_length_right)
	   {
		   if( left[i] <  right[j] )
		   {
			   arr[k] = left[i] ;
			   i++;
			   k++;
		   }
		   else
		   {
			   arr[k] = right[j] ;
			   j++;
			   k++;
		   }
	    }
	   
	   
	    while( i < arr_length_left )
	    {
	        arr[k] = left[i] ;
			   i++;
			   k++;
	    }
	   
	    
	    while( j < arr_length_right )
	    {
	    	arr[k] = right[j] ;
			   j++;
			   k++;
	    }
	    
	}

	
	
	
	public void Sort(int[] arr, int low, int high)
	{
		
		if( low < high)
		{
			int middle = (low+high)/ 2;
			
			Sort( arr , low, middle);
			
			Sort( arr , middle+1 , high);
			
			Merge( arr, low, middle, high );
			
		}
	}

	
	
	
	public static void main(String[] args) 
	{
		
        int[] abc = {11,2,33,445,5,6,17,89,900};
		
        Merge_Sort a = new Merge_Sort();
		
		a.Sort( abc, 0, 8 );
		
		
		for( int b : abc)
		{
			System.out.println(b);
		}
	}
	
	
	

}
