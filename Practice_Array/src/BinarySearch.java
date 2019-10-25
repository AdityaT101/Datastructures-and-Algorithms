
public class BinarySearch {

	public static void BinarySearch(int[] arr, int key,  int low, int high) {
		
		if (key >= arr[high]) 
	        System.out.println(arr[high]);  
		
		else if(low<=high)
		{
			
			
			int mid = (low+high)/2;
			
			if(arr[mid]==key) System.out.println(arr[mid]);
			
			
			else if(mid > 0 && arr[mid-1]<key && key < arr[mid]) System.out.println(arr[mid-1]);
			 
			
			else if( key < arr[mid])
				BinarySearch( arr,  key, low, mid );
			
			else if( key > arr[mid])
				BinarySearch( arr,  key, mid+1, high );
			
			
		}
		
		else
			System.out.println("Not present");
	}

	public static void main(String[] args) {
		
		int[] arr = {10,22,35,42,61,77,181,271};
		
		for(int i = 0 ; i< 8; i++)
		    BinarySearch(arr, (arr[i]+1) , 0 , 7);
	}

}
