package com.fc.test.service.impl;

import com.fc.test.mapper.auto.GeneratorMapper;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.model.custom.TsysTables;
import com.fc.test.service.GeneratorService;
import com.fc.test.util.GenUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipOutputStream;
@Service
public class GeneratorServiceImpl implements GeneratorService {

    @Autowired
    private GeneratorMapper generatorMapper;
    @Override
    public PageInfo<TsysTables> list(Tablepar tablepar, String searchTxt) {
        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
        List<TsysTables> list=  generatorMapper.queryList(searchTxt);
        PageInfo<TsysTables> pageInfo = new PageInfo<TsysTables>(list);
        return pageInfo;
    }

    @Override
    public byte[] generatorCode(String[] tableNames) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		ZipOutputStream zip = new ZipOutputStream(outputStream);

		for(String tableName : tableNames){
			//查询表信息
			TsysTables table = generatorMapper.queryTable(tableName);
			//查询列信息
			List<Map<String, String>> columns =generatorMapper.queryColumns(tableName);
			//生成代码
			GenUtils.generatorCode(table, columns, zip);
		}
		IOUtils.closeQuietly(zip);
		return outputStream.toByteArray();
    }
}
