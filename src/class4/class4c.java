package class4;


import java.util.Scanner;


public class class4c {
	
	public static void main(String[]args) {
		System.out.println("please enter a number:");
		Scanner sc=new Scanner(System.in);
		int input1=sc.nextInt();
		int input2=sc.nextInt();
		sc.close();
		int result= input1 + input2;
		System.out.println("Total addition of two inputs:" + result);
		
	}
	
	

}
