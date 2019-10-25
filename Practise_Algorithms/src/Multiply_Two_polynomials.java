
public class Multiply_Two_polynomials {

	public Multiply_Two_polynomials(int[] A, int[] B) {
		
		int[] prod = {0,0,0,0,0,0};
		
		int i =0; int j =0;
		 
		
		while( i <= 3 )
		{
			while( j <= 2 )
			{
				prod[i+j] = prod[i+j] + A[i]*B[j]; 
				
				j++; if(j==2) j=0;
			}
			i++; if(i==3) break;
		}
		
		
		for( int b : prod)
		{
			System.out.println(b);
		}
		
	}

	public static void main(String[] args) {
		
		
	    int[] A = {5,0,10,6};  int[] B = {1,2,4};
		
	    Multiply_Two_polynomials a = new Multiply_Two_polynomials( A, B );
		
	}

}
