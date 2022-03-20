package controllers;

import jdbc.CrudImp;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="SignIn",value="/sign-in")
public class SignIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public SignIn() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.getRequestDispatcher("./sign-in").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom=request.getParameter("nom");
		String password=request.getParameter("password");
		CrudImp login=new CrudImp();
		try {
			login.login(nom,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
