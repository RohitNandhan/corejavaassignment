package Bank_Project;

import org.hibernate.Transaction;

public class BankApp2 extends BankApp 
{
	public static void getMenu(Bank_Account bank){
			bt.setAccont(bank,session);
			char yes; 
	    	do {
	    	System.out.println("====================================================================");
	    	System.out.println("------Welcome to Accounting------\n"
					+ "\n1.Display Account"
					+ "\n2.Withdraw "
					+ "\n3.Deposit"
					+ "\n4.Exit");
	    	System.out.println("====================================================================");
			System.out.println("Enter your Choice :");
			int selection;
			selection=in.nextInt();
			
	  	switch(selection) {
		case 1:
				System.out.println("=========================================================");
				System.out.println("--------DISPLAY--------\n");
				display();
				System.out.println("=========================================================");		
				break;
			
	 	case 2:
	 			System.out.println("=========================================================");
	 			System.out.println("--------WITHDRAW--------\n");
	 			withdraw();
	 			System.out.println("=========================================================");		
	 			break;
		case 3:
				System.out.println("=========================================================");
				System.out.println("--------DEPOSIT--------\n");
				deposit();
				System.out.println("=========================================================");		
				break;
		case 4:
				System.out.println("=========================================================");		
				System.out.println("Returning to Previous Menu......\n");
				return;
			
		default:
			System.err.println("Invalid Choice\n");
			break;
	  	}
	  	System.out.println("/n->> to continue press y, Y");
	  	yes=in.next().charAt(0);
	  	}while(yes=='y'|| yes=='Y');
	    	System.out.println("Returning to Previous Menu\n");
			return;
	    }
				
	public static void access_Account() {
		Bank_Account check=BankApp3.checkAccount();
		if(check!=null) {
			try {
				getMenu(check);
			}catch(Exception e) {
				System.err.println(e.getMessage());
			}
			}System.out.println("=========================================================");		
			}
	
		public static void display() {
			try {
				Transaction tx1=session.beginTransaction();
				bt.displayAccount();
				tx1.commit();
			}catch(Exception e) {System.err.println(e.getMessage());}
			}
		
		public static void withdraw() {
		try {
			new Bank_Service();
			bt.getWithdrawal();
			Transaction tx2=session.beginTransaction();
			tx2.commit();
		}catch(Exception e) {
			System.err.println(e.getMessage());	}
		}
		
		public static void deposit(){
			try {
				bt.getDeposit();
				Transaction tx3=session.beginTransaction();
				tx3.commit();
			}catch(Exception e) {
				System.err.println(e.getMessage());
		}
			
	}
}
	  



