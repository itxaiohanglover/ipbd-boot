package net.maku.maku.convert;

import net.maku.maku.entity.GenTestStudentEntity;
import net.maku.maku.vo.GenTestStudentVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
* 测试2
*
* @author 阿沐 babamu@126.com
* @since 1.0.0 2024-01-22
*/
@Mapper
public interface GenTestStudentConvert {
    GenTestStudentConvert INSTANCE = Mappers.getMapper(GenTestStudentConvert.class);

    GenTestStudentEntity convert(GenTestStudentVO vo);

    GenTestStudentVO convert(GenTestStudentEntity entity);

    List<GenTestStudentVO> convertList(List<GenTestStudentEntity> list);

}