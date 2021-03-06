<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
<title>导入excel数据到数据库</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet"
	href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">

<script type="text/javascript"
	src="<%=request.getContextPath() %>/js/jquery-form.js"></script>
<script language="javascript" type="text/javascript" src="My97DatePicker/WdatePicker.js"></script>
 <jsp:include page="js.jsp"></jsp:include> 
<script type="text/javascript">
 	//页面加载
	$(function(){
		$("#file-table").bootstrapTable({
			   url:"<%=request.getContextPath()%>/showDetailed.do",
			   striped: true,//隔行变色
			   showColumns:true,//是否显示 内容列下拉框
			   showPaginationSwitch:true,//是否显示 数据条数选择框
			   minimumCountColumns:1,//最小留下一个
			   showRefresh:true,//显示刷新按钮
			   showToggle:true,//显示切换视图
			   search:false,//是否显示搜索框
			// searchOnEnterKey:true,//设置为 true时，按回车触发搜索方法，否则自动触发搜索方法
			   pagination:true,//开启分页
			   paginationLoop:true,//开启分页无限循环
			   pageNumber:1,//当前页数
			   pageSize:10,//每页条数
			   pageList:[10,20,30,50],//如果设置了分页，设置可供选择的页面数据条数。设置为All 则显示所有记录。
			   sidePagination:"server",//
			   method:'post',//发送请求的方式
			   contentType:"application/x-www-form-urlencoded",//必须的否则条件查询时会乱码
			   queryParams:function(){
				   var kdxname = $("#kdxname").val();
				   var kdxnumber = $("#kdxnumber").val();
				   var starttime = $("#starttime").val();
				   var endtime = $("#endtime").val();
				   return{
					   "kdxemployeename":kdxname,
					   "kdxworkattendance":kdxnumber,
					   "starttime":starttime,
					   "endtime":endtime,
					   page:this.pageNumber,
					   rows:this.pageSize
				   }
			   },
			   columns: [
			   /*  {
				    checkbox:true,
			   }, */{
		           field: 'detailedid',
		           title: 'id',
		           idField:true,
		           width: 5,

		       },{
	               field: 'kdxworkattendance',
	               title: '员工工号',
	               width: 5,

	           },{
	        	   field: 'kdxemployeename',
	               title: '员工名称',
	               width: 5,
	               
	           },{
	        	   field: 'kdxpaybycard',
	               title: '考勤日期',
	               width: 5,
	              
	           },{
	        	   field: 'kdxtimeinterval',
	               title: '对应时段',
	               width: 5,
	              
	           },{
	        	   field: 'kdxworkshift',
	               title: '上班时间',
	               width: 5,
	              
	           },{
	        	   field: 'kdxclosingtime',
	               title: '下班时间',
	               width: 5,
	              
	           },{
	        	   field: 'kdxsignintime',
	               title: '签到时间',
	               width: 5,
	              
	           },{
	        	   field: 'kdxreturntime',
	               title: '签退时间',
	               width: 5,
	              
	           },{
	        	   field: 'kdxtobe',
	               title: '应到',
	               width: 5,
	              
	           },{
	        	   field: 'kdxtoo',
	               title: '实到',
	               width: 5,
	              
	           },{
	        	   field: 'kdxlatetime',
	               title: '迟到时间',
	               width: 5,
	              
	           },{
	        	   field: 'kdxearlyretreattime',
	               title: '早退时间',
	               width: 5,
	              
	           },{
	        	   field: 'kdxabsenteeism',
	               title: '是否旷工',
	               width: 20,
	              
	           }/* ,
	           {
	        	   field: '11',
	               title: '操作',
	               width: 50,
	               formatter:function(value,row,index){
	            	   //class="btn btn-info"
	            	   //class="btn btn-primary"
	            	   var str = '<input type="button" value="预览" class="btn btn-info" onclick="preview(\''+row.bookname+'\',\''+row.bookname+'\')"/><input type="button" value="置顶" class="btn btn-primary" onclick="topZD(\''+row.id+'\')"/>';
	            	   str += '<input type="button" value="修改" class="btn btn-info" onclick="updateFile(\''+row.id+'\')"/>';
	            	   return str;
	               } 
	           }*/]
		   })
	})
    //列表展示
    function search(){
		$("#file-table").bootstrapTable("refresh",{'pageNumber':1});
	}
		//预览
		function preview(title,content){
		  	BootstrapDialog.show({
			 	size: BootstrapDialog.SIZE_LARGE,
	            title: '文章标题:'+title,
	            message:'文章内容:'+content
	        }); 
	   } 
		
		//导入excel
		function exceltodata() {
			if ($('#photoCover').val() == "") {
				alert("请先选择文件");
				return false;
			}

			var excelname = /^.*\.xlsx$|^.*\.xls$/;
			if (excelname.test($('#photoCover').val())) {
				/* //表单提交
				$("#tf").ajaxSubmit();
				alert("导入成功"); */
				//表单提交的第二种方式
				 $("#tf").ajaxSubmit({
					type : "post",
					 url : "<%=request.getContextPath()%>/user/fileUpload.do", 
					 beforeSubmit : function(formData, jqForm, options) {
						var flag = confirm("提交之后不能更改，请问您确定要提交吗？");
						if (flag == false) {
							return false;
						}
						return true;
					},
					success : function(data) {
					alert("上传成功");
						
					},
					error: function(msg) {
						alert("文件上传失败,请检查您所填写的内容");
					}
				}); 
				
					$.ajax({
					  type:'GET',
					  url:'/ssm/user/exceltodata',
					  data:{
					  filepath:getPath($('#photoCover').val())
					  },
					  success:function(){
					  alert("导入成功");
					  }
					
					}); 

			} else {
				alert("请选择正确的excel文件格式(支持.xlsx或者.xls)");
			}
		}
		
		function exceldetailed() {
			if ($('#detailed').val() == "") {
				alert("请先选择文件");
				return false;
			}

			var excelname = /^.*\.xlsx$|^.*\.xls$/;
			if (excelname.test($('#detailed').val())) {
				/* //表单提交
				$("#tf").ajaxSubmit();
				alert("导入成功"); */
				//表单提交的第二种方式
				 $("#tfdetailed").ajaxSubmit({
					type : "post",
					 url : "<%=request.getContextPath()%>/user/fileUploadDetailed.do", 
					beforeSubmit : function(formData, jqForm, options) {
						var flag = confirm("提交之后不能更改，请问您确定要提交吗？");
						if (flag == false) {
							return false;
						}
						return true;
					},
					success : function(data) {
					alert("上传成功");
						
					},
					error: function(msg) {
						alert("文件上传失败,请检查您所填写的内容");
					}
				}); 
				
					$.ajax({
					  type:'GET',
					  url:'/ssm/user/exceltodata',
					  data:{
					  filepath:getPath($('#detailed').val())
					  },
					  success:function(){
					  alert("导入成功");
					  }
					
					}); 

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
					<a class="btn btn-primary" onclick="$('input[id=lefile]').click();">请选择汇总表</a>
				<a class="btn btn-primary" onclick="exceltodata()">导入</a>
			</div>
			<div class="input-append"  style="padding-top: 50">
				<input id="detailed" class="input-large" type="text"
					readonly="true" style="height:30px;"> 
					<a class="btn btn-primary" onclick="$('input[id=lefiletfdetailed]').click();">请选择明细表</a>
				<a class="btn btn-primary" onclick="exceldetailed()">导入</a>
			</div>	
			</center>
<div class="panel panel-primary">
 	<div class="panel-heading">
        <h3 class="panel-title">条件查询</h3>
    </div>
    <div class="panel-body">
	<form class="form-inline">
	  <div class="form-group">
	    <label class="sr-only" >员工名称</label>
	    <input type="text" class="form-control" id="kdxname" placeholder="请输入名称" >
	    <input type="text" class="form-control" id="kdxnumber" placeholder="请输入工号" ><br>
	    起始时间<input name="" class="Wdate" id="starttime"  type="text" onClick="WdatePicker()"><br>
	    结束时间<input name="" class="Wdate" id="endtime" type="text" onClick="WdatePicker()">
	  </div>
	</form>
	</div>
	<button type="button" class="btn btn-primary" onclick="search()">搜索</button>
	</div>			
			
	<!-- 查询列表容器 -->		
<table class="table" id="file-table" border="1"></table>

<!-- 明细表单数据提交 -->
<form action="${pageContext.request.contextPath}/user/fileUpload.do" method="post"enctype="multipart/form-data" id="tfdetailed">
	<input id=lefiletfdetailed type="file" class="file" style="display:none" name="file">			
</form>
<!-- 汇总表单数据提交 -->
<form action="${pageContext.request.contextPath}/user/fileUpload.do" method="post"enctype="multipart/form-data" id="tf">
	<input id="lefile" type="file" style="display:none" name="file">			
</form>
<script type="text/javascript">
		//选择的Excel对应input框
		$('input[id=lefile]').change(function() {
			$('#photoCover').val($(this).val());
		});
		$('input[id=lefiletfdetailed]').change(function() {
			$('#detailed').val($(this).val());
		});
</script> 
 
</body>
</html>