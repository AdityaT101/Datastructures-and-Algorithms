import java.util.*;


public class LRU_Cache {

	static Deque<Integer> dq =  new LinkedList<>(); 
	static HashSet<Integer> map = new HashSet<>(); 
	 
	 
	 
	public static void LRU_Cache(int a) {
		 
		if(!map.contains(a)) 
        { 
			if(dq.size() == 3)
        
			{
				int last=dq.removeLast(); 
                map.remove(last); 
				 
			}
	    }
		
		else
		{
			 
            Iterator<Integer> itr = dq.iterator();  
            while(itr.hasNext())  
            {  
                if(itr.next()==a) 
                { 
                    
                    dq.remove(a); 
                    break; 
                } 
                
            }  
        }
		
		dq.push(a);
		map.add(a);
		
		
		
	}

	public static void main(String[] args) {
		 
		int[] arr = {1, 2, 3, 4, 1, 2, 5, 1, 2, 3, 4, 5};
		
		for(int i=0; i< arr.length; i++)
		{
			LRU_Cache( arr[i] ); 	
		}
		
	 
		 
		//System.out.println( dq.getFirst() );
	 
		Iterator<Integer> itr1 = dq.iterator();
		while( itr1.hasNext() ) 
		{ 
			System.out.println( itr1.next() );
		}
		 
		
		
	}

}
