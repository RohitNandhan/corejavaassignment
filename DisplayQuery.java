package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


	public class DisplayQuery {
		public static void main(String[] args) {
			try {
				Connection con=ConnectionDb.connectDb();
				
				String sql="select * from bank;";
				
				PreparedStatement ps=con.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
				
				System.out.println("==========================================");
				while(rs.next()) {
					System.out.println("Account number: "+ rs.getString(1) +"\nAccount holder name: "+ rs.getString(2) +"\nAccount balance: "+ rs.getLong(3));
				    System.out.println("==========================================");
				}
				
				con.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
