import java.util.*;


public class HshMap {

	public static void HshMap() {
		
	   HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
		                        hmap.put(0,1);
								hmap.put(1,2);
								hmap.put(2,3);
								hmap.put(3,4);
								hmap.put(4,5);
								hmap.put(5,6);
				
		
		 Set set = hmap.entrySet();
	      Iterator iterator = set.iterator();
	      while(iterator.hasNext()) {
	         Map.Entry mentry = (Map.Entry)iterator.next();
	         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
	         System.out.println(mentry.getValue());
	      }
		 
	}

	public static void main(String[] args) {
		 
		HshMap();
	}

}
