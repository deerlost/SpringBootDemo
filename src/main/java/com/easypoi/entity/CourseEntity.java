package com.easypoi.entity;


import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelCollection;
import cn.afterturn.easypoi.excel.annotation.ExcelEntity;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description TODO
 * @ClassName：CourseEntity :
 * @Package com.easypoi.entity
 * @anthor：wyang
 * @date：2019/1/23
 * @版本：V1.0
 */
@ExcelTarget("CourseEntity")
public class CourseEntity implements java.io.Serializable {
    /**
     * 主键
     */
    private String id;
    /**
     * 课程名称
     */
    @Excel(name = "课程名称", orderNum = "1", width = 25, needMerge = true)
    private String name;

    /**
     * 老师主键
     */
    @ExcelEntity(id = "teacherEntity")
    private TeacherEntity mathTeacher;

    @ExcelCollection(name = "学生", orderNum = "2")
    private List<StudentEntity> students;

    public CourseEntity(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TeacherEntity getMathTeacher() {
        return mathTeacher;
    }

    public void setMathTeacher(TeacherEntity mathTeacher) {
        this.mathTeacher = mathTeacher;
    }

    public List<StudentEntity> getStudents() {
        return students;
    }

    public void setStudents(List<StudentEntity> students) {
        this.students = students;
    }
}
