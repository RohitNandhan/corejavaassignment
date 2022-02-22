package PracticePrograms;
import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

	class Arr{
	static Scanner sc=new Scanner(System.in);
	int arr[][];
	int rows,columns;
	int count=0;
	int[][] array_create()
	{
		
		System.out.println("Enter no. of Rows");
		rows=sc.nextInt();
		System.out.println("Enter no. of Columns");
		columns=sc.nextInt();
		arr=new int[rows][columns];
		System.out.print("ENTER THE ELEMENTS FOR "+rows+ "*" +columns+" MATRIX\n\n");
		for(int i=0;i<rows;i++)
		{	for(int j=0;j<columns;j++)
		{
			arr[i][j]=sc.nextInt();
		}
		System.out.println();
		}
		return arr;
	
	}
	int[][] matixmultiplication(int[][] arr1,int[][] arr2)
	{
		int c[][]=new int[rows][columns];
		for(int i=0;i<rows;i++)
		{	for(int j=0;j<columns;j++)
		{
				c[i][j]=0;      
				for(int k=0;k<rows;k++)      
				{      
				c[i][j]+=arr1[i][k]*arr2[k][j]; 
			}
		System.out.println();
	}
	}
		return c;
	}
	
		
	void display(int arr[][])
	{	count++;
		System.out.print(rows+ " X " +columns+" Matrix for " +this.count+ " \n\n");
		for(int i=0;i<rows;i++)
		{	for(int j=0;j<columns;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
		}
	}
	
	void displayResult(int arr[][])
	{	count++;
		System.out.print("Resultant_Matrix is : \n\n");
		for(int i=0;i<rows;i++)
		{	for(int j=0;j<columns;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
		}
	}
	
	
	void display_Reverse(int[][] arr)
	{
		
		System.out.print("REVERSE ARRAY Of"+rows+ "*" +columns+"\n\n");
		for(int i=rows-1;i>=0;i--)
		{	for(int j=columns-1;j>=0;j--)
		{		
			System.out.print(arr[i][j]+" ");
	}
		System.out.println();
		}	
}
}

class TwoDimensionalArray extends Arr
{
	public static void main(String[] args) {
		TwoDimensionalArray obj=new TwoDimensionalArray();
		int[][] matrix_1=obj.array_create();
		int[][] matrix_2=obj.array_create();
		int[][] resultant_matrix=obj.matixmultiplication(matrix_1, matrix_2);
		obj.display(matrix_1);
		obj.display(matrix_2);
		obj.displayResult(resultant_matrix);
			
	
	}
}
