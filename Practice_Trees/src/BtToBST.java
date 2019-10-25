import java.util.*;

public class BtToBST {

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
    	public Node current ;
    	
    	
    	
    	public void Inorder(Node current, int a)
    	{
    		
    		if(a==0) 
    		{
    			if(current != null)
    		    {
    			   Inorder(current.left,a);
    			
    			   System.out.println(current.data);
    			   
    			   arrayList.add(current.data);
    			   
    			
    			   Inorder(current.right,a);
    		    }
    		}
    		
    	}
    	
    	
    	static int j = 0;
    	
    	public void InorderInsert(Node current )
    	{
    		
    		 
    			if(current != null)
    		    {
    			   InorderInsert(current.left);
    			
    			   //System.out.println(current.data);
    			   
    			   current.data = arrayList.get(j);++j;
    			   
    			
    			   InorderInsert(current.right);
    		    }
    		 
    		
    	}
	}
    
	


	public static void main(String[] args) 
	{
		 
		Tree tree = new Tree();
		
		
		tree.current = new Node(10);
		
		Node abc = tree.current;
		
		tree.current.left = new Node(30);
		
		tree.current.right = new Node(15);
		
		tree.current.left.left = new Node(20);
		
		tree.current.right.right = new Node(5);
		
		
		tree.Inorder(abc,0);
		System.out.println();

		Collections.sort(arrayList);
		
		
		tree.InorderInsert(abc);
	
		tree.Inorder(abc,0);
		
	
	}

}
