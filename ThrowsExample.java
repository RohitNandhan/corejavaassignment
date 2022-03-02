package exceptionHandling;

class Vaccine
{	
public  static void ageValidation(int age)
{
	try {

if(age<18)
{
	throw new CovidVaccinationException("Age is not valid for covid vaccine");
}
else
{
	System.out.println("Age is valid for covid vaccine");
}
}catch (ArithmeticException | CovidVaccinationException e) {
	System.out.println(e.getMessage());
}
}
}




public class ThrowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vaccine.ageValidation(23);
		//ageValidation(13);

	}

}

