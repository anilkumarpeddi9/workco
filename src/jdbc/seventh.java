package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
public class seventh {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		oracleConnectionpoolDataSource ds=new oracleConnectionpoolDataSource();
		
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe","system","1234");
		ds.setUser("system");
		ds.setPassword("1234");
		Connection con=ds.getConnection();
		Statement stmt=con.createStatement();
		String sqlquery="create table walker(wid number(10),wname char(10))";
		stmt.execute(sqlquery);
		con.close();

	}

}
