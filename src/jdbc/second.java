package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class second 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1234");
		Statement stmt=con.createStatement();
		String Query="insert into student1234 values(111,'suresh','sklm',9898,'civil','a')";
		stmt.execute(Query);
		con.close();
	}

}
