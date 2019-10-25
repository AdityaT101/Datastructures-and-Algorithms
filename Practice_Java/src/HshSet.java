import java.util.*;

public class HshSet {

	public static void HshSet_1() {
		 
		 ArrayList al = new ArrayList();
		      al.add("C");
		      al.add("A");
		      al.add("E");
		      al.add("B");
		      al.add("D");
		      al.add("F");

	      
	      HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
	          hmap.put(12,0);
		      hmap.put(2,0);
		      hmap.put(7,0);
		      hmap.put(49,0);
		      hmap.put(3,0);
		      
		      Iterator itr = hmap.entrySet().iterator();
		      
		      while (itr.hasNext()) 
		        {
		          Map.Entry me2 = (Map.Entry) itr.next();
		          //System.out.println("Key: "+me2.getKey() + " & Value: " + me2.getValue());
		        } 
		     
		      
		      
		      HashSet<Character> hashset = new HashSet<Character>();
		      HashSet<Integer> MaxNumber = new HashSet<Integer>();
		      
		        String s = "abacbdaed"; 
		        char[] gfg = s.toCharArray();
		        int counter=0;
		        
		        int Max=0;
		          int j=0;
		        
			      for (int i = 0; i < gfg.length; i++) 
			      { 
			        	
			        	if( !hashset.contains(gfg[i]) )
			        	{	
			        		hashset.add(gfg[i]);
			        		counter++;
			        	
			        	}
			        	
			        	else if( hashset.contains(gfg[i]) )
			        	{
			        		hashset.clear();
			        		j++;
			        		
			        		i=j;
			        		
			        		hashset.add(gfg[i]);
			        		
			        		if(counter > Max)
					        	Max = counter;
			        		
			        		counter=1;
			        	}
			      } 
		       
		    
		      
		      System.out.println(Max);
	}

	
	public static void main(String[] args) {
		 
		HshSet_1();

	}

}
