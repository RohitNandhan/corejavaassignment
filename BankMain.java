package bank;

import java.util.Scanner;

public class BankMain
{
	static Scanner sc=new Scanner(System.in);
	static BankDetails bankdetails=new BankDetails();
	//static BankTransactions bt=new BankTransactions();
	public static void main (String []args)
	{
		System.out.println("\n ***Banking System Application***");  
      //  System.out.println("1. CreateAccount \n 2. Display\n 3. Deposit Amount \n 4. Withdraw the amount \n 5.Exit ");  
      //  System.out.println("Enter your choice: "); 
        int ch = 0;
        while(ch!=5)
        {
        	System.out.println("1. Create New Account \n 2. Access Account");  
            System.out.println("Enter your choice: "); 
        ch =sc.nextInt(); 
            switch (ch) {
            
                case 1:  
                	bankdetails.addAccouct();  
                    break;  
                case 2:  
                	System.out.println("Enter your Account Number:  "); 
                    String accnum =sc.next(); 
                	int i=(int) bankdetails.accountAccess(accnum) ;
                	System.out.println("i"+i); 
                	BankTransactions bt=new BankTransactions(i);
                	bt.Transaction();
                    break; 
            }
        }
	}
}
