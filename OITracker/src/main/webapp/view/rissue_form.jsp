<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Raise Issue's Page</title>
</head>
<body style='margin-left: 30px'>

	<h2 id="heading3">Welcome To Issue Raise Page</h2>

	<form  align="center" action="issueview">

		<table>

			<tr>
				<td><b>IssuedId:</b></td>
				<td><input type="text" name="issueid" value="${Issueid}"
					required="required"></td>
			</tr>

			<tr>
				<td><b>Issued Report Date:</b>Format:yyyy-mm-dd</td>
				<td><input type="text" name="issuedate" required="required"></td>
			</tr>

			<tr>
				<td><b>CustomerId:</b></td>
				<td><input type="text" name="cid" required="required"></td>
			</tr>

			<tr>
				<td><b>Category:</b></td>
				<td><input type="text" name="issuecat" required="required"></td>
			</tr>

			<tr>
				<td><b>Description:</b></td>
				<td><textarea rows="5" cols="20" name="issuedesc"
						required="required"></textarea></td>
			</tr>

			<tr>
				<td></td>
				<td><input type="submit" value="Submit" name="Submit"
					required="required"></td>
			</tr>

		</table>
	</form>
</body>
</html>