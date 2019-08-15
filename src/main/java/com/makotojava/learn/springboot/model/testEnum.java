package com.makotojava.learn.springboot.model;


import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

/**
 * @Description TODO
 * @ClassName：testEnum :
 * @Package com.makotojava.learn.springboot.model
 * @anthor：wyang
 * @date：2019/7/10
 * @版本：V1.0
 */
public class testEnum {
    public static void main(String[] args) {


        //  List<Student>[] studentByRoom = (List<Student>[])new List[Student.ClassRoom.values().length];

        List<Student> students = Student.init();

        Map<Student.ClassRoom, Set<Student>> studentByRoom = new EnumMap<>(Student.ClassRoom.class);

        for (Student.ClassRoom r : Student.ClassRoom.values()) {
            studentByRoom.put(r, new HashSet<>());
        }
        for (Student s : students) {
            studentByRoom.get(s.room).add(s);
        }
        //  System.out.println(studentByRoom);

        for (int j = 0; j < Student.ClassRoom.values().length; j++) {
            for (Student student :studentByRoom.get(Student.ClassRoom.values()[j])) {
                System.out.printf(" %s : %s%n", Student.ClassRoom.values()[j], student.name);
            }
        }

        System.out.println(true | false);
        PayrollDay day = PayrollDay.WEDNESDAY;
        System.out.println(day.pay(3000, 10));

        EnumStrategy strategy = EnumStrategy.valueOf(EnumStrategy.FAST1.name());
        System.out.println(strategy.getType());
        strategy.run();

        Optional<EnumStrategy> strategyOp = EnumStrategy.fromString((byte) 2);

        strategyOp.get().run();

    }

    public static void useEnum(String param) {
        EnumStrategy strategy = EnumStrategy.valueOf(param);
        strategy.run();
    }


}
