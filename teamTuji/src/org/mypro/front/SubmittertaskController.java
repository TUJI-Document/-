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

import org.mypro.service.SubmittertaskServiceImp;

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

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.multipart.MultipartFile;

@Controller

@RequestMapping(value = "/")

public class SubmittertaskController {

	private static final Log logger = LogFactory.getLog(SubmittertaskController.class);

	@Autowired
	private SubmittertaskServiceImp submittertaskservice;

	// 定义方法addsubmittertask,响应页面addsubmittertask请求

	@RequestMapping(value = "addsubmittertask")

	public String addsubmittertask(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			String backurl) {

		// 输出日志，当前执行方法为addsubmittertask

		logger.debug("SubmittertaskController.addsubmittertask ......");

		submittertaskservice.addsubmittertask(request, session);

		// 若返回地址不等于空且不等于addsubmittertask.action，则将该请求跳转到backurl地址，再次执行方法

		if (backurl != null && backurl.indexOf("addsubmittertask.action") == -1) {
			// 跳转到backurl中

			return "forward:/" + backurl;
		}
		// 返回addsubmittertask页面

		return "addsubmittertask";

	}

	// 定义submitteraddsubmittertask方法

	@RequestMapping(value = "submitteraddsubmittertask")

	public String submitteraddsubmittertask(HttpServletRequest request, HttpServletResponse response,
			HttpSession session, String backurl) {

		// 输出日志，表示当前正在执行SubmittertaskController.submitteraddsubmittertask方法

		logger.debug("SubmittertaskController.submitteraddsubmittertask ......");

		submittertaskservice.submitteraddsubmittertask(request, session);

		// 若返回地址不等于空且不等于addsubmittertask.action，则将该请求跳转到backurl地址，再次执行方法

		if (backurl != null && backurl.indexOf("submitteraddsubmittertask.action") == -1) {
			// 跳转到backurl中

			return "forward:/" + backurl;
		}

		// 返回addsubmittertask页面

		return "submitteraddsubmittertask";

	}

	// 定义submitterupdatesubmittertask方法

	@RequestMapping(value = "submitterupdatesubmittertask")

	public String submitterupdatesubmittertask(HttpServletRequest request, HttpServletResponse response,
			HttpSession session, int id, String backurl) {

		// 输出日志SubmittertaskController.submitterupdatesubmittertask

		logger.debug("SubmittertaskController.submitterupdatesubmittertask ......");

		submittertaskservice.submitterupdatesubmittertask(request, session, id);

		// 如果backurl不等于null且backurl与当前方法名不同

		if (backurl != null && backurl.indexOf("submitterupdatesubmittertask.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回submitterupdatesubmittertask页面

		return "submitterupdatesubmittertask";

	}

	// 定义submittersubmittertaskmanage方法

	@RequestMapping(value = "submittersubmittertaskmanage")

	public String submittersubmittertaskmanage(HttpServletRequest request, HttpSession session,
			HttpServletResponse response, String backurl) {

		// 输出日志 ，表示当前正在执行方法为SubmittertaskController.submittersubmittertaskmanage

		logger.debug("SubmittertaskController.submittersubmittertaskmanage ......");

		submittertaskservice.submittersubmittertaskmanage(request, session); // 如果backurl不等于null且backurl不等于当前方法

		if (backurl != null && backurl.indexOf("submittersubmittertaskmanage.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		} // 返回submittersubmittertaskmanage方法

		return "submittersubmittertaskmanage";

	}

	// 定义submitteraddsubmittertaskact，响应页面添加请求

	@RequestMapping(value = "submitteraddsubmittertaskact")

	public String submitteraddsubmittertaskact(HttpServletRequest request, HttpSession session,
			HttpServletResponse response, Submittertask submittertask, String backurl) throws IOException {

		// 输出日志，表示当前正在执行方法为SubmittertaskController.submitteraddsubmittertaskact

		logger.debug("SubmittertaskController.submitteraddsubmittertaskact ......");

		submittertaskservice.submitteraddsubmittertaskact(request, session, submittertask); // 如果backurl不等于空
																							// 且
																							// backurl与当前方法所响应地址不同

		if (backurl != null && backurl.indexOf("submitteraddsubmittertaskact.action") == -1) { // 携带页面数据跳转到backurl地址中

			return "forward:/" + backurl;
		}

		// 返回到submitteraddsubmittertask方法

		return "forward:/submittersubmittertaskmanage.action";

	}

	// 定义addsubmittertaskact方法

	@RequestMapping(value = "addsubmittertaskact")

	public String addsubmittertaskact(HttpServletRequest request, HttpSession session, HttpServletResponse response,
			Submittertask submittertask, String backurl) throws IOException {

		// 输出当前方法日志，表示正在执行SubmittertaskController.addsubmittertaskact方法

		logger.debug("SubmittertaskController.addsubmittertaskact ......");

		submittertaskservice.addsubmittertaskact(request, session, submittertask); // 如果backurl不等于空，且backurl与本方法不同，则返回到backurl方法中

		if (backurl != null && backurl.indexOf("addsubmittertaskact.action") == -1) { // 返回到backurl所在的方法

			return "forward:/" + backurl;
		}

		// 返回addsubmittertask方法

		return "forward:/submittertaskmanage.action";

	}

	// 定义submittertaskmanage方法响应页面请求

	@RequestMapping(value = "submittertaskmanage")

	public String submittertaskmanage(HttpServletRequest request, HttpSession session, HttpServletResponse response,
			String backurl) {

		// 输出日志，表示当前正在执行SubmittertaskController.submittertaskmanage

		logger.debug("SubmittertaskController.submittertaskmanage ......");

		submittertaskservice.submittertaskmanage(request, session); // 如果backurl不为空，且backurl与当前方法不同，则返回backurl地址所在的方法

		if (backurl != null && backurl.indexOf("submittertaskmanage.action") == -1) { // 返回backurl所在的方法

			return "forward:/" + backurl;
		}

		// 返回到submittertaskmanage页面

		return "submittertaskmanage";

	}

	// 定义 submittertaskview方法

	@RequestMapping(value = "submittertaskview")

	public String submittertaskview(HttpServletRequest request, HttpSession session, HttpServletResponse response,
			String backurl) {

		// 输出日志，表示当前正在执行SubmittertaskController.submittertaskview方法

		logger.debug("SubmittertaskController.submittertaskview ......");

		submittertaskservice.submittertaskview(request, session);

		// 如果backurl不等于null且backurl不等于当前方法名

		if (backurl != null && backurl.indexOf("submittertaskview.action") == -1) { // 返回backur所在的方法

			return "forward:/" + backurl;
		}

		// 返回submittertaskview页面

		return "submittertaskview";

	}

	// 定义 updatesubmittertask方法

	@RequestMapping(value = "updatesubmittertask")

	public String updatesubmittertask(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			int id, String backurl) {

		// 输出日志SubmittertaskController.updatesubmittertask，表示正在执行该方法

		logger.debug("SubmittertaskController.updatesubmittertask ......");

		submittertaskservice.updatesubmittertask(request, session, id); // 如果backurl不等于null且backurl不等于当前方法

		if (backurl != null && backurl.indexOf("updatesubmittertask.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回updatesubmittertask页面

		return "updatesubmittertask";

	}

	// 定义updatesubmittertaskact处理提交人任务修改

	@RequestMapping(value = "updatesubmittertaskact")

	public String updatesubmittertaskact(HttpServletRequest request, HttpServletResponse response,
			Submittertask submittertask, HttpSession session, String backurl) throws IOException {

		// 输出日志，表示正在执行当前方法SubmittertaskController.updatesubmittertaskact

		logger.debug("SubmittertaskController.updatesubmittertaskact ......");

		submittertaskservice.updatesubmittertaskact(request, submittertask, session);

		// 如果backurl不等于null且backurl不等于当前方法名

		if (backurl != null && backurl.indexOf("updatesubmittertaskact.action") == -1) { // 返回backurl所对应方法

			return "forward:/" + backurl;
		}

		// 返回submittertaskmanage.action方法

		return "forward:/submittertaskmanage.action";

	}

	// 定义submitterupdatesubmittertaskact方法

	@RequestMapping(value = "submitterupdatesubmittertaskact")

	public String submitterupdatesubmittertaskact(HttpServletRequest request, HttpServletResponse response,
			Submittertask submittertask, HttpSession session, String backurl) throws IOException {

		// 当执行此方法时，输出此日志

		logger.debug("SubmittertaskController.submitterupdatesubmittertaskact ......");

		submittertaskservice.submitterupdatesubmittertaskact(request, submittertask, session);

		// 如果backurl不等于null且backurl不等于当前方法，则返回backurl所对应的方法

		if (backurl != null && backurl.indexOf("submitterupdatesubmittertaskact.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回submittersubmittertaskmanage.action方法

		return "forward:/submittersubmittertaskmanage.action";

	}

	// 定义deletesubmittertask,处理删除提交人任务

	@RequestMapping(value = "deletesubmittertask")

	public String deletesubmittertask(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			int id, String backurl) {

		// 输出日志，表示当前正在执行SubmittertaskController.deletesubmittertask方法

		logger.debug("SubmittertaskController.deletesubmittertask ......");

		submittertaskservice.deletesubmittertask(request, session, id);

		if (backurl != null && backurl.indexOf("deletesubmittertask.action") == -1) {
			// 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回submittertaskmanage.action方法

		return "forward:/submittertaskmanage.action";

	}

	// 定义submitterdeletesubmittertask方法

	@RequestMapping(value = "submitterdeletesubmittertask")

	public String submitterdeletesubmittertask(HttpServletRequest request, HttpServletResponse response,
			HttpSession session, int id, String backurl) {

		// 输出日志，表示当前正在执行SubmittertaskController.submitterdeletesubmittertask方法

		logger.debug("SubmittertaskController.submitterdeletesubmittertask ......");

		submittertaskservice.submitterdeletesubmittertask(request, session, id);

		// 如果backurl不等于null且backurl不等于当前方法名

		if (backurl != null && backurl.indexOf("submitterdeletesubmittertask.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回submittersubmittertaskmanage.action方法

		return "forward:/submittersubmittertaskmanage.action";

	}

	// 定义searchsubmittertask方法，处理搜索操作

	@RequestMapping(value = "searchsubmittertask")

	public String searchsubmittertask(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			String search, String backurl) {

		// 输出日志，表示当前正在执行SubmittertaskController.searchsubmittertask

		logger.debug("SubmittertaskController.searchsubmittertask ......");

		submittertaskservice.searchsubmittertask(request, session, search);

		// 如果backurl不等于null且backurl不等于当前方法

		if (backurl != null && backurl.indexOf("searchsubmittertask.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回backurl所对应的方法

		return "searchsubmittertask";

	}

	// 定义SubmittertaskpinglunMapper

	@RequestMapping(value = "submittertaskdetails")

	public String submittertaskdetails(HttpServletRequest request, HttpSession session, HttpServletResponse response,
			int id, String backurl) {

		// 输入日志信息，表名当前执行方法为SubmittertaskController.submittertaskdetails

		logger.debug("SubmittertaskController.submittertaskdetails ......");

		submittertaskservice.submittertaskdetails(request, session, id);

		// 如果backurl不等于null且backurl不等于当前方法

		if (backurl != null && backurl.indexOf("submittertaskdetails.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回submittertaskdetails

		return "submittertaskdetails";

	}

}
