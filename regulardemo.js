function searchpattern(){
    let str=document.getElementById("str").value;
    let pat=document.getElementById("pattern").value
   
    let patteren=new RegExp(pat,"gi")
    let arr=document.getElementsByName("operation");
    for(i=0;i<arr.length;i++){
     if(arr[i].checked){
         v=arr[i].value;
         break;
     }
     }
     switch(v){
         case "search":
             
             result="Position :"+str.search(patteren);
             break;
         case "replace":
             newstr=prompt("enter new string")
             
             result="new String afte rreplace"+str.replace(patteren,newstr);
             break;
         case "match":
            
             result="all strings"+str.match(patteren);
             break;
         case "test":
             
             result="pattern exists :  "+patteren.test(str);
             break;

     } 
      document.getElementById("mydiv").innerHTML=result
 }