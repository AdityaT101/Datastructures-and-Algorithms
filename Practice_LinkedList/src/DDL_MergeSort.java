 

public class DDL_MergeSort {

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
	     
	     
	     public void InsertNode(Node head, int data)
	     {
	    	 Node node = new Node(data);
	    	 
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
	     
	     
	     
	     public Node Sort(Node list)
	     {
	    	 if(list == null || list.next == null) return list;
	    	 
	    	 Node mid = GetMid(list);
	    	// System.out.println(mid.data);
	    	 
	    	 
	    	 mid.next.prev = null;
	    	 mid.next = null;
	    	 
	    	Node left =  Sort(list);
	    	Node right =  Sort(mid.next);
	    	  
	    	Node sortedlist = Merge(left,right);
	    	return sortedlist;
	    	 
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
	     
	     public Node Merge(Node a, Node b)
	     {
	    	 Node dummy = new Node(0);
	    	 
	    	 Node dum = dummy;
	    	 
	    	 while( a!= null && b!= null)
	    	 {
	    		 if(a.data<b.data)
	    		 {
	    			 dummy.next = a;
	    			 a=a.next;
	    			 dummy = dummy.next;
	    			 
	    		 }
	    		 
	    		 else
	    		 {   
	    			 dummy.next = b;
    			     b=b.next;
    			     dummy = dummy.next;
	    		 }
	    	 }
	    	 
	    	 if( a != null)
	    	 {
	    		 dummy.next = a;
    			 a=a.next;
    			 dummy = dummy.next;
	    	 }
	    	 
	    	 if( b != null )
	    	 {
	    		 dummy.next = b;
    			 b=b.next; 
    			 dummy = dummy.next;
	    	 }
	    	 
	    	 return dum.next;
	     }
	     
	 }

	public static void main(String[] args) {
	
        int[] arr = {10,20,130,40,50,160,790,80,90};
		
		DoublyLinkedList list = new DoublyLinkedList();
		
		list.InsertNode( null, arr[0]);
		
		Node abc = list.head;
		
		for( int i =1; i < arr.length ; i++ )
		{
			list.InsertNode( abc, arr[i]);
			 
		}
		
		
		list.head = list.Sort(abc);
		
		list.Print(list.head);
	}
		 

}
