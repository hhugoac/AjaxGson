<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/style.css">
<title>Ajax Gson Project</title>
</head>
<body>
    <!--FrontEnd Page for send info from a form to a  Servlet, using Ajax and connectiong with an existing Data Base-->
    <h1>Practice 1. Send info from a form to a  Servlet</h1>
    <hr/>

    <p>
        <label for="txtIdClient">Client Id</label>
        <input type="text" id="txtIdClient" name="txtIdClient">
    </p>
   
    <p>
        <label for="txtClientName">Client Name</label>
        <input type="text" id="txtClientName" name="txtClientName">
    </p>
    <p>
        <label for="txtBirthDate">Birth Date</label>
        <input type="date" id="txtBirthDate" name="txtBirthDate">
    </p>
    <p>
        <label for="txtBirthTime">Birth Time</label>
        <input type="time" id="txtBirthTime" name="txtBirthTime">
    </p>
    <p>
        <label for="txtBloodType">Blood Type</label>
        <select name="txtBloodType" id="txtBloodType">
            <option selected></option>
            <option value="A+">A+</option>
            <option value="A-">A-</option>
            <option value="B+">B+</option>
            <option value="B-">B-</option>
            <option value="AB+">AB+</option>
            <option value="AB-">AB-</option>
            <option value="O+">O+</option>
            <option value="O-">O-</option>
        </select>
    </p>
    <p>
        <label for="txtStatus">Status</label>
            <select name="txtStatus" id="txtStatus">
                <option selected></option>
                <option value="Single">Single</option>
                <option value="Married">Married</option>
                <option value="Divorsed">Divorsed</option>
                <option value="4EverAlone">4EverAlone</option>
            </select>
    </p>   
    <p>
        <label for="txtSex">Sex</label>
        <input type="radio" id="txtSex" name="txtSex" value="Man" checked>Man</input>
        <input type="radio" id="txtSex" name="txtSex" value="Woman" >Woman</input>
    </p>   
    <div id="Results"></div>
    <input class="btn btn-primary" type="button" id="btnSend" name="btnSend" value="Send">
    <div class="btn btn-primary"><a href="index.jsp">Go back</a></div>

    
    
    <script src="js/jquery-3.3.1.js"></script>
    <script src="js/bootstrap.bundle.min.js"></script>
    <script src="js/practica1gson.js"></script>
</body>
</html>