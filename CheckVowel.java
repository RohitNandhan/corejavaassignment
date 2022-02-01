package PracticePrograms;

import java.util.Scanner;

public class CheckVowel {

	public static void main(String []args)
	{
		Scanner sc =new Scanner(System.in);
		char ch;
		System.out.println("Enter the Character :");
		ch=sc.next().charAt(0);
		if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='I' || ch=='i' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
		{
			System.out.println(ch+" is a Vowel");
			
		}
		else
		System.out.println(ch+" is a Consonant");
		
		
	}
}
