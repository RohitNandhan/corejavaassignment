package thread_Programs;


class Transaction
{
	int amount=10000;
	synchronized void withdarw(int amount)
	{
		System.out.println("going to withdraw");
	if (this.amount<amount)
	{
	try
	{
		System.out.println("Less Balance! waiting for deposit");
		wait();
	}catch(Exception e)
	{
		
	}
	}

this.amount-=amount;
System.out.println(amount +" \n Withdrawal is completed");
System.out.println("Current balance: "+this.amount);
	}

	synchronized void deposit(int amount)
	{
		System.out.println("going to deposit");
		this.amount+=amount;
		System.out.println(amount+" deposit completed");
		System.out.println("Current balance: "+this.amount);
		notify();
	}
}
public class TestThreadCommunication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Transaction u=new Transaction();
		new Thread()
		{
			public void run()
			{
				//u.withdarw(MIN_PRIORITY);
				u.withdarw(15000);
			}
		}.start();
		new Thread()
		{
			public void run()
			{
				//u.deposit(2);
				u.deposit(2000);
			}
		}.start();
	}

}
