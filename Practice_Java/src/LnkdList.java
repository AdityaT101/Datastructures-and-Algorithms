

import java.util.*;

public class LnkdList {
	static Deque<Integer> dq = new LinkedList<Integer>(); 
	static HashSet<Integer> hshmap = new HashSet<Integer>();
	static int Max_Size = 3;
	
	    public static void LRU(  int a)
	    {
	    	
	    	if(dq.size() == Max_Size)
    		{
    			int last =  dq.removeLast();
    			hshmap.remove(last);
    			
    		}
	    	 
	    	else
	    	{
	        	dq.push(a);
	    	    hshmap.add(a);
	    	}
	    	
		}
	

	public static void main(String[] args) {
	   
	   
	    
		   LRU(4);
		   LRU(3);
		   LRU(2);
		   LRU(1);
		   LRU(0);
		   
		   Iterator<Integer> itr = dq.iterator();  
           while(itr.hasNext())  
           {  
                System.out.println(itr);
           }  
	}

}
