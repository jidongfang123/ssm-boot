<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
<title>ssm+maven导入excel数据到数据库</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet"
	href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">

<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-form.js"></script>
<script type="text/javascript">




	//导入excel
	function exceltodata() {
		if ($('#photoCover').val() == "") {
			alert("请先选择文件");
			return false;
		}

		var excelname = /^.*\.xlsx$|^.*\.xls$/;
		if (excelname.test($('#photoCover').val())) {
			//表单提交
			$("#tf").ajaxSubmit();
			alert("导入成功");
		

		} else {
			alert("请选择正确的excel文件格式(支持.xlsx或者.xls)");
		}
	}
</script>

</head>
<body>
<center>
		<div class="input-append"  style="padding-top: 50">
				<input id="photoCover" class="input-large" type="text"
					readonly="true" style="height:30px;"> 
					<a class="btn btn-primary" onclick="$('input[id=lefile]').click();">选择文件</a>
				<a class="btn btn-primary" onclick="exceltodata()">导入</a>
			</div>
			</center>
			</br>
		 <div style="margin:100px auto;width:980px;">
		
		 <span> <label>姓名：</label> <input id="name"
			placeholder="请输入姓名" type="text"> </span> <span> <label>性别：</label>
			<select id="sex" style="height: 24px;width: 163px;">
				<option value="">请选择性别</option>
				<option value="1">男</option>
				<option value="2">女</option>
		</select> </span> <span> <label>年龄：</label> <input id="age" placeholder="请输入年龄"
			type="text"> </span>
		<button class="btn btn-primary" onclick="UserinfoExport()">查询</button>
		<%-- <form action="${pageContext.request.contextPath}/user/fileUpload" method="post" --%>
		<form action="${pageContext.request.contextPath}/user/fileUpload" method="post"
			enctype="multipart/form-data" id="tf">
			<input id="lefile" type="file" style="display:none" name="file">
			
		</form>
		<script type="text/javascript">
			$('input[id=lefile]').change(function() {
				$('#photoCover').val($(this).val());
			});
		</script>


		<br />
		<div class="bs-example" data-example-id="contextual-table">
			<table class="table table-condensed" style="width:680px">
				<thead>
					<tr>
						<th>名字</th>
						<th>性别</th>
						<th>年龄</th>
					</tr>
				</thead>
				<tbody id="userinfoContendiv">
					<!-- <tr class="info">
						<td>Column content</td>
						<td>Column content</td>
						<td>Column content</td>
					</tr> -->
				</tbody>
			</table>
		</div>
</body>
</html>
