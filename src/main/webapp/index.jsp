<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Inscription</title>
        <link type="text/css" rel="stylesheet" href="form.css" />
    </head>
    <body>
        <form method="post" action="inscription">
            <fieldset>
                <legend><h2>Inscription</h2></legend>
                <p>Vous pouvez vous inscrire via ce formulaire.</p>

				<label for="nom">Nom d'utilisateur</label>
                <input type="text" id="nom" name="nom" value="" size="40" maxlength="40" />
                <br />
                
				<label for="prenom">Prenom d'utilisateur</label>
                <input type="text" id="prenom" name="prenom" value="" size="40" maxlength="40" />
                <br />
                
                <label for="telephone">Numero de telephone d'utilisateur</label>
                <input type="text" id="telephone" name="telephone" value="" size="40" maxlength="40" />
                <br />

                <label for="email">Adresse email <span class="requis">*</span></label>
                <input type="text" id="email" name="email" value="" size="40" maxlength="60" />
                <br />
                              

                <input type="submit" value="Valider" class="sansLabel" />
                <br />
            </fieldset>
        </form>
    </body>
</html>