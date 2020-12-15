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

import org.mypro.service.CollectorServiceImp;

import org.mypro.entity.Collector;

import org.mypro.entity.CollectorExample;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.multipart.MultipartFile;

@Controller

@RequestMapping(value = "/")

public class CollectorController {

	private static final Log logger = LogFactory.getLog(CollectorController.class);

	@Autowired
	private CollectorServiceImp collectorservice;

	// 定义方法addcollector,响应页面addcollector请求

	@RequestMapping(value = "addcollector")

	public String addcollector(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			String backurl) {

		// 输出日志，当前执行方法为addcollector

		logger.debug("CollectorController.addcollector ......");

		collectorservice.addcollector(request, session);

		// 若返回地址不等于空且不等于addcollector.action，则将该请求跳转到backurl地址，再次执行方法

		if (backurl != null && backurl.indexOf("addcollector.action") == -1) {
			// 跳转到backurl中

			return "forward:/" + backurl;
		}
		// 返回addcollector页面

		return "addcollector";

	}

	// 定义addcollectoract方法

	@RequestMapping(value = "addcollectoract")

	public String addcollectoract(HttpServletRequest request, HttpSession session, HttpServletResponse response,
			Collector collector, String backurl) throws IOException {

		// 输出当前方法日志，表示正在执行CollectorController.addcollectoract方法

		logger.debug("CollectorController.addcollectoract ......");

		collectorservice.addcollectoract(request, session, collector); // 如果backurl不等于空，且backurl与本方法不同，则返回到backurl方法中

		if (backurl != null && backurl.indexOf("addcollectoract.action") == -1) { // 返回到backurl所在的方法

			return "forward:/" + backurl;
		}

		// 返回addcollector方法

		return "forward:/collectormanage.action";

	}

	// 定义collectormanage方法响应页面请求

	@RequestMapping(value = "collectormanage")

	public String collectormanage(HttpServletRequest request, HttpSession session, HttpServletResponse response,
			String backurl) {

		// 输出日志，表示当前正在执行CollectorController.collectormanage

		logger.debug("CollectorController.collectormanage ......");

		collectorservice.collectormanage(request, session); // 如果backurl不为空，且backurl与当前方法不同，则返回backurl地址所在的方法

		if (backurl != null && backurl.indexOf("collectormanage.action") == -1) { // 返回backurl所在的方法

			return "forward:/" + backurl;
		}

		// 返回到collectormanage页面

		return "collectormanage";

	}

	// 定义 collectorview方法

	@RequestMapping(value = "collectorview")

	public String collectorview(HttpServletRequest request, HttpSession session, HttpServletResponse response,
			String backurl) {

		// 输出日志，表示当前正在执行CollectorController.collectorview方法

		logger.debug("CollectorController.collectorview ......");

		collectorservice.collectorview(request, session);

		// 如果backurl不等于null且backurl不等于当前方法名

		if (backurl != null && backurl.indexOf("collectorview.action") == -1) { // 返回backur所在的方法

			return "forward:/" + backurl;
		}

		// 返回collectorview页面

		return "collectorview";

	}

	// 定义 updatecollector方法

	@RequestMapping(value = "updatecollector")

	public String updatecollector(HttpServletRequest request, HttpServletResponse response, HttpSession session, int id,
			String backurl) {

		// 输出日志CollectorController.updatecollector，表示正在执行该方法

		logger.debug("CollectorController.updatecollector ......");

		collectorservice.updatecollector(request, session, id); // 如果backurl不等于null且backurl不等于当前方法

		if (backurl != null && backurl.indexOf("updatecollector.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回updatecollector页面

		return "updatecollector";

	}

	// 定义updatecollectoract处理收集人修改

	@RequestMapping(value = "updatecollectoract")

	public String updatecollectoract(HttpServletRequest request, HttpServletResponse response, Collector collector,
			HttpSession session, String backurl) throws IOException {

		// 输出日志，表示正在执行当前方法CollectorController.updatecollectoract

		logger.debug("CollectorController.updatecollectoract ......");

		collectorservice.updatecollectoract(request, collector, session);

		// 如果backurl不等于null且backurl不等于当前方法名

		if (backurl != null && backurl.indexOf("updatecollectoract.action") == -1) { // 返回backurl所对应方法

			return "forward:/" + backurl;
		}

		// 返回collectormanage.action方法

		return "forward:/collectormanage.action";

	}

	// 定义deletecollector,处理删除收集人

	@RequestMapping(value = "deletecollector")

	public String deletecollector(HttpServletRequest request, HttpServletResponse response, HttpSession session, int id,
			String backurl) {

		// 输出日志，表示当前正在执行CollectorController.deletecollector方法

		logger.debug("CollectorController.deletecollector ......");

		collectorservice.deletecollector(request, session, id);

		if (backurl != null && backurl.indexOf("deletecollector.action") == -1) {
			// 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回collectormanage.action方法

		return "forward:/collectormanage.action";

	}

	// 定义searchcollector方法，处理搜索操作

	@RequestMapping(value = "searchcollector")

	public String searchcollector(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			String search, String backurl) {

		// 输出日志，表示当前正在执行CollectorController.searchcollector

		logger.debug("CollectorController.searchcollector ......");

		collectorservice.searchcollector(request, session, search);

		// 如果backurl不等于null且backurl不等于当前方法

		if (backurl != null && backurl.indexOf("searchcollector.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回backurl所对应的方法

		return "searchcollector";

	}

	// 定义CollectorpinglunMapper

	@RequestMapping(value = "collectordetails")

	public String collectordetails(HttpServletRequest request, HttpSession session, HttpServletResponse response,
			int id, String backurl) {

		// 输入日志信息，表名当前执行方法为CollectorController.collectordetails

		logger.debug("CollectorController.collectordetails ......");

		collectorservice.collectordetails(request, session, id);

		// 如果backurl不等于null且backurl不等于当前方法

		if (backurl != null && backurl.indexOf("collectordetails.action") == -1) { // 返回backurl所对应的方法

			return "forward:/" + backurl;
		}

		// 返回collectordetails

		return "collectordetails";

	}

}
