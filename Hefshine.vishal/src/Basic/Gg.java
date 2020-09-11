package Basic;

import java.util.Scanner;

public class Gg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner grade =new Scanner(System.in);
System.out.println("enter the marks" );

double  sub1=grade.nextInt();
double sub2=grade.nextInt();
double sub3=grade.nextInt();
double sub4=grade.nextInt();
double sub5=grade.nextInt();
double sum= sub1+sub2+sub3+sub4+sub5;
double percentage= sum/5;
System.out.println("percentage :"+percentage);
if (percentage>=90)
{
	System.out.print("grade A");

}
else if(percentage>=80)
{
	System.out.print("grade B");
}
else if(percentage>=70) 
{
	System.out.print("grade c");
	
}
else if(percentage>=60)
{
System.out.print("grade d");	
}
else if (percentage>=40)
{
	System.out.print("grade e");
	
}

	}

	}


