package com.easypoi.entity;


import cn.afterturn.easypoi.excel.annotation.Excel;

import java.util.Date;

/**
 * @Description TODO
 * @ClassName：StudentEntity :
 * @Package com.easypoi.entity
 * @anthor：wyang
 * @date：2019/1/23
 * @版本：V1.0
 */
public class StudentEntity {
    /**
     * 学生姓名
     */
    @Excel(name = "学生姓名", height = 20, width = 30,needMerge = true,isImportField = "true_st")
    private String name;
    /**
     * 学生性别
     */
    @Excel(name = "学生性别", replace = {"男_1", "女_2"}, suffix = "生", isImportField = "true_st")
    private int sex;

    @Excel(name = "出生日期", databaseFormat = "yyyyMMddHHmmss", format = "yyyy-MM-dd", isImportField = "true_st", width = 20)
    private Date birthday;

    @Excel(name = "进校日期", databaseFormat = "yyyyMMddHHmmss", format = "yyyy-MM-dd")
    private Date registrationDate;

    public StudentEntity(String name, int sex, Date birthday, Date registrationDate) {
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.registrationDate = registrationDate;
    }

    public StudentEntity() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }
}
