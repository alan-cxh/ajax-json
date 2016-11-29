<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>注册页面</title>
</head>
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$("#but").ready(function(){
			// $.post("CodeAjaxServlet?name=alan");
			var name = $("#input").val();
			$.ajax({
				
	            type: "post",
	            url: "CodeAjaxServlet",
	            data: {name:name},
	            async: true,
	            cache:false,
	            dataType: "json",
	            success: function (result) {
	            	//	var result = eval('(' + result + ')');
	            	//	alert(result.name+':'+result.password+"---");
	            	alert("name:"+result.length);
	           		for(var i in result){
	           			$("div").append("<h1>"+result[i].name+"</h1>")
	           		}
	           }
	   		 }); 
		});
	});
</script>
<body>
<%-- 	<s:form action="cusreg" method="post">
		<table width="60%" height="76" border="0">
			<s:textfield name="customerId" label="客户编号"/>
			<s:textfield name="name" label="客户姓名"/>
			<s:textfield name="phone" label="客户电话"/>
			<s:submit value="提交" align="center"/>
		</table>
	</s:form> --%>
	
	<input id="input" name="name" value="abc"/>
	<div id="div"></div>
	<button id="but">submit</button>
	
</body>
</html>