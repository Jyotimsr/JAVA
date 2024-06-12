

import java.sql.*;

public class connect {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
//		----------------------Making Connection---------------//
		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
//		System.out.println("Connected: "+conn);
		
		//--------------------show databases ----------//
		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
//		System.out.println("Connected: "+conn);
//		Statement st = conn.createStatement();
//		ResultSet rs = st.executeQuery("show databases");
//		System.out.println("databases are: "+ rs);
//		
//		while(rs.next()) {
//		System.out.println(rs.getString(1));
//		}
		
//----------------------------createdatabase-----------------------//
//		(Class.forName("com.mysql.cj.jdbc.Driver");
//	    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
//	    Statement st = conn.createStatement();
//	    st.executeUpdate("create database msr");
//	    System.out.println("Connected: "+conn);
//	    System.out.println("databases created");
//		
//	-----------------------creatingtable----------------------------//
//		Connection conn = DriverManager.getConnection("jdbc:mysql//localhost/msr","root","");
//		String sql = "create table mishra(id int,name varchar(30),age int)";
//		 Statement st = conn.createStatement();
//		 st.executeUpdate(sql);
//		 System.out.println("table created");
//		 
	}

}
