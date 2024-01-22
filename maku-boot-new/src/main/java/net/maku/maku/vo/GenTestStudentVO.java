package net.maku.maku.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import java.io.Serializable;
import net.maku.framework.common.utils.DateUtils;
import java.util.Date;

/**
* 测试2
*
* @author 阿沐 babamu@126.com
* @since 1.0.0 2024-01-22
*/
@Data
@Schema(description = "测试2")
public class GenTestStudentVO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Schema(description = "学生ID")
	private Long id;

	@Schema(description = "姓名")
	private String name;

	@Schema(description = "性别")
	private Integer gender;

	@Schema(description = "年龄")
	private Integer age;

	@Schema(description = "班级")
	private String className;

	@Schema(description = "版本号")
	private Integer version;

	@Schema(description = "删除标识")
	private Integer deleted;

	@Schema(description = "创建者")
	private Long creator;

	@Schema(description = "创建时间")
	@JsonFormat(pattern = DateUtils.DATE_TIME_PATTERN)
	private Date createTime;

	@Schema(description = "更新者")
	private Long updater;

	@Schema(description = "更新时间")
	@JsonFormat(pattern = DateUtils.DATE_TIME_PATTERN)
	private Date updateTime;


}