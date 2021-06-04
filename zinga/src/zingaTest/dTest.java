package zingaTest;
import java.sql.*;
public class dTest{
	try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
		Statement st=con.createStatement();
		String f="select *from test";
		ResultSet rs=st.executeQuery(f);
		while(rs.next())
		{
			System.out.println(rs.getString(1)+":"+rs.getString(2)+":"+rs.getString(3));
			
		}
		
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}

}
