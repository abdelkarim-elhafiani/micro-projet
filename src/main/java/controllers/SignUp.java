package controllers;

import models.Client;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(name="SignUp",value="/sign-up")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public SignUp() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("sign-up.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Client client = new Client(
				request.getParameter("prenom"),
				request.getParameter("nom"),
				request.getParameter("adresse"),
				request.getParameter("email"),
				request.getParameter("motDePasse")
		);


		
	}

}
