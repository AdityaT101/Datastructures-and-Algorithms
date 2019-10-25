
public class MaxHeap_1 {

	static int[] Heap=new int[5];
	
	// Returns position of parent 
    private static int parent(int pos) 
    { 
        return pos / 2; 
    } 
  
    // Below two functions return left and 
    // right children. 
    private static int leftChild(int pos) 
    { 
        return (2 * pos); 
    } 
    private static int rightChild(int pos) 
    { 
        return (2 * pos) + 1; 
    } 
    
    
 // Returns true of given node is leaf 
     
    
	 public static void Insert(int a, int i)
	 {
		 if(i ==0 )
		 {
			 Heap[0] = a;
			 
		 }
		 
		 else
		 {
              i = parent(i);
              
              int left =  leftChild(i);
              
              if(Heap[left] == 0)
            	  Heap[left] = a;
              
              else
              {
            	  int right = rightChild(i) ;
                 Heap[right] = a;
              }
		 }
	}
	 
	 
	 public static void print() 
	    { 
	        for (int i = 1; i <= 5 / 2; i++) { 
	            System.out.print(" PARENT : " + Heap[i] + " LEFT CHILD : " + 
	                      Heap[2 * i] + " RIGHT CHILD :" + Heap[2 * i + 1]); 
	            System.out.println(); 
	        } 
	    } 
	 
	 
	 private static void swap(int fpos, int spos) 
	    { 
	        int tmp; 
	        tmp = Heap[fpos]; 
	        Heap[fpos] = Heap[spos]; 
	        Heap[spos] = tmp; 
	    } 
 
	 
	public static void main(String[] args) {
		 
		Insert(4,0);
		Insert(10,1);
		Insert(3,2);
		Insert(5,3);
		Insert(1,4);
		
		print();
		
		
		for(int i =0; i<5;i++)
		{
			//System.out.println(Heap[i]);
		}

	}

}
