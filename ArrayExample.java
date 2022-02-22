package array_package;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) 
	{
	 // ArraySearch as=new ArraySearch();
	  //as.Array();
	  int arr[]= {4,9,2,1,10};
	  System.out.println("elements in an array are");
	  for(int j=0; j<arr.length; j++)
	  {
		  System.out.println(arr[j]);
	  }findMin(arr);
	  Class c=arr.getClass();
	  System.out.println(c);
	  String name=c.getName();
	  System.out.println(name);
	  
	  
	}
	  public static void findMin (int arr[])
	  {
		  int min=arr[0];
		  for(int j = 0; j<arr.length;j++)
		  {
			  if(min>arr[j])
				  min=arr[j];
		  }
	  System.out.println("minimum value "+min);;
	  
	  }  
}
	
 
class SimpleArray
{
	public int arr[];
	public int n;
	Scanner sc=new Scanner(System.in);
	//arr=new int[7];
	
		public SimpleArray(int n) {
		//super();
		//this.arr = arr;
		this.n = n;
	}
	void Assign() {
		arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();		}
	}
	 void display() {
		 
		System.out.println("the array list"+arr);

	}
}
class ArraySearch{
	Scanner sc=new Scanner(System.in);
		 int arr[]=new int[5];
		 public ArraySearch() {
			// TODO Auto-generated constructor stub
			 System.out.println("ENTER THE INPUTS");
		 for(int i=0;i<arr.length;i++)
			{
				arr[i]=sc.nextInt();
			}
		 	System.out.println("WHAT TO FIND");
		 	int search=sc.nextInt();
		 	int pos=-1;
		 	for(int i=0;i<arr.length;i++)
			{
		 		if(arr[i]==search)
		 		{
		 			pos=i;
		 			break;
		 		}
		 }
		 	if (pos>=
		 			0)
		 	{
		 		System.out.println("Element '" +search+ "' found at position " +(pos+1));
		 	}
		 	else
		 		System.out.println("Element Not Found");
	 
		 }
}


