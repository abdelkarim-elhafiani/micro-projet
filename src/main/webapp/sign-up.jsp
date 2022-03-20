<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	
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
		margin-bottom:20px;
		}
	h1{
		width:100%;
		text-align:center;	
	}
		
	
</style>
</head>
<body>
	
	<form  action="./sign-up" method="post">
		<h1>Inscrivez-vous</h1>
		Prenom:
		<input type=text  name="prenom"><br>
		Nom:
		<input type=text name="nom"><br> 
		Adresse:
		<input type=text name="adresse"><br>
		Email*:
		<input type=text name="email"><br>
		Password*:
		<input type=password name="motDePasse"><br>
	
		<button class="btn" type="submit">OK</button>
		* champs obligatiore
	</form>
	 
	
		 
</body>
</html>