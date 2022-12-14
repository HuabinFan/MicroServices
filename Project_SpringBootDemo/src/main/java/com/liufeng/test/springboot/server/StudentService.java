package com.liufeng.test.springboot.server;

import com.liufeng.test.springboot.dto.SaveStudentDTO;
import com.liufeng.test.springboot.vo.StudentVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.common.utils.Page;
import org.springframework.stereotype.Service;

/**
 * @author: HB
 * @dateTime: 2022/8/24 16:44
 * @WeChatAccount: Java技术与生活
 * @description:
 */
@Slf4j
@Service
public class StudentService {

    /**
     * 新增学生信息
     * @param saveDto 学生信息参数
     * @return true 新增成功；false 新增失败
     */
    public boolean addStudent(SaveStudentDTO saveDto) {
        return true;
    }

    public boolean deleteStudent() {
        return true;
    }

    public boolean updateStudent(SaveStudentDTO updateDto) {
        return true;
    }

    public Page queryStudent() {
        return null;
    }

    public StudentVO getDetailsInfo() {
        return null;
    }

}
