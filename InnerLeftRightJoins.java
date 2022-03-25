package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InnerLeftRightJoins {
	public static void main(String[] args) {
		Connection con=ConnectionDb.connectDb();
		try {
			
			String sql="select sdetail.id,sdetail.sname,laptop.model from sdetail inner join laptop on sdetail.id=laptop.eid;";
			
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			System.out.println("==========================================");
			while(rs.next()) {
				System.out.println("Id: "+ rs.getString(1) +"\nName: "+ rs.getString(2) +"\nModel: "+ rs.getString(3));
			    System.out.println("==========================================");
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		finally{
			try {
				con.close();
			}catch(Exception e) {
				
			}
		}
	}
}