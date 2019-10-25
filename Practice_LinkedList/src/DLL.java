
public class DLL {

	
	
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
					 
				 }
				 
			 }
			 else
			 {
				 int i = 1;
				 
				 while( head != null)
				 {
					  if( position-1 == i) { 
					   node.next = head.next; 
					   head.next.prev = node;
					   head.next = node; 
					   node.prev = head; break;
					  
					  }
					 
					 head = head.next;
					 i++;
				 }
				 
				 if(head == null)
				 {
					 this.tail.next = node;
					 
					 node.prev = this.tail;
					 
					 this.tail = node;
				 }
				 
			 }
     		 
     		 
     		 
     	 }
		 
		 public void Print(Node head)
		 {
			 while( head != null)
			 {
				 System.out.println(head.data);
				 head = head.next;
			 }
			 
		 }
		 
	 }
	
	 
	 
	 
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60,70,80,90};
		
		DoublyLinkedList list = new DoublyLinkedList();
		
		list.Insert( null, arr[0], 0);
		
		Node abc = list.head;
		
		for( int i = 1; i < arr.length ; i++ )
		{
			list.Insert( abc, arr[i], i);
		}
		
		list.Print(abc);

	}

}
