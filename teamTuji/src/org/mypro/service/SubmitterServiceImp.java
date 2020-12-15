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

import org.mypro.dao.SubmitterMapper;

import org.mypro.entity.Submitter;

import org.mypro.entity.SubmitterExample;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.multipart.MultipartFile;

public interface SubmitterServiceImp {

	// 定义方法addsubmitter接口,响应控制层添加提交人请求

	public void addsubmitter(HttpServletRequest request, HttpSession session);

	// 定义addsubmitteract接口

	public void addsubmitteract(HttpServletRequest request, HttpSession session, Submitter submitter)
			throws IOException;

	// 定义submittermanage方法响应页面请求

	public void submittermanage(HttpServletRequest request, HttpSession session);

	// 定义 submitterview方法

	public void submitterview(HttpServletRequest request, HttpSession session);

	// 定义 updatesubmitter方法

	public void updatesubmitter(HttpServletRequest request, HttpSession session, int id);

	// 定义updatesubmitteract处理提交人修改

	public void updatesubmitteract(HttpServletRequest request, Submitter submitter, HttpSession session)
			throws IOException;

	// 定义deletesubmitter,处理删除提交人

	public void deletesubmitter(HttpServletRequest request, HttpSession session, int id);

	// 定义searchsubmitter方法，处理搜索操作

	public void searchsubmitter(HttpServletRequest request, HttpSession session, String search);

	// 定义SubmitterpinglunMapper

	public void submitterdetails(HttpServletRequest request, HttpSession session, int id);

}
