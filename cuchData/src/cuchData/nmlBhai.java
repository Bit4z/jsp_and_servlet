package cuchData;
import java.sql.*;
public class nmlBhai {
	 public static void main(String args[])throws Exception{
         System.out.println("creared raw..");
String qry="insert into test(Name,Email,Password)values('anshuman','anshu.khan17@gmail.com',Khan@123)";
try{
  Class.forName("com.mysql.cj.jdbc.Driver");
 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root"," ");
 Statement st=con.createStatement();
 st.execute(qry);
 System.out.println("creared raw..");
}
catch(Exception e)
{
  System.out.println(e.getMessage());
}
finally{
             System.out.println("creared raw..");
}
}


}
