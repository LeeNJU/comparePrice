<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<%@ taglib prefix="s" uri="/struts-tags" %>

<head>
	<meta charset="utf-8">
	<title>��½</title>
</head>

<body>

	<div id="inputPart">						
		<s:form action="getComments" method="POST">
			<div id="titleText">��Ʒ1 blah blah blah</div>
			<s:hidden name="cid" value="3"> </s:hidden>
			<s:submit value="�鿴����" />
			
		</s:form>
			
	</div>

</body>


</html>






	




