package com.fc.test.service;

import com.fc.test.model.auto.TsysDatas;
import com.fc.test.model.auto.TsysFileData;
import com.fc.test.model.auto.TsysFileDataExample;

import java.util.List;

public interface SysFileDatasService{

	 int deleteByPrimaryKey(String ids);

	 int insertSelective(TsysFileData record);

	 TsysFileData selectByPrimaryKey(String id);

	 int updateByPrimaryKeySelective(TsysFileData record) ;

	 int updateByExampleSelective(TsysFileData record,
			TsysFileDataExample example);

	 int updateByExample(TsysFileData record, TsysFileDataExample example) ;

	 List<TsysFileData> selectByExample(TsysFileDataExample example) ;

	 long countByExample(TsysFileDataExample example) ;

	 int deleteByExample(TsysFileDataExample example) ;
	
	/**
	 * 根据文件列表id查询出对应的文件信息,已经支持多个图片获取
	 * @param fileid
	 * @return
	 */
	 List<TsysDatas> queryfileID(String fileid);

}
