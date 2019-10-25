 
public class Sub_Employee extends Employee {

	public Sub_Employee(String a) {
		super(a);
		System.out.println("sub_employee");
	}

	public static void main(String[] args) {

		//Sub_Employee a = new Sub_Employee("Ad");
		 
		//System.out.println( a.name );
		
		 
		String number = "123456";
		
		int num = Integer.parseInt(number);
		
		int i=0;
		while(i<6)
		{
			System.out.println(num%10);
			num = num/10;
			
			i++;
		}
		
		
			
	}

}
