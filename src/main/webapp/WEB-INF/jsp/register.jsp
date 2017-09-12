<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.2.1.js"></script>
<script type="text/javascript">
	$(function(){
		$("input[name='birthday']").blur(function(){
			$.post("cA",{"birthday":$("input[name='birthday']").val()},function(date){
				$("input[name='age']").val(date);
			},"text");
		})
		
	})
</script>
</head>
<body>
<b>请输入注册的用户信息</b>
<form action="Userregister" method="post">
用户名：<input type="text" name="name"><br>
密码：<input type="text" name="password"><br>
年龄：<input type="text" name="age"><br>
邮箱：<input type="text" name="email"><br>
生日：<input type="date" name="brithday"><br>
<input type="submit" value="提交注册信息"><br>

</form>
</body>
</html>