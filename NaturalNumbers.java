package com.bridgelabz;

import java.util.Scanner;

public class NaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		int sum = 0;
		for(int i=0; i<=n; i++)
		{
			sum = sum + i ;
			//System.out.println("Sum is: "+sum);
		}
		System.out.println("Sum is: "+sum);
		
		sc.close();

	}

}
