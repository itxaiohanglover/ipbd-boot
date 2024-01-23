package com.ipbd.system.dao;

import com.ipbd.framework.mybatis.dao.BaseDao;
import com.ipbd.system.entity.SysLogLoginEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 登录日志
 *
 */
@Mapper
public interface SysLogLoginDao extends BaseDao<SysLogLoginEntity> {

}