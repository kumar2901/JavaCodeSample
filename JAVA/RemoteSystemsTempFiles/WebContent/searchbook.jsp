<%@ page import="java.util.*" %> 

<html>
<head>
<link href="a.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="one.css" />
</head>
<body>
<div id='stars'></div>
<div id='stars2'></div>
<div id='stars3'></div>

<table align="center" cellpadding="5" cellspacing="5" width="1359">
<tr>
<td colspan=8 align="center" 
style="background-color:ffeeff">
<b>Employee Record</b></td>
</tr>
<tr style="background-color:efefef;">
<td><b>Book Id</b></td>
<td><b>Department</b></td>
<td><b>Book Title</b></td>
<td><b>Author</b></td>
<td><b>Publisher</b></td>
<td><b>Edition</b></td>
<td><b>Cost</b></td>


</tr>
<%
int count=0;
String color = "#F9EBB3";


if(request.getAttribute("empList")!=null)
{
ArrayList al = (ArrayList)request.getAttribute("empList");
Iterator itr = al.iterator();


while(itr.hasNext()){

if((count%2)==0){ 
color = "#eeffee"; 
}
else{
color = "#F9EBB3";
}
count++;
ArrayList empList = (ArrayList)itr.next();
%>
<tr style="background-color:<%=color%>;">
<td><%=empList.get(0)%></td>
<td><%=empList.get(6)%></td>
<td><%=empList.get(1)%></td>
<td><%=empList.get(2)%></td>
<td><%=empList.get(3)%></td>
<td><%=empList.get(4)%></td>
<td><%=empList.get(5)%></td>

</tr>
<%
}
}
%> 
<%
if(count==0){
%>
<tr>
<td colspan=8 align="center" 
style="background-color:eeffee"><b>No Record</b></td>
</tr>
<%
}
%>
</table>
</body>
</html>