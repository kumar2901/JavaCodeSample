<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<html>
<head>
<link href="a.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="one.css" />
<style type="text/css">
table
{
  margin-top:-21px;
    margin-left:-5px
}



</style>
</head>
<body>
<div id='stars'></div>
<div id='stars2'></div>
<div id='stars3'></div>
<%
String id = request.getParameter("username");
String url="jdbc:mysql://localhost:3306/minorproject";
String user="root";
String pass="abhishek708";

try {
Class.forName("com.mysql.jdbc.Driver");
} catch (ClassNotFoundException e) {
e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<table align="center" cellpadding="5" cellspacing="5" width="1359">
<tr>

</tr>
<tr bgcolor="#A52A2A">
<td><b>First name</b></td>
<td><b>Last name</b></td>
<td><b>Email</b></td>
<td><b>City</b></td>
<td><b>username</b></td>
<td><b>sex</b></td>
<td><b>Mobile number</b></td>
<td><b>Confirmation</b></td>
<td><b>Department</b></td>
</tr>
<%
try{ 
connection = DriverManager.getConnection(url, user, pass);
statement=connection.createStatement();
String sql ="SELECT * FROM studentregister where confirmation like 'n%' ";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr bgcolor="#DEB887">

<td><%=resultSet.getString("firstname") %></td>
<td><%=resultSet.getString("lastname") %></td>
<td><%=resultSet.getString("email") %></td>
<td><%=resultSet.getString("city") %></td>
<td><%=resultSet.getString("username") %></td>
<td><%=resultSet.getString("sex") %></td>
<td><%=resultSet.getString("mobilenumber") %></td>
<td><%=resultSet.getString("confirmation") %></td>
<td><%=resultSet.getString("department") %></td>

</tr>

<% 
}

} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
</body>
</html>
