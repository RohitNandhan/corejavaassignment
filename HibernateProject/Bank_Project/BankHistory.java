package Bank_Project;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class BankHistory {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int tid;
		@Temporal(TemporalType.DATE)
		private Date date;
		private String trans;
		@OneToOne
		Bank_Account bank;

		public Bank_Account getBank() {
			return bank;
		}
		public void setBank(Bank_Account bank) {
			this.bank = bank;
		}
		public int getTid() {
			return tid;
		}
		public void setTid(int tid) {
			this.tid = tid;
		}
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
		public String getTrans() {
			return trans;
		}
		public void setTrans(String trans) {
			this.trans = trans;
		}
		public BankHistory() {
			super();
			// TODO Auto-generated constructor stub
		}
		public String display() {
			return "Date: " + date + "\nTransaction: " + trans;
		}
	}

