package org.mypro.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.mypro.entity.Submittertask;
import org.mypro.entity.SubmittertaskExample;

public interface SubmittertaskMapper {
	long countByExample(SubmittertaskExample example);

	int deleteByExample(SubmittertaskExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(Submittertask record);

	int insertSelective(Submittertask record);

	List<Submittertask> selectByExample(SubmittertaskExample example);

	Submittertask selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") Submittertask record, @Param("example") SubmittertaskExample example);

	int updateByExample(@Param("record") Submittertask record, @Param("example") SubmittertaskExample example);

	int updateByPrimaryKeySelective(Submittertask record);

	int updateByPrimaryKey(Submittertask record);
}