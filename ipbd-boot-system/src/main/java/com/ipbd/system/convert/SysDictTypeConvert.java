package com.ipbd.system.convert;

import com.ipbd.system.entity.SysDictTypeEntity;
import com.ipbd.system.vo.SysDictTypeVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface SysDictTypeConvert {
    SysDictTypeConvert INSTANCE = Mappers.getMapper(SysDictTypeConvert.class);

    SysDictTypeVO convert(SysDictTypeEntity entity);

    SysDictTypeEntity convert(SysDictTypeVO vo);
    
    List<SysDictTypeVO> convertList(List<SysDictTypeEntity> list);

}
