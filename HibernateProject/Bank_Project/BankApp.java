package Bank_Project;

import java.util.List;
import java.util.Scanner;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class BankApp {
	
	static Scanner sc=new Scanner(System.in);
	static SessionFactory factory=new Configuration().configure().buildSessionFactory();
	static Session session=factory.openSession();
	static Bank_Service bt=new Bank_Service();
	static GetInputMatching in=new GetInputMatching();
		
		public static Bank_Account checkExistingAccount() {
			System.out.println("--------ENTER THE ACCOUNT DETAILS:--------\n\n");
			System.out.println("Enter Account Number : ");
			bt.setAccNumber(in.nextInt());
			Bank_Account b=session.get(Bank_Account.class, bt.getAccNumber());
			try {
				if(b!=null) {
					throw new AccountExistException("Account number already exist!");
				}
			}catch(AccountExistException e) {
				System.err.println(e.getMessage());
			}
			return b;
		}
		
		public static Bank_Account checkAccount() {
			System.out.println("Enter Account Number : ");
			int accno=in.nextInt();
			Bank_Account bd=session.find(Bank_Account.class,accno);
			try {
				if (bd==null)
					throw new AccountNotFoundException("Account Number Not Found!");
			}catch (Exception e) {
				System.err.println(e.getMessage());
			}return bd;
		}
			
			public static void add_Account() {
				Bank_Account ca=checkExistingAccount();
				if(ca==null) 
	    		{
	    			bt.CreateAccount();
	    			//in.nextLine();
	    			Transaction tx=session.beginTransaction();
	    			session.save(new Bank_Account(bt.getName(), bt.getAccNumber(), bt.getBalance()));
	    			tx.commit();
	    			System.out.println("Your Account has been created!");
	    		}else
	    		System.out.println("===================================================================="); 
			}
			
			public static void update_Account() {
				Bank_Account update=BankApp3.checkAccount();
				if(update!=null) {
						sc.nextLine();
						System.out.println("Enter Account Holder Name : ");
						update.setName(in.nextLine());
						Transaction tx=session.beginTransaction();
						session.update(update);
						tx.commit();
						System.out.println("---------Account has been Updated Successfully-------\n");
					}
				System.out.println("=========================================================");		
				}
			
			public static void delete_Account() {
				Bank_Account delete=BankApp3.checkAccount();
				if(delete!=null) {
					//deleteAccount(delete);
					Transaction tx=session.beginTransaction();
					deleteFKT(delete);
					session.delete(delete);
					tx.commit();
					System.out.println("---------Account has been Deleted Successfully-------\n");
				}System.out.println("=========================================================");		
				}
			public static void deleteFKT(Bank_Account fkt) {
				Query q=session.createQuery("delete from BankHistory where bank_Account_Number=:y");
				q.setParameter("y",fkt.getAccNumber());
				q.executeUpdate();
			}
			
			public static void createTransactionHistory() {
				Bank_Account histroy=checkAccount();
				if(histroy!=null) {
					Query q=session.createQuery("from BankHistory where bank_Account_Number=:y");
					q.setParameter("y",histroy.getAccNumber());
					System.out.println("Account Holder: "+histroy.getName());
					System.out.println("--------------------------------------------------------------------");
					@SuppressWarnings("unchecked")
					List<BankHistory> list=q.getResultList();
					System.out.println("Total Transactions : "+list.size());
					System.out.println("--------------------------------------------------------------------");
					System.out.println("--------------------------------------------------------------------");
					if(list.size()>0) {
					for(BankHistory t:list) {
						System.out.println(t.display());
						System.out.println("--------------------------------------------------------------------");
						
					} }
					else {
						System.err.println("No Transaction!!!");
					}
				}
			}
}

		
		
