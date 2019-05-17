package com.fc.test.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.fc.test.common.base.BaseService;
import com.fc.test.common.conf.V2Config;
import com.fc.test.common.file.FileUploadUtils;
import com.fc.test.common.support.Convert;
import com.fc.test.mapper.auto.TsysDatasMapper;
import com.fc.test.model.auto.TsysDatas;
import com.fc.test.model.auto.TsysDatasExample;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.util.SnowflakeIdWorker;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

public interface SysDatasService {

	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	PageInfo<TsysDatas> list(Tablepar tablepar,String searchTxt);

	int deleteByPrimaryKey(String ids);

	/**
	 * 文件上传文件存储到文件表
	 * @param record
	 * @param fileURL
	 * @return 主键
	 * @throws IOException
	 */
	String insertSelective(MultipartFile file) throws IOException;

	int insertSelective(TsysDatas record);

	TsysDatas selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(TsysDatas record);

	int updateByPrimaryKey(TsysDatas record);

	int updateByExampleSelective(TsysDatas record, TsysDatasExample example);

	int updateByExample(TsysDatas record, TsysDatasExample example);

	List<TsysDatas> selectByExample(TsysDatasExample example);

	long countByExample(TsysDatasExample example);

	int deleteByExample(TsysDatasExample example);


}
