package Main;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import Entity.FoodAdmin;

public class JdbcDemo {
	

	

	public static void main(String[] args) {
		

		String fId;
		int fPrice;
		int fQuantity;
		
		
		
			Scanner scanner = new Scanner(System.in);
			System.out.println("please enter the data");
			fId = scanner.next();
			System.out.println("Please enter the price");
			fPrice = scanner.nextInt();
			System.out.println("Enter the Quantity");
			fQuantity = scanner.nextInt();
			
			
			
		try {
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
				
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
