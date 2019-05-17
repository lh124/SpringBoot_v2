package com.fc.test.service;

import com.fc.test.model.auto.TsysFile;
import com.fc.test.model.auto.TsysFileExample;
import com.fc.test.model.custom.Tablepar;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

public interface SysFileService {
    /**
     * 分页查询
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageInfo<TsysFile> list(Tablepar tablepar,String searchTxt);

    int deleteByPrimaryKey(String ids) ;

    int insertSelective(TsysFile record,String dataId) ;

    TsysFile selectByPrimaryKey(String id) ;

    int updateByPrimaryKeySelective(TsysFile record) ;

    /**
     * 修改信息
     * @param record
     * @return
     */
    int updateByPrimaryKey(TsysFile record,String dataId) ;


    int updateByExampleSelective(TsysFile record, TsysFileExample example) ;

    int updateByExample(TsysFile record, TsysFileExample example) ;

    List<TsysFile> selectByExample(TsysFileExample example) ;

    long countByExample(TsysFileExample example) ;

    int deleteByExample(TsysFileExample example);

    /**
     * 检查文件名字
     * @param TsysFile
     * @return
     */
    int checkNameUnique(TsysFile tsysFile);


    //无用
    int insertSelective(TsysFile record) ;

}
