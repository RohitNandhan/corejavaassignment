package PracticePrograms;

	class Account {
		int accId;
		String accNumber,accType;
		public Account(int accId, String accNumber, String accType) {
			this.accId = accId;
			this.accNumber = accNumber;
			this.accType = accType;
		}
	}

	class User{
		private String name;
		Account acc;
		
		public User(String name, Account acc) {
			this.name = name;
			this.acc = acc;
		
		}
		public void display() {
			System.out.println("Name:"+ name +"\nAccount Id:"+ acc.accId +"\nAccount Number:"+ acc.accNumber +"\nAccount Type:"+ acc.accType +"\n");
		}
	}

	public class AggregationExample {
		public static void main(String [] args) {
			Account a=new Account(101,"A1234","Local");
			Account a1=new Account(102,"B5678","International");
			User u=new User("Rohit P.R",a);
			User u1=new User("Nandhan P.S",a1);
			u.display();
			u1.display();
		}
	}


