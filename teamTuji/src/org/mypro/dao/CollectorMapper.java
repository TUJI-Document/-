package org.mypro.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.mypro.entity.Collector;
import org.mypro.entity.CollectorExample;

public interface CollectorMapper {
	long countByExample(CollectorExample example);

	int deleteByExample(CollectorExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(Collector record);

	int insertSelective(Collector record);

	List<Collector> selectByExample(CollectorExample example);

	Collector selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") Collector record, @Param("example") CollectorExample example);

	int updateByExample(@Param("record") Collector record, @Param("example") CollectorExample example);

	int updateByPrimaryKeySelective(Collector record);

	int updateByPrimaryKey(Collector record);
}