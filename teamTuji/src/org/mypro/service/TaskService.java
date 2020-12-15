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

@Service

public class TaskService implements TaskServiceImp {

	private static final Log logger = LogFactory.getLog(TaskService.class);

	@Autowired
	private TaskMapper taskdao;
	// 定义collectordao参数

	@Autowired
	private CollectorMapper collectordao;

	// 定义方法addtask,响应控制层addtask请求

	public void addtask(HttpServletRequest request, HttpSession session) {

		// 输出日志，当前执行方法为addtask

		logger.debug("TaskService.addtask ......");

		// 定义 example1为 CollectorExample的实例

		CollectorExample example1 = new CollectorExample();

		// 定义collectorall的List使用 collectordao的selectByExample方法查询所有任务数据

		List collectorall = collectordao.selectByExample(example1);

		// 将上面查询到的任务数据保存到request中，返回页面

		request.setAttribute("collectorall", collectorall);

	}

	// 定义collectoraddtask方法，在任务控制层中调用

	public void collectoraddtask(HttpServletRequest request, HttpSession session) {

		// 输出日志，表示当前正在执行TaskService.collectoraddtask方法

		logger.debug("TaskService.collectoraddtask ......");

		// 定义 example1为 CollectorExample的实例

		CollectorExample example1 = new CollectorExample();

		// 定义collectorall的List使用 collectordao的selectByExample方法查询所有任务数据

		List collectorall = collectordao.selectByExample(example1);

		// 将上面查询到的任务数据保存到request中，返回页面

		request.setAttribute("collectorall", collectorall);

	}

	// 定义collectorupdatetask方法

	public void collectorupdatetask(HttpServletRequest request, HttpSession session, int id) {

		// 输出日志TaskService.collectorupdatetask

		logger.debug("TaskService.collectorupdatetask ......");

		// 实例化任务,使用taskdao的selectByPrimaryKey方法通过id查询任务

		Task task = taskdao.selectByPrimaryKey(id);

		// 定义 example1为 CollectorExample的实例

		CollectorExample example1 = new CollectorExample();

		// 定义collectorall的List使用 collectordao的selectByExample方法查询所有任务数据

		List collectorall = collectordao.selectByExample(example1);

		// 将上面查询到的任务数据保存到request中，返回页面

		request.setAttribute("collectorall", collectorall);

		// 将查询出的任务信息保存到request中

		request.setAttribute("task", task);

	}

	// 定义collectortaskmanage方法

	public void collectortaskmanage(HttpServletRequest request, HttpSession session) {

		// 输出日志 ，表示当前正在执行方法为TaskService.collectortaskmanage

		logger.debug("TaskService.collectortaskmanage ......");

		// 定义实体，从session中获取当前用户，赋值给

		Collector collector = (Collector) session.getAttribute("userinfo");

		// 实例化任务类为example

		TaskExample example = new TaskExample();

		// 实例化任务Example类的criteria

		TaskExample.Criteria criteria = example.createCriteria();

		// 通过 criteria设置查询条件Collectorid为当前用户id

		criteria.andCollectoridEqualTo(collector.getId());

		// 使用 taskdao.selectByExample(example)方法查询所有collectorid为当前用户id的任务

		List taskall = taskdao.selectByExample(example);

		// 将查询的任务数据保存到request中的 taskall参数中

		request.setAttribute("taskall", taskall);
	}

	// 定义collectoraddtaskact，响应页面添加请求

	public void collectoraddtaskact(HttpServletRequest request, HttpSession session, Task task, MultipartFile filefile)
			throws IOException {

		// 输出日志，表示当前正在执行方法为TaskService.collectoraddtaskact

		logger.debug("TaskService.collectoraddtaskact ......");

		// 判断文件文件是否为空

		if (!filefile.isEmpty()) {

			// 调用uploadUtile方法将页面传入的文件文件上传到服务器，将返回的文件名保存到file参数中

			String file = uploadUtile(filefile, request);

			// 将task的文件设置为file的值

			task.setFile(file);

		}

		// 使用mybatis逆向工程所提供的insert方法添加任务数据到数据库中

		taskdao.insert(task);

		// 将添加任务成功的信息保存到request中，在页面中进行初始化

		request.setAttribute("message", "添加任务成功");

	}

	// 定义addtaskact方法

	public void addtaskact(HttpServletRequest request, HttpSession session, Task task, MultipartFile filefile)
			throws IOException {

		// 输出当前方法日志，表示正在执行TaskService.addtaskact方法

		logger.debug("TaskService.addtaskact ......");

		// 判断文件文件是否为空

		if (!filefile.isEmpty()) {

			// 调用uploadUtile方法将页面传入的文件文件上传到服务器，将返回的文件名保存到file参数中

			String file = uploadUtile(filefile, request);

			// 将task的文件设置为file的值

			task.setFile(file);

		}

		// 使用taskdao的insert方法将任务添加到数据库中

		taskdao.insert(task);

		// 将添加任务信息添加到request中用message参数进行保存

		request.setAttribute("message", "添加任务成功");

	}

	// 定义taskmanage方法响应页面请求

	public void taskmanage(HttpServletRequest request, HttpSession session) {

		// 输出日志，表示当前正在执行TaskService.taskmanage

		logger.debug("TaskService.taskmanage ......");

		// 实例化TaskExample类为example

		TaskExample example = new TaskExample();

		// 使用 taskdao.selectByExample(example)方法获取所有的任务数据

		List taskall = taskdao.selectByExample(example);

		// 将所有的任务数据保存到request中的taskall参数里

		request.setAttribute("taskall", taskall);

	}

	// 定义 taskview方法

	public void taskview(HttpServletRequest request, HttpSession session) {

		// 输出日志，表示当前正在执行TaskService.taskview方法

		logger.debug("TaskService.taskview ......");

		// 实例化TaskExample类

		TaskExample example = new TaskExample();

		// 使用taskdao的selectByExample方法查询任务信息

		List taskall = taskdao.selectByExample(example);

		// 将查询的taskall保存到request中，记录为参数taskall

		request.setAttribute("taskall", taskall);

	}

	// 定义 updatetask方法

	public void updatetask(HttpServletRequest request, HttpSession session, int id) {

		// 输出日志TaskController.updatetask，表示正在执行该方法

		logger.debug("TaskController.updatetask ......");

		// 定义任务为biaoming，使用 taskdao的selectByPrimaryKey方法通过id查询数据

		Task task = taskdao.selectByPrimaryKey(id);

		// 定义 example1为 CollectorExample的实例

		CollectorExample example1 = new CollectorExample();

		// 定义collectorall的List使用 collectordao的selectByExample方法查询所有任务数据

		List collectorall = collectordao.selectByExample(example1);

		// 将上面查询到的任务数据保存到request中，返回页面

		request.setAttribute("collectorall", collectorall);

		// 将查询的任务保存到request中

		request.setAttribute("task", task);

	}

	// 定义updatetaskact处理任务修改

	public void updatetaskact(HttpServletRequest request, Task task, HttpSession session, MultipartFile filefile)
			throws IOException {

		// 输出日志，表示正在执行当前方法TaskController.updatetaskact

		logger.debug("TaskController.updatetaskact ......");

		// 判断文件文件是否为空

		if (!filefile.isEmpty()) {

			// 调用uploadUtile方法将页面传入的文件文件上传到服务器，将返回的文件名保存到file参数中

			String file = uploadUtile(filefile, request);

			// 将task的文件设置为file的值

			task.setFile(file);

		}

		// 执行taskdao的updateByPrimaryKeySelective方法，将传入的任务数据同步到数据库中

		taskdao.updateByPrimaryKeySelective(task);

		// 将修改成功信息保存到request中

		request.setAttribute("message", "修改任务信息成功");

	}

	// 定义collectorupdatetaskact方法

	public void collectorupdatetaskact(HttpServletRequest request, Task task, HttpSession session,
			MultipartFile filefile) throws IOException {

		// 当执行此方法时，输出此日志

		logger.debug("TaskService.collectorupdatetaskact ......");

		// 判断文件文件是否为空

		if (!filefile.isEmpty()) {

			// 调用uploadUtile方法将页面传入的文件文件上传到服务器，将返回的文件名保存到file参数中

			String file = uploadUtile(filefile, request);

			// 将task的文件设置为file的值

			task.setFile(file);

		}

		// 调用taskdao的updateByPrimaryKeySelective方法修改传入的task

		taskdao.updateByPrimaryKeySelective(task);

		request.setAttribute("message", "修改任务信息成功");

	}

	// 定义deletetask,处理删除任务

	public void deletetask(HttpServletRequest request, HttpSession session, int id) {

		// 输出日志，表示当前正在执行TaskService.deletetask方法

		logger.debug("TaskService.deletetask ......");

		// 根据id调用taskdao的deleteByPrimaryKey方法，删除任务

		taskdao.deleteByPrimaryKey(id);

		request.setAttribute("message", "删除任务成功");

	}

	// 定义collectordeletetask方法

	public void collectordeletetask(HttpServletRequest request, HttpSession session, int id) {

		// 输出日志，表示当前正在执行TaskController.collectordeletetask方法

		logger.debug("TaskController.collectordeletetask ......");

		// 调用taskdao的deleteByPrimaryKey方法，传入id。删除id所对应的任务

		taskdao.deleteByPrimaryKey(id);

		// 将删除任务成功信息保存到request中

		request.setAttribute("message", "删除任务成功");

	}

	// 定义searchtask方法，处理搜索操作

	public void searchtask(HttpServletRequest request, HttpSession session, String search) {

		// 输出日志，表示当前正在执行TaskService.searchtask

		logger.debug("TaskService.searchtask ......");

		// 实例化 TaskExample

		TaskExample example = new TaskExample();

		// 实例化 TaskExample的Criteria内部类

		TaskExample.Criteria criteria = example.createCriteria();

		// 如果搜索内容不等于空

		if (search != null) {

			// 将搜索内容通过like关键字传到数据库中进行搜索

			criteria.andNameLike("%" + search + "%");

		}

		// 查询任务结果

		List taskall = taskdao.selectByExample(example);

		// 将查询到的任务 保存到request中进行保存

		request.setAttribute("taskall", taskall);

	}

	// 定义TaskpinglunMapper

	public void taskdetails(HttpServletRequest request, HttpSession session, int id) {

		// 输入日志信息，表名当前执行方法为TaskController.taskdetails

		logger.debug("TaskController.taskdetails ......");

		// 传入页面所传入的任务id使用taskdao的selectByPrimaryKey方法进行查询

		Task task = taskdao.selectByPrimaryKey(id);

		// 将查询到的任务保存到request中

		request.setAttribute("task", task);

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
