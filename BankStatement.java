package myprograms;

import java.util.Scanner;

public class BankStatement {

		
		// TODO Auto-generated method stub
		int accNumber,withdraw;
		Bank sbi=new Bank();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account Number : ");
		accNumber=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter WithDraw Amount : ");
		withdraw=sc.nextInt();
		//sc.nextLine();
		sbi.setAccNumber(accNumber);
		sbi.setwithdraw(withdraw);
		sbi.withdrawAmount();
		System.out.println("Get Method "+sbi.getaccNum());
		System.out.println("Get Method "+sbi.getwithdraw());
		sc.close();
	}

}

class Bank{
	private int accBalance=10000;
	private int accNumber;
	private int  withdraw;	

	
	public int getaccNum()
	{
		return accNumber;
	}
	
	public int getwithdraw()
	{
		return withdraw;
	}
	
	
	public void setAccNumber(int accNumber) {
		// TODO Auto-generated method stub
		this.accNumber=accNumber;
		
	}

	public void setwithdraw(int withdraw) {
		// TODO Auto-generated method stub
		this.withdraw=withdraw;
	}

	public void withdrawAmount() {
		// TODO Auto-generated method stub
		if(withdraw<=accBalance)
		{
			accBalance-=withdraw;
			System.out.println("The Account Number is : " +accNumber);
			System.out.println("The Account Number is : " +withdraw);
			System.out.println("The Account Number is : " +accBalance);
		}
		else
		{
			System.out.println("Insufficient Balance ");
		}
		
	}
	
}
