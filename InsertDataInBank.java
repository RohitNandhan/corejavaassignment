package jdbc;

	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.util.Scanner;
	//import java.sql.Statement;

	public class InsertDataInBank {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			try {
				Connection con=ConnectionDb.connectDb();

				//Statement stmt=con.createStatement();
				String sql="insert into bank values(?,?,?);";

				PreparedStatement ps=con.prepareStatement(sql);

				System.out.println("Enter account number: ");
				String accno=sc.nextLine();
				ps.setString(1,accno);

				System.out.println("Enter your name: ");
				String name=sc.nextLine();
				ps.setString(2,name);

				System.out.println("Enter balance: ");
				long balance=sc.nextLong();
				ps.setLong(3, balance);
				sc.nextLine();

				int row=ps.executeUpdate();
				if(row!=0)
					System.out.println(row+" row inserted");
				else
					System.out.println("no row inserted");

				con.close();
			}catch(Exception e) {
				System.out.println(e);
			}
			sc.close();
		}
	}

