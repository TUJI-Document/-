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

import org.mypro.dao.CollectorMapper;

import org.mypro.entity.Collector;

import org.mypro.entity.CollectorExample;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.multipart.MultipartFile;

@Service

public class CollectorService implements CollectorServiceImp {

	private static final Log logger = LogFactory.getLog(CollectorService.class);

	@Autowired
	private CollectorMapper collectordao;

	// 定义方法addcollector,响应控制层addcollector请求

	public void addcollector(HttpServletRequest request, HttpSession session) {

		// 输出日志，当前执行方法为addcollector

		logger.debug("CollectorService.addcollector ......");

	}

	// 定义addcollectoract方法

	public void addcollectoract(HttpServletRequest request, HttpSession session, Collector collector)
			throws IOException {

		// 输出当前方法日志，表示正在执行CollectorService.addcollectoract方法

		logger.debug("CollectorService.addcollectoract ......");

		// 使用collectordao的insert方法将收集人添加到数据库中

		collectordao.insert(collector);

		// 将添加收集人信息添加到request中用message参数进行保存

		request.setAttribute("message", "添加收集人成功");

	}

	// 定义collectormanage方法响应页面请求

	public void collectormanage(HttpServletRequest request, HttpSession session) {

		// 输出日志，表示当前正在执行CollectorService.collectormanage

		logger.debug("CollectorService.collectormanage ......");

		// 实例化CollectorExample类为example

		CollectorExample example = new CollectorExample();

		// 使用 collectordao.selectByExample(example)方法获取所有的收集人数据

		List collectorall = collectordao.selectByExample(example);

		// 将所有的收集人数据保存到request中的collectorall参数里

		request.setAttribute("collectorall", collectorall);

	}

	// 定义 collectorview方法

	public void collectorview(HttpServletRequest request, HttpSession session) {

		// 输出日志，表示当前正在执行CollectorService.collectorview方法

		logger.debug("CollectorService.collectorview ......");

		// 实例化CollectorExample类

		CollectorExample example = new CollectorExample();

		// 使用collectordao的selectByExample方法查询收集人信息

		List collectorall = collectordao.selectByExample(example);

		// 将查询的collectorall保存到request中，记录为参数collectorall

		request.setAttribute("collectorall", collectorall);

	}

	// 定义 updatecollector方法

	public void updatecollector(HttpServletRequest request, HttpSession session, int id) {

		// 输出日志CollectorController.updatecollector，表示正在执行该方法

		logger.debug("CollectorController.updatecollector ......");

		// 定义收集人为biaoming，使用 collectordao的selectByPrimaryKey方法通过id查询数据

		Collector collector = collectordao.selectByPrimaryKey(id);

		// 将查询的收集人保存到request中

		request.setAttribute("collector", collector);

	}

	// 定义updatecollectoract处理收集人修改

	public void updatecollectoract(HttpServletRequest request, Collector collector, HttpSession session)
			throws IOException {

		// 输出日志，表示正在执行当前方法CollectorController.updatecollectoract

		logger.debug("CollectorController.updatecollectoract ......");

		// 执行collectordao的updateByPrimaryKeySelective方法，将传入的收集人数据同步到数据库中

		collectordao.updateByPrimaryKeySelective(collector);

		// 将修改成功信息保存到request中

		request.setAttribute("message", "修改收集人信息成功");

	}

	// 定义deletecollector,处理删除收集人

	public void deletecollector(HttpServletRequest request, HttpSession session, int id) {

		// 输出日志，表示当前正在执行CollectorService.deletecollector方法

		logger.debug("CollectorService.deletecollector ......");

		// 根据id调用collectordao的deleteByPrimaryKey方法，删除收集人

		collectordao.deleteByPrimaryKey(id);

		request.setAttribute("message", "删除收集人成功");

	}

	// 定义searchcollector方法，处理搜索操作

	public void searchcollector(HttpServletRequest request, HttpSession session, String search) {

		// 输出日志，表示当前正在执行CollectorService.searchcollector

		logger.debug("CollectorService.searchcollector ......");

		// 实例化 CollectorExample

		CollectorExample example = new CollectorExample();

		// 实例化 CollectorExample的Criteria内部类

		CollectorExample.Criteria criteria = example.createCriteria();

		// 如果搜索内容不等于空

		if (search != null) {

			// 将搜索内容通过like关键字传到数据库中进行搜索

			criteria.andNameLike("%" + search + "%");

		}

		// 查询收集人结果

		List collectorall = collectordao.selectByExample(example);

		// 将查询到的收集人 保存到request中进行保存

		request.setAttribute("collectorall", collectorall);

	}

	// 定义CollectorpinglunMapper

	public void collectordetails(HttpServletRequest request, HttpSession session, int id) {

		// 输入日志信息，表名当前执行方法为CollectorController.collectordetails

		logger.debug("CollectorController.collectordetails ......");

		// 传入页面所传入的收集人id使用collectordao的selectByPrimaryKey方法进行查询

		Collector collector = collectordao.selectByPrimaryKey(id);

		// 将查询到的收集人保存到request中

		request.setAttribute("collector", collector);

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
