import java.util.*;


public class DLL_Insert_Delete {
static int number = -1;

	static class Node
	 {
		 public int data;
		 public Node prev;
		 public Node next;
		 
		public Node(int data)
		{
			this.data = data;
			this.prev =null;
			this.next = null;
			number++;
			 
		}
	 }

	
	
	static class DoublyLinkedList
	 {
		 public Node head;
		 public Node tail;

		 public DoublyLinkedList()
		 {
			 this.head = null;
			 this.tail = null;
		 }
		 
		 public void Insert(Node head , int data, int position)
		 {
			 Node node = new Node(data);
			 
			 
			 if(position == 0)
			 {
				 if( head == null)
				 {
					 this.head = node;
					 this.tail = node;
				 }
				 else
				 {
					 node.next = this.head;
					 this.head.prev = node;
					 this.head = node;
				 }
				 
			 }
			 
			 else
			 {
				 this.tail.next = node;
				 node.prev = tail;
				 tail=node;
			 }
			 
		 }
		 
		 
		 
		 public void InsertAtPosition(Node head, int data, int position)
		 {  
			 Node node = new Node(data);
			 
			 if(position == 0)
			 {
				  
					 node.next = this.head;
					 this.head.prev = node;
					 this.head = node;
				 
				 
			 }
			 else
			 {
				 if(position ==  Length(head)-1 )
				 {
					 this.tail.next = node;
					 node.prev = tail;
					 tail=node;
				 }
				 
				 else
				 {   
					 int i=0;
					 
					 while(head != null) 
					 {
						 if(position == i)
						 {
						   node.next = head.next ;
						   head.next.prev = node;
						   head.next = node; 
						   node.prev = head; 
						   break;
						 }
						 head = head.next;
						 i++;
					 }
				 }
			 }
			 
		 }
		 
		 
		 
		 public int Length(Node head)
		 {   int count=0;
			 while(head != null)
			 {
				 count++;
				 head =head.next;
				 
			 }
			 return count;
		 }
		 
		 
		 public void Print(Node head)
		 {
			 while( head != null)
			 {
				 System.out.println(head.data);
				 head = head.next;
			 }
			 
		 }
		 
		 
		 public void PrintAtPosition(Node head , int PositionFromTail)
		 {
			  int a = Length(head);
			  
			  int position = a-1-PositionFromTail;// most imp line;
			  
			  int j=0;
			  
			  while(j != position)
				 {
					 head = head.next;
					 j++;
				 }
			  
			  System.out.println(head.data);
			  
			 
		 }
		 
		 
		 public Node GetMid(Node list)
	     {
	    	 if(list == null) return list;
	    	 
	    	 else
	    	 {
	    		 Node a = list;
	    		 Node b = list.next;
	    		 
	    		 while( b!= null)
	    		 {
	    			 b = b.next;
	    			 
	    			 if(b != null)
	    			 {
	    				 a=a.next;
	    				 b=b.next;
	    			 }
	    		 }
	    		 return a;
	    	 }
	     } 
		 
		 //to find the mid point based on 
		 public void GetMid_1(Node head)
	     {
	    	 int k=0;
	    	  
	    	 while(k != number/2)
	    	 {
	    		 k++;
	    		 head= head.next;
	    	 }
	    	 
	    	 System.out.println(k);
	     }
		 
		 
		 //Remove duplicates in an unsorted array.
		 public void RemoveDuplicates(Node head)
		 {
			 HashSet<Integer>  h = new HashSet<Integer>();
			
			 while(head!=null)
			  {
				  if(h.contains(head.data) && head.data == this.tail.data)
				  {
					  
					 Node a = head.prev;
					 a.next = null;
					  
				  }
				  
				  else if(h.contains(head.data))
				  {
					  
					 Node a = head.prev;
					 Node b = head.next;
					 
					 a.next = b;
					 b.prev = a;
					 
				  }
				 else
				 {
					 h.add(head.data);
				 }
				  
				  head = head.next;
			  }
			  
			  Print(this.head);
		 }
		 
		 static boolean loop = false;
		 
		 
		 //detect a loop
		 public boolean ContainsLoop( Node head)
		 {
			 Node a = head;
			 Node b = head.next;
			 
			 while( a!=null && b != null && b.next != null)
			 {
				 a = a.next;
				 b = b.next.next;
				 
				 if(a == b)
				 {
					 loop = true;  
				 }
			 }
			 
			 
			 return loop;
			
		 }
		 
	 }
	
	
	

	public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90};
		
		DoublyLinkedList list = new DoublyLinkedList();
		
		list.Insert( null, arr[0], 0);
		
		Node abc = list.head;
		
		
		  for( int i = 1; i < arr.length ; i++ ) { list.Insert( abc, arr[i], i); }
		 
		
		
		/*
		 * while( list.head.data != 50) { list.head = list.head.next; }
		 * 
		 * Node a= list.head; list.tail.next = a;
		 */
		//System.out.println(abc.data);
		
		 //list.InsertAtPosition( abc, 5, 4);
	    // list.Print(abc);
	     
		//list.PrintAtPosition(abc, 3);
		//list.GetMid_1(abc);
		
		//list.RemoveDuplicates(abc);
		
		//System.out.println(  list.ContainsLoop(abc) );
		
		
		//System.out.println(  Math.min(0, 9)  );
		  
		  
		  int x = 8 ;
				  
				  if(x%2==1)System.out.println("odd");
		          if(x%2==0)System.out.println("even");
		          
		          
		 
		
	}

}
