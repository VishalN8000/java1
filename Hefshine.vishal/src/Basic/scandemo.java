package Basic;

import java.util.Scanner;

public class scandemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner scandemo = new Scanner(System.in);
   System.out.println("enter the value:");
   int number= scandemo.nextInt();
   
   if(number >0)
   {
   System.out.println("no is +ve");
	   
   }
   else if(number <0)
   {
	   System.out.println("no is -ve");
   }
   else if(number ==0)
   {
	   System.out.println("no is 0");
   
	   
   }
   else
   System.out.println("enter the value between 0to9");
	}

}
