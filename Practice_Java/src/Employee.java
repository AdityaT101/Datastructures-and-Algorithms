
class Employee {
	
	  String name;
      int Id;
      
	  //NoArg constructor
      public Employee()
   	  { 
  		 this.name = "Aditya";
  	     this.Id = 23;
  	     
  	   System.out.println("employee");
  	  }
      
      //Parameterized Constructor
      public Employee(String a  )
   	  { 
    	 this(2); //Calling the constructor with integer argument
    	 
    	 
    	 this.name = a;
  	  }
      
      
      public Employee(  int b )
   	  { 
    	 this();
    	 this.Id = b;
  	  }
      
      
      public static int Add(int a, int b)
      {
    	  return a+b;
      }
      
      
      public static void main(String[] args)
      {
			 //Employee a = new Employee("Aditya Takale");
			// System.out.println( a.Id );
	  }

}



