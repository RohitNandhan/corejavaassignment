package Bank_Project;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Bank_Table")
public class Bank_Account {
	@Id
	@Column(name = "Account_Number")
	private int accNumber;
	@Column (name = "Account_Holder")
	private String accName;
	protected long Balance;
	public Bank_Account() {
		super();
	}
	public Bank_Account(String accName, int accNumber, long balance) {
		super();
		this.accName = accName;
		this.accNumber = accNumber;
		Balance = balance;
	}
	
	//getter and setter
	public int getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
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

	

}
