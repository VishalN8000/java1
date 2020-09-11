package Constructor;

public class Employee {
int amount =10000;
	
	
	public Employee()
	{
		
		amount=0;
		System.out.println("intial amount is:"+amount);
		
	}
	
	public Employee(int x)
	{
		
		amount=x;
		System.out.println(" the final amount is :"+x);
}
}