package com.ajaxgson.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.*;
import com.ajaxgson.model.Product;

/**
 * Servlet implementation class Practica3gsonServlet
 */
@WebServlet("/Practica3gsonServlet")
public class Practica3gsonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Practica3gsonServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String JsonString = request.getParameter("txtJsonString");
		
		Gson objGson = new Gson();
    	Product objProduct= objGson.fromJson(JsonString, Product.class); //Here the Json object is changed to a nes Product object
    	PrintWriter output=response.getWriter();
    	
    	System.out.println(objProduct);
    	output.println("idProduct: "+objProduct.getIdProduct());
    	output.println("ProductName: "+objProduct.getProductName());
    	output.println("ProductPrice: "+objProduct.getProductPrice());
    	
        output.close();
	}

}
