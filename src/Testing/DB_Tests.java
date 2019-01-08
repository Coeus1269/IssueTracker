package Testing;

import MySQLConn.DBconnectMySQL;

public class DB_Tests {

	public static void main(String[] args) 
	{
		// testing configuration
			String DB_str = "SchemaTest";	// The database you want to connect to
			String User_str = "dbread";		// The user login name
			String PWD_str = "zxcv";		// the password
			
		try
			{
			DBconnectMySQL MySQLDBCONN = new DBconnectMySQL(DB_str, User_str, PWD_str);
			MySQLDBCONN.TableToConsole("select * from MeasureUnits limit 5");	
			
		
			MySQLDBCONN.CloseConnection();

			}
		catch(Exception e)
			{ System.out.println(e.toString());} 

	}

}
