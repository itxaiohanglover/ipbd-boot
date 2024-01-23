package com.ipbd.system.service;

import com.ipbd.framework.common.utils.PageResult;
import com.ipbd.framework.mybatis.service.BaseService;
import com.ipbd.system.entity.SysLogLoginEntity;
import com.ipbd.system.query.SysLogLoginQuery;
import com.ipbd.system.vo.SysLogLoginVO;

/**
 * 登录日志
 *
 */
public interface SysLogLoginService extends BaseService<SysLogLoginEntity> {

    /**
     * Page result.
     *
     * @param query the query
     * @return the page result
     */
    PageResult<SysLogLoginVO> page(SysLogLoginQuery query);

    /**
     * 保存登录日志
     *
     * @param username  用户名
     * @param status    登录状态
     * @param operation 操作信息
     */
    void save(String username, Integer status, Integer operation);

    /**
     * 导出登录日志
     */
    void export();
}