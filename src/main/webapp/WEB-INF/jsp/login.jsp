<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
$(function(){
	$("#input[type='buttom']").click(function(){
		$.post("checkUser",{"Name":$("input[name='name']").val(),"password":$("input[name='password']").val()},
				function(data){
			alert(data.name);
		},"json")
		
	});
})
</script>
</head>
<body>
<form action="checkUser" method="post">
<input name="name">
<input name="password">
<input type="submit" value="登陆">
<input type="submit" value="ajax登陆">${error } 

</form>
<form action="registe" method="post">
<input type="submit" value="注册">
</form>
</body>
</html>