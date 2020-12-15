SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------

-- ----------------------------

-- Table structure for bianxiewenjian

-- ----------------------------

DROP TABLE IF EXISTS `t_admin`;

CREATE TABLE `t_admin` (`id` int(11) NOT NULL AUTO_INCREMENT COMMENT '管理员id',`username` varchar(255) DEFAULT NULL COMMENT '账号',`password` varchar(255) DEFAULT NULL COMMENT '密码',PRIMARY KEY (`id`)

) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='管理员';


-- ----------------------------

DROP TABLE IF EXISTS `t_collector`;

CREATE TABLE `t_collector` (`id` int(11) NOT NULL AUTO_INCREMENT COMMENT '收集人id',`name` varchar(255) DEFAULT NULL COMMENT '姓名',`tel` varchar(255) DEFAULT NULL COMMENT '移动电话',PRIMARY KEY (`id`)

) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='收集人';


-- ----------------------------

DROP TABLE IF EXISTS `t_submitter`;

CREATE TABLE `t_submitter` (`id` int(11) NOT NULL AUTO_INCREMENT COMMENT '提交人id',`name` varchar(255) DEFAULT NULL COMMENT '姓名',`email` varchar(255) DEFAULT NULL COMMENT '邮箱',`tel` varchar(255) DEFAULT NULL COMMENT '电话号码',`wxnum` varchar(255) DEFAULT NULL COMMENT '微信号',PRIMARY KEY (`id`)

) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='提交人';


-- ----------------------------

DROP TABLE IF EXISTS `t_task`;

CREATE TABLE `t_task` (`id` int(11) NOT NULL AUTO_INCREMENT COMMENT '任务',`name` varchar(255) DEFAULT NULL COMMENT '名字',`introduce` varchar(255) DEFAULT NULL COMMENT '任务描述',`closingdate` varchar(255) DEFAULT NULL COMMENT '截止日期',`file` varchar(255) DEFAULT NULL COMMENT '文件',`submitternumber` varchar(255) DEFAULT NULL COMMENT '提交人数量',`collector` varchar(255) DEFAULT NULL COMMENT '收集人',`collectorid` int(11) DEFAULT NULL COMMENT '收集人id',PRIMARY KEY (`id`)

) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='任务';


-- ----------------------------

DROP TABLE IF EXISTS `t_submittertask`;

CREATE TABLE `t_submittertask` (`id` int(11) NOT NULL AUTO_INCREMENT COMMENT '提交人任务id',`task` varchar(255) DEFAULT NULL COMMENT '任务',`taskid` int(11) DEFAULT NULL COMMENT '任务id',`submitter` varchar(255) DEFAULT NULL COMMENT '提交人',`submitterid` int(11) DEFAULT NULL COMMENT '提交人id',`closingdate` varchar(255) DEFAULT NULL COMMENT '截止日期',`introduce` varchar(500) DEFAULT NULL COMMENT '任务描述',`taskfile` varchar(255) DEFAULT NULL COMMENT '任务文件',`state` varchar(255) DEFAULT NULL COMMENT '状态',PRIMARY KEY (`id`)

) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='提交人任务';




