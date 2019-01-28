package com.easypoi.entity;


import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;

/**
 * @Description TODO
 * @ClassName：TeacherEntity :
 * @Package com.easypoi.entity
 * @anthor：wyang
 * @date：2019/1/23
 * @版本：V1.0
 */
@ExcelTarget("teacherEntity")
public class TeacherEntity implements java.io.Serializable {
    /**
     * name
     */
    @Excel(name = "主讲老师_teacherEntity,代课老师_absent", orderNum = "1", mergeVertical = true, needMerge = true, isImportField = "true_major,true_absent")
    private String name;

    @Excel(name = "老师年龄_teacherEntity,年龄_age", orderNum = "2", mergeVertical = true, needMerge = true, isImportField = "true_major,true_absent")
    private Integer age;

    public TeacherEntity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public TeacherEntity(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}

