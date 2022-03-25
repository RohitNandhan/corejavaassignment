package thread_Programs;

	class NumberTable
	{
		synchronized void print(int n)
		//public void print(int n)
		{
			for(int i=1; i<=5; i++)
			{
				System.out.println(Thread.currentThread().getName()+": "+n*i);
			}
			try {
				//Thread.sleep(1000);
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}
		
		}
	
	class thread1 extends Thread
	{
	NumberTable numberTable;
	public thread1(NumberTable nt)
	{
		numberTable=nt;
	}
	public void run()h
	 
	{
		numberTable.print(5);
	}
	}
	class thread2 extends Thread
	{
	NumberTable numberTable;
	public thread2(NumberTable nt)
	{
		numberTable=nt;
	}
	public void run()
	{
		numberTable.print(10);
	}
	}

		public class TestSynchronozedMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberTable nt =new NumberTable();
		thread1 t1=new thread1(nt);
		thread2 t2=new thread2(nt);
		t1.setName("Table 1");
		t2.setName("Table 2");
		t1.start();
		t2.start();
	}

	}


