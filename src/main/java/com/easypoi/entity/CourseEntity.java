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
     *图片导出
     *表示type =2 该字段类型为图片,imageType=1
     *(默认可以不填),表示从file读取,字段类型是个字符串类型
     *可以用相对路径也可以用绝对路径,绝对路径优先依次获取
     *图片是先贴单元格，后合并
     */
    @Excel(name = "课程图片", orderNum = "1",width = 25, height = 25,type = 2,needMerge = true)
    private String courseImg;

    /**
     * 老师主键
     */
    @ExcelEntity(id = "teacherEntity")
    private TeacherEntity mathTeacher;

    @ExcelCollection(name = "学生", orderNum = "2")
    private List<StudentEntity> students;

    public CourseEntity() {
    }

    public CourseEntity(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public CourseEntity(String id, String name, String courseImg) {
        this.id = id;
        this.name = name;
        this.courseImg = courseImg;
    }

    public String getId() {
        return id;
    }

    public CourseEntity setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public CourseEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String getCourseImg() {
        return courseImg;
    }

    public CourseEntity setCourseImg(String courseImg) {
        this.courseImg = courseImg;
        return this;
    }

    public TeacherEntity getMathTeacher() {
        return mathTeacher;
    }

    public CourseEntity setMathTeacher(TeacherEntity mathTeacher) {
        this.mathTeacher = mathTeacher;
        return this;
    }

    public List<StudentEntity> getStudents() {
        return students;
    }

    public CourseEntity setStudents(List<StudentEntity> students) {
        this.students = students;
        return this;
    }
}
