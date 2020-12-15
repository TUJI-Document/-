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

import org.mypro.service.SubmitterServiceImp;

import org.mypro.entity.Submitter;

import org.mypro.entity.SubmitterExample;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.multipart.MultipartFile;

@Controller

@RequestMapping(value = "/")

public class SubmitterController {

	private static final Log logger = LogFactory.getLog(SubmitterController.class);

	@Autowired
	private SubmitterServiceImp submitterservice;

	// 定义方法addsubmitter,响应页面addsubmitter请求

	@RequestMapping(value = "addsubmitter")

	public String addsubmitter(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			String backurl) {

		// 输出日志，当前执行方法为addsubmitter

		logger.debug("SubmitterController.addsubmitter ......");

		submitterservice.addsubmitter(request, session);

		// 若返回地址不等于空且不等于addsubmitter.action，则将该请求跳转到backurl地址，再次执行方法

		if (backurl != null && backurl.indexOf("addsubmitter.action") == -1) {
			// 跳转到backurl中

			return "forward:/" + backurl;
		}
		// 返回addsubmitter页面

		return "addsubmitter";

	}

	// 定义addsubmitteract方法

	@RequestMapping(value = "addsubmitteract")

	public String addsubmitteract(HttpServletRequest request, HttpSession session, HttpServletResponse response,
			Submitter submitter, String backurl) throws IOException {

		// 输出当前方法日志，表示正在执行SubmitterController.addsubmitteract方法

		logger.debug("SubmitterController.addsubmitteract ......");

		submitterservice.addsubmitteract(request, session, submitter); // 如果backurl不等于空，且backurl与本方法不同，则返回到backurl方法中

		if (backurl != null && backurl.indexOf("addsubmitteract.action") == -1) { // 返回到backurl所在的方法

			return "forward:/" + backurl;
		}

		// 返回addsubmitter方法

		return "forward:/submittermanage.action";

	}

	// 定义submittermanage方法响应页面请求

	@RequestMapping(value = "submittermanage")

	public String submittermanage(HttpServletRequest request, HttpSession session, HttpServletResponse response,
			String backurl) {

		// 输出日志，表示当前正在执行SubmitterController.submittermanage

		logger.debug("SubmitterController.submittermanage ......");

		submitterservice.submittermanage(request, session); // 如果backurl不为空，且backurl与当前方法不同，则返回backurl地址所在的方法

		if (backurl != null && backurl.indexOf("submittermanage.action") == -1) { // 返回backurl所在的方法

			return "forward:/" + backurl;
		}

		// 返回到submittermanage页面

		return "submittermanage";

	}

	// 定义 submitterview方法

	@RequestMapping(value = "submitterview")

	public String submitterview(HttpServletRequest request, HttpSession session, HttpServletResponse response,
			String backurl) {

		// 输出日志，表示当前正在执行SubmitterController.submitterview方法

		logger.debug("SubmitterController.submitterview ......");

		submitterservice.submitterview(request, session);

		// 如果backurl不等于null且backurl不等于当前方法名

		if (backurl != null && backurl.indexOf("submitterview.action") == -1) { // 返回backur所在的方法

			return "forward:/" + backurl;
		}

		// 返回submitterview页面

		return "submitterview";

	}

	// 定义 updatesubmitter方法

	@RequestMapping(value = "updatesubmitter")

	public String updatesubmitter(HttpServletRequest request, HttpServletResponse response, HttpSession session, int id,
			String backurl) {

		// 输出日志SubmitterController.updatesubmitter，表示正在执行该方法

		logger.debug("SubmitterController.updatesubmitter ......");

		submitterservice.updatesubmitter(request, session, id); // 如果backurl不等于null且backurl不等于当前方法

		if (backurl != null && backurl.indexOf("updatesubmitter.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回updatesubmitter页面

		return "updatesubmitter";

	}

	// 定义updatesubmitteract处理提交人修改

	@RequestMapping(value = "updatesubmitteract")

	public String updatesubmitteract(HttpServletRequest request, HttpServletResponse response, Submitter submitter,
			HttpSession session, String backurl) throws IOException {

		// 输出日志，表示正在执行当前方法SubmitterController.updatesubmitteract

		logger.debug("SubmitterController.updatesubmitteract ......");

		submitterservice.updatesubmitteract(request, submitter, session);

		// 如果backurl不等于null且backurl不等于当前方法名

		if (backurl != null && backurl.indexOf("updatesubmitteract.action") == -1) { // 返回backurl所对应方法

			return "forward:/" + backurl;
		}

		// 返回submittermanage.action方法

		return "forward:/submittermanage.action";

	}

	// 定义deletesubmitter,处理删除提交人

	@RequestMapping(value = "deletesubmitter")

	public String deletesubmitter(HttpServletRequest request, HttpServletResponse response, HttpSession session, int id,
			String backurl) {

		// 输出日志，表示当前正在执行SubmitterController.deletesubmitter方法

		logger.debug("SubmitterController.deletesubmitter ......");

		submitterservice.deletesubmitter(request, session, id);

		if (backurl != null && backurl.indexOf("deletesubmitter.action") == -1) {
			// 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回submittermanage.action方法

		return "forward:/submittermanage.action";

	}

	// 定义searchsubmitter方法，处理搜索操作

	@RequestMapping(value = "searchsubmitter")

	public String searchsubmitter(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			String search, String backurl) {

		// 输出日志，表示当前正在执行SubmitterController.searchsubmitter

		logger.debug("SubmitterController.searchsubmitter ......");

		submitterservice.searchsubmitter(request, session, search);

		// 如果backurl不等于null且backurl不等于当前方法

		if (backurl != null && backurl.indexOf("searchsubmitter.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回backurl所对应的方法

		return "searchsubmitter";

	}

	// 定义SubmitterpinglunMapper

	@RequestMapping(value = "submitterdetails")

	public String submitterdetails(HttpServletRequest request, HttpSession session, HttpServletResponse response,
			int id, String backurl) {

		// 输入日志信息，表名当前执行方法为SubmitterController.submitterdetails

		logger.debug("SubmitterController.submitterdetails ......");

		submitterservice.submitterdetails(request, session, id);

		// 如果backurl不等于null且backurl不等于当前方法

		if (backurl != null && backurl.indexOf("submitterdetails.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回submitterdetails

		return "submitterdetails";

	}

}
