package jdbc;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class fourth {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1234");
		Statement stmt=con.createStatement();
		String query="insert into UserDetaill(?,?,?,?,?,?,?)";
		PreparedStatement prepare=con.prepareStatement(query);
		
		while(true)
		{
			System.out.println("menu :");
			System.out.println("1,Register");
			System.out.println("2,login");
			System.out.println("3,view profile");
			System.out.println("4,edit profile");
			System.out.println("5,view user");
			System.out.println("6,delete user");
			System.out.println("7,exit");
			System.out.println("enter your choice");
			Scanner sc=new Scanner(System.in);
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("please register here");
				System.out.println("enter the name");
				String name=sc.next();
				prepare.setString(1,name);
				System.out.println("enter the password");
				int password=sc.nextInt();
				prepare.setInt(2,password);
				System.out.println("enter the first name");
				String firstname=sc.next();
				prepare.setString(3,firstname);
				System.out.println("enter the last name");
				String lastname=sc.next();
				prepare.setString(4,lastname);
				System.out.println("enter the city");
				String city=sc.next();
				prepare.setString(5,city);
				System.out.println("enter the mailid");
				String mailid=sc.next();
				prepare.setString(6,mailid);
				System.out.println("enter the phone number");
				int phno=sc.nextInt();
				prepare.setInt(7,phno);
				System.out.println("your registration is successfully done");
			case 2:
				System.out.println("enter the password");
				password=sc.nextInt();
				
				
			}


		}
	}
}
