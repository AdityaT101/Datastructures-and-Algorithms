import java.util.ArrayList;
import java.util.List;

 

public class GreaterSumTree {

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
		    
		    
		    public void InOrder( Node current )
		    {
		    	
		    	if(current != null)
		    	{
		    		
		    		InOrder(current.left);
		    		System.out.print(current.data+" , ");
		    		arrayList.add(current.data);
		    		InOrder(current.right);
		    	}
		    }
		    
		    
		    public List<Integer> GreaterInOrder( List<Integer> arrayList)
		    {
		    	for(int i=0; i<arrayList.size()-1;i++)
				 {
					 int sum=0;
					 for(int j=i+1; j<arrayList.size();j++)
					 {
						 sum = sum + arrayList.get(j);
					 }
					 arrayList.set(i, sum);
				 }
				 
		    	arrayList.set(arrayList.size()-1, 0);
		    	
		    	return arrayList;
		    }
		    
		    
		    static int j1 = 0;
		    
		   // solution to #6 in construction and conversion
		    public void InorderInsert(Node current )
	    	{
	    		
	    		 
	    			if(current != null)
	    		    {
	    			   InorderInsert(current.left);
	    			
	    			   //System.out.println(current.data);
	    			   
	    			   current.data = arrayList.get(j1);++j1;
	    			   InorderInsert(current.right);
	    		    }
	    	}
		    
		   // solution to #8 in construction and conversion
		    public List<Integer> GreaterInOrder_1( List<Integer> arrayList)
		    {
		    	for(int i=0; i<arrayList.size();i++)
				 {
					 int sum=0;
					 for(int j=i; j<arrayList.size();j++)
					 {
						 sum = sum + arrayList.get(j);
					 }
					 arrayList.set(i, sum);
				 }
				 
		    	//arrayList.set(arrayList.size()-1, );
		    	
		    	return arrayList;
		    }
		    
		    
		    // solution to #9 in construction and conversion
		    public List<Integer> GreaterInOrder_2( List<Integer> arrayList)
		    {
		    	for(int i=arrayList.size()-1; i>=0; i--)
				 {
					 int sum=0;
					 for(int j=i; j<=arrayList.size()-1-i;j++)
					 {
						 sum = sum + arrayList.get(j);
					 }
					 arrayList.set( arrayList.size()-1-i, sum);
				 }
				 
		    	//arrayList.set(arrayList.size()-1, );
		    	
		    	return arrayList;
		    }
		    
		    
	     }
	
	    
	public static void main(String[] args) {
		 
        int[] arr = {50,30,20,40,70,60,80};
		
	    Tree  tree = new Tree();
	    
	    for(int i =0;i<arr.length;i++) { tree.Insert(arr[i]); }
		
		Node abc = tree.current;

		tree.InOrder( abc );
		
		tree.GreaterInOrder_2(arrayList);
		
		System.out.println();
		
		tree.InorderInsert(abc);
		
		tree.InOrder(abc);
		
		
	}

}
