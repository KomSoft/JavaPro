package com.KomSoft.lection8;

/*
    Created by Volodymyr P. Komarov aka KomSoft
*/
/*
    5. Создать класс Department с внутренним классом, с помощью объектов
    которого можно хранить информацию обо всех должностях отдела и обо
    всех сотрудниках, когда-либо занимавших конкретную должность.
*/
public class Department {
    private final int MAX_RECORDS = 100;
    public String depName;
    private Position[] positions;
    private int posCount;

    public int getRealPositionCount() {

    }

    public int getAllPositionCount() {
        return posCount;
    }

    public boolean addPosition(String position) {

    }



    private class Position {

    }

}
