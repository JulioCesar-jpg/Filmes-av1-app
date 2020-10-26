
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.mycompany.filmes.app.models.Customers"%>
<%@page import="com.mycompany.filmes.app.db.MovieList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="Skeleton-2.0.4/css/skeleton.css">
<style>
    h1, h2, h3{
        font-family: cursive;
    }
</style>
</head>
<body>
<center>
	<%
		Customers user = (Customers) session.getAttribute("logger_user");
		if (user != null) {
	%>
	<h2>
		Usuario:
		<%=user.getName()%></h2>

	<div class="container">
		<h3>Filmes</h3>
		<div styles="margin: auto">
			<table class="table" styles="padding: 5px;">
				<thead>
					<tr>
                                                <th>Capa</th>
						<th>Nome</th>
						<th>Preços (R$)</th>
                                                <th>Classificação</th>
                                                <th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="movies" items="${MovieList.moviesList}">
						<tr>
                                                        <td><img src="Imagens/${movies.title}.jpg" width="50"/></td>
							<td>${movies.title}</td>
							<td>${movies.price}</td>
                                                        <td><img src="Indicativa/${movies.title}.jpg" width="20"/></td>
                                                        <td><a href="#"><button class="button-primary">Alugar</button></a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>


	<%
		} else {
	%>
        <h1>Sessão Expirada<br>
            <a href="login.jsp"><button class="button-primary">Login</button></a>
	</h1>
	<%
		}
	%>
</center>
</body>
</html>