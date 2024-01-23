package com.ipbd.system.dao;

import com.ipbd.framework.mybatis.dao.BaseDao;
import com.ipbd.system.entity.SysLogOperateEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 操作日志
 *
 */
@Mapper
public interface SysLogOperateDao extends BaseDao<SysLogOperateEntity> {

}