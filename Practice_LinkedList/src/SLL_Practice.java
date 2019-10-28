 
import java.util.*;

public class SLL_Practice {

	static class Node
	{
		public Node next;
		public int data;
		
		public Node(int data)
		{
			this.data = data;
			this.next = null;
		}
		
	}

	
	static class SinglyLinkedList
	{
	    public Node head;
	    public Node tail;
	    
	    public SinglyLinkedList()
	    {
	    	this.head = null;
	    	this.tail = null;
	    }
		
	    
	    public void Insert( Node head , int data, int position)
	    {
	    	Node node = new Node(data);

	    	if( position == 0 )
	    	{
	    		if (head == null)
	    	    {
	    			this.head = this.tail = node; // If no node exists
	    	    }
	    		else
	    		{
	    			node.next = this.head; //Adding the node before the head
	    			this.head = node;
	    		}
	    	}
	    	else
	    	{
	    		int i=0;
	    		
	    		while(head != null)
	    		{
		    		if( position - 1 == i)
		    		{
		    			node.next = head.next;
		    			head.next = node;
		    			break;
		    		}
		    		
		    		head = head.next;
		    		i++;
		    		
	    		}
	    		
	    		if(head == null )
	    		{
	    			this.tail.next = node;
	    			this.tail = node;
	    		}
	    	
	    		
	    	}
	    }
	    
	    
	    public void Delete( Node head , int data )
	    {
	    	if( head == null ) System.out.println("null"); // if head is null
	    	
	    	else if ( head.data == this.tail.data ) { this.head = null ; this.tail = null; } // if only node needs to be deleted
	    	
	    	else if ( head.data == data) { this.head = head.next;} // if head needs to be removed.
	    	
	    	else {
	    		
	    		while( head.next != null && head.next.data !=data)
	    		{
	    			head=head.next;
	    		}
	    		
	    		if(head.next != null)
				{
					if(tail.data ==data) {head.next = null; head =tail;}
					else
						head.next=head.next.next;
				}
				
				else {System.out.println("element not present");}
	    	}
	    	
	    }
	    
	    
	    public void Print(Node head)
	    {
	    	while( head != null)
	    	{
	    		//System.out.println(head.data);
	    		head = head.next;
	    		
	    	}
	    }
		
	    
	    public Node removeNthFromEnd(Node head, int n) 
	    {
	         if(head == null) return null; // if list doesnt contain any value
	         if( n == 0 ) return head;// no element needs to be removed
	        
	         Node a = this.head;
	         Node b = this.head;
	        
	         
	         int counter = 0;
	        
	         while( a != null )
	         {
	             counter++;
	             a= a.next;
	         }
	        
	        int length = counter;
	        
	        if(n==length)
	        {
	             head = head.next;
	             return head; // when n = 1st node from the start
	        }
	        
	        int number = length - n;
	        
	        int i = 0;
	        
	        while( i < number-1)
	        {
	            i++;
	            b = b.next;
	        }
	        
	        
	        if(n == 1) 
	        {
	            b.next = null;
	            return head;//when n is the last element
	        }
	        
	        else
	        {
	            b.next = b.next.next;
	            return head;// in n lies in the middle
	        }
	        
	    }
	    
	    
	    public Node mergeTwoLists(Node l1, Node l2)
	    {
	    	Node abc = new Node(-1);
	    	
	    	Node prev = abc;
	    	
	    	while(( l1 != null) && (l2 != null))
	    	{
	    		if( l1.data <= l2.data)
	    		{
	    			prev.next = l1;
	    			l1=l1.next;
	    			prev=l1;
	    		}
	    		if( l2.data <= l1.data)
	    		{
	    			prev.next = l2;
	    			l2=l2.next;
	    			prev=l2;
	    		}
	    	}
	    	
	    	if( l1 == null)
	    	{
	    		prev.next = l2;
	    	}
	    	
	    	if( l2 == null)
	    	{
	    		prev.next = l1;
	    	}
	    	
	    	return abc.next;
	    	
	    }
	    
	    
	    
	    
	}
	
	
	public static void main(String[] args) {
		
        int[] arr = {10,20,30,40,50,60,70,80,90};
        int[] arr1 = {5,15,25,35,45,55,65,75,85};
		
		SinglyLinkedList list = new SinglyLinkedList();
		list.Insert(null , arr[0], 0);
		Node abc = list.head;
		for( int i = 1 ; i < arr.length ; i++ ) { list.Insert( abc , arr[i], i ); }
		
		
		
        
		
		
		
		//  list.Insert( abc , 111, 6 );
		 
		//System.out.println( list.removeNthFromEnd(abc, 2) );
		
		SinglyLinkedList list3 = new SinglyLinkedList();
		
		LinkedList<Integer> l2 =new LinkedList<Integer>();
		 l2.add(1);
		 l2.add(2);
		 l2.add(3);
		 l2.add(6);
		 l2.add(7);
		 l2.add(8);
		 
		
		//System.out.println(  list3.mergeTwoLists(abc, l2)  );  
		
		
		//list.Print( abc);
	 
	}


	 

}
