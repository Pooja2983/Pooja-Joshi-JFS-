var counter=1;

function addToDiv()
{
    var d = document.getElementById("content");

    var d1 = document.createElement("div");
    d1.name="content"+counter;
    d1.id="content"+counter;

    var i = document.createElement("input");
    i.name='name'+counter;
    i.type='text';
    i.placeholder='Enter Username'+counter;
    i.style.height="30px";
    i.style.width="300px";
    i.style.borderColor="blue";
    i.style.borderWidth="3px";

    var b  = document.createElement("button");
    b.name = "btn"+counter;
    b.value = "btn"+counter;
    b.innerText = "Remove"+counter;
    b.style.margin="6px";
    b.style.padding="5px";
    b.style.backgroundColor="red"
    b.addEventListener("click",function(){
        d1.remove();
     });

    d1.appendChild(i);
    d1.appendChild(b);

    d.appendChild(d1);
    counter = counter+1;
   
   
}