package Basic;

import java.util.Scanner;

public class weeks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner salary= new Scanner(System.in);
System.out.println("enter the basic salary");
double bs =salary.nextDouble();

if(bs<10000)
{
	double da = 80*bs/1000;
	double hra =20*bs/1000;
	double gs =bs+da+hra;
	System.out.println("gs is "+gs);
}
 else if (bs<20000)
{
	 double da =26*bs/100;
	 double hra=22*bs/100;
	 double gs=bs+da+hra;
	 System.out.println("gs is "+gs);
	 }
	


	
}
	
	
	
	
	}





