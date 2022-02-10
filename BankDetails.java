package bank;

import java.util.Scanner;

public class BankDetails {
		String accno;
		private String name;
		private String acc_type;
		BankDetails B[]=new BankDetails[10];
		 int sl_no=0;
		public long balance[]=new long [10];
		//BankMain main=new BankMain();
		static Scanner sc=new Scanner(System.in);
	//	BankTransactions bt=new BankTransactions(balance);
		
	//	BankDetails c[]=new BankTransactions[]
		
		
		
		public void createAccount(int i)
		{
			sc.nextLine();
			
			System.out.println("Enter Account Holder Name : ");
			name=sc.nextLine();
			System.out.println("Enter Account Number : ");
			accno=sc.next();
			System.out.println("Enter Account Type : ");
			acc_type=sc.next();
			System.out.println("Enter Opening Balance : ");
			System.out.println("sl "+i);
			balance[i]=sc.nextLong();
			//sl_no++;
		//	BankTransactions bt=new BankTransactions();
		//	bt.BankTransactions();
			
			System.out.println("*** THE ACCOUNT WAS SUCCESSFULLY CREATED *** ");
		}
		
		public void displayAccount(int i)
		{
			
			System.out.println("Account holder : " +name);
			System.out.println("Account Number : " +accno);
			System.out.println("Account type : " +acc_type);
			System.out.println("Balance : " +balance[i]);
		}
		
		public long accountAccess(String acc)
		
		{
			for(int i=0; i<=sl_no;i++)
			{
				if (acc.equals(B[i].accno))
				{
				//	System.out.println(" found");
				//	System.out.println(" display");
					B[i].displayAccount(i);
					return i;
				//	break;
				}
				System.out.println(" not found");			
	}
			return 0;	
		}
		public void addAccouct()
		{
			//BankDetails B[]=new BankDetails[10];				
			B[sl_no]=new BankDetails();
			B[sl_no].createAccount(sl_no);
		//	B[sl_no].displayAccount();
			
			sl_no++;
			System.out.println();
		}
		public void display(int num)
		{
			System.out.println(num+ "num value ");
			//BankDetails B[]=new BankDetails[10];				
			B[num].displayAccount(num);
			
			//sl_no++;
		}
			
		}
		
		

