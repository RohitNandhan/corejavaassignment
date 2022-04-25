package Bank_Project;

public class BankApp3 extends BankApp2 {
	public static void main( String[] args )
    {
		int choice;
		do {	
		System.out.println("====================================================================");
		System.out.println("-----------BANKING APPLICATION------------");
		System.out.println(" Press 1. Add account\n Press 2. Account Access "
				+ "\n Press 3. Update Account  \n Press 4. Delete Account "
				+ "\n Press 5. Transaction History \n Press 6. Exit");
		System.out.println("====================================================================");
		System.out.println("Enter your choice!");
		choice=in.nextInt();
		
		System.out.println("====================================================================");
		switch(choice) 
		{
		case 1:
			add_Account();
			break;
		case 2: 
			access_Account();	
			break;
		case 3 :
			update_Account();
			break;	
		case 4 : 
			delete_Account();
			break;
		case 5 :
			createTransactionHistory();
			break;	
		case 6 : 
			System.out.println("====================================================================");
			System.out.println("\n-----------THANK YOU-----------\n----------VISIT AGAIN----------\n");
			System.out.println("====================================================================");
			return;
		
		default :
			System.err.println("Invalid Choice\n");
			break;
		} }while(true);
		}
}

