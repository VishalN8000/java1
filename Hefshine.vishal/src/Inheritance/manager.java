package Inheritance;

import java.util.Scanner;

public class manager extends Worker {
	
	String Department;
	Scanner scr=new Scanner(System.in);

	void managerinput()
	{
		System.out.println(" enter the department ");
		Department =scr.next();
	}
	
	void managerdisplay()
	{
		System.out.println("the department of Manager is:"+Department);
		System.out.println("manager name is: "+Sname);
		System.out.println("enter the name:"+Sname);
		System.out.println("enter the add:"+Saddres);
		System.out.println("enter the phoneno:"+Sphoneno);
		System.out.println("enter the age:"+Sage);
		System.out.println("enter the salary: "+Ssalary);
		
	}

}
