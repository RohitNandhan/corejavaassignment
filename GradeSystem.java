package myprograms;
import java.util.Scanner;
public class GradeSystem {

	public static void main(String []args) {
		
		System.out.println("**Enter marks of five subjects**");
		String[] s1= {"ENGLISH", "TAMIL", "MATHS", "PHYSICS", "CHEMISTRY", "COMPUTER_SCIENCE"};
		int[] mark = new int[10];
		int[] m = new int[10];
		int t=0;
		for(int i = 0; i<s1.length;i++)
		{
		  System.out.println("Enter marks of "+s1[i]+ " subject:");
	       m[i] = getchar(mark[i]);  
	       t+=m[i];
		}	
		
		for(int j=0;j<s1.length;j++)
		{
		display(s1[j],m[j]);	
		}
		display(t);
	}
	public static int getchar(int in) {
		Scanner sc = new Scanner(System.in);
		in=sc.nextInt();
       return in;
	}  
	
	public static float calc(float t) 
	{
		float percentage;
		percentage=(t/600)*100;
		return percentage;
	}   

	public static char grading(int mark)
	{
		char ch = 'a';
		 if(mark>=90){
		    	ch='O';
		    }else if(mark>=80 && mark<90){
		    	ch='A';
		    }else if(mark>=70 && mark<80){
		    	ch='B';
		    }else if(mark>=60 && mark<70){
		    	ch='C';
		    }else if(mark>=40 && mark<60){
		    	ch='D';
		    }else if(mark<40){
		    	ch='E';		   
		    	}
		return ch;
		
	}
	public static void display(String s1, int mark)
	{	
		System.out.printf(s1+ ":- \nMARK : "+mark+" \t GRADE : "+grading(mark));
		System.out.println("\n");
	}
	public static void display(int t)
	{	
		float p =calc(t);
		System.out.println(" TOTAL MARKS SCORED : " +t+"\n PERCENTAGE : "+p+"%");
		System.out.println();
	}
}