package PracticePrograms;

public class Bascis {
	public static void main(String [] args)
	{
		char ch = '-';
		
		System.out.println(ch);
		System.out.println();
		System.out.println();
		preincrementopr();
	}
	
private static void preincrementopr() {
	int x,y,z;
	int a,b,c;
	int r1,r2,r3,r4,r5;
	x=10;
	y=20;
	z=30;
	r1=x--;//9
	r2=--y;//y stores 19
	r3=z++;//31
	r4=r1+r2+r3;
	System.out.println("the result1 is :"+r1);
	System.out.println("the result2 is :"+r2);
	System.out.println("the result3 is :"+r3);
	System.out.println("the result4 is :"+r4);	
}

	
}
		// TODO Auto-generated method stub
		




