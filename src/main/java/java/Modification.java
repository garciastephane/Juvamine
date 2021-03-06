package java;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Modification
 */
public class Modification extends HttpServlet {
	 
		public static final String VUE = "/WEB-INF/index.jsp";
		private static final long serialVersionUID = 1L;
		public static final String CHAMP_NOM = "nom";
		public static final String CHAMP_PRENOM = "prenom";
		public static final String CHAMP_TELEPHONE = "telephone";
	     public static final String CHAMP_EMAIL = "email";  
	     
    public Modification() {
        super();
        // TODO Auto-generated constructor stub
    }
    


    	public  void validationEmail(String email) throws Exception {
    		if (email != null && email.trim().length() != 0) {
    			if (!email.matches("#^[a-z0-9._-]+@[a-z0-9._-]{2,}\\.[a-z]{2,4}$#")) {
    				throw new Exception("Merci de saisir une adresse mail valide.");
    			}
    		} else {
    			throw new Exception("Merci de saisir une adresse mail.");
    		}

    	}

    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	doGet(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String nom = request.getParameter( "CHAMP_NOM" );
		String prenom = request.getParameter( "CHAMP_PRENOM" );
		String telephone = request.getParameter( "CHAMP_TELEPHONE" );
		String email = request.getParameter( "CHAMP_EMAIL" );
		
		try {
			validationEmail ( email );
						
	} catch (Exception e) {
		
	}
		
	}
	
	

}
