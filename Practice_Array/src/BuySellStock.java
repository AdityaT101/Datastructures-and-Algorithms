
public class BuySellStock {

	public static int BuySellStock() {
		
		int[] arr = {7,1,5,3,6,4};
		
		int Max = Integer.MIN_VALUE;
		
		for( int i = 0; i< arr.length-1; i++)
		{
			for(int j= i+1; j< arr.length; j++)
			{
				if(arr[j] - arr[i] > Max)
				{
					 Max = arr[j] - arr[i];
				}
			}
		}
		
		return Max;
    }
	
	
	
	public static int BuySellStock_DP() {
	
		int[] arr = {7,6,5,4,3,2,1};
		
		int Min = arr[0];
		int Max_Profit = 0;
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i] < Min)
				Min = arr[i];
			
			if( (arr[i]-Min) > Max_Profit )
			{
				Max_Profit = arr[i]-Min;
			}
		}
		
		
		if( Max_Profit < 0) 
			return 0;
		else
			return Max_Profit;
		
		
	}

	
	
	public static void main(String[] args) {
		 
		System.out.println( BuySellStock_DP() );
		
	}

}
