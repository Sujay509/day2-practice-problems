package com.bridgelabz;

import java.util.Scanner;

public class ReverseNoForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		int rev = 0; //Stores the reversed number
		int rem ; //stores the remainder
		System.out.println("Actual Number: "+ n);
		for(int i=n ; i > 0; )//no need of decrement here
		{
			rem = i % 10 ;
			rev = rev * 10 + rem;
			i = i / 10;
			
		}	
		System.out.println("Reversed Number is: "+ rev);
    sc.close();
	}
}
