package simple_programs;


import java.text.DecimalFormat;
import java.util.Scanner;



@SuppressWarnings("serial")											//Exception Overridding
class InvalidInputException extends Exception{
	public InvalidInputException(String message) {
		 
		super(message);
	} } 

@SuppressWarnings("serial")											//Exception Overridding
class NoAccountException extends Exception{
	 public NoAccountException(String message) {
		super(message);
	}
}

public class Account implements Runnable{										//Initialization
	static Account obj[]=new Account[10];						//array objets
	private String accName;
	private int accNumber;
	private long Balance;
	private int pin;
	static int num=0;
	
	static Scanner sc=new Scanner(System.in);
	DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
																		//getter and setter
	public String getName() {
		return accName;
	}

	public void setName(String name) {
		accName = name;
	}

	public long getBalance() {
		return Balance;
	}

	public void setBalance(long balance) {
		Balance = balance;
	}

	public int getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin =pin ;
	}
	public void SetAccount()													//Account Creation
	{
		System.out.println("------ENTER THE ACCOUNT DETAILS:--------\n\n");
		System.out.println("ENTER ACCOUNT Number :");
		setAccNumber(sc.nextInt());
		System.out.println("ENTER ACCOUNT Name :");
		setName(sc.next());
		System.out.println("SET PIN :");
		setPin(sc.nextInt());
		
		System.out.println("------ ACCOUNT CREATED SUCCESSFULLY -------- ");
		
	}
	
		public void displayAccount()												//Account Display
		{
			System.out.println("Displaying Account..........");
					
			System.out.println("Account holder : " +accName);
			System.out.println("Account Number : " +accNumber);
			System.out.println("Current Account Balance :"+moneyFormat.format(Balance) );
		}
		
		public void getWithdrawal() {														//invoking Withdrawal
			//System.out.println("Current account Balance"+moneyFormat.format(Balance));
			System.out.println("Enter The Amount you want to Withdarw from Account : ");
			double amt=sc.nextInt();
			try {
		
			if(Balance>amt)	{
				calcWithdrawal(amt);
				System.out.println("------Withdrawal Successful------\n "
						+ "Current Balance = "+moneyFormat.format(Balance));
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

		public void getDeposit() {																	//invoking Deposit
			//System.out.println("Checking account Balance"+moneyFormat.format(Balance));
			System.out.println("Enter The Amount you want to Deposit to Checking Account : ");
			double amt=sc.nextInt();
			calcDeposit(amt);
				System.out.println("------Deposit Successful------\n "
						+ "Current Balance = "+moneyFormat.format(Balance));
		}
		public double calcWithdrawal(double amt)
		{
			Balance-=amt;
			return Balance;
		}

		public double calcDeposit(double amt)
		{
			Balance+=amt;
			return Balance;
		}
		
		void getMenu(){															//sub Menu Structure
		    	char yes;
		    	do {
		    	System.out.println("------Welcome to Accounting------\n"
						+ "\n1.Display Account"
						+ "\n2.Withdraw "
						+ "\n3.Deposit"
						+ "\n4.Exit");
				System.out.println("Enter your Choice :");
				int selection;
				selection=sc.nextInt();
				
		  	switch(selection) {
			case 1:
			    displayAccount();
				break;
		 	case 2:
				getWithdrawal();
				break;
			case 3:
				getDeposit();
				break;
			case 4:
				Accounting();
				break;	
			default:
				//throw new IllegalArgumentException("Unexpected value: " + selection);
				System.err.println("Invalid Choice\n");
				getAccNumber();
				break;
		  	}
		  	System.out.println("/n-> to continue press y, Y");
		  	yes=sc.next().charAt(0);
		  	}while(yes=='y'|| yes=='Y');
		    	return;
		    }
		    public static void accountAccess()						// Searching Accounts
				    {
		    	System.out.println("Enter Customer Number :");
				int tnum=sc.nextInt();
				System.out.println("Enter your PIN : ");
				int tpin=sc.nextInt();	
		    	try {
		    		for(Account o : obj) {
            			 {
							if(tnum == o.getAccNumber() && tpin==o.getPin()) {
									o.getMenu(); }						
							}	}	throw new InvalidInputException("Account Number or PIN is Invalid");
							}catch (InvalidInputException e) {
								 System.err.println(e.getMessage()); 
								}
		    		}
								
						
		    public static void addAccouct()
			{
				obj[num]=new Account();
				obj[num].SetAccount();
				num++;
				System.out.println();
			}
		    public static void Accounting() {							//		Main menu Structure
		   
			int ch ;
			
			
			while(true)
	        {
				System.out.println("Selcet Your Query :\n");
	        	System.out.println("->>1. Create New Account \n->>2. Access Account \n->>3. Exit ");  
	            System.out.println("Enter your choice: "); 
	        ch =sc.nextInt();
	       
	            switch (ch) {
	            
	                case 1:  
	                	addAccouct();
	                	//obj[num]=new Account();
	                	//obj[num].SetAccount();
	                //	num++;
	                    break;  
	                case 2:  
	                	try {
	                   		if (obj != null) {
	                   			accountAccess();
							}
	                   		throw new Exception("NULL");
	                	} 
	                	catch(Exception e)
	                	{
	                		System.err.println("// No DATA FOUND //");
	                		System.out.println("Please! Create Account " + " \n ###############");
	                		System.out.println("\n Creating new Account......");
	                		addAccouct();
	                	}
	                	break;
	                case 3:  
		                	
		                	System.out.println("\n------Thank You!!!-----"
		                			+ "\n-------Visit again --------");
		               return;

	                default:
	                	System.err.println("Invalid Choice\n");
	    				break;
	 	         }
	              	}
	         } 

		    @Override
			public void run() {										//Thread Running
				// TODO Auto-generated method stub
				System.out.println("\n ->>> Thread Running.....\n");
				Accounting();
			}

		   public static void main(String[] args) {
		// TODO Auto-generated method stub
			   System.out.println("\nWelcome To Accounting\n ");
			   
			   System.out.println("we are please to service...... ");
			 
			    Account A=new Account();
			   Thread th=new Thread(A);								//reference class account obj with thread
			   th.start();
			 										// Invokes the overall fuction
      	}}
		    
		
				
	


