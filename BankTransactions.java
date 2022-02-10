package bank;

import java.util.Scanner;

public class BankTransactions
{
	long balance;
	int num;
	static Scanner sc=new Scanner(System.in);
	BankDetails bankdetails=new BankDetails();
	

	public BankTransactions(int i) {
		
		num=i;
		this.balance=bankdetails.balance[i];
		System.out.println("B " + bankdetails.balance[num]);  
	}
	public void Balance_calculation() {
		
		
	}
	void withdrawal() {  
        long amt;  
        System.out.println("Enter the amount you want to withdraw: ");  
        amt = sc.nextLong();  
        if (balance >= amt) {  
            balance = balance - amt;
            System.out.println("bal before: "+balance);
            bankdetails.balance[num]+=balance;
            System.out.println("Balance after withdrawal: " + bankdetails.balance[num]);  
        } else {  
            System.out.println("INSUFFICIENT BALANCE \tTransaction failed...!!" );
            System.out.println(balance);
        }  
}
	 public void deposit() {  
	        long amt;  
	        System.out.println("Enter the amount you want to deposit: ");  
	        amt = sc.nextLong();  
	        balance = balance + amt;
	        System.out.println("bal before: "+balance);
            bankdetails.balance[num]+=balance;
            System.out.println("Balance after depoist: " + bankdetails.balance[num]);
	        System.out.println("AMOUNT DEPOSITED "); 
	        System.out.println("CURRENT BALANCE : " + balance); 
	    }  
	 public void Transaction()	{
		 System.out.println("Press D/d for Deposit /n Press W/w for Withdraw /n ");
		 
		 char ch;
		 ch=sc.next().charAt(0);
		 if(ch=='D' || ch=='d')
		 {
		 deposit();
		 }
		 else if(ch=='W' || ch=='w')	{
			 withdrawal();
		 }
		 else
		 {
			 System.out.println("Wrong please press the key correctly ");
		 	Transaction();
		 }
	 }
}
