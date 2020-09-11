package Inheritance;

public class Bike extends Vehicle {
	int bikemodno,bikeprice;
float discountrate;
String bikename,servstationname;

Bike()
{
	
}
void display()
{
	System.out.println("the bike name is:"+bikename);
	System.out.println("the bike price is:"+bikeprice);
	System.out.println("the bike modno is:"+bikemodno);
	System.out.println("the discountrate is:"+discountrate);
	System.out.println("servicestation is"+servstationname);
}
}
