package Inheritance;

public class workermain {

	public static void main(String[] args) {
		
		Employe obj1=new Employe();
		manager obj2=new manager();
		
		System.out.println("Employe data");
		
		obj1.Employeinput();
		obj1.displaysalary();
		obj1.Employedisplay();
		
		System.out.println(" \n manager data");
		obj2.managerinput();
		obj1.displaysalary();
		obj2.managerdisplay();
		

	}

}
