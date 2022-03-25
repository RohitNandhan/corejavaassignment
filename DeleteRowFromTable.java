package jdbc;
	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.util.Scanner;
	//import java.sql.Statement;

	public class DeleteRowFromTable {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			try {
				Connection con=ConnectionDb.connectDb();
				
				//Statement stmt=con.createStatement();
				
				String sql="delete from bank where accno=?;";
				
				PreparedStatement ps=con.prepareStatement(sql);
				
				System.out.println("Enter account number: ");
				String accno=sc.nextLine();
				ps.setString(1,accno);
				
				
				int row =ps.executeUpdate();
				if(row!=0)
					System.out.println(row+" row deleted");
				else
					System.out.println("no row deleted");
				
				con.close();
			}catch(Exception e) {
				System.out.println(e);
			}
			sc.close();
		}
	}

