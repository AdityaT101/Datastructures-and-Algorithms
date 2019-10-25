
public class Greater_Array {

	public Greater_Array() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		 int[] arr = {1,2,7,11,15,29,35,40};
		 
		 for(int i=0; i<arr.length-1;i++)
		 {
			 int sum=0;
			 for(int j=i+1; j<arr.length;j++)
			 {
				 sum = sum + arr[j];
			 }
			 arr[i] = sum;
		 }
		 
		 arr[arr.length-1] = 0;
		 
		 for(int i=0; i<arr.length;i++)
		 {
			 System.out.println( arr[i] );
		 }

	}

}
