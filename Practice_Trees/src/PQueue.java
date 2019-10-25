import java.util.*;

public class PQueue {

	public static void main(String[] args) {
		 
		// Creating empty priority queue 
		PriorityQueue<Integer> PQ = new PriorityQueue<Integer>( );
		  
		 
        LinkedList<Integer> list = new LinkedList<Integer>();
		  
		list.add(121); list.add(4561); list.add(61); list.add(1); list.add(18); list.add(91);
		 
		  
		
		 LinkedList<Integer> list1 = new LinkedList<Integer>();
		  
		 list1.add(8); list1.add(45); list1.add(6); list1.add(17); list1.add(93); list1.add(671);
			
			
		Iterator itr = list.iterator();
		
		while( itr.hasNext( ))
		{
			PQ.add( (Integer) itr.next() );
		}
		
		
        Iterator itr1 = list1.iterator();
		
		while( itr1.hasNext( ))
		{
			PQ.add( (Integer)itr1.next() );
		}
		
		

        Iterator itr2 = PQ.iterator();
		
		while( itr2.hasNext( ))
		{
			System.out.println( PQ.poll() );
		}
		
	}

}
