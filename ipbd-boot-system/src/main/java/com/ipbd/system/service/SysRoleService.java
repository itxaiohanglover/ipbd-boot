package com.ipbd.system.service;

import com.ipbd.framework.common.utils.PageResult;
import com.ipbd.framework.mybatis.service.BaseService;
import com.ipbd.system.entity.SysRoleEntity;
import com.ipbd.system.query.SysRoleQuery;
import com.ipbd.system.vo.SysRoleDataScopeVO;
import com.ipbd.system.vo.SysRoleVO;

import java.util.List;

/**
 * 角色
 * 
 */
public interface SysRoleService extends BaseService<SysRoleEntity> {

	PageResult<SysRoleVO> page(SysRoleQuery query);

	List<SysRoleVO> getList(SysRoleQuery query);

	void save(SysRoleVO vo);

	void update(SysRoleVO vo);

	void dataScope(SysRoleDataScopeVO vo);

	void delete(List<Long> idList);
}
