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
<h1>Practice 3. Deserialization from an Json object with Gson</h1>
<h3>Get a Java object from JSON string</h3>

<p>
    <label for="txtJSONString">Write a JSON string</label>
    <input type="text" id="txtJSONString" name="txtJSONString" placeholder="{IdProduct:value,ProductName:value,ProductPrice}" size="50">
</p>
<p>
    <input type="button" value="Deserialization" id="btnDeserialization" name="btnDeserialization" >
</p>
<div id="answer"></div>
<script src="js/jquery-3.3.1.js"></script>
<script src="js/bootstrap.bundle.min.js"></script>
<script src="js/practica3gson.js"></script>
</body>
</html>