
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
<title>修改提交人任务</title>
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
					<h5 class="logo-text">修改提交人任务</h5>
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
						<h4 class="page-title">修改提交人任务</h4>
						</ol>
					</div>
				</div>
				<!-- End Breadcrumb-->
				<div class="row">
					<div class="col-lg-12">
						<div class="card">
							<div class="card-body">
								<form action="submitterupdatesubmittertaskact.action"
									method="post" enctype="multipart/form-data">
									<h4 class="form-header">
										<i class="fa fa-file-text-o"></i> 修改提交人任务
									</h4>
									<input name='id' style='display: none;'
										value="${submittertask.id}">
									<div class="form-group">
										<label>任务</label>
										<!-- 定义任务下拉框，并定义其onchange事件 -->

										<select id='task' onchange="taskchange(this)" name="task"
											class="form-control">
											<!-- 使用c标签的if表达式判断 taskall是否为空 -->

											<c:if test="${ !empty taskall}">

												<!-- 使用c标签的forEach表达式循环输入 taskall -->

												<c:forEach items="${ taskall}" var="item">



													<option value="${item.name }">${item.name }</option>

												</c:forEach>

											</c:if>



										</select>

										<script>

 <!-- 定义taskchange方法 -->  

                                                	function taskchange(select){

 <!-- 将id为taskid的项数设置为select的选中项的项数 -->  

                                           $("#taskid").val($("#taskid option:eq("+select.selectedIndex+")").val());                                                	}

                                                </script>
										<script>
 <!-- 将id为task值设置为request中的submittertask.task -->  

$("#task").val("${submittertask.task}")</script>

									</div>
									<!-- 设置div的display为none，将其进行隐藏 -->

									<div style='display: none;' class="form-group">
										<label>任务id</label>
										<!-- 定义任务id下拉框，并定义其onchange事件 -->

										<select id='taskid' onchange="taskidchange(this)"
											name="taskid" class="form-control">
											<!-- 使用c标签的if表达式判断 taskall是否为空 -->

											<c:if test="${ !empty taskall}">

												<!-- 使用c标签的forEach表达式循环输入 taskall -->

												<c:forEach items="${ taskall}" var="item">



													<option value="${item.id }">${item.id }</option>

												</c:forEach>

											</c:if>



										</select>

										<script>

 <!-- 定义taskidchange方法 -->  

                                                	function taskidchange(select){

 <!-- 将id为taskidid的项数设置为select的选中项的项数 -->  

                                           $("#taskidid").val($("#taskidid option:eq("+select.selectedIndex+")").val());                                                	}

                                                </script>
										<script>
 <!-- 将id为taskid值设置为request中的submittertask.taskid -->  

$("#taskid").val("${submittertask.taskid}")</script>

									</div>
									<!-- 设置div display属性为none，将其隐藏 -->

									<div style='display: none;' class="form-group">
										<label>提交人</label> <input
											value="${sessionScope.userinfo.name}" name="submitter"
											class="form-control">
									</div>
									<!-- 设置div display属性为none，将其隐藏 -->

									<div style='display: none;' class="form-group">
										<label>提交人id</label> <input
											value="${sessionScope.userinfo.id}" name="submitterid"
											class="form-control">
									</div>
									<div class="form-group">
										<label>截止日期</label>
										<!-- 定义截止日期时间输入框 -->

										<input type="date" name="closingdate"
											value="${submittertask.closingdate}" class="form-control">
									</div>
									<div class="form-group">
										<label>任务描述</label>
										<!-- 定义任务描述文本输入框 -->

										<textarea name="introduce" class="form-control"
											style="height: 300px;">${submittertask.introduce}</textarea>
									</div>
									<div class="form-group">
										<label>任务文件</label>
										<!-- 定义任务文件输入框并赋值 -->

										<input name="taskfile" value="${submittertask.taskfile}"
											class="form-control">
									</div>
									<div class="form-group">
										<label>状态</label>
										<!-- 定义状态下拉框，并定义其onchange事件 -->

										<select id='state' onchange="statechange(this)" name="state"
											class="form-control"><option>未完成</option>
											<option>已完成</option></select>
										<script>
 <!-- 将id为state的input赋值为request中的 submittertask.state-->  

$("#state").val("${submittertask.state}")</script>

									</div>
									<div class="form-footer">
										<button type="submit" class="btn btn-success">
											<i class="fa fa-check-square-o"></i>修改
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

