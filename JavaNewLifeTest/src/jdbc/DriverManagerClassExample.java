package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DriverManagerClassExample {
	public static void main(String args[]){
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
		if(con!=null){
			System.out.println("connection succefull");
		}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
