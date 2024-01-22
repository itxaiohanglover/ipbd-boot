package net.maku.maku.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import net.maku.framework.common.utils.PageResult;
import net.maku.framework.common.utils.Result;
import net.maku.maku.convert.GenTestStudentConvert;
import net.maku.maku.entity.GenTestStudentEntity;
import net.maku.maku.service.GenTestStudentService;
import net.maku.maku.query.GenTestStudentQuery;
import net.maku.maku.vo.GenTestStudentVO;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

/**
* 测试2
*
* @author 阿沐 babamu@126.com
* @since 1.0.0 2024-01-22
*/
@RestController
@RequestMapping("maku/gen_test_student")
@Tag(name="测试2")
@AllArgsConstructor
public class GenTestStudentController {
    private final GenTestStudentService genTestStudentService;

    @GetMapping("page")
    @Operation(summary = "分页")
    @PreAuthorize("hasAuthority('maku:gen_test_student:page')")
    public Result<PageResult<GenTestStudentVO>> page(@ParameterObject @Valid GenTestStudentQuery query){
        PageResult<GenTestStudentVO> page = genTestStudentService.page(query);

        return Result.ok(page);
    }

    @GetMapping("{id}")
    @Operation(summary = "信息")
    @PreAuthorize("hasAuthority('maku:gen_test_student:info')")
    public Result<GenTestStudentVO> get(@PathVariable("id") Long id){
        GenTestStudentEntity entity = genTestStudentService.getById(id);

        return Result.ok(GenTestStudentConvert.INSTANCE.convert(entity));
    }

    @PostMapping
    @Operation(summary = "保存")
    @PreAuthorize("hasAuthority('maku:gen_test_student:save')")
    public Result<String> save(@RequestBody GenTestStudentVO vo){
        genTestStudentService.save(vo);

        return Result.ok();
    }

    @PutMapping
    @Operation(summary = "修改")
    @PreAuthorize("hasAuthority('maku:gen_test_student:update')")
    public Result<String> update(@RequestBody @Valid GenTestStudentVO vo){
        genTestStudentService.update(vo);

        return Result.ok();
    }

    @DeleteMapping
    @Operation(summary = "删除")
    @PreAuthorize("hasAuthority('maku:gen_test_student:delete')")
    public Result<String> delete(@RequestBody List<Long> idList){
        genTestStudentService.delete(idList);

        return Result.ok();
    }
}