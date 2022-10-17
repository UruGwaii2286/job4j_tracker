package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Ivan Ivanov");
        student.setGroup(3);
        student.setDate(new Date());

        System.out.println(student.getFio() + " joined the group" + student.getGroup() + " " + student.getDate());
    }
}
