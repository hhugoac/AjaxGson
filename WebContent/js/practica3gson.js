var xhr = new XMLHttpRequest();

window.onload =
()=>
{
    var btnDserialization = document.getElementById("btnDeserialization");
    btnDserialization.addEventListener("click",functionDserialization);
    
}

function functionDserialization()
{
    var JsonString = document.getElementById("txtJSONString").value;
    console.log(JsonString);
    var myForm= new FormData();

   
    myForm.append("txtJSONString",JsonString);
   
    alert("It is working out");
    xhr.open("POST","Practica3gsonServlet",true);
    xhr.onload = functionCallBack;
    xhr.send(myForm);
}

function functionCallBack()
{
    document.getElementById("answer").innerHTML=xhr.response;
}