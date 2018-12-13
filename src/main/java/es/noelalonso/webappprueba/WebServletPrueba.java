package es.noelalonso.webappprueba;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WebServlet
 */
@WebServlet("/")
public class WebServletPrueba extends HttpServlet {

	/** serialVersionUID */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("WebServletPrueba.service");
		response.getWriter().println("Esta es la Web App Prueba.");
		response.getWriter().flush();
	}

}
