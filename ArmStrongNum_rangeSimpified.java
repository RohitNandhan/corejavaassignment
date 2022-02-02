package PracticePrograms;

import java.util.Scanner;

public class ArmStrongNum_rangeSimpified {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		int result=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range:");
		num=sc.nextInt();
	    for(int i=1;i<=num;i++)
	    {
	    	int s=count(i);
	    //	System.out.println("s is"+s);
	    	result=calc(i,s);
	     	
	    	
	if(i==result)
		{
			 System.out.println(+result+" - is a ARMSTRONG NUMBER");
	}
	}
	}

   public static int calc(int i,int count)
	{
	   int r = 0;
		int sum=0;
		while(i!=0)
		{
			r=i%10;
		sum=(int) (Math.pow(r, count) + sum);		
		i/=10;	
	}
return sum;
}
   public static int count(int num)
   {
int count = 0;
while (num!=0)
{
	//System.out.println("num is"+num );
	
	num/=10;
	count++;
}
return count;
}

}


