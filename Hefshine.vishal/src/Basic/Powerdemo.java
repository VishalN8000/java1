package Basic;

import java.util.Scanner;

public class Powerdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner(System.in);
		int number,power,result=1,i;
		System.out.println("enter the value of number:");
		number = src.nextInt();
		System.out.println("enter the value of power:");
		power = src.nextInt();
		
		for(i=1;i<=5;i++) 
		{
			result=result*number;
		}
		System.out.println("the result is:" +result);

	}

}
