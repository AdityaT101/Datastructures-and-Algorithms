 
public class ArrayToBST {

	static class Node
    {
    	public int data;
    	public Node left;
    	public Node right;
    	
    	public Node(int data)
		{
			this.data = data;
			this.left =null;
			this.right = null;
		}
    }
	
	
	public static int count=0;
	public static Node abc;
	
	
	static class Tree
	{
		
		//public static Node current;
		
		public Node Balanced_BST(int[] arr,  int low, int high )
		{
			
			
			if(low<=high)
			{
				int mid = (low+high)/2;
				
				Node current = new Node(arr[mid]); 
				
				if(count == 0 )
					{ abc = current; count++;}
				
				//System.out.println(current.data);
				
			    current.left =    Balanced_BST(arr,low,mid-1  );		
				
				current.right =    Balanced_BST(arr,mid+1,high  );	
				
				
				return current;
			}
			else
				return null;
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
		
		
		
		
		public Node FindParent(Node current, int data)
	    {
	    	if(current == null)
	    		return null;
	    	
	    	if(current.data==data)
	    		return null;
	    	
	    	if( data < current.data )
	    	{
	    		if(current.left == null)
	    			return null;
	    		else if( current.left.data == data)//  
	    			return current;
	    		else
	    			return FindParent( current.left, data);
	    	}
	    	else
	    	{
	    		if(current.right == null)
	    			return null;
	    		else if( current.right.data == data)
	    			return current;
	    		else
	    			return FindParent( current.right, data);
	    	}	
	    	
	    }
	    
		
		
	    
	    
	    public Node FindNode(Node current, int data)
	    {
	    	
	    	if(current == null)
	    		return null;
	    	
	    	if(current.data == data)
	    		return current;
	    	
	    	else if(data<current.data)
	    		return FindNode(current.left, data);
	    	
	    	else 
	    		return FindNode(current.right, data);
	    }
	    
	    
	    
	    public Node FindMin(Node node )
	    {
	    	Node current =  node;
	    	 
	    	System.out.println("yguyg");
	    	 
	    		while( current.left  != null)
    			{
    			
    			current = current.left;
    			}
	    		
	    		return current;
    		 
	    	
	    	 
	    }
	     
	    
	    
	    
		public Node Successor(Node current,int data)
		{
			
			
			if(current == null) return null;
			
			Node abc1 = FindNode(current, data);
			Node xyz ;
			 
			
			if(abc1.right != null)
				xyz =  FindMin(abc1.right);
			
			else 
				xyz = FindParent( abc,  data);
			
			return xyz;
			
		}
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		 
		int[] arr = { 15,20,25,30,35,40,45,50,55,60,65,70,75,80 };
		
		Tree tree = new Tree();
		 
		tree.Balanced_BST(arr, 0, arr.length-1 );
		 
		 tree.InOrder(abc);
		 
		
      //  tree.Successor(abc,  20);

	}

}
