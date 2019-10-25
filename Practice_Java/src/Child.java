
 public class Child extends Parent{

	public Child() {
		//System.out.println("Child Constructor");
	}
	
	public void Method()
	{
		
	}
	 
	public int Add(int a, int b)
	{
		return a+b;
	}
	
	public int Add(int a, int b, int c)
	{
		return a+b+c;
	}

	public static void main(String[] args) {
		 
		/*
		 * Parent b= new Parent(); b.Method();
		 */
          
		
		  Parent a = new Child(); 
		  a.Method();
		 System.out.println( a.abc );
          
          //System.out.println( a.Add(2,3,4)) ;
    }

}
