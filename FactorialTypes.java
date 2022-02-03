package myprograms;

import java.util.Scanner;

public class FactorialTypes {
		static int fact1(int n)			//recrussive method
	    {
	        if (n == 0)					
	          return 1;
	          
	        return n*fact1(n-1);	//	5*4*3*2*1
	    }
		private static int fact2(int r) {				// recrussive with loop 
			
			while(r!=0)
			{
			return r*fact2(r-1);
			}
			return 1;
		}
		
		private static int fact3(int r) {				//factorial executed
			int f = 1;
			for (int i=r;i>=1;i--)
			{
				f=i*f;
			}
			return f;
		}
	      
	  
	    public static void main(String[] args) 
	    {
	    	
	    		int num;
	    		// TODO Auto-generated constructor stub
	    		Scanner sc=new Scanner(System.in);
	    		System.out.println("ENTER THE NUMBER :- ");
	    		num=sc.nextInt();
	    	
	        System.out.println("Factorial of "+ num + " is " + fact1(num));
	        System.out.println("Factorial of "+ (num+1) + " is " + fact2(num+1));
	        System.out.println("Factorial of "+ (num+2) + " is " + fact3(num+2));
	    }

	}


