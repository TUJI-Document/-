package org.mypro.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.mypro.entity.Submitter;
import org.mypro.entity.SubmitterExample;

public interface SubmitterMapper {
	long countByExample(SubmitterExample example);

	int deleteByExample(SubmitterExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(Submitter record);

	int insertSelective(Submitter record);

	List<Submitter> selectByExample(SubmitterExample example);

	Submitter selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") Submitter record, @Param("example") SubmitterExample example);

	int updateByExample(@Param("record") Submitter record, @Param("example") SubmitterExample example);

	int updateByPrimaryKeySelective(Submitter record);

	int updateByPrimaryKey(Submitter record);
}