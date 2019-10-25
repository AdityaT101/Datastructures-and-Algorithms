
public class Merge_Sort_Practice {
	
	
	public void Merge(int[] arr, int low, int middle , int high)
	{
		
		int n1 = middle - low +1;//finding the length of left and right arrays;
		int n2 = high - middle;
		
		int[] left = new int[n1];
		int[] right = new int[n2];
		
		
		//inserting elements in the left and right arrays;
		for(int i = 0 ; i<n1 ;i++)
		{
			left[i] = arr[low + i];
		}
		
		for(int i = 0 ; i<n2 ;i++)
		{
			right[i] = arr[ (middle+1) + i];
		}
		
		int i=0; int j=0; int k=low;
		
		
		//find which one is smaller among starting elements of both arrays and add it to the final array - arr
		while( i < n1 && j < n2 )
		{
			if( left[i] < right[j])
			{
				arr[k] = left[i];
				i++;k++;
			}
			else
			{
				arr[k] = right[j];
				j++;k++;
			}
		}
		
		//copy the remaining elements from first(left) array
		while(i < n1)
		{
			arr[k]= left[i];i++;k++;
		}
		
		//copy the remaining elements from second(right) array
		while(j < n2)
		{
			arr[k]= right[j];j++;k++;
		}
		
	}

	
	
	
	public void Sort(int[] arr, int low, int high) 
	{
		
	  if(low<high)
		{
		
		    int middle = (low + high)/2;
	
	        Sort(arr , low , middle);
	
	        Sort(arr , middle+1 , high);
	
	     	Merge(arr, low, middle, high);
		}
	}

	
	
	
	public static void main(String[] args) {
		
		    int[] abc = {11,2,33,445,5,6,17,89,900};
			
	        Merge_Sort_Practice a = new Merge_Sort_Practice();
			
			a.Sort( abc, 0, 8 );
			
			
			for( int b : abc)
			{
				System.out.println(b);
			}
	}

}
