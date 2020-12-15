package org.mypro.front;

import java.io.File;

import java.io.IOException;

import java.math.BigDecimal;

import java.text.SimpleDateFormat;

import java.util.ArrayList;

import java.util.HashMap;

import java.util.Map;

import org.springframework.web.bind.annotation.ResponseBody;

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

import org.mypro.service.TaskServiceImp;

import org.mypro.entity.Task;

import org.mypro.entity.TaskExample;

import org.mypro.entity.Collector;

import org.mypro.entity.CollectorExample;

import org.mypro.dao.CollectorMapper;

import org.mypro.entity.Collector;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.multipart.MultipartFile;

@Controller

@RequestMapping(value = "/")

public class TaskController {

	private static final Log logger = LogFactory.getLog(TaskController.class);

	@Autowired
	private TaskServiceImp taskservice;

	// 定义方法addtask,响应页面addtask请求

	@RequestMapping(value = "addtask")

	public String addtask(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			String backurl) {

		// 输出日志，当前执行方法为addtask

		logger.debug("TaskController.addtask ......");

		taskservice.addtask(request, session);

		// 若返回地址不等于空且不等于addtask.action，则将该请求跳转到backurl地址，再次执行方法

		if (backurl != null && backurl.indexOf("addtask.action") == -1) {
			// 跳转到backurl中

			return "forward:/" + backurl;
		}
		// 返回addtask页面

		return "addtask";

	}

	// 定义collectoraddtask方法

	@RequestMapping(value = "collectoraddtask")

	public String collectoraddtask(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			String backurl) {

		// 输出日志，表示当前正在执行TaskController.collectoraddtask方法

		logger.debug("TaskController.collectoraddtask ......");

		taskservice.collectoraddtask(request, session);

		// 若返回地址不等于空且不等于addtask.action，则将该请求跳转到backurl地址，再次执行方法

		if (backurl != null && backurl.indexOf("collectoraddtask.action") == -1) {
			// 跳转到backurl中

			return "forward:/" + backurl;
		}

		// 返回addtask页面

		return "collectoraddtask";

	}

	// 定义collectorupdatetask方法

	@RequestMapping(value = "collectorupdatetask")

	public String collectorupdatetask(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			int id, String backurl) {

		// 输出日志TaskController.collectorupdatetask

		logger.debug("TaskController.collectorupdatetask ......");

		taskservice.collectorupdatetask(request, session, id);

		// 如果backurl不等于null且backurl与当前方法名不同

		if (backurl != null && backurl.indexOf("collectorupdatetask.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回collectorupdatetask页面

		return "collectorupdatetask";

	}

	// 定义collectortaskmanage方法

	@RequestMapping(value = "collectortaskmanage")

	public String collectortaskmanage(HttpServletRequest request, HttpSession session, HttpServletResponse response,
			String backurl) {

		// 输出日志 ，表示当前正在执行方法为TaskController.collectortaskmanage

		logger.debug("TaskController.collectortaskmanage ......");

		taskservice.collectortaskmanage(request, session); // 如果backurl不等于null且backurl不等于当前方法

		if (backurl != null && backurl.indexOf("collectortaskmanage.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		} // 返回collectortaskmanage方法

		return "collectortaskmanage";

	}

	// 定义collectoraddtaskact，响应页面添加请求

	@RequestMapping(value = "collectoraddtaskact")

	public String collectoraddtaskact(HttpServletRequest request, HttpSession session, HttpServletResponse response,
			Task task, String backurl, MultipartFile filefile) throws IOException {

		// 输出日志，表示当前正在执行方法为TaskController.collectoraddtaskact

		logger.debug("TaskController.collectoraddtaskact ......");

		taskservice.collectoraddtaskact(request, session, task, filefile); // 如果backurl不等于空
																			// 且
																			// backurl与当前方法所响应地址不同

		if (backurl != null && backurl.indexOf("collectoraddtaskact.action") == -1) { // 携带页面数据跳转到backurl地址中

			return "forward:/" + backurl;
		}

		// 返回到collectoraddtask方法

		return "forward:/collectortaskmanage.action";

	}

	// 定义addtaskact方法

	@RequestMapping(value = "addtaskact")

	public String addtaskact(HttpServletRequest request, HttpSession session, HttpServletResponse response, Task task,
			String backurl, MultipartFile filefile) throws IOException {

		// 输出当前方法日志，表示正在执行TaskController.addtaskact方法

		logger.debug("TaskController.addtaskact ......");

		taskservice.addtaskact(request, session, task, filefile); // 如果backurl不等于空，且backurl与本方法不同，则返回到backurl方法中

		if (backurl != null && backurl.indexOf("addtaskact.action") == -1) { // 返回到backurl所在的方法

			return "forward:/" + backurl;
		}

		// 返回addtask方法

		return "forward:/taskmanage.action";

	}

	// 定义taskmanage方法响应页面请求

	@RequestMapping(value = "taskmanage")

	public String taskmanage(HttpServletRequest request, HttpSession session, HttpServletResponse response,
			String backurl) {

		// 输出日志，表示当前正在执行TaskController.taskmanage

		logger.debug("TaskController.taskmanage ......");

		taskservice.taskmanage(request, session); // 如果backurl不为空，且backurl与当前方法不同，则返回backurl地址所在的方法

		if (backurl != null && backurl.indexOf("taskmanage.action") == -1) { // 返回backurl所在的方法

			return "forward:/" + backurl;
		}

		// 返回到taskmanage页面

		return "taskmanage";

	}

	// 定义 taskview方法

	@RequestMapping(value = "taskview")

	public String taskview(HttpServletRequest request, HttpSession session, HttpServletResponse response,
			String backurl) {

		// 输出日志，表示当前正在执行TaskController.taskview方法

		logger.debug("TaskController.taskview ......");

		taskservice.taskview(request, session);

		// 如果backurl不等于null且backurl不等于当前方法名

		if (backurl != null && backurl.indexOf("taskview.action") == -1) { // 返回backur所在的方法

			return "forward:/" + backurl;
		}

		// 返回taskview页面

		return "taskview";

	}

	// 定义 updatetask方法

	@RequestMapping(value = "updatetask")

	public String updatetask(HttpServletRequest request, HttpServletResponse response, HttpSession session, int id,
			String backurl) {

		// 输出日志TaskController.updatetask，表示正在执行该方法

		logger.debug("TaskController.updatetask ......");

		taskservice.updatetask(request, session, id); // 如果backurl不等于null且backurl不等于当前方法

		if (backurl != null && backurl.indexOf("updatetask.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回updatetask页面

		return "updatetask";

	}

	// 定义updatetaskact处理任务修改

	@RequestMapping(value = "updatetaskact")

	public String updatetaskact(HttpServletRequest request, HttpServletResponse response, Task task,
			HttpSession session, String backurl, MultipartFile filefile) throws IOException {

		// 输出日志，表示正在执行当前方法TaskController.updatetaskact

		logger.debug("TaskController.updatetaskact ......");

		taskservice.updatetaskact(request, task, session, filefile);

		// 如果backurl不等于null且backurl不等于当前方法名

		if (backurl != null && backurl.indexOf("updatetaskact.action") == -1) { // 返回backurl所对应方法

			return "forward:/" + backurl;
		}

		// 返回taskmanage.action方法

		return "forward:/taskmanage.action";

	}

	// 定义collectorupdatetaskact方法

	@RequestMapping(value = "collectorupdatetaskact")

	public String collectorupdatetaskact(HttpServletRequest request, HttpServletResponse response, Task task,
			HttpSession session, String backurl, MultipartFile filefile) throws IOException {

		// 当执行此方法时，输出此日志

		logger.debug("TaskController.collectorupdatetaskact ......");

		taskservice.collectorupdatetaskact(request, task, session, filefile);

		// 如果backurl不等于null且backurl不等于当前方法，则返回backurl所对应的方法

		if (backurl != null && backurl.indexOf("collectorupdatetaskact.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回collectortaskmanage.action方法

		return "forward:/collectortaskmanage.action";

	}

	// 定义deletetask,处理删除任务

	@RequestMapping(value = "deletetask")

	public String deletetask(HttpServletRequest request, HttpServletResponse response, HttpSession session, int id,
			String backurl) {

		// 输出日志，表示当前正在执行TaskController.deletetask方法

		logger.debug("TaskController.deletetask ......");

		taskservice.deletetask(request, session, id);

		if (backurl != null && backurl.indexOf("deletetask.action") == -1) {
			// 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回taskmanage.action方法

		return "forward:/taskmanage.action";

	}

	// 定义collectordeletetask方法

	@RequestMapping(value = "collectordeletetask")

	public String collectordeletetask(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			int id, String backurl) {

		// 输出日志，表示当前正在执行TaskController.collectordeletetask方法

		logger.debug("TaskController.collectordeletetask ......");

		taskservice.collectordeletetask(request, session, id);

		// 如果backurl不等于null且backurl不等于当前方法名

		if (backurl != null && backurl.indexOf("collectordeletetask.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回collectortaskmanage.action方法

		return "forward:/collectortaskmanage.action";

	}

	// 定义searchtask方法，处理搜索操作

	@RequestMapping(value = "searchtask")

	public String searchtask(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			String search, String backurl) {

		// 输出日志，表示当前正在执行TaskController.searchtask

		logger.debug("TaskController.searchtask ......");

		taskservice.searchtask(request, session, search);

		// 如果backurl不等于null且backurl不等于当前方法

		if (backurl != null && backurl.indexOf("searchtask.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回backurl所对应的方法

		return "searchtask";

	}

	// 定义TaskpinglunMapper

	@RequestMapping(value = "taskdetails")

	public String taskdetails(HttpServletRequest request, HttpSession session, HttpServletResponse response, int id,
			String backurl) {

		// 输入日志信息，表名当前执行方法为TaskController.taskdetails

		logger.debug("TaskController.taskdetails ......");

		taskservice.taskdetails(request, session, id);

		// 如果backurl不等于null且backurl不等于当前方法

		if (backurl != null && backurl.indexOf("taskdetails.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回taskdetails

		return "taskdetails";

	}

}
