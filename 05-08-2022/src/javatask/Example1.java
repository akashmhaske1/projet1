package javatask;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		int age, b=18;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age ");
		age=sc.nextInt();
		sc.close();
		boolean condition =(age >= b);
		System.out.println("Valid status:--" +condition);
	
		if(condition)
		{
			System.out.println("able to vote");
		}
	}

}
