package PracticePrograms;
import java.util.Scanner;
public class GradeSystem {

	public static void main(String []args) {
		float total,percent;
		float eng,phy,chem,math,comp;
		Scanner sc = new Scanner(System.in);
		System.out.println("**Enter marks of five subjects**");
		System.out.println();
	    System.out.print("Enter marks of English subject:");
	    eng=sc.nextFloat();
	    System.out.print("Enter marks of physics subject:");
	    phy=sc.nextFloat();
	    System.out.print("Enter marks of chemistry subject:");
	    chem=sc.nextFloat();
	    System.out.print("Enter marks of maths subject:");
	    math=sc.nextFloat();
	    System.out.print("Enter marks of computer subject:");
	    comp=sc.nextFloat();
	    total=eng+phy+chem+math+comp;
	    percent=(total/500)*100;
	   //calling Display method 
	    display(eng,phy,chem,math,comp,total,percent);
	
	}
	
	public static char grading(float percent)
	{
		char ch = 'a' ;
		 if(percent>=90){
		    	ch='O';
		    }else if(percent>=80 && percent<90){
		    	ch='A';
		    }else if(percent>=70 && percent<80){
		    	ch='B';
		    }else if(percent>=60 && percent<70){
		    	ch='C';
		    }else if(percent>=40 && percent<60){
		    	ch='D';
		    }else if(percent<40){
		    	ch='E';		   
		    	}
		// System.out.println(ch);
		return ch;
		
	}
	public static void display(float eng,float phy,float chem,float math,float comp,float total,float percent)

	{
		System.out.printf(" The Marks scored in English is : " +eng+ " and the grade is : "+grading(eng));
		System.out.println();
		System.out.printf("The Marks scored in Physics is : " +phy+ " and the grade is : "+grading(phy));
		System.out.println();
		System.out.printf("The Marks scored in Chemistry is : " +chem+ " and the grade is : "+grading(chem));
		System.out.println();
		System.out.printf("The Marks scored in Maths is : " +math+ " and the grade is : "+grading(math));
		System.out.println();
		System.out.printf("The Marks scored in Computer Science is :" +comp+ " and the grade is : "+grading(comp));
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.printf("TOTAL MARKS SCORED = "+total+" and GRADE = :"+grading(total));
		System.out.println();
		System.out.printf("PERCENTAGE OBTAINED = "+percent);
		
	}
}
