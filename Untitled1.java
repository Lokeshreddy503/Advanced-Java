import java.util.*;
import java.sql.*;
import java.sun.*;


class JdbcDriverTest 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Enumeration e=DriverManager.getDrivers() ;
		while(e.hasMoreElements())
		{
			Driver d= (Driver)e.nextElement();
			System.out.println(d);

		}
	}
}
