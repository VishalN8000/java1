package Basic;

import java.util.Scanner;

public class grade {

	public static void main(String[] args) {
	Scanner student = new Scanner (System.in);
	System.out.println("enter the marks");
	int sub1 = student.nextInt();
	int sub2 = student.nextInt();
	int sub3 = student.nextInt();
	int sub4 = student.nextInt();
	int sub5 = student.nextInt();
	int sum= sub1+sub2+sub3+sub4+sub5;
	double percentage  = sum/5;
	System.out.println("the percentage is"+percentage);
if (percentage>90)
{
	System.out.println("grade A");
}
else if (percentage >80)
{
	System.out.println("grade B");
}
else if(percentage>60)
{
	System.out.println("grade C");
}

else if(percentage >40)
{
	System.out.println("grade D");
}
else if (percentage<40)
{
System.out.println("failll!!!!!!!");	
}

	
	
	
	
	
	}

}
