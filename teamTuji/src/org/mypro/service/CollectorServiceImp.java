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

import org.mypro.dao.CollectorMapper;

import org.mypro.entity.Collector;

import org.mypro.entity.CollectorExample;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.multipart.MultipartFile;

public interface CollectorServiceImp {

	// 定义方法addcollector接口,响应控制层添加收集人请求

	public void addcollector(HttpServletRequest request, HttpSession session);

	// 定义addcollectoract接口

	public void addcollectoract(HttpServletRequest request, HttpSession session, Collector collector)
			throws IOException;

	// 定义collectormanage方法响应页面请求

	public void collectormanage(HttpServletRequest request, HttpSession session);

	// 定义 collectorview方法

	public void collectorview(HttpServletRequest request, HttpSession session);

	// 定义 updatecollector方法

	public void updatecollector(HttpServletRequest request, HttpSession session, int id);

	// 定义updatecollectoract处理收集人修改

	public void updatecollectoract(HttpServletRequest request, Collector collector, HttpSession session)
			throws IOException;

	// 定义deletecollector,处理删除收集人

	public void deletecollector(HttpServletRequest request, HttpSession session, int id);

	// 定义searchcollector方法，处理搜索操作

	public void searchcollector(HttpServletRequest request, HttpSession session, String search);

	// 定义CollectorpinglunMapper

	public void collectordetails(HttpServletRequest request, HttpSession session, int id);

}
