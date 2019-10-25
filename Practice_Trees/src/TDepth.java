 
public class TDepth {

	static class Node {

		public int data;
		public Node left;
		public Node right;
	 
		 
		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
			 
		}
	}

	
	   
	 static class Tree
	 {
	   
		 public static Node current;
		 
	 
		 
		  
		   Tree() 
		    { 
			   current = null; 
		    } 
		   
		   
		   
		   
		   public void InOrder( Node current )
		    {
		    	
		    	if(current != null)
		    	{
		    		InOrder(current.left);
		    		System.out.print(current.data+" , ");
		    		InOrder(current.right);
		    	}
		    }
		    
		    
	 }
		 

		public static void main(String[] args) {
	
		   Tree tree = new Tree();
		
	       tree.current =  new Node(50);
	       Node abc = tree.current;
		
	       tree.current.left = new Node(30);
	       tree.current.right = new Node(70);
		  
	       tree.current.left.left = new Node(20);
	       tree.current.left.right = new Node(40);
		  
	       tree.current.right.left = new Node(60);
	       tree.current.right.right = new Node(80);
	
	       tree.InOrder(abc);
	       
	       
	       
		}
	 
	
		
}
