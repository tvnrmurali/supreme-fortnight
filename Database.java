package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import Validation.FoodAdminValidation;

public class Database {
	
	public void dbConnection()throws Exception
	{	
			FoodAdminValidation fadminval = new FoodAdminValidation();
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@10.219.34.3:1521:orcl","trg724","training724");
			
			PreparedStatement ps = con.prepareStatement("insert into jdbedemo values(?,?,?)");
			ps.setString(1,fId);
			ps.setInt(2,fPrice);
			ps.setInt(3,fQuantity);
			ps.executeUpdate();

			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from jdbedemo");
			while(rs.next())
			{
				System.out.println(rs.getString(1));
				System.out.println(rs.getInt(2));
				System.out.println(rs.getInt(3));
			}
			rs.close();
			con.close();

	}
}
