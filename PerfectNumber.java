package PracticePrograms;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
int num;
Scanner sc = new Scanner(System.in);
System.out.println("***ENTER THE RANGE OF NUMBER***");

num=sc.nextInt();
int r;
int sum = 0;
for(int a=1; a<=num;a++)
{
	//System.out.println("a is "+a);
for (int i=1;i<=a/2;i++)
{
	//System.out.println("i is "+i);
	if (a%i==0)
	{
		sum=sum+i;
		//System.out.println("sum is "+sum);
	}
}
if(a==sum)
{
     System.out.println("THE GIVEN NUMBER "+a+" IS A PERFECT NUMBER"); 
	}
/*else
{
	System.out.println("THE GIVEN NUMBER "+a+" IS NOT A PERFECT NUMBER");
}*/
sum = 0;

}
	}
}
