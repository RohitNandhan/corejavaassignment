package PracticePrograms;
import java.util.*;
public class DataTypeSamples {
	public static void main(String [] args)
	{
	float a,b,c;
	double d;
	Scanner s = new Scanner(System.in);
	System.out.print("Enter the numbers");
	
	System.out.println("Number1 :");
	a=s.nextFloat();
	System.out.println("Number2 :");
	b=s.nextFloat();
	System.out.println("Number3 :");
	c=s.nextFloat();
	d=(a+b+c)/3;
	System.out.println("The Final result is :"+d);
	System.out.println("***Thank You***");
	}
}
