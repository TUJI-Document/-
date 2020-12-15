
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>添加提交人任务</title>
<!--favicon-->
<link rel="icon" href="resource/houtai/assets/images/favicon.ico"
	type="image/x-icon">
<!-- simplebar CSS-->
<link href="resource/houtai/assets/plugins/simplebar/css/simplebar.css"
	rel="stylesheet" />
<!-- Bootstrap core CSS-->
<link href="resource/houtai/assets/css/bootstrap.min.css"
	rel="stylesheet" />
<!-- animate CSS-->
<link href="resource/houtai/assets/css/animate.css" rel="stylesheet"
	type="text/css" />
<!-- Icons CSS-->
<link href="resource/houtai/assets/css/icons.css" rel="stylesheet"
	type="text/css" />
<!-- Sidebar CSS-->
<link href="resource/houtai/assets/css/sidebar-menu.css"
	rel="stylesheet" />
<!-- Custom Style-->
<link href="resource/houtai/assets/css/app-style.css" rel="stylesheet" />
<script src="resource/houtai/assets/js/jquery.min.js"></script>
</head>

<body>

	<!-- Start wrapper-->
	<div id="wrapper">

		<!--Start sidebar-wrapper-->
		<div id="sidebar-wrapper" data-simplebar=""
			data-simplebar-auto-hide="true">
			<div class="brand-logo">
				<a href="index.action"> <img
					src="resource/houtai/assets/images/logo-icon.png" class="logo-icon"
					alt="logo icon">
					<h5 class="logo-text">添加提交人任务</h5>
				</a>
			</div>
			<c:import url="htmenu.jsp"></c:import>

		</div>
		<!--End sidebar-wrapper-->

		<!--Start topbar header-->
		<header class="topbar-nav">
			<nav class="navbar navbar-expand fixed-top bg-white">
				<ul class="navbar-nav mr-auto align-items-center">
					<li class="nav-item"><a class="nav-link toggle-menu"
						href="javascript:void();"> <i class="icon-menu menu-icon"></i>
					</a></li>
				</ul>
			</nav>
		</header>
		<!--End topbar header-->

		<div class="clearfix"></div>

		<div class="content-wrapper">
			<div class="container-fluid">
				<!-- Breadcrumb-->
				<div class="row pt-2 pb-2">
					<div class="col-sm-9">
						<h4 class="page-title">添加提交人任务</h4>
						</ol>
					</div>
				</div>
				<!-- End Breadcrumb-->
				<div class="row">
					<div class="col-lg-12">
						<div class="card">
							<div class="card-body">
								<form action="addsubmittertaskact.action" method="post"
									enctype="multipart/form-data">
									<h4 class="form-header">
										<i class="fa fa-file-text-o"></i> 添加提交人任务
									</h4>
									<div class="form-group">
										<label>任务</label>
										<!-- 定义task下拉框 并定义其onchange方法taskchange(this)" -->

										<select id='task' onchange="taskchange(this)" name="task"
											class="form-control">
											<!-- 用c标签的if表达式判断taskall是否为空  -->

											<c:if test="${ !empty taskall}">

												<!-- 用c标签的forEach循环展示 request中的taskall  -->

												<c:forEach items="${ taskall}" var="item">



													<option value="${item.name }">${item.name }</option>

												</c:forEach>

											</c:if>



										</select>

										<script>

 <!-- 定义taskchange方法  -->  

                                                	function taskchange(select){

 <!-- 将taskid"的被选中项数设置为与传入的select.selectedIndex相同  -->  

                                           $("#taskid").val($("#taskid option:eq("+select.selectedIndex+")").val());                                                	}

 <!-- 定义GetQueryString方法获取参数栏中的参数值  -->  

										function GetQueryString(name) { 

											　　　var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)","i");

											     var r = window.location.search.substr(1).match(reg); 

											　　　if (r!=null) return (r[2]); 

											　　　return null; 

											} 

                                                                                           	

 <!-- 若地址栏中存在taskid时获取地址栏中的taskid值  -->  

                                            var taskid = GetQueryString("taskid"); 

 <!-- 判断taskid是否为null  -->  

											if(taskid!=null) { 

 <!-- 将id为taskid的值设置为参数栏中taskid的值  -->  

											　　$("#taskid").val(taskid);

 <!-- 获取id为taskid的select保存为sel变量  -->  

												var sel=document.getElementById("taskid"); 

 <!-- 获取sel的当前的选中值  -->  

												var taskidselectedindex = sel.selectedIndex;

 <!-- 将task的选中项数设置为sel.selectedIndex的值  -->  

											   $("#task").val($("#task option:eq("+taskidselectedindex+")").val());

											}                                                         </script>
									</div>
									<!-- 设置display为none,设置为不可见 -->

									<div style='display: none;' class="form-group">
										<label>任务id</label>
										<!-- 定义taskid下拉框 并定义其onchange方法taskidchange(this)" -->

										<select id='taskid' onchange="taskidchange(this)"
											name="taskid" class="form-control">
											<!-- 用c标签的if表达式判断taskall是否为空  -->

											<c:if test="${ !empty taskall}">

												<!-- 用c标签的forEach循环展示 request中的taskall  -->

												<c:forEach items="${ taskall}" var="item">



													<option value="${item.id }">${item.id }</option>

												</c:forEach>

											</c:if>



										</select>

										<script>

 <!-- 定义taskidchange方法  -->  

                                                	function taskidchange(select){

 <!-- 将taskidid"的被选中项数设置为与传入的select.selectedIndex相同  -->  

                                           $("#taskidid").val($("#taskidid option:eq("+select.selectedIndex+")").val());                                                	}

 <!-- 定义GetQueryString方法获取参数栏中的参数值  -->  

										function GetQueryString(name) { 

											　　　var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)","i");

											     var r = window.location.search.substr(1).match(reg); 

											　　　if (r!=null) return (r[2]); 

											　　　return null; 

											} 

                                                                                           	

 <!-- 若地址栏中存在taskidid时获取地址栏中的taskidid值  -->  

                                            var taskidid = GetQueryString("taskidid"); 

 <!-- 判断taskidid是否为null  -->  

											if(taskidid!=null) { 

 <!-- 将id为taskidid的值设置为参数栏中taskidid的值  -->  

											　　$("#taskidid").val(taskidid);

 <!-- 获取id为taskidid的select保存为sel变量  -->  

												var sel=document.getElementById("taskidid"); 

 <!-- 获取sel的当前的选中值  -->  

												var taskididselectedindex = sel.selectedIndex;

 <!-- 将taskid的选中项数设置为sel.selectedIndex的值  -->  

											   $("#taskid").val($("#taskid option:eq("+taskididselectedindex+")").val());

											}                                                         </script>
									</div>
									<div class="form-group">
										<label>提交人</label>
										<!-- 定义submitter下拉框 并定义其onchange方法submitterchange(this)" -->

										<select id='submitter' onchange="submitterchange(this)"
											name="submitter" class="form-control">
											<!-- 用c标签的if表达式判断submitterall是否为空  -->

											<c:if test="${ !empty submitterall}">

												<!-- 用c标签的forEach循环展示 request中的submitterall  -->

												<c:forEach items="${ submitterall}" var="item">



													<option value="${item.name }">${item.name }</option>

												</c:forEach>

											</c:if>



										</select>

										<script>

 <!-- 定义submitterchange方法  -->  

                                                	function submitterchange(select){

 <!-- 将submitterid"的被选中项数设置为与传入的select.selectedIndex相同  -->  

                                           $("#submitterid").val($("#submitterid option:eq("+select.selectedIndex+")").val());                                                	}

 <!-- 定义GetQueryString方法获取参数栏中的参数值  -->  

										function GetQueryString(name) { 

											　　　var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)","i");

											     var r = window.location.search.substr(1).match(reg); 

											　　　if (r!=null) return (r[2]); 

											　　　return null; 

											} 

                                                                                           	

 <!-- 若地址栏中存在submitterid时获取地址栏中的submitterid值  -->  

                                            var submitterid = GetQueryString("submitterid"); 

 <!-- 判断submitterid是否为null  -->  

											if(submitterid!=null) { 

 <!-- 将id为submitterid的值设置为参数栏中submitterid的值  -->  

											　　$("#submitterid").val(submitterid);

 <!-- 获取id为submitterid的select保存为sel变量  -->  

												var sel=document.getElementById("submitterid"); 

 <!-- 获取sel的当前的选中值  -->  

												var submitteridselectedindex = sel.selectedIndex;

 <!-- 将submitter的选中项数设置为sel.selectedIndex的值  -->  

											   $("#submitter").val($("#submitter option:eq("+submitteridselectedindex+")").val());

											}                                                         </script>
									</div>
									<!-- 设置display为none,设置为不可见 -->

									<div style='display: none;' class="form-group">
										<label>提交人id</label>
										<!-- 定义submitterid下拉框 并定义其onchange方法submitteridchange(this)" -->

										<select id='submitterid' onchange="submitteridchange(this)"
											name="submitterid" class="form-control">
											<!-- 用c标签的if表达式判断submitterall是否为空  -->

											<c:if test="${ !empty submitterall}">

												<!-- 用c标签的forEach循环展示 request中的submitterall  -->

												<c:forEach items="${ submitterall}" var="item">



													<option value="${item.id }">${item.id }</option>

												</c:forEach>

											</c:if>



										</select>

										<script>

 <!-- 定义submitteridchange方法  -->  

                                                	function submitteridchange(select){

 <!-- 将submitteridid"的被选中项数设置为与传入的select.selectedIndex相同  -->  

                                           $("#submitteridid").val($("#submitteridid option:eq("+select.selectedIndex+")").val());                                                	}

 <!-- 定义GetQueryString方法获取参数栏中的参数值  -->  

										function GetQueryString(name) { 

											　　　var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)","i");

											     var r = window.location.search.substr(1).match(reg); 

											　　　if (r!=null) return (r[2]); 

											　　　return null; 

											} 

                                                                                           	

 <!-- 若地址栏中存在submitteridid时获取地址栏中的submitteridid值  -->  

                                            var submitteridid = GetQueryString("submitteridid"); 

 <!-- 判断submitteridid是否为null  -->  

											if(submitteridid!=null) { 

 <!-- 将id为submitteridid的值设置为参数栏中submitteridid的值  -->  

											　　$("#submitteridid").val(submitteridid);

 <!-- 获取id为submitteridid的select保存为sel变量  -->  

												var sel=document.getElementById("submitteridid"); 

 <!-- 获取sel的当前的选中值  -->  

												var submitterididselectedindex = sel.selectedIndex;

 <!-- 将submitterid的选中项数设置为sel.selectedIndex的值  -->  

											   $("#submitterid").val($("#submitterid option:eq("+submitterididselectedindex+")").val());

											}                                                         </script>
									</div>
									<div class="form-group">
										<label>截止日期</label>
										<!-- 定义截止日期时间选择框  -->

										<input type="date" name="closingdate" class="form-control">
									</div>
									<div class="form-group">
										<label>任务描述</label>
										<!-- 定义任务描述本文输入框  -->

										<textarea name="introduce" class="form-control"
											style="height: 300px;"></textarea>
									</div>
									<div class="form-group">
										<label>任务文件</label>
										<!-- 定义 任务文件输入框 -->

										<input name="taskfile" class="form-control">
									</div>
									<div class="form-group">
										<label>状态</label>
										<!-- 定义state下拉框 并定义其onchange方法statechange(this)" -->

										<select id='state' onchange="statechange(this)" name="state"
											class="form-control"><option>未完成</option>
											<option>已完成</option></select>
										<!-- 为下拉框添加自定义数据 -->


									</div>
									<div class="form-footer">
										<button type="submit" class="btn btn-success">
											<i class="fa fa-check-square-o"></i>添加
										</button>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
				<!--End Row-->

			</div>
			<!-- End container-fluid-->

		</div>
		<!--End content-wrapper-->
		<!--Start Back To Top Button-->
		<a href="javaScript:void();" class="back-to-top"><i
			class="fa fa-angle-double-up"></i> </a>
		<!--End Back To Top Button-->

		<!--Start footer-->
		<footer class="footer">
			<div class="container">
				<div class="text-center">
					
				</div>
			</div>
		</footer>
		<!--End footer-->

	</div>
	<!--End wrapper-->


	<!-- Bootstrap core JavaScript-->
	<script src="resource/houtai/assets/js/jquery.min.js"></script>
	<script src="resource/houtai/assets/js/popper.min.js"></script>
	<script src="resource/houtai/assets/js/bootstrap.min.js"></script>

	<!-- simplebar js -->
	<script src="resource/houtai/assets/plugins/simplebar/js/simplebar.js"></script>
	<!-- waves effect js -->
	<script src="resource/houtai/assets/js/waves.js"></script>
	<!-- sidebar-menu js -->
	<script src="resource/houtai/assets/js/sidebar-menu.js"></script>
	<!-- Custom scripts -->
	<script src="resource/houtai/assets/js/app-script.js"></script>

	<!--Form Validatin Script-->
	<script
		src="resource/houtai/assets/plugins/jquery-validation/js/jquery.validate.min.js"></script>
	<script>

    $().ready(function() {

        $("#personal-info").validate();

    });
    if("${message}"){
        alert("${message}");
    }
</script>

</body>
</html>

