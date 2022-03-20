<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Article</title>
		<style type="text/css">
		
			body{
			background-color:#e5e8ff;
			margin:auto;
			}
		
			header{
				width:100%;
				display:flex;
				align-items:center;
				justify-content:center;
				text-align: center;
				color:#5a2fb7;
			}
			
			img{
				height: 150px;
				width:150px;
			}
			
			.box{
				  display: flex;
				  align-items: flex-start;
				  justify-content: start;
				  margin-left:10px;
			}
							
			#imgdiv{
				margin-top:75px;
				padding-left:200px;
			}
				
			#id{
				font-size: 24px;
				width: 180px;
			}
			
			h2{
				margin:15px ;
				color:#5a2fb7;
			}
			
			.blocks{
				display:block;
				margin-top:10px;
			}
			.global{
				display: flex;
			}
			
			a{
				margin:5px 40px;
				font-size: 20px;
				border: 1px solid;
				padding:5px;
				background-color:#fff;
				color:#5a2fb7;
 				text-decoration:none; 				
			}
			
			
			
			
			
		</style>
	</head>
	<body>
	
		<header>
			<div>
				<h1>Details de l'article</h1>
			</div>
		</header>
		
		<div class="box">
			<div><img src="https://img.freepik.com/vecteurs-libre/instruments-musique-jazz_81894-3155.jpg" /></div>
			
			<div id="imgdiv"><input id="id" value="1987" readOnly="true" /></div>
		</div>
		
		<div class="global">
		
			<div class="col1">
				<h2>Référence :</h2>
				<h2>Auteur :</h2>
				<h2>Quantité en stock :</h2>
			</div>
			
			<div class="col2">
				<input class="blocks" id="id" value="J210" readOnly="true" />
				<input class="blocks" id="id" value="Miles David" readOnly="true" />
				<input class="blocks" id="id" value="4" readOnly="true" />
			</div>
		
			<div class="col1">
				<h2>titre :</h2>
				<h2>Editeur :</h2>
				<h2>Le prix :</h2>
			</div>
			
			<div class="col2">
				<input class="blocks" id="id" value="Tutu" readOnly="true" />
				<input class="blocks" id="id" value="Polygam" readOnly="true" />
				<input class="blocks" id="id" value="120$" readOnly="true" />
			</div>
		
		</div>
		
		
		<div>
			<a href="catalogue.jsp">Retour</a>
			<a href="">Ajouter au panier</a>
		</div>
		
	
	</body>
</html>




























