package thread_Programs;

public class ThreadAlive extends Thread {
	
	public void run()
	{
		for(int i =0; i<3;i++)
		{
			printMsg();
		}
	}
	public void printMsg()
	{
		Thread th1 =Thread.currentThread();
		String name=th1.getName();
		System.out.println("name= "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadAlive tobj=new ThreadAlive();
		ThreadAlive tobj2=new ThreadAlive();
		tobj.setName("My thread");
		System.out.println("before start "+tobj.isAlive());
		tobj.start();
		System.out.println("after start"+tobj.isAlive());
		tobj2.start();
		for(int i =0; i<4;i++)
		{
			tobj2.setName("Main Thread");
			
			tobj2.printMsg();
			
		}
		
		System.out.println("end of main "+tobj.isAlive());
		
	}
	
	

}
