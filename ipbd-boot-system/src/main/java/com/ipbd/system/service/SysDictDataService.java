package com.ipbd.system.service;

import com.ipbd.framework.common.utils.PageResult;
import com.ipbd.framework.mybatis.service.BaseService;
import com.ipbd.system.entity.SysDictDataEntity;
import com.ipbd.system.query.SysDictDataQuery;
import com.ipbd.system.vo.SysDictDataVO;

import java.util.List;

/**
 * 数据字典
 *
 */
public interface SysDictDataService extends BaseService<SysDictDataEntity> {

    PageResult<SysDictDataVO> page(SysDictDataQuery query);

    void save(SysDictDataVO vo);

    void update(SysDictDataVO vo);

    void delete(List<Long> idList);

}