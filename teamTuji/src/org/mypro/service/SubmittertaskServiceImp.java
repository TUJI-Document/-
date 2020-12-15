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

import org.mypro.dao.SubmittertaskMapper;

import org.mypro.entity.Submittertask;

import org.mypro.entity.SubmittertaskExample;

import org.mypro.entity.Task;

import org.mypro.entity.TaskExample;

import org.mypro.dao.TaskMapper;

import org.mypro.entity.Submitter;

import org.mypro.entity.SubmitterExample;

import org.mypro.dao.SubmitterMapper;

import org.mypro.entity.Submitter;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.multipart.MultipartFile;

public interface SubmittertaskServiceImp {

	// 定义方法addsubmittertask接口,响应控制层添加提交人任务请求

	public void addsubmittertask(HttpServletRequest request, HttpSession session);

	// 定义submitteraddsubmittertask接口，在提交人任务控制层中调用

	public void submitteraddsubmittertask(HttpServletRequest request, HttpSession session);

	// 定义submitterupdatesubmittertask方法

	public void submitterupdatesubmittertask(HttpServletRequest request, HttpSession session, int id);

	// 定义submittersubmittertaskmanage方法

	public void submittersubmittertaskmanage(HttpServletRequest request, HttpSession session);

	// 定义submitteraddsubmittertaskact接口，响应控制层添加请求

	public void submitteraddsubmittertaskact(HttpServletRequest request, HttpSession session,
			Submittertask submittertask) throws IOException;

	// 定义addsubmittertaskact接口

	public void addsubmittertaskact(HttpServletRequest request, HttpSession session, Submittertask submittertask)
			throws IOException;

	// 定义submittertaskmanage方法响应页面请求

	public void submittertaskmanage(HttpServletRequest request, HttpSession session);

	// 定义 submittertaskview方法

	public void submittertaskview(HttpServletRequest request, HttpSession session);

	// 定义 updatesubmittertask方法

	public void updatesubmittertask(HttpServletRequest request, HttpSession session, int id);

	// 定义updatesubmittertaskact处理提交人任务修改

	public void updatesubmittertaskact(HttpServletRequest request, Submittertask submittertask, HttpSession session)
			throws IOException;

	// 定义submitterupdatesubmittertaskact方法

	public void submitterupdatesubmittertaskact(HttpServletRequest request, Submittertask submittertask,
			HttpSession session) throws IOException;

	// 定义deletesubmittertask,处理删除提交人任务

	public void deletesubmittertask(HttpServletRequest request, HttpSession session, int id);

	// 定义submitterdeletesubmittertask方法

	public void submitterdeletesubmittertask(HttpServletRequest request, HttpSession session, int id);

	// 定义searchsubmittertask方法，处理搜索操作

	public void searchsubmittertask(HttpServletRequest request, HttpSession session, String search);

	// 定义SubmittertaskpinglunMapper

	public void submittertaskdetails(HttpServletRequest request, HttpSession session, int id);

}
