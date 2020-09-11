package Inheritance;

import java.util.Scanner;

public class Worker {
	int Sage,Ssalary;
	String Sname,Saddres;
	long Sphoneno;
	Scanner src =new Scanner(System.in);
	
   void displaysalary()
   {
	   System.out.println("enter the name of worker" );
	   Sname=src.next();
	   System.out.println("enter the address of worker");
	   Saddres=src.next();
	   System.out.println("enter the age of  worker");
	   Sage=src.nextInt();
	   System.out.println("enter the phoneno of  worker");
	   Sphoneno=src.nextInt();
	   System.out.println("enter the salary of  worker");
	   Ssalary=src.nextInt();
   }

}

				

