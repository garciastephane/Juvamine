package java;

public class Control {

	public static void validationEMail(String email) throws Exception {
		if (email != null && email.trim().length() != 0) {
			if (!email.matches("#^[a-z0-9._-]+@[a-z0-9._-]{2,}\\.[a-z]{2,4}$#")) {
				throw new Exception("Merci de saisir une adresse mail valide.");
			}
		} else {
			throw new Exception("Merci de saisir une adresse mail.");
		}

	}

}
