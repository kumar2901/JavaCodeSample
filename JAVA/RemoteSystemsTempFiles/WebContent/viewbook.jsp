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
String id = request.getParameter("id");
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
<td><b>Book Id</b></td>
<td><b>Department</b></td>
<td><b>Book Title</b></td>

<td><b>Author</b></td>
<td><b>Plisher</b></td>
<td><b>Edition</b></td>
<td><b>cost</b></td>
</tr>
<%
try{ 
connection = DriverManager.getConnection(url, user, pass);
statement=connection.createStatement();
String sql ="SELECT * FROM library";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr bgcolor="#DEB887">

<td><%=resultSet.getString("id") %></td>
<td><%=resultSet.getString("department") %></td>
<td><%=resultSet.getString("title") %></td>
<td><%=resultSet.getString("author") %></td>
<td><%=resultSet.getString("publisher") %></td>
<td><%=resultSet.getString("edition") %></td>
<td><%=resultSet.getString("cost") %></td>

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
