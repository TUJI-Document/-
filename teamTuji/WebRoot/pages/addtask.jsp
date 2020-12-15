
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
<title>添加任务</title>
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
					<h5 class="logo-text">添加任务</h5>
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
						<h4 class="page-title">添加任务</h4>
						</ol>
					</div>
				</div>
				<!-- End Breadcrumb-->
				<div class="row">
					<div class="col-lg-12">
						<div class="card">
							<div class="card-body">
								<form action="addtaskact.action" method="post"
									enctype="multipart/form-data">
									<h4 class="form-header">
										<i class="fa fa-file-text-o"></i> 添加任务
									</h4>
									<div class="form-group">
										<label>名字</label>
										<!-- 定义 名字输入框 -->

										<input name="name" class="form-control">
									</div>
									<div class="form-group">
										<label>任务描述</label>
										<!-- 定义 任务描述输入框 -->

										<input name="introduce" class="form-control">
									</div>
									<div class="form-group">
										<label>截止日期</label>
										<!-- 定义截止日期时间选择框  -->

										<input type="date" name="closingdate" class="form-control">
									</div>
									<div class="form-group">
										<label>文件</label>
										<!-- 定义文件文件选择框  -->

										<input type="file" name="filefile" class="form-control">
									</div>
									<div class="form-group">
										<label>提交人数量</label>
										<!-- 定义提交人数量数字输入框  -->

										<input type="number" name="submitternumber"
											class="form-control">
									</div>
									<div class="form-group">
										<label>收集人</label>
										<!-- 定义collector下拉框 并定义其onchange方法collectorchange(this)" -->

										<select id='collector' onchange="collectorchange(this)"
											name="collector" class="form-control">
											<!-- 用c标签的if表达式判断collectorall是否为空  -->

											<c:if test="${ !empty collectorall}">

												<!-- 用c标签的forEach循环展示 request中的collectorall  -->

												<c:forEach items="${ collectorall}" var="item">



													<option value="${item.name }">${item.name }</option>

												</c:forEach>

											</c:if>



										</select>

										<script>

 <!-- 定义collectorchange方法  -->  

                                                	function collectorchange(select){

 <!-- 将collectorid"的被选中项数设置为与传入的select.selectedIndex相同  -->  

                                           $("#collectorid").val($("#collectorid option:eq("+select.selectedIndex+")").val());                                                	}

 <!-- 定义GetQueryString方法获取参数栏中的参数值  -->  

										function GetQueryString(name) { 

											　　　var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)","i");

											     var r = window.location.search.substr(1).match(reg); 

											　　　if (r!=null) return (r[2]); 

											　　　return null; 

											} 

                                                                                           	

 <!-- 若地址栏中存在collectorid时获取地址栏中的collectorid值  -->  

                                            var collectorid = GetQueryString("collectorid"); 

 <!-- 判断collectorid是否为null  -->  

											if(collectorid!=null) { 

 <!-- 将id为collectorid的值设置为参数栏中collectorid的值  -->  

											　　$("#collectorid").val(collectorid);

 <!-- 获取id为collectorid的select保存为sel变量  -->  

												var sel=document.getElementById("collectorid"); 

 <!-- 获取sel的当前的选中值  -->  

												var collectoridselectedindex = sel.selectedIndex;

 <!-- 将collector的选中项数设置为sel.selectedIndex的值  -->  

											   $("#collector").val($("#collector option:eq("+collectoridselectedindex+")").val());

											}                                                         </script>
									</div>
									<!-- 设置display为none,设置为不可见 -->

									<div style='display: none;' class="form-group">
										<label>收集人id</label>
										<!-- 定义collectorid下拉框 并定义其onchange方法collectoridchange(this)" -->

										<select id='collectorid' onchange="collectoridchange(this)"
											name="collectorid" class="form-control">
											<!-- 用c标签的if表达式判断collectorall是否为空  -->

											<c:if test="${ !empty collectorall}">

												<!-- 用c标签的forEach循环展示 request中的collectorall  -->

												<c:forEach items="${ collectorall}" var="item">



													<option value="${item.id }">${item.id }</option>

												</c:forEach>

											</c:if>



										</select>

										<script>

 <!-- 定义collectoridchange方法  -->  

                                                	function collectoridchange(select){

 <!-- 将collectoridid"的被选中项数设置为与传入的select.selectedIndex相同  -->  

                                           $("#collectoridid").val($("#collectoridid option:eq("+select.selectedIndex+")").val());                                                	}

 <!-- 定义GetQueryString方法获取参数栏中的参数值  -->  

										function GetQueryString(name) { 

											　　　var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)","i");

											     var r = window.location.search.substr(1).match(reg); 

											　　　if (r!=null) return (r[2]); 

											　　　return null; 

											} 

                                                                                           	

 <!-- 若地址栏中存在collectoridid时获取地址栏中的collectoridid值  -->  

                                            var collectoridid = GetQueryString("collectoridid"); 

 <!-- 判断collectoridid是否为null  -->  

											if(collectoridid!=null) { 

 <!-- 将id为collectoridid的值设置为参数栏中collectoridid的值  -->  

											　　$("#collectoridid").val(collectoridid);

 <!-- 获取id为collectoridid的select保存为sel变量  -->  

												var sel=document.getElementById("collectoridid"); 

 <!-- 获取sel的当前的选中值  -->  

												var collectorididselectedindex = sel.selectedIndex;

 <!-- 将collectorid的选中项数设置为sel.selectedIndex的值  -->  

											   $("#collectorid").val($("#collectorid option:eq("+collectorididselectedindex+")").val());

											}                                                         </script>
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

