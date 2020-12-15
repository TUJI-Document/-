
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
<title>任务管理</title>
<!--favicon-->
<link rel="icon" href="resource/houtai/assets/images/favicon.ico"
	type="image/x-icon">
<!-- simplebar CSS-->
<link href="resource/houtai/assets/plugins/simplebar/css/simplebar.css"
	rel="stylesheet" />
<!-- Bootstrap core CSS-->
<link href="resource/houtai/assets/css/bootstrap.min.css"
	rel="stylesheet" />
<!--Data Tables -->
<link
	href="resource/houtai/assets/plugins/bootstrap-datatable/css/dataTables.bootstrap4.min.css"
	rel="stylesheet" type="text/css">
<link
	href="resource/houtai/assets/plugins/bootstrap-datatable/css/buttons.bootstrap4.min.css"
	rel="stylesheet" type="text/css">
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
					<h5 class="logo-text">任务管理</h5>
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
						<h4 class="page-title">任务管理</h4>
					</div>
				</div>
				<!-- End Breadcrumb-->


				<div class="row">
					<div class="col-lg-12">
						<div class="card">
							<div class="card-header">
								<i class="fa fa-table"></i> 任务管理
							</div>
							<div class="card-body">
								<div class="table-responsive">
									<table id="example" class="table table-bordered">
										<thead>
											<th>名字</th>
											<th>任务描述</th>
											<th>截止日期</th>
											<th>文件</th>
											<th>提交人数量</th>
											<th>收集人</th>
											<th>收集人id</th>
											<th>操作</th>
										</thead>
										<tbody>





											<c:if test="${ !empty taskall}">

												<c:forEach items="${ taskall}" var="item">



													<tr>
														<td>${item.name }</td>
														<td>${item.introduce }</td>
														<td>${item.closingdate }</td>
														<td>
															<!-- 将文件从服务器中获取并制作a标签链接到文件处进行下载 --> <a
															href="resource/uploads/${item.file }"
															download="${item.file }">下载</a>

														</td>
														<td>${item.submitternumber }</td>
														<td>${item.collector }</td>
														<td>${item.collectorid }</td>
														<td>
															<!--  定义修改任务按钮和删除任务按钮，修改提交地址为updatetask.action?id=${item.id}，删除提交地址为 deletetask.action?id=${item.id}-->

															<a href="updatetask.action?id=${item.id}">修改</a> <a
															href="deletetask.action?id=${item.id}">删除</a>

														</td>
													</tr>

												</c:forEach>

											</c:if>

										</tbody>
									</table>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!-- End Row-->

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

	<!--Data Tables js-->
	<script
		src="resource/houtai/assets/plugins/bootstrap-datatable/js/jquery.dataTables.min.js"></script>
	<script
		src="resource/houtai/assets/plugins/bootstrap-datatable/js/dataTables.bootstrap4.min.js"></script>
	<script
		src="resource/houtai/assets/plugins/bootstrap-datatable/js/dataTables.buttons.min.js"></script>
	<script
		src="resource/houtai/assets/plugins/bootstrap-datatable/js/buttons.bootstrap4.min.js"></script>
	<script
		src="resource/houtai/assets/plugins/bootstrap-datatable/js/jszip.min.js"></script>
	<script
		src="resource/houtai/assets/plugins/bootstrap-datatable/js/pdfmake.min.js"></script>
	<script
		src="resource/houtai/assets/plugins/bootstrap-datatable/js/vfs_fonts.js"></script>
	<script
		src="resource/houtai/assets/plugins/bootstrap-datatable/js/buttons.html5.min.js"></script>
	<script
		src="resource/houtai/assets/plugins/bootstrap-datatable/js/buttons.print.min.js"></script>
	<script
		src="resource/houtai/assets/plugins/bootstrap-datatable/js/buttons.colVis.min.js"></script>

	<script>
    $(document).ready(function() {
        //Default data table
        $('#default-datatable').DataTable();


        var table = $('#example').DataTable( {
            lengthChange: false,
            buttons: [  ]
        } );

        table.buttons().container()
            .appendTo( '#example_wrapper .col-md-6:eq(0)' );

    } );

    if("${message}"){
        alert("${message}");
    }

</script>

</body>
</html>

