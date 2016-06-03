package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet é um objeto capaz de 
 * receber e responder HTTP (web)
 * @author Virmerson
 */
@WebServlet(name="cli", urlPatterns={"/cliente"})
public class ClienteController extends HttpServlet {
 
	/**
	 * Recebe pelo  POST
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Aqui a gente pega os dados do browser e manda pro banco
		//super.doPost(req, resp);
	}
	/**
	 * Recebe requisições pelo método GET
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Pega os dados do banco e manda pro browser
		//super.doGet(req, resp);
	}
}
