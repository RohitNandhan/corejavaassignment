package entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesterTest {
Tester tobj=new Tester();
	@Test
	public void testFindMax()
	{
		int arr[]=new int[] {1,3,2,5,4};
		assertEquals(5,Tester.findmax(arr) );
	}
	@Test
	public void testdivide()
	{
		assertEquals(1,tobj.divide(3, 4) );
		assertThrows(ArithmeticException.class,()->tobj.divide(3,0), "divide by zero");
	}
}
