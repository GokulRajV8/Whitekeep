package connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{ 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","Tethys@123");
			System.out.println("Connection success!!");
			Statement stmt=con.createStatement();
			System.out.println("\nCountries in Asia\n");
			ResultSet rs=stmt.executeQuery("select * from country where continent = 'asia'");  
			while(rs.next())  
				System.out.println(rs.getString(2) + "..................." + rs.getString("surfacearea"));
			System.out.println("\nCountries in Europe\n");
			rs=stmt.executeQuery("select * from country where continent = 'europe'");  
			while(rs.next())  
				System.out.println(rs.getString(2) + "..................." + rs.getString("surfacearea"));
			System.out.println("\nCountries in Africa\n");
			rs=stmt.executeQuery("select * from country where continent = 'africa'");  
			while(rs.next())  
				System.out.println(rs.getString(2) + "..................." + rs.getString("surfacearea"));
			System.out.println("\nCountries in North America\n");
			rs=stmt.executeQuery("select * from country where continent = 'north america'");  
			while(rs.next())  
				System.out.println(rs.getString(2) + "..................." + rs.getString("surfacearea"));
			System.out.println("\nCountries in South America\n");
			rs=stmt.executeQuery("select * from country where continent = 'south america'");
			while(rs.next())  
				System.out.println(rs.getString(2) + "..................." + rs.getString("surfacearea"));
			con.close();
			System.out.println("\nConnection closed!!");
		}catch(Exception e){
			e.printStackTrace();
		}  
	}
}
