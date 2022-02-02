package PracticePrograms;

import java.util.Scanner;

public class ArmStrongNumber_Range {

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
	    	switch(s)
	    	{
	    	case 1:
	    		result=onedigits(i);
	   // System.out.println("one digit"+i);
	    	break;
	    	case 2:
	    		result=twodigits(i);
	  //  		 System.out.println("two digit"+i);
	    		
		    	break;
	    	case 3:
	    		result=threedigits(i);
		    	break;
	    	case 4:
	    		result=fourdigits(i);
		    	break;
	    	case 5:
	    		result=fivedigits(i);
		    	break;
		    	
	    	}
	    	
	    	
	if(i==result)
		{
			 System.out.println(+result+" - is a ARMSTRONG NUMBER");
	}
	}
	   
	   

	}
	public static int onedigits(int i)
	{
	   int r = 0;
		int sum=0;
		while(i!=0)
		{
			r=i%10;
		sum=(r)+sum;		
		i/=10;	
	}
return sum;
}
   public static int twodigits(int i)
	{
	   int r = 0;
		int sum=0;
		while(i!=0)
		{
			r=i%10;
		sum=(r*r)+sum;		
		i/=10;	
	}
return sum;
}
   public static int threedigits(int i)
  	{
  	   int r = 0;
  		int sum=0;
  		while(i!=0)
  		{
  			r=i%10;
  		sum=(r*r*r)+sum;		
  		i/=10;	
  	}
  return sum;
  }
   public static int fourdigits(int i)
  	{
  	   int r = 0;
  		int sum=0;
  		while(i!=0)
  		{
  			r=i%10;
  		sum=(r*r*r*r)+sum;		
  		i/=10;	
  	}
  return sum;
  }
  
  public static int fivedigits(int i)
 	{
 	   int r = 0;
 		int sum=0;
 		while(i!=0)
 		{
 			r=i%10;
 		sum=(r*r*r*r*r)+sum;		
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
	//System.out.println("count"+count);
}
return count;
}

}
