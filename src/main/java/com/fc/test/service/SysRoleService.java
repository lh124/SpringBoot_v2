package com.fc.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import cn.hutool.core.util.RandomUtil;
import com.fc.test.common.base.BaseService;
import com.fc.test.common.support.Convert;
import com.fc.test.mapper.auto.TsysPermissionRoleMapper;
import com.fc.test.mapper.auto.TsysRoleMapper;
import com.fc.test.mapper.custom.RoleDao;
import com.fc.test.model.auto.TsysPermissionRole;
import com.fc.test.model.auto.TsysPermissionRoleExample;
import com.fc.test.model.auto.TsysRole;
import com.fc.test.model.auto.TsysRoleExample;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.util.SnowflakeIdWorker;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

public interface SysRoleService  {

	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	  PageInfo<TsysRole> list(Tablepar tablepar,String searchTxt);
	 
	 /**
	  * 查询全部角色集合
	  * @return
	  */
	  List<TsysRole> queryList();

	
	 /**
	  * 
	  */	
	 int deleteByPrimaryKey(String ids);


	
	 int insertSelective(TsysRole record) ;
	
	/**
	 * 添加角色绑定权限
	 * @param record 角色信息
	 * @param prem 权限id集合
	 * @return
	 */
	 int insertRoleAndPrem(TsysRole record,String prem) ;

	 TsysRole selectByPrimaryKey(String id);

	
	 int updateByPrimaryKeySelective(TsysRole record);
	
	/**
	 * 修改用户角色 以及下面绑定的权限
	 * @param record
	 * @return
	 */
	 int updateRoleAndPrem(TsysRole record,String prem) ;
	

	
	int updateByExampleSelective(TsysRole record, TsysRoleExample example) ;
	
	 int updateByExample(TsysRole record, TsysRoleExample example) ;

	 List<TsysRole> selectByExample(TsysRoleExample example) ;

	
	 long countByExample(TsysRoleExample example) ;

	
	 int deleteByExample(TsysRoleExample example);
	
	/**
	 * 检查角色name
	 * @param tsysUser
	 * @return
	 */
	 int checkNameUnique(TsysRole tsysRole);
	
	
	/**
	 * 根据用户id查询角色
	 * @param userid
	 * @return
	 */
	 List<TsysRole> queryUserRole(String userid);
	
}
