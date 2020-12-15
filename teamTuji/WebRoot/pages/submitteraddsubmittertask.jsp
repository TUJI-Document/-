
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
								<form action="submitteraddsubmittertaskact.action" method="post"
									enctype="multipart/form-data">
									<h4 class="form-header">
										<i class="fa fa-file-text-o"></i> 添加提交人任务
									</h4>
									<div class="form-group">
										<label>任务</label>
										<!--  定义 task-->

										<select id='task' onchange="taskchange(this)" name="task"
											class="form-control">
											<!-- 使用c标签的if表达式判断taskall是否为空 -->

											<c:if test="${ !empty taskall}">

												<!-- 使用c标签的forEach表达式循环taskall并将其name字段进行展示 -->

												<c:forEach items="${ taskall}" var="item">



													<option value="${item.name }">${item.name }</option>

												</c:forEach>

											</c:if>



										</select>

										<script>

// 定义taskchange方法，当task改变时执行 

                                                	function taskchange(select){

<!-- 将taskid"的值改变为与 task项数相同的值，即task为第一项则taskid为第一项-->

                                           $("#taskid").val($("#taskid option:eq("+select.selectedIndex+")").val());                                                	}

<!-- 定义GetQueryString方法，该方法目的为获取地址栏中的参数 -->

										function GetQueryString(name) { 

											　　　var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)","i");

											     var r = window.location.search.substr(1).match(reg); 

											　　　if (r!=null) return (r[2]); 

											　　　return null; 

											} 

                                                                                           	

<!-- 若地址栏中存在taskid，使用GetQueryString方法获取该值 -->

                                            var taskid = GetQueryString("taskid"); 

<!-- 如果taskid不等于null -->

											if(taskid!=null) { 

<!-- 将地址栏中的 taskid值赋值给id为taskid的项-->

											　　$("#taskid").val(taskid);

<!-- 获取到id为taskid的项-->

												var sel=document.getElementById("taskid"); 

<!-- 获取到sel当前的选择项-->

												var taskidselectedindex = sel.selectedIndex;

<!-- 将id为task赋值为与taskid相同的项数的值，即当前taskid项目为第一项时，task项为第一项 -->

											   $("#task").val($("#task option:eq("+taskidselectedindex+")").val());

											}                                                         </script>
									</div>
									<div style='display: none;' class="form-group">
										<label>任务id</label>
										<!--  定义 taskid-->

										<select id='taskid' onchange="taskidchange(this)"
											name="taskid" class="form-control">
											<!-- 使用c标签的if表达式判断taskall是否为空 -->

											<c:if test="${ !empty taskall}">

												<!-- 使用c标签的forEach表达式循环taskall并将其id字段进行展示 -->

												<c:forEach items="${ taskall}" var="item">



													<option value="${item.id }">${item.id }</option>

												</c:forEach>

											</c:if>



										</select>

										<script>

// 定义taskidchange方法，当taskid改变时执行 

                                                	function taskidchange(select){

<!-- 将taskidid"的值改变为与 taskid项数相同的值，即taskid为第一项则taskidid为第一项-->

                                           $("#taskidid").val($("#taskidid option:eq("+select.selectedIndex+")").val());                                                	}

<!-- 定义GetQueryString方法，该方法目的为获取地址栏中的参数 -->

										function GetQueryString(name) { 

											　　　var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)","i");

											     var r = window.location.search.substr(1).match(reg); 

											　　　if (r!=null) return (r[2]); 

											　　　return null; 

											} 

                                                                                           	

<!-- 若地址栏中存在taskidid，使用GetQueryString方法获取该值 -->

                                            var taskidid = GetQueryString("taskidid"); 

<!-- 如果taskidid不等于null -->

											if(taskidid!=null) { 

<!-- 将地址栏中的 taskidid值赋值给id为taskidid的项-->

											　　$("#taskidid").val(taskidid);

<!-- 获取到id为taskidid的项-->

												var sel=document.getElementById("taskidid"); 

<!-- 获取到sel当前的选择项-->

												var taskididselectedindex = sel.selectedIndex;

<!-- 将id为taskid赋值为与taskidid相同的项数的值，即当前taskidid项目为第一项时，taskid项为第一项 -->

											   $("#taskid").val($("#taskid option:eq("+taskididselectedindex+")").val());

											}                                                         </script>
									</div>
									<div style='display: none;' class="form-group">
										<label>提交人</label>
										<!-- 使用el表达式给submitter复制，将session中的submitter赋值到input中-->

										<input value="${sessionScope.userinfo.name}" name="submitter"
											class="form-control">
									</div>
									<div style='display: none;' class="form-group">
										<label>提交人id</label>
										<!-- 使用el表达式给submitterid复制，将session中的submitterid赋值到input中-->

										<input value="${sessionScope.userinfo.id}" name="submitterid"
											class="form-control">
									</div>
									<div class="form-group">
										<label>截止日期</label>
										<!-- 定义closingdate时间选择框-->

										<input type="date" name="closingdate" class="form-control">
									</div>
									<div class="form-group">
										<label>任务描述</label>
										<!-- 定义introduce文本输入框-->

										<textarea name="introduce" class="form-control"
											style="height: 300px;"></textarea>
									</div>
									<div class="form-group">
										<label>任务文件</label>
										<!-- 定义taskfile输入框 -->

										<input name="taskfile" class="form-control">
									</div>
									<div class="form-group">
										<label>状态</label>
										<!--  定义 state-->

										<select id='state' onchange="statechange(this)" name="state"
											class="form-control"><option>未完成</option>
											<option>已完成</option></select>
										<!-- 给select赋值 -->


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

