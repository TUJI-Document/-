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

@Service

public class SubmittertaskService implements SubmittertaskServiceImp {

	private static final Log logger = LogFactory.getLog(SubmittertaskService.class);

	@Autowired
	private SubmittertaskMapper submittertaskdao;
	// 定义taskdao参数

	@Autowired
	private TaskMapper taskdao;
	// 定义submitterdao参数

	@Autowired
	private SubmitterMapper submitterdao;

	// 定义方法addsubmittertask,响应控制层addsubmittertask请求

	public void addsubmittertask(HttpServletRequest request, HttpSession session) {

		// 输出日志，当前执行方法为addsubmittertask

		logger.debug("SubmittertaskService.addsubmittertask ......");

		// 定义 example1为 TaskExample的实例

		TaskExample example1 = new TaskExample();

		// 定义taskall的List使用 taskdao的selectByExample方法查询所有提交人任务数据

		List taskall = taskdao.selectByExample(example1);

		// 将上面查询到的提交人任务数据保存到request中，返回页面

		request.setAttribute("taskall", taskall);

		// 定义 example2为 SubmitterExample的实例

		SubmitterExample example2 = new SubmitterExample();

		// 定义submitterall的List使用 submitterdao的selectByExample方法查询所有提交人任务数据

		List submitterall = submitterdao.selectByExample(example2);

		// 将上面查询到的提交人任务数据保存到request中，返回页面

		request.setAttribute("submitterall", submitterall);

	}

	// 定义submitteraddsubmittertask方法，在提交人任务控制层中调用

	public void submitteraddsubmittertask(HttpServletRequest request, HttpSession session) {

		// 输出日志，表示当前正在执行SubmittertaskService.submitteraddsubmittertask方法

		logger.debug("SubmittertaskService.submitteraddsubmittertask ......");

		// 定义 example1为 TaskExample的实例

		TaskExample example1 = new TaskExample();

		// 定义taskall的List使用 taskdao的selectByExample方法查询所有提交人任务数据

		List taskall = taskdao.selectByExample(example1);

		// 将上面查询到的提交人任务数据保存到request中，返回页面

		request.setAttribute("taskall", taskall);

		// 定义 example2为 SubmitterExample的实例

		SubmitterExample example2 = new SubmitterExample();

		// 定义submitterall的List使用 submitterdao的selectByExample方法查询所有提交人任务数据

		List submitterall = submitterdao.selectByExample(example2);

		// 将上面查询到的提交人任务数据保存到request中，返回页面

		request.setAttribute("submitterall", submitterall);

	}

	// 定义submitterupdatesubmittertask方法

	public void submitterupdatesubmittertask(HttpServletRequest request, HttpSession session, int id) {

		// 输出日志SubmittertaskService.submitterupdatesubmittertask

		logger.debug("SubmittertaskService.submitterupdatesubmittertask ......");

		// 实例化提交人任务,使用submittertaskdao的selectByPrimaryKey方法通过id查询提交人任务

		Submittertask submittertask = submittertaskdao.selectByPrimaryKey(id);

		// 定义 example1为 TaskExample的实例

		TaskExample example1 = new TaskExample();

		// 定义taskall的List使用 taskdao的selectByExample方法查询所有提交人任务数据

		List taskall = taskdao.selectByExample(example1);

		// 将上面查询到的提交人任务数据保存到request中，返回页面

		request.setAttribute("taskall", taskall);

		// 定义 example2为 SubmitterExample的实例

		SubmitterExample example2 = new SubmitterExample();

		// 定义submitterall的List使用 submitterdao的selectByExample方法查询所有提交人任务数据

		List submitterall = submitterdao.selectByExample(example2);

		// 将上面查询到的提交人任务数据保存到request中，返回页面

		request.setAttribute("submitterall", submitterall);

		// 将查询出的提交人任务信息保存到request中

		request.setAttribute("submittertask", submittertask);

	}

	// 定义submittersubmittertaskmanage方法

	public void submittersubmittertaskmanage(HttpServletRequest request, HttpSession session) {

		// 输出日志 ，表示当前正在执行方法为SubmittertaskService.submittersubmittertaskmanage

		logger.debug("SubmittertaskService.submittersubmittertaskmanage ......");

		// 定义实体，从session中获取当前用户，赋值给

		Submitter submitter = (Submitter) session.getAttribute("userinfo");

		// 实例化提交人任务类为example

		SubmittertaskExample example = new SubmittertaskExample();

		// 实例化提交人任务Example类的criteria

		SubmittertaskExample.Criteria criteria = example.createCriteria();

		// 通过 criteria设置查询条件Submitterid为当前用户id

		criteria.andSubmitteridEqualTo(submitter.getId());

		// 使用
		// submittertaskdao.selectByExample(example)方法查询所有submitterid为当前用户id的提交人任务

		List submittertaskall = submittertaskdao.selectByExample(example);

		// 将查询的提交人任务数据保存到request中的 submittertaskall参数中

		request.setAttribute("submittertaskall", submittertaskall);
	}

	// 定义submitteraddsubmittertaskact，响应页面添加请求

	public void submitteraddsubmittertaskact(HttpServletRequest request, HttpSession session,
			Submittertask submittertask) throws IOException {

		// 输出日志，表示当前正在执行方法为SubmittertaskService.submitteraddsubmittertaskact

		logger.debug("SubmittertaskService.submitteraddsubmittertaskact ......");

		// 使用mybatis逆向工程所提供的insert方法添加提交人任务数据到数据库中

		submittertaskdao.insert(submittertask);

		// 将添加提交人任务成功的信息保存到request中，在页面中进行初始化

		request.setAttribute("message", "添加提交人任务成功");

	}

	// 定义addsubmittertaskact方法

	public void addsubmittertaskact(HttpServletRequest request, HttpSession session, Submittertask submittertask)
			throws IOException {

		// 输出当前方法日志，表示正在执行SubmittertaskService.addsubmittertaskact方法

		logger.debug("SubmittertaskService.addsubmittertaskact ......");

		// 使用submittertaskdao的insert方法将提交人任务添加到数据库中

		submittertaskdao.insert(submittertask);

		// 将添加提交人任务信息添加到request中用message参数进行保存

		request.setAttribute("message", "添加提交人任务成功");

	}

	// 定义submittertaskmanage方法响应页面请求

	public void submittertaskmanage(HttpServletRequest request, HttpSession session) {

		// 输出日志，表示当前正在执行SubmittertaskService.submittertaskmanage

		logger.debug("SubmittertaskService.submittertaskmanage ......");

		// 实例化SubmittertaskExample类为example

		SubmittertaskExample example = new SubmittertaskExample();

		// 使用 submittertaskdao.selectByExample(example)方法获取所有的提交人任务数据

		List submittertaskall = submittertaskdao.selectByExample(example);

		// 将所有的提交人任务数据保存到request中的submittertaskall参数里

		request.setAttribute("submittertaskall", submittertaskall);

	}

	// 定义 submittertaskview方法

	public void submittertaskview(HttpServletRequest request, HttpSession session) {

		// 输出日志，表示当前正在执行SubmittertaskService.submittertaskview方法

		logger.debug("SubmittertaskService.submittertaskview ......");

		// 实例化SubmittertaskExample类

		SubmittertaskExample example = new SubmittertaskExample();

		// 使用submittertaskdao的selectByExample方法查询提交人任务信息

		List submittertaskall = submittertaskdao.selectByExample(example);

		// 将查询的submittertaskall保存到request中，记录为参数submittertaskall

		request.setAttribute("submittertaskall", submittertaskall);

	}

	// 定义 updatesubmittertask方法

	public void updatesubmittertask(HttpServletRequest request, HttpSession session, int id) {

		// 输出日志SubmittertaskController.updatesubmittertask，表示正在执行该方法

		logger.debug("SubmittertaskController.updatesubmittertask ......");

		// 定义提交人任务为biaoming，使用 submittertaskdao的selectByPrimaryKey方法通过id查询数据

		Submittertask submittertask = submittertaskdao.selectByPrimaryKey(id);

		// 定义 example1为 TaskExample的实例

		TaskExample example1 = new TaskExample();

		// 定义taskall的List使用 taskdao的selectByExample方法查询所有提交人任务数据

		List taskall = taskdao.selectByExample(example1);

		// 将上面查询到的提交人任务数据保存到request中，返回页面

		request.setAttribute("taskall", taskall);

		// 定义 example2为 SubmitterExample的实例

		SubmitterExample example2 = new SubmitterExample();

		// 定义submitterall的List使用 submitterdao的selectByExample方法查询所有提交人任务数据

		List submitterall = submitterdao.selectByExample(example2);

		// 将上面查询到的提交人任务数据保存到request中，返回页面

		request.setAttribute("submitterall", submitterall);

		// 将查询的提交人任务保存到request中

		request.setAttribute("submittertask", submittertask);

	}

	// 定义updatesubmittertaskact处理提交人任务修改

	public void updatesubmittertaskact(HttpServletRequest request, Submittertask submittertask, HttpSession session)
			throws IOException {

		// 输出日志，表示正在执行当前方法SubmittertaskController.updatesubmittertaskact

		logger.debug("SubmittertaskController.updatesubmittertaskact ......");

		// 执行submittertaskdao的updateByPrimaryKeySelective方法，将传入的提交人任务数据同步到数据库中

		submittertaskdao.updateByPrimaryKeySelective(submittertask);

		// 将修改成功信息保存到request中

		request.setAttribute("message", "修改提交人任务信息成功");

	}

	// 定义submitterupdatesubmittertaskact方法

	public void submitterupdatesubmittertaskact(HttpServletRequest request, Submittertask submittertask,
			HttpSession session) throws IOException {

		// 当执行此方法时，输出此日志

		logger.debug("SubmittertaskService.submitterupdatesubmittertaskact ......");

		// 调用submittertaskdao的updateByPrimaryKeySelective方法修改传入的submittertask

		submittertaskdao.updateByPrimaryKeySelective(submittertask);

		request.setAttribute("message", "修改提交人任务信息成功");

	}

	// 定义deletesubmittertask,处理删除提交人任务

	public void deletesubmittertask(HttpServletRequest request, HttpSession session, int id) {

		// 输出日志，表示当前正在执行SubmittertaskService.deletesubmittertask方法

		logger.debug("SubmittertaskService.deletesubmittertask ......");

		// 根据id调用submittertaskdao的deleteByPrimaryKey方法，删除提交人任务

		submittertaskdao.deleteByPrimaryKey(id);

		request.setAttribute("message", "删除提交人任务成功");

	}

	// 定义submitterdeletesubmittertask方法

	public void submitterdeletesubmittertask(HttpServletRequest request, HttpSession session, int id) {

		// 输出日志，表示当前正在执行SubmittertaskController.submitterdeletesubmittertask方法

		logger.debug("SubmittertaskController.submitterdeletesubmittertask ......");

		// 调用submittertaskdao的deleteByPrimaryKey方法，传入id。删除id所对应的提交人任务

		submittertaskdao.deleteByPrimaryKey(id);

		// 将删除提交人任务成功信息保存到request中

		request.setAttribute("message", "删除提交人任务成功");

	}

	// 定义searchsubmittertask方法，处理搜索操作

	public void searchsubmittertask(HttpServletRequest request, HttpSession session, String search) {

		// 输出日志，表示当前正在执行SubmittertaskService.searchsubmittertask

		logger.debug("SubmittertaskService.searchsubmittertask ......");

		// 实例化 SubmittertaskExample

		SubmittertaskExample example = new SubmittertaskExample();

		// 实例化 SubmittertaskExample的Criteria内部类

		SubmittertaskExample.Criteria criteria = example.createCriteria();

		// 如果搜索内容不等于空

		if (search != null) {

			// 将搜索内容通过like关键字传到数据库中进行搜索

			criteria.andTaskLike("%" + search + "%");

		}

		// 查询提交人任务结果

		List submittertaskall = submittertaskdao.selectByExample(example);

		// 将查询到的提交人任务 保存到request中进行保存

		request.setAttribute("submittertaskall", submittertaskall);

	}

	// 定义SubmittertaskpinglunMapper

	public void submittertaskdetails(HttpServletRequest request, HttpSession session, int id) {

		// 输入日志信息，表名当前执行方法为SubmittertaskController.submittertaskdetails

		logger.debug("SubmittertaskController.submittertaskdetails ......");

		// 传入页面所传入的提交人任务id使用submittertaskdao的selectByPrimaryKey方法进行查询

		Submittertask submittertask = submittertaskdao.selectByPrimaryKey(id);

		// 将查询到的提交人任务保存到request中

		request.setAttribute("submittertask", submittertask);

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
