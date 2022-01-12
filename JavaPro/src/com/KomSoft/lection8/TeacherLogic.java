package com.KomSoft.lection8;

public class TeacherLogic {
    public void excludeProcess(int rectorId, String nameStudent) {
        AbstractTeacher teacher = TeacherCreator.createTeacher(rectorId);
        System.out.println("Student: " + nameStudent + " has excluded: " + teacher.excludeStudent(nameStudent));
    }
}
