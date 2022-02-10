package myprograms;

import java.util.Scanner;

public class PrimeNumbers {
		public static void PrimeNumbers(int num)
	{
	int count =0;
	for(int i=1 ; i<=(num/2); i++)
	{
		if (num%i==0)
		{
			//System.out.println(" "+i);
			count++;
		}
		}
	if (count==1)
	{
		System.out.println("prime : "+num);
		
	}
	}
		public static void main(String[] args) {
			int num;
			int result=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the range from:  ");
			int i=sc.nextInt();
			
			System.out.println("Enter the range to:  ");
			num=sc.nextInt();
		    for(;i<=num;i++)
		    {
		    	PrimeNumbers(i);
		    }
		    }
		

}
