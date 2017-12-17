package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.OracleTypes;

import java.sql.CallableStatement;


public class CallableStatementTest {
	public static void main(String args[]){
		CallableStatement cast=null;
		Connection con=null;
		ResultSet rs=null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
		/*	 cast=con.prepareCall("{call insertEmployee(?,?,?,?,?,?)}");*/
		/*	cast.setInt(1, 1);
			cast.setString(2, "Pankaj");
			cast.setString(3, "Developer");
			cast.setString(4, "Bangalore");
			cast.setString(5, "India");*/
	             
			
			/*cast.setInt(1, 3);
			cast.setString(2, "PankajK");
			cast.setString(3, "Developer");
			cast.setString(4, "Bangalore");
			cast.setString(5, "India");
			
			
	            //register the OUT parameter before calling the stored procedure
			cast.registerOutParameter(6, java.sql.Types.VARCHAR);
	             
			cast.executeUpdate();
			//read the OUT parameter now
            String result = cast.getString(6);
             
            System.out.println("Employee Record Save Success::"+result);*/
			
			cast=con.prepareCall("{call getEmployeeByRole(?,?)}");
			cast.setString(1,"Developer");
			cast.registerOutParameter(2, OracleTypes.CURSOR);
			
			cast.execute();
			
			rs=(ResultSet)cast.getObject(2);
			
		    while(rs.next()){
                System.out.println("Employee ID="+rs.getInt("empId")+",Name="+rs.getString("name")+
                        ",Role="+" Developer "+",City="+rs.getString("city")+
                        ",Country="+rs.getString("country"));
                }
			
			
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try {
                cast.close();
                con.close();
      
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}