package com.bridgelabz;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 54, reverse = 0;  
		System.out.println("Number before Reverse is " +number);
		while(number != 0)   
		{  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		number = number/10;  
		}  
		System.out.println("The reverse number is: " + reverse);  
	}

}
