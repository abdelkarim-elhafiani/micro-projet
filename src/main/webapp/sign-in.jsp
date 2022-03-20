<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<style type="text/css">
	body{
	display:flex;
	align-items:center;
	justify-content:center;
	height:100vh;
	
	}
	form{
		display:flex;
		flex-direction:column;
		border:solid 1px #000;
		padding:50px;
	}
	input{
	display:inline-block;
	width:250px;
	height:25px;
	
	
	}
	.btn{
		cursor:pointer;
		}
	h1{
		width:100%;
		text-align:center;	
	}
	</style>
</head>
<body>

	<form action="sign-in" method="post">
		<h1>Idetifiez-vous</h1>
		Nom:
		<input name="nom" type="text"><br>
		Password:
		<input name="password" type="password"><br>
		<button class="btn" type="submit">login</button>
	</form>
	

</body>
</html>

</body>
</html>