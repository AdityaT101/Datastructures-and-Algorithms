 
import java.util.*;

public class Solution_Tree_1 {
	static List<Integer> arrayList = new ArrayList<Integer>();
	
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
    
    
    
    static class Tree
    {
    	
	    public Node current;
	    
	    public void Insert(int data)
	    {
	    	if(current==null)
	    		current = new Node(data);
	    	else
	    		current = Insert(current,data);
	    }
	    
	    
	    
	    public Node Insert( Node current, int data)
	    {
	    	if(data < current.data)
	    	{
	    		if(current.left == null)
	    		{
	    			current.left = new Node(data);
	    		}
	    		else
	    			Insert(current.left,data);
	    	}
	    	else
	    	{
	    	    if( current.right == null)
	    	    {
	    	    	current.right = new Node(data);
	    	    }
	    	    else
	    	    	Insert(current.right,data);
	    	}
	    	
	    	return current;
	    }
	    
	    
	    
	    public boolean Search(Node current, int data)
	    {
	    	
	    	if(current == null)
	    		return false;
	    	
	    	if(current.data==data)
	    		return true;
	    	
	    	else if (data < current.data)
	    		return Search( current.left, data);
	    	
	    	else  
	    		return Search( current.right, data);
	    	
	    }
	    
	    
	    
	    
	    public void PreOrder( Node current )
	    {
	    	if(current != null)
	    	{
	    		System.out.print(current.data+" , ");
	    		PreOrder(current.left);
	    		PreOrder(current.right);
	    	}
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
	    
	    
	    
	    public void PostOrder( Node current )
	    {
	    	
	    	if(current != null)
	    	{
	    		
	    		PostOrder(current.left);
	    		PostOrder(current.right);
	    		System.out.print(current.data+" , ");
	    	}
	    }
	    
	    
	    
	    public void BreadthFirst(Node current)
	    {
	    	
	    	Queue<Node> queue = new LinkedList<Node>();
	    	
	    	while( current !=null )
	    	{
	    		System.out.println(current.data);
	    		
	    		if(current.left != null)
	    			 queue.add(current.left);
	    		
	    		if(current.right != null)
	    			 queue.add(current.right);
	    		
	    		if(!queue.isEmpty())
	    		{
	    			current = queue.poll();
	    		}
	    		else
	    			current = null;
	    		
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
	    
	    
	    
	    public void Delete( int data , Node root )
	    {
	    	
	    	Node NodeToRemove = FindNode(current, data);
	    	Node Parent = FindParent( current, data);
	    	
	    	//System.out.println(NodeToRemove.data);
	    	//System.out.println(Parent.data);
	    	
	    	
	    	 
	    	//System.out.println();
	    	if ( NodeToRemove == null)
	    		System.out.println( "null element");
	    	
	    	
	    	//#1
	    	else if( NodeToRemove.left == null && NodeToRemove.right == null)
	    	{
	    		if( NodeToRemove.data > Parent.data )
	    		{
	    			Parent.right = null;
	    		}
	    		else
	    			Parent.left = null;
	    	}
	    	
			
			  //#2
	    	 else if ( NodeToRemove.left == null && NodeToRemove.right != null ) 
	    	 {
			  if( NodeToRemove.data < Parent.data )
			      { Parent.left = NodeToRemove.right; }
			  else 
				    Parent.right = NodeToRemove.right; 
			  
	    	 }
			 
			  //#3 
	    	else if ( NodeToRemove.left != null && NodeToRemove.right == null )
	    	{
			  if( NodeToRemove.data < Parent.data ) 
			       { Parent.left = NodeToRemove.left; }
			  else 
				     Parent.right = NodeToRemove.left; 
			}
			  
			//#4
			  else if ( NodeToRemove.left != null && NodeToRemove.right != null ) {       
			  
			  Node LargestValue = NodeToRemove.left;
			  
			  while( LargestValue.right != null ) LargestValue = LargestValue.right;
			  
			  FindParent(current, LargestValue.data).right = null;
			  NodeToRemove.data = LargestValue.data;
				  
			  }
		}
	    
	    
	  
	    
    }
	    
	public static void main(String[] args) {
		 
		int[] arr = {50,30,20,40,70,60,80};
		
	    Tree  tree = new Tree();
	    
	    //for(int i =0;i<arr.length;i++) { tree.Insert(arr[i]); }
		
	    tree.Insert(23);
	    tree.Insert(14);
	    tree.Insert(31);
	    tree.Insert(15);
	    tree.Insert(7);
	    tree.Insert(9);
	    
		Node abc = tree.current; // ** Most important line - assigning an identifier to the root node 
		
		//System.out.println(  tree.FindParent(abc,50) );
		
		//tree.PreOrder( abc );
		//tree.InOrder( abc );
		//tree.PostOrder( abc );
		//tree.BreadthFirst( abc );
		
		
		//tree.Delete(14, abc);
		
		tree.InOrder( abc );
	
	}


}
