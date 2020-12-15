package org.mypro.service;

import java.io.File;

import java.io.IOException;

import java.math.BigDecimal;

import java.text.SimpleDateFormat;

import java.util.HashMap;

import java.util.Map;

import java.util.ArrayList;

import java.util.Calendar;

import java.util.Collections;

import java.util.Date;

import java.util.List;

import javax.jms.Session;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;

import org.apache.commons.logging.Log;

import org.apache.commons.logging.LogFactory;

import org.mypro.dao.TaskMapper;

import org.mypro.entity.Task;

import org.mypro.entity.TaskExample;

import org.mypro.entity.Collector;

import org.mypro.entity.CollectorExample;

import org.mypro.dao.CollectorMapper;

import org.mypro.entity.Collector;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.multipart.MultipartFile;

public interface TaskServiceImp {

	// 定义方法addtask接口,响应控制层添加任务请求

	public void addtask(HttpServletRequest request, HttpSession session);

	// 定义collectoraddtask接口，在任务控制层中调用

	public void collectoraddtask(HttpServletRequest request, HttpSession session);

	// 定义collectorupdatetask方法

	public void collectorupdatetask(HttpServletRequest request, HttpSession session, int id);

	// 定义collectortaskmanage方法

	public void collectortaskmanage(HttpServletRequest request, HttpSession session);

	// 定义collectoraddtaskact接口，响应控制层添加请求

	public void collectoraddtaskact(HttpServletRequest request, HttpSession session, Task task, MultipartFile filefile)
			throws IOException;

	// 定义addtaskact接口

	public void addtaskact(HttpServletRequest request, HttpSession session, Task task, MultipartFile filefile)
			throws IOException;

	// 定义taskmanage方法响应页面请求

	public void taskmanage(HttpServletRequest request, HttpSession session);

	// 定义 taskview方法

	public void taskview(HttpServletRequest request, HttpSession session);

	// 定义 updatetask方法

	public void updatetask(HttpServletRequest request, HttpSession session, int id);

	// 定义updatetaskact处理任务修改

	public void updatetaskact(HttpServletRequest request, Task task, HttpSession session, MultipartFile filefile)
			throws IOException;

	// 定义collectorupdatetaskact方法

	public void collectorupdatetaskact(HttpServletRequest request, Task task, HttpSession session,
			MultipartFile filefile) throws IOException;

	// 定义deletetask,处理删除任务

	public void deletetask(HttpServletRequest request, HttpSession session, int id);

	// 定义collectordeletetask方法

	public void collectordeletetask(HttpServletRequest request, HttpSession session, int id);

	// 定义searchtask方法，处理搜索操作

	public void searchtask(HttpServletRequest request, HttpSession session, String search);

	// 定义TaskpinglunMapper

	public void taskdetails(HttpServletRequest request, HttpSession session, int id);

}
