package org.mypro.service;

import java.io.File;

import java.io.IOException;

import java.math.BigDecimal;

import java.text.SimpleDateFormat;

import java.util.ArrayList;

import java.util.HashMap;

import java.util.Map;

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

@Service

public class SubmitterService implements SubmitterServiceImp {

	private static final Log logger = LogFactory.getLog(SubmitterService.class);

	@Autowired
	private SubmitterMapper submitterdao;

	// 定义方法addsubmitter,响应控制层addsubmitter请求

	public void addsubmitter(HttpServletRequest request, HttpSession session) {

		// 输出日志，当前执行方法为addsubmitter

		logger.debug("SubmitterService.addsubmitter ......");

	}

	// 定义addsubmitteract方法

	public void addsubmitteract(HttpServletRequest request, HttpSession session, Submitter submitter)
			throws IOException {

		// 输出当前方法日志，表示正在执行SubmitterService.addsubmitteract方法

		logger.debug("SubmitterService.addsubmitteract ......");

		// 使用submitterdao的insert方法将提交人添加到数据库中

		submitterdao.insert(submitter);

		// 将添加提交人信息添加到request中用message参数进行保存

		request.setAttribute("message", "添加提交人成功");

	}

	// 定义submittermanage方法响应页面请求

	public void submittermanage(HttpServletRequest request, HttpSession session) {

		// 输出日志，表示当前正在执行SubmitterService.submittermanage

		logger.debug("SubmitterService.submittermanage ......");

		// 实例化SubmitterExample类为example

		SubmitterExample example = new SubmitterExample();

		// 使用 submitterdao.selectByExample(example)方法获取所有的提交人数据

		List submitterall = submitterdao.selectByExample(example);

		// 将所有的提交人数据保存到request中的submitterall参数里

		request.setAttribute("submitterall", submitterall);

	}

	// 定义 submitterview方法

	public void submitterview(HttpServletRequest request, HttpSession session) {

		// 输出日志，表示当前正在执行SubmitterService.submitterview方法

		logger.debug("SubmitterService.submitterview ......");

		// 实例化SubmitterExample类

		SubmitterExample example = new SubmitterExample();

		// 使用submitterdao的selectByExample方法查询提交人信息

		List submitterall = submitterdao.selectByExample(example);

		// 将查询的submitterall保存到request中，记录为参数submitterall

		request.setAttribute("submitterall", submitterall);

	}

	// 定义 updatesubmitter方法

	public void updatesubmitter(HttpServletRequest request, HttpSession session, int id) {

		// 输出日志SubmitterController.updatesubmitter，表示正在执行该方法

		logger.debug("SubmitterController.updatesubmitter ......");

		// 定义提交人为biaoming，使用 submitterdao的selectByPrimaryKey方法通过id查询数据

		Submitter submitter = submitterdao.selectByPrimaryKey(id);

		// 将查询的提交人保存到request中

		request.setAttribute("submitter", submitter);

	}

	// 定义updatesubmitteract处理提交人修改

	public void updatesubmitteract(HttpServletRequest request, Submitter submitter, HttpSession session)
			throws IOException {

		// 输出日志，表示正在执行当前方法SubmitterController.updatesubmitteract

		logger.debug("SubmitterController.updatesubmitteract ......");

		// 执行submitterdao的updateByPrimaryKeySelective方法，将传入的提交人数据同步到数据库中

		submitterdao.updateByPrimaryKeySelective(submitter);

		// 将修改成功信息保存到request中

		request.setAttribute("message", "修改提交人信息成功");

	}

	// 定义deletesubmitter,处理删除提交人

	public void deletesubmitter(HttpServletRequest request, HttpSession session, int id) {

		// 输出日志，表示当前正在执行SubmitterService.deletesubmitter方法

		logger.debug("SubmitterService.deletesubmitter ......");

		// 根据id调用submitterdao的deleteByPrimaryKey方法，删除提交人

		submitterdao.deleteByPrimaryKey(id);

		request.setAttribute("message", "删除提交人成功");

	}

	// 定义searchsubmitter方法，处理搜索操作

	public void searchsubmitter(HttpServletRequest request, HttpSession session, String search) {

		// 输出日志，表示当前正在执行SubmitterService.searchsubmitter

		logger.debug("SubmitterService.searchsubmitter ......");

		// 实例化 SubmitterExample

		SubmitterExample example = new SubmitterExample();

		// 实例化 SubmitterExample的Criteria内部类

		SubmitterExample.Criteria criteria = example.createCriteria();

		// 如果搜索内容不等于空

		if (search != null) {

			// 将搜索内容通过like关键字传到数据库中进行搜索

			criteria.andNameLike("%" + search + "%");

		}

		// 查询提交人结果

		List submitterall = submitterdao.selectByExample(example);

		// 将查询到的提交人 保存到request中进行保存

		request.setAttribute("submitterall", submitterall);

	}

	// 定义SubmitterpinglunMapper

	public void submitterdetails(HttpServletRequest request, HttpSession session, int id) {

		// 输入日志信息，表名当前执行方法为SubmitterController.submitterdetails

		logger.debug("SubmitterController.submitterdetails ......");

		// 传入页面所传入的提交人id使用submitterdao的selectByPrimaryKey方法进行查询

		Submitter submitter = submitterdao.selectByPrimaryKey(id);

		// 将查询到的提交人保存到request中

		request.setAttribute("submitter", submitter);

	}

	// 上传文件图片等

	public String uploadUtile(MultipartFile file, HttpServletRequest request) throws IOException {

		// 根据当前时间生成时间字符串

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSS");

		String res = sdf.format(new Date());

		// uploads文件夹位置

		String rootPath = request.getSession().getServletContext().getRealPath("resource/uploads/");

		// 原始名称

		String originalFileName = file.getOriginalFilename();

		// 新文件名

		String newFileName = "sliver" + res + originalFileName.substring(originalFileName.lastIndexOf("."));

		// 创建年月文件夹

		Calendar date = Calendar.getInstance();

		File dateDirs = new File(date.get(Calendar.YEAR) + File.separator + (date.get(Calendar.MONTH) + 1));

		// 新文件

		File newFile = new File(rootPath + File.separator + dateDirs + File.separator + newFileName);

		// 判断目标文件所在目录是否存在

		if (!newFile.getParentFile().exists()) {

			// 如果目标文件所在的目录不存在，则创建父目录

			newFile.getParentFile().mkdirs();

		}

		System.out.println(newFile);

		// 将内存中的数据写入磁盘

		file.transferTo(newFile);

		// 完整的url

		String fileUrl = date.get(Calendar.YEAR) + "/" + (date.get(Calendar.MONTH) + 1) + "/" + newFileName;

		return fileUrl;

	}
}
