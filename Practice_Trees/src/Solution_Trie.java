import java.util.*;


public class Solution_Trie {

	
    	
	static class Node
	{

		public   HashMap<Character,Node> children;
		public   boolean EndOfWord;
		
		public Node()
		{
			children = new HashMap<>();
			EndOfWord = false;
		}
	}
	
	 private static final Node root  = new Node();;
	
	static class Trie
	 {
		
		 
		  
		 public void Insert( String word)
		 {
			 Node current = root;
			 
			 for( int i=0; i < word.length(); i++)
			 {
				 char ch = word.charAt(i);
				 
				 Node node = current.children.get(ch);
				 
				 if(node == null)
				 {
					 node = new Node();
					 current.children.put(ch, node);
				 }
				 
				 current = node;
			 }
			  current.EndOfWord = true;
		 }
		 
		 public void Print(Node current)
		 {
			 
			 while(current.EndOfWord != true)
			 {
				 System.out.println( current.children);
			 }
			 
		 }
	 }
	 
	 
	public static void main(String[] args) {
	 
		Trie trie = new Trie();
		
		trie.Insert("aditya");

		trie.Print(root);
	}

}
