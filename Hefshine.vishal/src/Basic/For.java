package Basic;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner src = new Scanner(System.in);
 int a; int b;
 System.out.println("enter the value of coloum:");
 a =src.nextInt();
 System.out.println("enter the value of row:");
 b =src.nextInt();
 
	for(int i=1;i<=5;i++)
	{
		for(int j=5;j>=i;j--)
		{
			System.out.print("*");
		}
		System.out.println();
		
	}
	}
}
	

	


