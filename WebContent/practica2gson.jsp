<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/style.css">
<!--Serialization means the action to convert an objet into an string, 
sealization is to generate an object with an Java objects.
-->
<title>Practice 2 - Json object serialization</title>
</head>
<body>
<h1>Practice 2 - Json object serialization</h1>

<p>
    <label for="txtIdProduct">Introduce the product Id: </label>
    <input type="text" id="txtIdProduct" name="txtIdProduct">
</p>
<p>
    <label for="txtProductName">Introduce the product name: </label>
    <input type="text" id="txtProductName" name="txtProductName">
</p>
<p>
    <label for="txtProductPrice">Introduce the price name: </label>
    <input type="text" id="txtProductPrice" name="txtProductPrice">
</p>
<p>
    <input type="button" id="btnSerialization" value="Serialize the object">
</p>
<div id="answer"></div>
<script src="js/jquery-3.3.1.js"></script>
<script src="js/bootstrap.bundle.min.js"></script>
<script src="js/practica2gson.js"></script>
</body>
</html>