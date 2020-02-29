<!DOCTYPE html>
<html>

<body>
	<h1 style="text-align: center">R�cup�ration des donn�es</h1>
	<br>

	<%="Nom : " + request.getAttribute("CHAMP_NOM")%><br>
	<%="Pr�nom : " + request.getAttribute("CHAMP_PRENOM")%><br>
	<%="T�l�phone : " + request.getAttribute("CHAMP_TELEPHONE")%><br>
	<%="E-mail : " + request.getAttribute("CHAMP_EMAIL")%>
</body>
</html>