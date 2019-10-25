
public class SLL {

	static class Node{ // creates a node and assigns values to parameters
		
		public int data;
		public Node next;
		
		public Node( int data )
		{
		   this.data = data;
		   this.next = null;
		}
	}
	
	
	
	static class SinglyLinkedList
	{
		public Node head;
		public Node tail;
		
		
		
		public SinglyLinkedList() //initialize head and tail for the "SinglyLinkedList". 
		{
			this.head = null;
			this.tail = null;
		}
		
		//Insert the element in the linked List one after the other
		public void Insert(int data)
		{
			Node node = new Node(data);
			
			if(this.head == null)
			{
				this.head = this.tail = node;
			}
			else
			{
				this.tail.next = node;
				this.tail = node;
			}
			
		}
		
		
		//Search for an element in the linkedlist
		public void Search( Node head , int data)
		{
			if(head == null)
				System.out.println("null");
			
			else
			{
				while( head != null)
				{
					if( head.data == data )
					{
						System.out.println("element present");break;
					}
					else head = head.next;
				}
				 if(head == null)
					System.out.println("element not present");
			}
			
		}
		
		
		//function to insert at a given position
		public void Insert(Node head, int data , int position)
		{
			Node node = new Node(data);
			
			if(position == 0)
			{
				if( head == null)
				{
					head = node ;
			
			    }
				else
				{
					node.next = this.head;
					this.head = node ;
					
				}
			}
			else
			{
				int i = 0;
				
				while( head != null)
				{
					
				  if( position-1 == i )
				  { 
					node.next = head.next; 
					head.next = node;
				  }
				  
				    head = head.next; 
				    i++;
				}
				 
			}
			Print(this.head);
			
		}
		
		
		//function to delete the node at given position
		public void delete( Node head, int data )
		{
			if( head == null ) System.out.println("null"); // if the head is null.
			
			else if( head.data == data ) {  this.head = head.next ;} // if we are to remove the head.
			
			else if(  head == this.tail &&  head.data == data ) {  this.head = this.tail = null;} // if only head is present.
			 
			else
			{
				
				while( head.next != null && head.next.data != data)
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
			
			
			
			 Print(this.head);
		}
		
		
		// function used to print the SinglyLinkedList
		public void Print( Node head)
		{
		    while(head != null)
			{
				System.out.println(head.data);
				head = head.next;
			}
		}
		
		
		public void Inverse()
		{
			
			Node prev;
			Node next;
			Node current;
			
			
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) 
	{
		int[] arr = {10,20,30,40,50,60,70,80,90};
		
		SinglyLinkedList list = new SinglyLinkedList();
		
		for( int i = 0 ; i < arr.length ; i++ ) { list.Insert(arr[i]); } 
	 
		Node abc = list.head;
		
        //list.Insert(abc, 198, 0);
        
        list.Search(abc, 900);
		
		//list.delete(abc, 10);
		
		//list.Print(abc);
		
	}
	
	
}
