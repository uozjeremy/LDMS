package cn.cug.laboratory.service;

import cn.cug.laboratory.model.persistent.Student;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.Test;

/**
 * Created by HXY on 2016/5/27.
 */
public class StudentServiceTest extends AbstarctSpringTest {
    @Autowired
    private StudentService studentService;

    @Test
    public void insertTest()throws Exception{
        studentService.insert("鹏鹏","软件工程",111132,"信息工程","女");
    }

    @Test
    public void SelectByPrimaryKeyTest() throws Exception {
        System.out.println(studentService.selectByPrimaryKey("20131000007").toString());
    }
}
