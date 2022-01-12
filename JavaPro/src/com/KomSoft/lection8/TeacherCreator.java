package com.KomSoft.lection8;

public class TeacherCreator {
    public static AbstractTeacher createTeacher(int id) {

        //объявляем внутренний класс
        class Rector extends AbstractTeacher {
            Rector (int id) {
                super(id);
            }
            @Override
            public boolean excludeStudent(String name) {
                if (name != null) {
                    // выгоняем студента
                    return  true;
                } else {
                    return false;
                }
            }
        }

        if (isRectorId(id))
        {
            return new Rector(id);
        } else {
            return new Teacher(id);
        }
    }

    private static boolean isRectorId(int id) {
        // проверка id
        return id == 6; // for example....
    }
}
