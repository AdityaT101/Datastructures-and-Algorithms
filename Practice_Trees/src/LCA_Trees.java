import java.util.*; 

public class LCA_Trees  {

	static ArrayList<Integer> list = new ArrayList<Integer>();
	
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
		    
		    
		    public void InOrder( Node current )
		    {
		    	
		    	if(current != null)
		    	{
		    		
		    		InOrder(current.left);
		    		System.out.print(current.data+" , ");
		    		list.add(current.data);
		    		
		    		InOrder(current.right);
		    		
		    	}
		    }
		    
		    
		    public Node LCA(Node current, int a, int b)
		    {
		    	if(current == null) return null;
		    	
		    	
		    	
		    	if (current.data < a && current.data < b)
		    		return LCA(current.right,a,b);
		    	
		    	else if (current.data > a && current.data > b)
		    		return LCA(current.left,a,b);
		    	
		    	else  
		    	    return current;
		    }
		    
		    
		    public boolean IsNodePresent(Node current, int a)
		    {
		    	boolean T = false;
		    	
		    	if(current == null) return false;
		    	
		    	if(current.data == a)
		    	    T = true;
		    	else if(a < current.data )
		    		T = IsNodePresent(current.left, a);
		    	else
		    		T = IsNodePresent(current.right, a);
		    	
		    	
		    	return T;

		    }
		    static int count = 0;
		    
		    public int NodeDistance(Node current, int count, int a)
		    {
		    	if(current == null) return 0;
		    	
		        if(current.data == a)
		    		return count;
	    	    
		    	else if (a < current.data )
		    	{
		    		 ++count;
		    		    count = NodeDistance( current.left,  count,  a);
		    	}
		    	else  
		    	{     
		    		++count;
	    		    count = NodeDistance( current.right,  count,  a);
		    		
		    	}  
		    	 
				 return count;
		    }
		    
		    
		    public void LeftMostNode(Node current)
		    {
		    	while(current.left != null)
		    	{
		    		current = current.left;
		    	}
		    	System.out.println(current.data);
		    }
		    
		    
		    public int Maxheight(Node current)
		    {
		    	if( current == null) return 0;
		    	else
		    	{
		    		int lDepth = Maxheight(current.left);
		    		int rDepth = Maxheight(current.right);
		    		
		    		if(lDepth > rDepth)
		    			return (lDepth+1);
		    		else
		    			return (rDepth+1);
		    	}
		    }
		    
	    }   

	public static void main(String[] args) {
        int[] arr = {30,20,40,15};//{50,30,40, 20,70,60,80,15,25,35,45,55,65,75,85};
		
	    Tree  tree = new Tree();
	    
	    for(int i =0;i<arr.length;i++) { tree.Insert(arr[i]); }
	    
	    Node abc = tree.current; // ** Most important line - assigning an identifier to the root node 
		
		//tree.InOrder( abc );
		/*
		 * if( tree.IsNodePresent(abc, a) && tree.IsNodePresent(abc, b) )
		 * System.out.println( tree.LCA(abc,a,b).data ); else
		 * System.out.println("Nodes not present");
		 */
		
		/*
		 * int a = 15; int b = 35;
		 * 
		 * int Node_1 = tree.NodeDistance(abc, 0, a) ; int Node_2 =
		 * tree.NodeDistance(abc, 0, b) ;
		 * 
		 * int LCA_dist = tree. NodeDistance(abc, 0,tree.LCA(abc,a,b).data) ;
		 * 
		 * int final_Dist = Node_1+Node_2 - 2*LCA_dist;
		 * 
		 * System.out.println(final_Dist);
		 */
		 
		/*
		 * boolean a = false; for(int i=0; i< list.size()-1; i++) { if (!(list.get(i) <
		 * list.get(i+1)) ) { System.out.println("The tree is NOT BST"); a = true;
		 * break;
		 * 
		 * }
		 * 
		 * }
		 * 
		 * if(!a) { System.out.println("The tree is BST"); }
		 */
		
		//tree.LeftMostNode(abc);
	    System.out.println(tree.Maxheight(abc));
		
	    
	}

}
