package thread_Programs;


class User{
	private int amount=10000;
	synchronized void withdrawal(int amount) {
		System.out.println("Amount balance: "+this.amount);
		System.out.println("going to withdrawal");
		System.out.println("Amount withdrawal: "+amount);
		if(this.amount<amount) {
			System.out.println("Insufficient balance");
			try {
				wait();
			}catch(Exception e) {
				System.out.println(e);
			}
			this.amount-=amount;
			System.out.println("Withdrawal complete");
			System.out.println("Amount withdrawal: "+amount);
			System.out.println("Amount balance: "+this.amount);
		}
	}
	synchronized void deposit(int amount) {
		System.out.println("goint to deposit");
		this.amount+=amount;
		System.out.println("Amount deposit: "+amount);
		System.out.println("deposit complete");
		notify();
	}
}

public class ThreadCommunication {
	public static void main(String[] args) {
		User u=new User();
		new Thread() {
			public void run() {
				u.withdrawal(15000);
			}
		}.start();
		new Thread() {
			public void run() {
				u.deposit(6000);
			}
		}.start();
	}
}
