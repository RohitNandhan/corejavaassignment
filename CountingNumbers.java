package PracticePrograms;

import java.util.Scanner;

public class CountingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num;
		Scanner s =new Scanner(System.in); 
		System.out.println("ENTER THE NUMBER : ");
		num = s.nextLong();
		int count = 0;
		while (num!=0)
		{
			num=num/10;
			//num/=10;
			count++;
		}
		System.out.println("NO. OF DIGITS : "+count);
		

	}

}
