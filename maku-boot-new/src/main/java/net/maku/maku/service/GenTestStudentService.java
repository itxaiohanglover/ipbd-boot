package net.maku.maku.service;

import net.maku.framework.common.utils.PageResult;
import net.maku.framework.mybatis.service.BaseService;
import net.maku.maku.vo.GenTestStudentVO;
import net.maku.maku.query.GenTestStudentQuery;
import net.maku.maku.entity.GenTestStudentEntity;

import java.util.List;

/**
 * 测试2
 *
 * @author 阿沐 babamu@126.com
 * @since 1.0.0 2024-01-22
 */
public interface GenTestStudentService extends BaseService<GenTestStudentEntity> {

    PageResult<GenTestStudentVO> page(GenTestStudentQuery query);

    void save(GenTestStudentVO vo);

    void update(GenTestStudentVO vo);

    void delete(List<Long> idList);
}