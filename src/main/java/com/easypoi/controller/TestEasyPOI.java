package com.easypoi.controller;


import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import com.easypoi.entity.CourseEntity;
import com.easypoi.entity.StudentEntity;
import com.easypoi.entity.TeacherEntity;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description TODO
 * @ClassName：TestEasyPOI :
 * @Package com.easypoi.controller
 * @anthor：wyang
 * @date：2019/1/23
 * @版本：V1.0
 */

public class TestEasyPOI {

    public static void main(String[] args) {
        try {

            testExportExcel_1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void testExportExcel_1() throws Exception {
        ExportParams params = new ExportParams("0328课程表", "日期：2016-03-28", "六年一班");

        CourseEntity course = new CourseEntity("1", "西天取金小班");
        TeacherEntity teacher = new TeacherEntity("老王");
        StudentEntity student = new StudentEntity("孙悟空", 1, new SimpleDateFormat("yyyy-MM-dd").parse("1995-06-01"), new SimpleDateFormat("yyyy-MM-dd").parse("2014-06-01"));
        StudentEntity student1 = new StudentEntity("猪九戒", 1, new SimpleDateFormat("yyyy-MM-dd").parse("1995-06-01"), new SimpleDateFormat("yyyy-MM-dd").parse("2014-06-01"));
        course.setMathTeacher(teacher);
        course.setStudents(Arrays.asList(student, student1));

        List<CourseEntity> courseEntityList = new ArrayList<>();
        courseEntityList.add(course);

        Workbook workbook = ExcelExportUtil.exportExcel(params, CourseEntity.class, courseEntityList);
        FileOutputStream fos = new FileOutputStream("D:/targetFile/0328课程表.xls");
        workbook.write(fos);
        fos.close();
    }
}
