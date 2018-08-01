package com.ajaxgson.controller;

import com.ajaxgson.model.Clientes;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Practica4gsonServlet
 */
@WebServlet("/Practica4gsonServlet")
public class Practica4gsonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Practica4gsonServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*int idClient=Integer.parseInt(request.getParameter("idClient"));
		String ClientName=request.getParameter("ClientName");
		String BirthDate=request.getParameter("BirthDate");
		
		Clientes objClient=new Clientes();
		objClient.setIdClient(idClient);
		objClient.setClientName(ClientName);
		objClient.setBirthDate(BirthDate);
		
		response.getWriter().print("Id: "+objClient.getIdCliente()+" Name: "+objClient.getClientName()+"Birth Date: "+objClient.getBirthDate());*/
		
	}

}
