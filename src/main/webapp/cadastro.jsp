<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro</title>
<link rel="stylesheet" href="Skeleton-2.0.4/css/skeleton.css">
        <style>
            #lg{
                font-family: cursive; 
            }
        </style>
</head>
<body>
    <form action="register" method="POST">
        <center>
            <table>
                <tr>
                    <th id="lg"><center><h1>Cadastro</h1></center></th>
                </tr>
                <tr>
                    <td><input type="text" name="name" placeholder="Nome"></td>
                </tr>
                <tr>
                    <td><input type="text" name="password" placeholder="Senha"></td>
                </tr>
                <tr>
                    <td><input type="text" name="cpf" placeholder="cpf"></td>
                </tr>
                <tr>
                    <td><input type="text" name="birth" placeholder="data de nascimento"></td>
                </tr>
                <tr>
                    <td><center><button type="submit" class="button-primary">Cadastrar</button></center></td>
                </tr>
            </table>
        </center>
    </form>
</body>
</html>