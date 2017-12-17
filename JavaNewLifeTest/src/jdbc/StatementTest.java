package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementTest {

	public static void main(String args[]){
		Connection con;
		Statement stmt;
		ResultSet rs;
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
		 stmt=con.createStatement();
		 con.setAutoCommit(false);
		 
	/*	 stmt.addBatch("INSERT into EMPLOYEE_JDBC_TEST (ID, NAME) values (3, 'ankit2') ");
		 stmt.addBatch("INSERT into EMPLOYEE_JDBC_TEST (ID, NAME) values (4, 'ankit3') ");
		 stmt.addBatch("INSERT into EMPLOYEE_JDBC_TEST (ID, NAME) values (5, 'ankit4') ");
		 
		stmt.executeBatch();*/
		 
		boolean i= stmt.execute("delete from EMPLOYEE_JDBC_TEST where NAME='ankit4'");
		 System.out.println(i);
		con.commit();
		 
	/*	stmt.executeUpdate("create table EMPLOYEE_JDBC_TEST("
                + "ID number(4), NAME varchar2(22))");*/
		/*stmt.executeQuery("INSERT into EMPLOYEE_JDBC_TEST (ID, NAME) values (1, 'ankit') ");*/
		 /*rs=stmt.executeQuery("Select ID id,NAME  name from EMPLOYEE_JDBC_TEST");
		while(rs.next()){
			System.out.println(rs.getInt("id"));
			System.out.println(rs.getString("name"));	
		}*/
		System.out.println("EMPLOYEE Table created");
		stmt.close();
		con.close();
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
}
