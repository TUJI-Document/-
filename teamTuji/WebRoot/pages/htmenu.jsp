

<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<c:if test="${sessionScope.identity == '管理员' }">
		<ul class="sidebar-menu do-nicescrol">
			<li><a href="javaScript:void();" class="waves-effect"> <i
					class="fa fa-share"></i> <span>管理员管理</span> <i
					class="fa fa-angle-left pull-right"></i>
			</a>
				<ul class="sidebar-submenu">
					<li><a href="addadmin.action"><i
							class="zmdi zmdi-star-outline"></i>添加管理员</a></li>
					<li><a href="adminmanage.action"><i
							class="zmdi zmdi-star-outline"></i>管理员管理</a></li>
				</ul></li>

			<li><a href="javaScript:void();" class="waves-effect"> <i
					class="fa fa-share"></i> <span>收集人管理</span> <i
					class="fa fa-angle-left pull-right"></i>
			</a>
				<ul class="sidebar-submenu">
					<li><a href="addcollector.action"><i
							class="zmdi zmdi-star-outline"></i>添加收集人</a></li>
					<li><a href="collectormanage.action"><i
							class="zmdi zmdi-star-outline"></i>收集人管理</a></li>
				</ul></li>

			<li><a href="javaScript:void();" class="waves-effect"> <i
					class="fa fa-share"></i> <span>提交人管理</span> <i
					class="fa fa-angle-left pull-right"></i>
			</a>
				<ul class="sidebar-submenu">
					<li><a href="addsubmitter.action"><i
							class="zmdi zmdi-star-outline"></i>添加提交人</a></li>
					<li><a href="submittermanage.action"><i
							class="zmdi zmdi-star-outline"></i>提交人管理</a></li>
				</ul></li>

			<li><a href="javaScript:void();" class="waves-effect"> <i
					class="fa fa-share"></i> <span>任务管理</span> <i
					class="fa fa-angle-left pull-right"></i>
			</a>
				<ul class="sidebar-submenu">
					<li><a href="addtask.action"><i
							class="zmdi zmdi-star-outline"></i>添加任务</a></li>
					<li><a href="taskmanage.action"><i
							class="zmdi zmdi-star-outline"></i>任务管理</a></li>
				</ul></li>

			<li><a href="javaScript:void();" class="waves-effect"> <i
					class="fa fa-share"></i> <span>提交人任务管理</span> <i
					class="fa fa-angle-left pull-right"></i>
			</a>
				<ul class="sidebar-submenu">
					<li><a href="addsubmittertask.action"><i
							class="zmdi zmdi-star-outline"></i>添加提交人任务</a></li>
					<li><a href="submittertaskmanage.action"><i
							class="zmdi zmdi-star-outline"></i>提交人任务管理</a></li>
				</ul></li>


			<li><a href="exitsystem.action" class="waves-effect"><i
					class="zmdi zmdi-share text-info"></i> <span>退出系统</span></a></li>
		</ul>
	</c:if>
	<c:if test="${sessionScope.identity == '收集人' }">
		<ul class="sidebar-menu do-nicescrol">
			
			<li><a href="javaScript:void();" class="waves-effect"> <i
					class="fa fa-share"></i> <span>提交人管理</span> <i
					class="fa fa-angle-left pull-right"></i>
			</a>
				<ul class="sidebar-submenu">
					<li><a href="addsubmitter.action"><i
							class="zmdi zmdi-star-outline"></i>添加提交人</a></li>
					<li><a href="submittermanage.action"><i
							class="zmdi zmdi-star-outline"></i>提交人管理</a></li>
				</ul></li>

			<li><a href="javaScript:void();" class="waves-effect"> <i
					class="fa fa-share"></i> <span>任务管理</span> <i
					class="fa fa-angle-left pull-right"></i>
			</a>
				<ul class="sidebar-submenu">
					<li><a href="collectoraddtask.action"><i
							class="zmdi zmdi-star-outline"></i>添加任务</a></li>
					<li><a href="collectortaskmanage.action"><i
							class="zmdi zmdi-star-outline"></i>任务管理</a></li>
				</ul></li>
				
			
						<li><a href="javaScript:void();" class="waves-effect"> <i
					class="fa fa-share"></i> <span>提交人任务管理</span> <i
					class="fa fa-angle-left pull-right"></i>
			</a>
				<ul class="sidebar-submenu">
					<li><a href="addsubmittertask.action"><i
							class="zmdi zmdi-star-outline"></i>添加提交人任务</a></li>
					<li><a href="submittertaskmanage.action"><i
							class="zmdi zmdi-star-outline"></i>提交人任务管理</a></li>
				</ul></li>
			
			
			<li><a href="exitsystem.action" class="waves-effect"><i
					class="zmdi zmdi-share text-info"></i> <span>退出系统</span></a></li>
		</ul>
	</c:if>
	<c:if test="${sessionScope.identity == '提交人' }">
		<ul class="sidebar-menu do-nicescrol">
			
						<li><a href="javaScript:void();" class="waves-effect"> <i
					class="fa fa-share"></i> <span>任务管理</span> <i
					class="fa fa-angle-left pull-right"></i>
			</a>
				<ul class="sidebar-submenu">
				<li><a href="submittertaskmanage.action"><i
							class="zmdi zmdi-star-outline"></i>需完成任务管理</a></li>
					<li><a href="submittertaskmanage.action"><i
							class="zmdi zmdi-star-outline"></i>已提交任务管理</a></li>
				</ul></li>
			
			<li><a href="exitsystem.action" class="waves-effect"><i
					class="zmdi zmdi-share text-info"></i> <span>退出系统</span></a></li>
		</ul>
	</c:if>


</body>
</html>


