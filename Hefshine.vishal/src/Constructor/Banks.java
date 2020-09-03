package Constructor;

public class Banks {

	
		int amount =5000;
		
		
		
		
		  Banks()
		  {
		  
			  System.out.println("No amount has been added to your account");
		  }
		  
		  Banks(int amount)
		  {
			 System.out.println("The amount of "+amount+" has been credited to your account");
			 this.amount = this.amount + amount;
		
		  }
		  
		  void display()
		  {
			  System.out.println("The Account Balance in your account is : "+amount);

	}

}
