package com.ipbd.system.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ipbd.framework.mybatis.dao.BaseDao;
import com.ipbd.system.entity.SysUserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 系统用户
 * 
 */
@Mapper
public interface SysUserDao extends BaseDao<SysUserEntity> {

	List<SysUserEntity> getList(Map<String, Object> params);


	List<SysUserEntity> getRoleUserList(Map<String, Object> params);

	default SysUserEntity getByUsername(String username){
		return this.selectOne(new QueryWrapper<SysUserEntity>().eq("username", username));
	}

	default SysUserEntity getByMobile(String mobile){
		return this.selectOne(new QueryWrapper<SysUserEntity>().eq("mobile", mobile));
	}
}