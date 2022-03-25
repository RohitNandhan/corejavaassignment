package jdbc;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;
//import java.sql.Statement;

public class UpdateTableRow {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			Connection con=ConnectionDb.connectDb();

			//Statement stmt=con.createStatement();

			System.out.println("Enter account number to update: ");
			String accno=sc.nextLine();


			String sql="update bank set name=?,balance=? where accno='"+accno+"';";

			PreparedStatement ps=con.prepareStatement(sql);

			System.out.println("Enter your name: ");
			String name=sc.nextLine();
			ps.setString(1,name);

			System.out.println("Enter balance: ");
			long balance=sc.nextLong();
			ps.setLong(2, balance);


			int row =ps.executeUpdate();
			if(row!=0)
				System.out.println(row+" row updated");
			else
				System.out.println("no row updated");

			con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		sc.close();
	}
}