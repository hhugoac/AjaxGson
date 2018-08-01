alert("It is working");
var xhr=new XMLHttpRequest();
window.onload =
()=>
{
    var btnSend=document.getElementById("btnSend");
    alert("It noty works!!..");
    btnSend.addEventListener("click",sendInfo);
}

function sendInfo()
{
    var idClient=document.getElementById("txtIdClient").value;
    var ClientName=document.getElementById("txtClientName").value;
    var BirthDate=document.getElementById("txtBirthDate").value;
    var BirthTime=document.getElementById("txtBirthTime").value;
    var BloodType=document.getElementById("txtBloodType").value;
    var MaritalStatus=document.getElementById("txtStatus").value;

 if (document.getElementById("txtSex").checked==true)
 {
    var Sex="M";
 }
 else
 {
     var Sex="W";
 }
    

    var myForm=new FormData();

    myForm.append("idClient",idClient);
    myForm.append("ClientName",ClientName);
    myForm.append("BirthDate",BirthDate);
    myForm.append("BirthTime",BirthTime);
    myForm.append("BloodType",BloodType);
    myForm.append("MaritalStatus",MaritalStatus);
    myForm.append("Sex",Sex);

    console.log("idClient"+idClient);
    console.log("ClientName"+ClientName);
    console.log("BirthDate"+BirthDate +BirthTime+BloodType+MaritalStatus+Sex);

    alert("It works!!..");
    xhr.open("Post","Practica1gsonServlet",true);
    xhr.onload=functionCallBack;
    xhr.send(myForm);
}

function functionCallBack()
{
    document.getElementById("Results").innerHTML=xhr.response;
}