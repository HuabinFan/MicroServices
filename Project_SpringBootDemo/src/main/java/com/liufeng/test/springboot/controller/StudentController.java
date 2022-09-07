package com.liufeng.test.springboot.controller;

import com.liufeng.first.version.core.utils.ResultUtil;
import com.liufeng.test.springboot.dto.SaveStudentDTO;
import com.liufeng.test.springboot.server.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author: HB
 * @dateTime: 2022/8/24 16:43
 * @WeChatAccount: Java技术与生活
 * @description:
 */
@Api(value = "高校学生管理", tags = {"学生管理1", "学生管理2"})
@RestController
@RequestMapping("/v1/demo")
public class StudentController {

    @Autowired
    StudentService studentService;

    @ApiOperation(value = "新增学生信息", notes = "新增一条高校学生信息")
    @PostMapping("/add")
    public ResultUtil addStudent(@Valid @RequestBody SaveStudentDTO saveDto) throws Exception {
        return studentService.addStudent(saveDto) ? ResultUtil.success() : ResultUtil.failure();
    }

    @ApiOperation(value = "修改学生信息")
    @PutMapping("/update")
    public ResultUtil updateStudent(@Valid @RequestBody SaveStudentDTO updateDto) throws Exception {
        return studentService.updateStudent(updateDto) ? ResultUtil.success() : ResultUtil.failure();
    }
}
