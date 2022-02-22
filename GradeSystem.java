package myprograms;
import java.util.Scanner;
public class GradeSystem {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String []args) {
		
		Student obj=new Student();
		obj.createStudent();
		System.out.println("=============================================================");
		System.out.println("\n**Enter marks of Six Subjects**\n");
		String[] s1= {"ENGLISH", "TAMIL", "MATHS", "PHYSICS", "CHEMISTRY", "COMPUTER_SCIENCE"};
		int[] mark = new int[6];
		int total=0;
		System.out.println("=============================================================");
		for(int i = 0; i<s1.length;i++)
		{
		  System.out.println("Enter marks of "+s1[i]+ " subject:");
	       mark[i] = getchar();
	     //  int Maxmark=Maxmark(marktemp[i]);
	       total+=mark[i];
		}	
		obj.display_Student();
		for(int j=0;j<s1.length;j++)
		{
		display(s1[j],mark[j]);	
		}
		display(total);
		int Maxmark=Maxmark(mark);
		int max=Maxmark(mark);
		System.out.println("\nYOU GOT MAXIMUM MARK IN "+s1[max]+  " AND SCORED :- "+mark[max]);
		int min=Minmark(mark);
		System.out.println("\nYOU GOT MINIMUM MARK IN "+s1[min]+  " AND SCORED :- "+mark[min]);
}
	public static int Maxmark(int arr[])
	{
		int max=arr[0];
		int n = 0,m=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				n=i;
			}
		}return n;
	}
	
	public static int Minmark(int arr[])
	{
		int min=arr[0];
		int m=0;
		for(int i=0;i<arr.length;i++)//0 11 1 22 2 33 3 44 5 66
		{
			if(arr[i]<min){
				min=arr[i];
					m=i;
				}
			}
		return m;
	}
		
	
	public static int getchar() {
		
		int in=sc.nextInt();
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

class Student
{
	String Name;
	int roll_no;
	public void createStudent()
	{
		GradeSystem gs = new GradeSystem();
		//gs.sc.nextLine();
		
		System.out.println("Enter Student Name : ");
		Name=gs.sc.nextLine();
		System.out.println("Enter Roll Number : ");
		roll_no=gs.sc.nextInt();
	}
		public void display_Student()
		{
			System.out.println("Student Nmae :\t " +Name);
			System.out.println("Roll_no : \t" +roll_no);
			System.out.println("\n" );
			//System.out.println("Balance : " +balance[i]);
		}

	
}
