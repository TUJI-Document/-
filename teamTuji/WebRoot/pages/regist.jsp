
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
<title>注册</title>
<!--favicon-->
<link rel="icon" href="resource/houtai/assets/images/favicon.ico"
	type="image/x-icon">
<!-- Bootstrap core CSS-->
<link href="resource/houtai/assets/css/bootstrap.min.css"
	rel="stylesheet" />
<!-- animate CSS-->
<link href="resource/houtai/assets/css/animate.css" rel="stylesheet"
	type="text/css" />
<!-- Icons CSS-->
<link href="resource/houtai/assets/css/icons.css" rel="stylesheet"
	type="text/css" />
<!-- Custom Style-->
<link href="resource/houtai/assets/css/app-style.css" rel="stylesheet" />
<script src="resource/houtai/assets/js/jquery.min.js"></script>
</head>

<body class="bg-dark">
	<!-- Start wrapper-->
	<div id="wrapper">
		<div class="card card-authentication1 mx-auto my-5">
			<div class="card-body">
				<div class="card-content p-2">
					<div class="text-center">
						<img src="resource/houtai/assets/images/logo-icon.png"
							alt="logo icon">
					</div>
					<div class="card-title text-uppercase text-center py-3">注册</div>
					<form class="widget-form" action="registact.action" method="post">
						<div class="form-group">
							<label class="">Username</label>
							<div class="position-relative has-icon-right">
								<input type="text" class="form-control input-shadow"
									name="username" placeholder="请输入用户名" required>
								<div class="form-control-position">
									<i class="icon-user"></i>
								</div>
							</div>
						</div>
						<div class="form-group">
							<label class="">Password</label>
							<div class="position-relative has-icon-right">
								<input name="password" type="password" placeholder="请输入密码"
									class="form-control input-shadow">
								<div class="form-control-position">
									<i class="icon-lock"></i>
								</div>
							</div>
						</div>



						<div class="form-group">
							<label class="">RePassword</label>
							<div class="position-relative has-icon-right">
								<input name="repassword" type="password" placeholder="请确认密码"
									class="form-control input-shadow">
								<div class="form-control-position">
									<i class="icon-lock"></i>
								</div>
							</div>
						</div>


						<div class="form-group">
							<label class="">身份</label>
							<div class="position-relative has-icon-right">
								<select class="form-control input-shadow" name="identity">
									<option>收集人</option>
									<option>提交人</option>
								</select>
							</div>
						</div>


						<button type="submit"
							class="btn btn-primary shadow-primary btn-block waves-effect waves-light">注册</button>
						<div class="text-center mt-3">注册</div>

					</form>
				</div>
			</div>
			<div class="card-footer text-center py-3">
				<p class="text-muted mb-0">
					已有账号，点击<a href="login.action">登录</a>
				</p>
			</div>
		</div>

		<!--Start Back To Top Button-->
		<a href="javaScript:void();" class="back-to-top"><i
			class="fa fa-angle-double-up"></i> </a>
		<!--End Back To Top Button-->
	</div>
	<!--wrapper-->

	<!-- Bootstrap core JavaScript-->
	<script src="resource/houtai/assets/js/jquery.min.js"></script>
	<script src="resource/houtai/assets/js/popper.min.js"></script>
	<script src="resource/houtai/assets/js/bootstrap.min.js"></script>
	<script>
    if("${message}"){
        alert("${message}");
    }
</script>
</body>
</html>

