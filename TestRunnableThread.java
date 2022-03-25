package thread_Programs;

class demothread implements Runnable
{
	@Override
	public void run()	{
		System.out.println("Thread Using runnable interface");
	}
}

public class TestRunnableThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demothread t1=new demothread();
		t1.run();
	}

}
