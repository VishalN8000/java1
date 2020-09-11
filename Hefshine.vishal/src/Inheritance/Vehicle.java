package Inheritance;

import java.util.Scanner;

public class Vehicle {
	String vehname,servicestationname;
	int vehiclemodno,vehprice;
	Scanner sc= new Scanner(System.in);
	Vehicle ()
	{
		
	}
	
	void Display()
	{
		System.out.println("enter the vehname:");
		vehname=sc.next();
		System.out.println("enter the serstation name:");
		servicestationname=sc.next();
		System.out.println("enter the vehmodno:");
		vehiclemodno=sc.nextInt();
		System.out.println("enter the vehprice:");
		vehprice=sc.nextInt();
	}

}
