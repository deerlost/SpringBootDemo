package com.makotojava.learn.springboot.model;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Description TODO
 * @ClassName：Student :
 * @Package com.makotojava.learn.springboot.model
 * @anthor：wyang
 * @date：2019/8/15
 * @版本：V1.0
 */
public class Student {
    enum ClassRoom{ONE,TWO,THREE}

    final ClassRoom room;

    final String name;

    public Student(ClassRoom room, String name) {
        this.room = room;
        this.name = name;
    }

    static List<Student> init(){
        List<Student> studentSet = new ArrayList<>();
        Student zhang = new Student(ClassRoom.ONE, "张三");
        Student li = new Student(ClassRoom.ONE, "张ds三");
        Student wu = new Student(ClassRoom.TWO, "李三");
        Student tr = new Student(ClassRoom.TWO, "李三tr");
        Student c = new Student(ClassRoom.TWO, "李dfd三");
        Student wang = new Student(ClassRoom.ONE, "wang三");
        Student a = new Student(ClassRoom.TWO, "李ewq三");
        studentSet.add(zhang);
        studentSet.add(wang);
        studentSet.add(li);
        studentSet.add(wu);
        studentSet.add(tr);
        studentSet.add(c);
        studentSet.add(a);

        return studentSet;
    }
}
