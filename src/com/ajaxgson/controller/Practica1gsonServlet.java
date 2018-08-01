package com.ajaxgson.controller;

import com.ajaxgson.model.Clientes;
import java.util.Properties;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Practica1gsonServlet
 */
@WebServlet("/Practica1gsonServlet")
@MultipartConfig
public class Practica1gsonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Practica1gsonServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idClient=Integer.parseInt(request.getParameter("idClient"));
		String Clientname=request.getParameter("ClientName");
		String dateStr=request.getParameter("BirthDate");
		String timeStr=request.getParameter("BirthTime");
		String BloodType=request.getParameter("BloodType");
		String MaritalStatus=request.getParameter("MaritalStatus");
		String Sex=request.getParameter("Sex");
		
		//Use of the simpleDateFormat to cast the date element
		SimpleDateFormat objSimpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
		Date dateBirthClient=null;
		try {
			dateBirthClient=(Date)objSimpleDateFormat.parse(dateStr);
		}catch(ParseException e){
			e.printStackTrace();
		}
		
		SimpleDateFormat objTime = new SimpleDateFormat("hh:mm");
		Date timeBirthClient=null;
		try {
			timeBirthClient=(Date)objTime.parse(timeStr);
		}catch(ParseException e){
			e.printStackTrace();
		}
		
		
		Clientes objClient=new Clientes();
		objClient.setIdClient(idClient);
		objClient.setClientName(Clientname);
		objClient.setBirthDate(dateBirthClient);
		objClient.setBirthTime(timeBirthClient);
		objClient.setBloodType(BloodType);
		objClient.setMaritalStatus(MaritalStatus);
		objClient.setSex(Sex);
		//Step 1. Define the variables
		//String url="jdbc:mysql://localhost:3306/hugo?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		//String nameUser="root";
		//String passWord="root";
		
		//Creation of an object to use a file called *config.properties* that has the properties for the database
		Properties props=new Properties();
		String propFile="config.properties";
		InputStream input=null;
		input=getClass().getClassLoader().getResourceAsStream(propFile);
		props.load(input);
		
		//Create the objects
		Connection conn = null;
		PreparedStatement stmnt = null;
		int isRegisterSaved = 0;
		String sql = "insert into cliente(idClientes,FechaNacimiento,HoraNacimiento,TipoSangre,isSoltero,sexo,NombreCliente) values(?,?,?,?,?,?,?)";
		
		//Step 3. Put the dataBase connections inside a try-catch statement
		try
		{
			//Step 4. Create a Driver object from JDBC package com.mysql.jdbc
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			
			//Step 5. Open connection
			conn=DriverManager.getConnection(props.getProperty("url"), props.getProperty("user"), props.getProperty("password"));
			
			//Step 6. Create Statement
			stmnt=conn.prepareStatement(sql);
			stmnt.setInt(1,idClient);
			stmnt.setDate(2,(java.sql.Date)dateBirthClient);
			stmnt.setDate(3,(java.sql.Date)timeBirthClient);
			stmnt.setString(4, BloodType);
			stmnt.setInt(5, 1);
			stmnt.setString(6, Sex);
			stmnt.setString(7, Clientname);
			
			//Step 7. Check idf the register is 
			if(isRegisterSaved!=0)
			{
				response.getWriter().println("Registro valido");
				
			}
			else
			{
				response.getWriter().println("Registro no valido");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		try
		{
			stmnt.close();
			conn.close();
		}
		catch(Exception ex)
		{
			
		}
		response.getWriter().print("Link"+props.getProperty("url"));
		response.getWriter().println("user"+props.getProperty("user"));
		response.getWriter().println("password"+props.getProperty("password"));
		
		
		
		
		//response.getWriter().print(objClient.getIdCliente()+objClient.getClientName()+objSimpleDateFormat.format(dateBirthClient));
		//response.getWriter().print(objTime.format(timeBirthClient)+objClient.getBloodType()+objClient.getMaritalStatus()+objClient.getSex());
	}

}
