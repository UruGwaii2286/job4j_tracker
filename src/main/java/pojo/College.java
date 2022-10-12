package pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Ivan Ivanov");
        student.setGroup(3);
        student.setDate(new Date());

        System.out.println(student.getFio() + " поступил в группу " + student.getGroup() + " " + student.getDate());
    }
}
