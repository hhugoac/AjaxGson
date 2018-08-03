package com.ajaxgson.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.MultipartConfig;
import com.ajaxgson.model.Product;
import com.google.gson.*;
/**
 * Servlet implementation class Practica2gsonServlet
 */
@WebServlet("/Practica2gsonServlet")
@MultipartConfig
public class Practica2gsonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Practica2gsonServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int IdProduct = Integer.parseInt(request.getParameter("IdProduct"));
		String ProductName = request.getParameter("ProductName");
		double ProductPrice = Double.parseDouble(request.getParameter("ProductPrice"));
		
		Product objProduct=new Product(IdProduct,ProductName,ProductPrice);
		
		PrintWriter output=response.getWriter();
		//Gson object creation
		Gson objGson=new Gson();
		
		String json = objGson.toJson(objProduct);
		//String json2 =objGson.
		output.println("Id"+objProduct.getIdProduct());
		output.println("Name"+objProduct.getProductName());
		output.println("Price"+objProduct.getProductPrice());
		output.println(json);
		
		output.close();
	}

}
