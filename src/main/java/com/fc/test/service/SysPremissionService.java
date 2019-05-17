package com.fc.test.service;

import com.fc.test.model.auto.TsysPremission;
import com.fc.test.model.auto.TsysPremissionExample;
import com.fc.test.model.custom.BootstrapThree;
import com.fc.test.model.custom.PremissionThreeModelVo;
import com.fc.test.model.custom.Tablepar;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface SysPremissionService {
	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	  PageInfo<TsysPremission> list(Tablepar tablepar,String searchTxt);

	
	int deleteByPrimaryKey(String ids) ;


	
	 int insertSelective(TsysPremission record) ;

	 TsysPremission selectByPrimaryKey(String id);

	
	int updateByPrimaryKeySelective(TsysPremission record);
	
	 int updateByPrimaryKey(TsysPremission record);

	
	int updateByExampleSelective(TsysPremission record, TsysPremissionExample example) ;

	
int updateByExample(TsysPremission record, TsysPremissionExample example) ;

	List<TsysPremission> selectByExample(TsysPremissionExample example) ;

	
long countByExample(TsysPremissionExample example) ;

	
	 int deleteByExample(TsysPremissionExample example) ;
	
	/**
	 * 检查权限名字
	 * @param tsysUser
	 * @return
	 */
	 int checkNameUnique(TsysPremission tsysPremission);

	/**
	 * 检查权限URL
	 * @param tsysUser
	 * @return
	 */
	 int checkURLUnique(TsysPremission tsysPremission);

	/**
	 * 检查权限perms字段
	 * @param tsysUser
	 * @return
	 */
	 int checkPermsUnique(TsysPremission tsysPremission);
	
	
	/**
	 * 根据父id 以及类型查询权限子集
	 * @param pid
	 * @return
	 */
	 List<TsysPremission> queryPid(String pid,int type);
	

	/**
	 * 获取权限树
	 * @return
	 */
	 PremissionThreeModelVo queryThreePrem();
	
	/**
	 * 获取转换成bootstarp的权限数据
	 * @return
	 */
	 BootstrapThree getbooBootstrapThreePerm();
	
	
	/**
	 * 获取所有权限
	 * @return
	 */
	 List<TsysPremission> getall();
	
	
	/**
	 * 判断权限是否有权限
	 * @param myTsysPremissions
	 * @param sysPremission
	 */
	 Boolean ifpermissions(List<TsysPremission>  myTsysPremissions,BootstrapThree sysPremission);
	
	
	/**
	 * 获取角色已有的Bootstarp权限
	 * @return
	 */
	 BootstrapThree getCheckPrem(String roleid) ;
	
	
}
