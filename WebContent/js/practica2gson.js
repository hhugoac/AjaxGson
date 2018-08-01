var xhr=new XMLHttpRequest();

window.onload=
()=>
{
    //Var definition to asigne the events into the buttom
    document.getElementById("btnSerialization").onclick=Serialization;
}

function Serialization()
{
    //This function conects to Servelet
    // catching the values from the textboxes
    var IdProduct = document.getElementById("txtIdProduct").value;
    var ProductName = document.getElementById("txtProductName").value;
    var ProductPrice = document.getElementById("txtProductPrice").value;

    //create form data
    var myForm = new FormData();
    myForm.append("IdProduct", IdProduct);
    myForm.append("ProductName",ProductName);
    myForm.append("ProductPrice",ProductPrice)

    //send the asincron process
    xhr.open("POST","Practica2gsonServlet",true);

    xhr.onload=functionCallBack;

    xhr.send(myForm);

}

function functionCallBack()
{
    document.getElementById("answer").innerHTML = xhr.responseText;
}