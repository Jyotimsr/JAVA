import java.sql.*;
package java;


public class crud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
		System.out.println("Connected: "+conn);

		
		
	}

}
