package com.fc.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fc.test.common.base.BaseService;
import com.fc.test.common.support.Convert;
import com.fc.test.mapper.auto.TSysRoleUserMapper;
import com.fc.test.mapper.auto.TsysRoleMapper;
import com.fc.test.mapper.auto.TsysUserMapper;
import com.fc.test.mapper.custom.RoleDao;
import com.fc.test.model.auto.TSysRoleUser;
import com.fc.test.model.auto.TSysRoleUserExample;
import com.fc.test.model.auto.TsysRole;
import com.fc.test.model.auto.TsysRoleExample;
import com.fc.test.model.auto.TsysUser;
import com.fc.test.model.auto.TsysUserExample;
import com.fc.test.model.custom.RoleVo;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.util.MD5Util;
import com.fc.test.util.SnowflakeIdWorker;
import com.fc.test.util.StringUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 系统用户
 * @ClassName: SysUserService
 * @author fuce
 * @date 2018年8月26日
 *
 */
public interface SysUserService {
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	  PageInfo<TsysUser> list(Tablepar tablepar,String username);

	 int deleteByPrimaryKey(String ids) ;
	
	/**
	 * 添加用户
	 */
	 int insertSelective(TsysUser record);
	
	/**
	 * 添加用户跟角色信息
	 * @param record
	 * @param roles
	 * @return
	 */
	 int insertUserRoles(TsysUser record,List<String> roles);
	
	 TsysUser selectByPrimaryKey(String id) ;

	 int updateByPrimaryKeySelective(TsysUser record) ;

	int updateByExampleSelective(TsysUser record, TsysUserExample example) ;
	
	 int updateByExample(TsysUser record, TsysUserExample example) ;

     List<TsysUser> selectByExample(TsysUserExample example) ;

	 long countByExample(TsysUserExample example) ;

	
	 int deleteByExample(TsysUserExample example) ;
	
	/**
	 * 检查用户name
	 * @param tsysUser
	 * @return
	 */
	 int checkLoginNameUnique(TsysUser tsysUser);
	
	/**
	 * 获取所有权限 并且增加是否有权限字段
	 * @return
	 */
	 List<RoleVo> getUserIsRole(String userid);
	
	
	/**
	 * 修改用户密码
	 * @param record
	 * @return
	 */
	 int updateUserPassword(TsysUser record) ;
	
	
	/**
	 * 修改用户信息以及角色信息
	 * @param record
	 * @param roles
	 * @return
	 */
	int updateUserRoles(TsysUser record,List<String> roles) ;
	
	
	
}
