package simple_programs;
import java.util.Scanner;

@SuppressWarnings("serial")
class CountryNotValidException extends Exception {
	public CountryNotValidException(String message) {
		super(message);
	}
}
@SuppressWarnings("serial")
class EmployeeNameInvalidException extends Exception {
	public EmployeeNameInvalidException(String message) {
		super(message);
	}
}
@SuppressWarnings("serial")
class TaxNotEligibleException extends Exception {
	public TaxNotEligibleException(String message) {
		super(message);
	}
}
class TaxCalculator {
	private String empName;
	private long empSal;
	private double taxAmount;
	private boolean isIndian;
	
	public boolean isIndian() {
		return isIndian;
	}
	public void setIndian(boolean isIndian) {
		this.isIndian = isIndian;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public long getEmpSal() {
		return empSal;
	}
	public void setEmpSal(long empSal) {
		this.empSal = empSal;
	}
	
	public double calculateTax(){
		try{
			if(this.empName.isEmpty()) {
				throw new EmployeeNameInvalidException("The employee name cannot be empty");
			}
		}catch(EmployeeNameInvalidException e) {
			System.out.println(e.getMessage());
		}
		try {
			if(!(this.isIndian)) {
				throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax.");
			}
		}catch(CountryNotValidException e) {
			System.out.println(e.getMessage());
		}
		try {
			if(this.empSal>100000) {
				taxAmount=(this.empSal*8)/100;
			}else if(this.empSal>50000 && this.empSal<=100000) {
				taxAmount=(this.empSal*6)/100;
			}else if(this.empSal>30000 && this.empSal<=50000) {
				taxAmount=(this.empSal*5)/100;
			}else if(this.empSal>10000 && this.empSal<=30000) {
				taxAmount=(this.empSal*4)/100;
			}else {
				throw new TaxNotEligibleException("The employee does not need to pay tax");
			}
		}catch(TaxNotEligibleException e) {
			System.out.println(e.getMessage());
		}
		return taxAmount;
	}
}
public class TaxCalculatorSimulator {
	public static void main(String[] args) {
		long sal;
		String name,cn;
		double taxAmount;
		Scanner sc=new Scanner(System.in);
		
		TaxCalculator tc=new TaxCalculator();
		
		System.out.println("Enter the name: ");
		name=sc.nextLine();
		System.out.println("Enter your country name: ");
		cn=sc.nextLine();
		System.out.println("Enter the salary amount: ");
		sal=sc.nextLong();
		
		if(cn.equalsIgnoreCase("India")) {
			tc.setIndian(true);
		}else {
			tc.setIndian(false);
		}
		tc.setEmpName(name);
		tc.setEmpSal(sal);
		
		taxAmount=tc.calculateTax();
		
		if(tc.isIndian() && !(tc.getEmpName().isEmpty())) {
			System.out.println("Name: "+tc.getEmpName());
			System.out.println("Country: India\nSalary: "+tc.getEmpSal());
			System.out.println("Tax amount: "+taxAmount);
		}
		
		sc.close();
	}
}