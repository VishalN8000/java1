package Inheritance;

import java.util.Scanner;

public class Employe extends Worker {
	String Workspecialization;
	Scanner src=new Scanner(System.in);
	void Employeinput()
	{
		System.out.println("enter workspecialization");
		Workspecialization = src.next();
		
	}

	void Employedisplay()
	{
		System.out.println("the work specialization of employe is:"+Workspecialization);
		
	
		
	
		
	System.out.println("Employe:");
	System.out.println("enter the name:"+Sname);
	System.out.println("enter the add:"+Saddres);
	System.out.println("enter the phoneno:"+Sphoneno);
	System.out.println("enter the age:"+Sage);
	System.out.println("enter the salary: "+Ssalary);
}

}