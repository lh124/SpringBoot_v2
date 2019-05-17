package com.fc.test.service;

import com.fc.test.model.custom.Tablepar;
import com.fc.test.model.custom.TsysTables;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;


/**
 * 自动生成代码Service
* @Title: GeneratorService.java 
* @Package com.fc.test.service 
* @author fuce  
* @date 2019年5月9日 上午12:24:47 
* @version V1.0   
 */
public interface GeneratorService {

	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 PageInfo<TsysTables> list(Tablepar tablepar,String searchTxt);

	 
	 
	 /**
	  * 代码
	  * @param tableName
	  * @return
	  */
	 byte[] generatorCode(String[] tableNames);
}
