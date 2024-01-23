package com.ipbd.system.service;

import com.ipbd.framework.common.utils.PageResult;
import com.ipbd.framework.mybatis.service.BaseService;
import com.ipbd.system.entity.SysLogOperateEntity;
import com.ipbd.system.query.SysLogOperateQuery;
import com.ipbd.system.vo.SysLogOperateVO;

/**
 * 操作日志
 *
 */
public interface SysLogOperateService extends BaseService<SysLogOperateEntity> {

    PageResult<SysLogOperateVO> page(SysLogOperateQuery query);
}