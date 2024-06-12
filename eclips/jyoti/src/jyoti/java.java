import java.sql.*;
package jyoti;

public class java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManger.getConnection("jdbc:mysql://localhost:3306","root","");
		System.out.println("Connected: "+conn);

	}

}
