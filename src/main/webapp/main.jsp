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

<table class="table" id="file-table" border="1"></table>
<script type="text/javascript">
	//页面加载
	$(function(){
		$("#file-table").bootstrapTable({
			   url:"<%=request.getContextPath()%>/ShowBook.do",
			   striped: true,//隔行变色
			   showColumns:true,//是否显示 内容列下拉框
			   showPaginationSwitch:true,//是否显示 数据条数选择框
			   minimumCountColumns:1,//最小留下一个
			   showRefresh:true,//显示刷新按钮
			   showToggle:true,//显示切换视图
			   search:false,//是否显示搜索框
			 //  searchOnEnterKey:true,//设置为 true时，按回车触发搜索方法，否则自动触发搜索方法
			   pagination:true,//开启分页
			   paginationLoop:true,//开启分页无限循环
			   pageNumber:1,//当前页数
			   pageSize:2,//每页条数
			   pageList:[2,3,4,5],//如果设置了分页，设置可供选择的页面数据条数。设置为All 则显示所有记录。
			   sidePagination:"server",//
			   method:'post',//发送请求的方式
			   contentType:"application/x-www-form-urlencoded",//必须的否则条件查询时会乱码
			   queryParams:function(){
				 
				   return{
					   page:this.pageNumber,
					   rows:this.pageSize
				   }
			   },
			   columns: [
			    {
				    checkbox:true,
			   },{
		           field: 'bookid',
		           title: '书籍编号',
		           idField:true,
		           width: 100

		       },{
	               field: 'bookname',
	               title: '书籍名称',
	               width: 100

	           },{
	        	   field: 'booktype',
	               title: '书籍类型',
	               width: 100
	               
	           },{
	        	   field: 'bookprice',
	               title: '书籍价格',
	               width: 100,
	              
	           },{
	        	   field: '11',
	               title: '操作',
	               width: 100,
	               formatter:function(value,row,index){
	            	   //class="btn btn-info"
	            	   //class="btn btn-primary"
	            	   var str = '<input type="button" value="预览" class="btn btn-info" onclick="preview(\''+row.bookname+'\',\''+row.bookname+'\')"/><input type="button" value="置顶" class="btn btn-primary" onclick="topZD(\''+row.id+'\')"/>';
	            	   str += '<input type="button" value="修改" class="btn btn-info" onclick="updateFile(\''+row.id+'\')"/>';
	            	   return str;
	               }
	           }]
		   })
	})
    //列表展示
    function searchButton(){
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
</script>      
</body>
</html>