module dbTest {
	try {
		Class.forname("com.mysql.jdbc.Driver");
		Connection con=DriverManaget.getConnection("jdbc:mysql://localhost:3306/student","root","");
		
	}
}