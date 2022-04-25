package Bank_Project;

import java.text.DecimalFormat;
import java.util.Date;
import java.util.Scanner;

import org.hibernate.Session;

public class Bank_Service extends Bank_Account  {
	
	Date date=new Date();
	Bank_Account bank;
	private int pin;
	static GetInputMatching in=new GetInputMatching();
	static Scanner sc=new Scanner(System.in);
	DecimalFormat moneyFormat=new DecimalFormat("'Rs.'###,##0.00");
	Session session;
	
	public Bank_Service() {
		super();
	}
	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin =pin ;
	}	
	
	public void setAccont(Bank_Account bank, Session session)												//Account Display
	{
		this.bank=bank;
		this.session=session;	
	}
	
	public void CreateAccount()													//Account Creation
	{	
		System.out.println("Enter Account Holder Name :");
		setName(in.next());
		System.out.println("Opening Balance :");
		setBalance(in.nextInt());
		System.out.println("------ ACCOUNT CREATED SUCCESSFULLY -------- ");
		}
	
		public void displayAccount()												//Account Display
		{
			System.out.println("Displaying Account..........");
			System.out.println("Account holder : " +bank.getName());
			System.out.println("Account Number : " +bank.getAccNumber());
			System.out.println("Current Account Balance :"+moneyFormat.format(bank.Balance) );
		}
		
	public void getWithdrawal() {	
		System.out.println("Enter The Amount to Withdraw : ");
		int amt=in.nextInt();
		try {
		if(bank.Balance>amt){
			calcWithdrawal(amt);
			BankHistory th=new BankHistory();
			th.setDate(new java.util.Date());
			th.setTrans("Rs."+amt+" Withdrawal");
			th.setBank(bank);
			session.save(th);
			System.out.println("------Withdrawal Successful------\n "
					+ "Current Balance = "+moneyFormat.format(bank.Balance));
		}
		else {
			throw new Exception("Insuffient Balance");
		}
		}
	
	catch(Exception e)
		{
			System.err.println(e.getMessage());
		}
	}

	public void getDeposit() {	
		System.out.println("Enter The Amount to Deposit : ");
		int amt=in.nextInt();
			calcDeposit(amt);
			BankHistory th=new BankHistory();
			th.setDate(new java.util.Date());
			th.setTrans("Rs."+amt+" Deposited");
			th.setBank(bank);
			session.save(th);
		
		System.out.println("------Deposit Successful------\n "
					+ "Current Balance = "+moneyFormat.format(bank.Balance));
	}
	public double calcWithdrawal(double amt)
	{
		bank.Balance-=amt;	
		return bank.Balance;
	}

	public double calcDeposit(double amt)
	{
		bank.Balance+=amt;
		return bank.Balance;
	}

	
		
	
	

		
}
