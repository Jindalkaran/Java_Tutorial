package Except;
import java.sql.*;

class TestConnection
{
	Connection cn=null;
	public Connection getConn()
	{
		
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch(ClassNotFoundException ce)
		{
		ce.printStackTrace();
		}
		return cn;
	}
}


public class CheckedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestConnection t=new TestConnection();
		t.getConn();

	}

}
