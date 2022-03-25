package jdbc;


	import java.sql.Connection;
	import java.sql.Statement;
	public class CreateTablebank {
		public static void main(String[] args) {
			try {
				Connection con=ConnectionDb.connectDb();

				//create statement
				Statement stmt=con.createStatement();

				//create query
				String sql="create table bank(accno varchar(20) primary key,name varchar(20),balance long);";

				//execute query
				stmt.executeUpdate(sql);
				System.out.println("table created");

				//closing database
				con.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}

