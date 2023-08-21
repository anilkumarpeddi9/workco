package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1234");
		Statement stmt=con.createStatement();
		String Query="create table UserDetaill(name char(10),password char(10),firstname char(10),lastname char(10),city char(10),mailid char(10),phoneno number(10))";
		stmt.execute(Query);
		con.close();
	}

}
