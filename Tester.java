package entity;

public class Tester {

	public int addition(int a, int b)
	{
		return a+b;
	}
	
	public static int findmax(int arr[])
	{
		int max=0;
		for(int i=0; i<arr.length; i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		return max;
	}
	
	public int divide(int a,int b)
	{
		return a/b;
	}
}
