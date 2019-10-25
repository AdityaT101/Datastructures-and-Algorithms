 
public class DLL_Palindrome {

	static class Node
	 {
		 public int data;
		 public int index;
		 public Node prev;
		 public Node next;
		 
		public Node(int data, int index)
		{
			this.data = data;
			this.prev =null;
			this.next = null;
			this.index = index;
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
	     
	     
	     public void InsertNode(Node head, int data, int index)
	     {
	    	 Node node = new Node(data,index);
	    	 
	    	 if( head == null)
	    	 {
	    		 this.head = node;
	    		 this.tail = node;
	    	 }
	    	 else
	    	 {
	    		 this.tail.next = node;
	    		 node.prev = this.tail;
	    		 tail = node;
	    	 }
	     }
	     
	     public void Print(Node head) 
	     {
	    	 if ( head == null)
	    	 {
	    		 System.out.println("null");
	    	 }
	    	 else
	    	 {
	    		 while(head != null)
	    		 {
	    			 System.out.print(head.data+",");
	    			 
	    			 head = head.next;
	    		 }
	    		 System.out.println();
	    	 }
	     }
	     
	     
	    
	     static boolean flag = true;
	     
	     public boolean IsPalindrome( Node head, Node tail)
	     {
	    	  while( head.index < tail.index)
	    		 {
	    			 if(head.data == tail.data)
	    			 {
	    				 head = head.next;
	    				 tail = tail.prev;
	    				 IsPalindrome( head,tail);
	    			 }
	    			 else 
	    			 {
	    				 flag = false; 
	    				 break;
	    			 }
	    		 }
	    	  return flag;
	    	 
	      }
	     
	     
	 }
	     
	     

	public static void main(String[] args) {
		
int[] arr = {10,20,30,40,50,60,70,80};
		
		DoublyLinkedList list = new DoublyLinkedList();
		
		list.InsertNode( null, arr[0],0);
		
		Node abc = list.head;
		
		for( int i =1; i < arr.length ; i++ )
		{
			list.InsertNode( abc, arr[i],i);
		}
		
		Node xyz = list.tail;
	    list.Print(abc);
		
	    
		//System.out.println( list.IsPalindrome(abc, xyz ) );

	}

}
