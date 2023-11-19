<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>THIS IS THE ABC PROJECT</title>
</head>
<body>
	<h1>Registriere dich jetzt!</h1>

<p>Bitte gib deinen UserNamen und Passwort ein:</p><br>

	<form method="post" action="register">

		<label for="username">Username: </label><br> 
		<input type="text"name="username" id="user"><br> <label for="password">Passwort:
		</label><br> <input type="password" name="password" id="pw"><br>

		<label for="password">Passwort: </label><br> 
		<input			type="password" name="password" id="pw"><br> <br> <input
			type="submit" value="Submit">
	</form>

</body>
</html>