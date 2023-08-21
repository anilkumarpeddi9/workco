package jdbc;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Third {
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id");
		int stdid=sc.nextInt();
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1234");
		Statement stmt=con.createStatement();
		String Query="delete from student1234 where stdid"+stdid;
		int a=stmt.executeUpdate(Query);
		if(a==1)
		{
			System.out.println("already record got deleted"+a);
		}
		else
		{
			System.out.println("no record got inserted"+a);
		}
		con.close();
	}
}
