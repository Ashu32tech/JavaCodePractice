package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PrepariedStatementTest {
	public static void main(String args[]){
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
		PreparedStatement psmt=con.prepareStatement("update EMPLOYEE_JDBC_TEST set NAME=? where  id=?");
		psmt.setString(1, "ASHU");
		psmt.setInt(2,8);
		psmt.executeQuery();
	/*	for(int i=0;i<=15;i++){
		psmt.setInt(1, 8);
		psmt.setString(2, "A1"+i);
		psmt.addBatch();
		}		
	psmt.executeBatch();*/
	con.close();
	psmt.close();
	
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
	psmt=con.prepareStatement("select * from  EMPLOYEE_JDBC_TEST where id=?");
	psmt.setInt(1, 8);
	ResultSet rs = psmt.executeQuery();
         while (rs.next()) {
               System.out.print(rs.getInt(1)+" ");
               System.out.println(rs.getString(2));
         }
	
		
		/*	 stmt.addBatch("INSERT into EMPLOYEE_JDBC_TEST (ID, NAME) values (3, 'ankit2') ");
		 stmt.addBatch("INSERT into EMPLOYEE_JDBC_TEST (ID, NAME) values (4, 'ankit3') ");
		 stmt.addBatch("INSERT into EMPLOYEE_JDBC_TEST (ID, NAME) values (5, 'ankit4') ");
		 
		stmt.executeBatch();*/
		
		
		
		
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
