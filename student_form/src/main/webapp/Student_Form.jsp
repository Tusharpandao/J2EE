
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.util.Properties"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! String name,email,address; long mobile;

	private static Connection connection;
	
	private static int result;
	private static Properties properties = new Properties();
	private static FileInputStream file;
	private static String filePath = "D:\\WEJA2\\student_form\\resources\\db_info.properties";
	private static String query="insert into student_registration_form values (?,?,?,?)";
	private static PreparedStatement preparedStatement;

%>
	<%
	
	name = request.getParameter("name");
	email = request.getParameter("email");
	address=request.getParameter("address");
	mobile=Long.parseLong(request.getParameter("mobile"));
	
	
	
	
	try {
		file = new FileInputStream(filePath);
		properties.load(file);
		
		Class.forName(properties.getProperty("driverPath"));
		
		connection = DriverManager.getConnection
				(properties.getProperty("dburl"), properties);
		
		preparedStatement = connection.prepareStatement(query);
		
		
		preparedStatement.setString(1, name);
		preparedStatement.setString(2, email);
		preparedStatement.setString(3,address);
		preparedStatement.setLong(4,mobile);
		
		result = preparedStatement.executeUpdate();
		
		
		
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		try {
			if (connection != null) {
				connection.close();
			}
			if (preparedStatement != null) {
				preparedStatement.close();
			}
			if (file != null) {
				file.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	%>
	<h1>
		Student <%= name %> Registration is done
		</h1>
</body>
</html>
<%@ include file="Student.html" %>

