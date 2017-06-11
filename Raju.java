import java.util.*;
import java.sql.*;
import java.sun.jdbc.odbc.*;


class JdbcDriverTest 
{
	public static void main(String[] args) 
	{
		Driver d= new JdbcOdbcDriver();
		DriverManager.registerDriver(d);
		
	
			Enumeration e=DriverManager.getDrivers() ;
		while(e.hasMoreElements())
		{
			Driver d= (Driver)e.nextElement();
			System.out.println(d.getClass().getName());

		}
			
	
		
		
	}
}
