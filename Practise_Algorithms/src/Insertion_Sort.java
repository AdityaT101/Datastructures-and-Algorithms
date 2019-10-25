
public class Insertion_Sort {

	public Insertion_Sort(int[] arr)
	{
		
		
		for( int i = 0 ; i< arr.length-1 ; i++) //Iterate through each element
		{
			int temp = 0 ;
			
			for( int j = i+1 ; j > 0 ; j-- ) //Compare (i+1)th with the sub array and shift the element to the appropriate position.
			{
				if( arr[j] < arr[j-1])
				{
					temp= arr[j] ;
					arr[j] = arr[j-1];
					arr[j-1]= temp ;
					
				}
				
			}
			
		}
		
		
		for( int a : arr)
		{
			System.out.println(a);
		}
		
		
	}

	public static void main(String[] args) {
		
		int[] abc = {11,2,13,40,25,6,17,8121,9};
		
		Insertion_Sort a = new Insertion_Sort(abc);
    
	}

}
