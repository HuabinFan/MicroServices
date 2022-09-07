package com.liufeng.test.springboot.server;

import com.liufeng.test.springboot.dto.SaveStudentDTO;
import lombok.extern.slf4j.Slf4j;
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

    public boolean addStudent(SaveStudentDTO saveDto) {
        return true;
    }

    public boolean updateStudent(SaveStudentDTO updateDto) {
        return true;
    }
}
