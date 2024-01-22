package net.maku.maku.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import lombok.AllArgsConstructor;
import net.maku.framework.common.utils.PageResult;
import net.maku.framework.mybatis.service.impl.BaseServiceImpl;
import net.maku.maku.convert.GenTestStudentConvert;
import net.maku.maku.entity.GenTestStudentEntity;
import net.maku.maku.query.GenTestStudentQuery;
import net.maku.maku.vo.GenTestStudentVO;
import net.maku.maku.dao.GenTestStudentDao;
import net.maku.maku.service.GenTestStudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 测试2
 *
 * @author 阿沐 babamu@126.com
 * @since 1.0.0 2024-01-22
 */
@Service
@AllArgsConstructor
public class GenTestStudentServiceImpl extends BaseServiceImpl<GenTestStudentDao, GenTestStudentEntity> implements GenTestStudentService {

    @Override
    public PageResult<GenTestStudentVO> page(GenTestStudentQuery query) {
        IPage<GenTestStudentEntity> page = baseMapper.selectPage(getPage(query), getWrapper(query));

        return new PageResult<>(GenTestStudentConvert.INSTANCE.convertList(page.getRecords()), page.getTotal());
    }

    private LambdaQueryWrapper<GenTestStudentEntity> getWrapper(GenTestStudentQuery query){
        LambdaQueryWrapper<GenTestStudentEntity> wrapper = Wrappers.lambdaQuery();

        return wrapper;
    }

    @Override
    public void save(GenTestStudentVO vo) {
        GenTestStudentEntity entity = GenTestStudentConvert.INSTANCE.convert(vo);

        baseMapper.insert(entity);
    }

    @Override
    public void update(GenTestStudentVO vo) {
        GenTestStudentEntity entity = GenTestStudentConvert.INSTANCE.convert(vo);

        updateById(entity);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(List<Long> idList) {
        removeByIds(idList);
    }

}