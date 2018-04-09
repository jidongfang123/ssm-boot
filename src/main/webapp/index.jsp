<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<jsp:include page="js.jsp"></jsp:include>
</head>
<body>
<h2>Hello World!</h2>
<input type="button" value="BootStarp列表展示" onclick="selectbook()">
<script type="text/javascript">
	function selectbook(){
		location="<%=request.getContextPath()%>/selectbook.do"
	}
</script>
</body>
</html>