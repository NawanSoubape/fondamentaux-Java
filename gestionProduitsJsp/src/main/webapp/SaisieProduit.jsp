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
<div class="container col-md-8 col-md-offset-2">
	<div class="panel panel-primary">
			<div class="panel-heading">Saisie d'un produit</div>
			<div class="panel-body">
				<form action="SaveProduit.php" method="post">
					<div class="form-group">
						<label class="form-control">Designation</label>
						<input  required="required" class="form-control" type="text" name="designation" value="${produit.designation}" }/>
						<span></span>
					</div>
					
					<div class="form-group">
						<label class="form-control">Prix</label>
						<input required="required"  class="form-control" type="text" name="prix" value="${produit.prix}"/>
						<span></span>
					</div>
					
					<div class="form-group">
						<label class="form-control">Quantite</label>
						<input required="required"  class="form-control" type="text" name="quantite" value="${produit.quantite}"/>
						<span></span>
					</div>
					<div>
						<button type ="submit" class="btn btn-primary">Save</button>
					</div>
					
				</form>	
				
			</div>
		</div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" 
integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</body>
</html>