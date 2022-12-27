<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>Produits</title>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" 
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<body>
<%@include file="header.jsp" %>
<div class="container col-md-10 col-md-offset-1">
	<div class="panel panel-primary">
			<div class="panel-heading">Recherche des produits</div>
			<div class="panel-body">
				<form action="chercher.php" method="get">
					<label>Mot cl�</label>
					<input type="text" name="motCle" value="${model.motCle}"/>
					<button type ="submit" class="btn btn-primary">Chercher</button>
				</form>	
				<table class="table table-striped">
					<tr>
					<th>ID</th><th>DESIGNATION</th><th>PRIX</th><th>QUANTITE</th>
					</tr>	
					<c:forEach items="${model.produits}" var="p">
						<tr>
							<td>${p.id}</td>
							<td>${p.designation}</td>
							<td>${p.prix}</td>
							<td>${p.quantite}</td>
							<td><a onclick= "return confirm('�tes-vous s�r de vouloir supprimer le produit ?')"
								href="supprime.php?id=${p.id }">Supprimer</a></td>
							<td><a href="edit.php?id=${p.id }">Editer</a></td>
						</tr>
					</c:forEach>		
				</table>
			</div>
		</div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" 
integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</body>
</html>