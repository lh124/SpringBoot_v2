package com.fc.test.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fc.test.common.base.BaseService;
import com.fc.test.common.support.Convert;
import com.fc.test.mapper.auto.TsysOperLogMapper;
import com.fc.test.model.auto.TsysOperLog;
import com.fc.test.model.auto.TsysOperLogExample;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.util.SnowflakeIdWorker;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

public interface SysOperLogService {
	

	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	  PageInfo<TsysOperLog> list(Tablepar tablepar,String searchTxt);

	 int deleteByPrimaryKey(String ids) ;

	 TsysOperLog selectByPrimaryKey(String id) ;

	 int updateByPrimaryKeySelective(TsysOperLog record) ;
	
	 int updateByExampleSelective(TsysOperLog record, TsysOperLogExample example) ;

	 int updateByExample(TsysOperLog record, TsysOperLogExample example) ;

	 List<TsysOperLog> selectByExample(TsysOperLogExample example);

	 long countByExample(TsysOperLogExample example) ;

	 int deleteByExample(TsysOperLogExample example) ;

	 int insertSelective(TsysOperLog record) ;
	
}
