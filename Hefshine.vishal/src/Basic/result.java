package Basic;

import java.util.Scanner;

public class result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sub1, sub2,sub3,sub4,sub5;
Scanner grade =new Scanner(System.in);
System.out.println("enter mark of sub 1");
 sub1=grade.nextInt();
 System.out.println("enter the mark of sub 2");
 sub2= grade.nextInt();
 System.out.println("enter the mark of sub 3");
 sub3= grade.nextInt();
 System.out.println("enter the mark of sub 4");
 sub4=grade.nextInt();
 System.out.println("enter the mark of sub 5");
 sub5=grade.nextInt();
 int total= sub1+sub2+sub3+sub4+sub5;
 int perc= total/5;
 
 if(perc>=90) {System.out.println("gradeA");}
 else if(perc>=80) {System.out.println("grade B");}
 else if (perc>=60) {System.out.println("grade c");}
 else if (perc>=40) {System.out.println("grade d");}
 else {System.out.println("fail!!");}
 }







	}


