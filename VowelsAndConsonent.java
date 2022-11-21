package com.bridgelabz;

import java.util.Scanner;

public class VowelsAndConsonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Charater: ");
		char ch = sc.next().charAt(0);
		switch(ch)
		{
			case 'A':System.out.println(ch+" is Vowel");
				 break;
			case 'E':System.out.println(ch+" is Vowel");
				 break;
			case 'I':System.out.println(ch+" is Vowel");
				 break;
			case 'O':System.out.println(ch+" is Vowel");
				 break;
			case 'U':System.out.println(ch+" is Vowel");
				 break;
			case 'a':System.out.println(ch+" is Vowel");
				 break;
			case 'e':System.out.println(ch+" is Vowel");
				 break;
			case 'i':System.out.println(ch+" is Vowel");
				 break;
			case 'o':System.out.println(ch+" is Vowel");
				 break;
			case 'u':System.out.println(ch+" is Vowel");
				 break;
			default :System.out.println(ch+ " is Consonant");
		}
		
		sc.close();
	}

}
