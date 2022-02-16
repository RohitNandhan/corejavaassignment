package PracticePrograms;

	
	class Cal{
		//overriding
		public void display() {
			System.out.println("Calculation");
		}
		
		public void display2() {
			System.out.println("Calculation");
		}
	}

	class Add extends Cal{
		//overriding
		public void display() {
			super.display();
			//Add a=new Add();
			//overloading
			//a.display2();
			System.out.println("The operation going to do is addition");
		}
		//overloading
		public void add(int a,int b) {
			System.out.println((a+b));
		}
		public void add(int a,int b,int c) {
			System.out.println((a+b+c));
		}
	}

	public class PolymorphismExample {
		public static void main(String [] args) {
			//up_casting
			Cal c=new Add();
			c.display();
			Add a=new Add();
			//overloading
			//a.display2();
			a.add(1,4);
			a.add(1,3,4);
		}
	
}
