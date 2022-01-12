package com.KomSoft.lection6;

/*
    Created by Volodymyr P. Komarov aka KomSoft
*/

import java.util.Scanner;

/*
Консольний калькулятор
        создать метод * на получение числа
        создать метод * на получение операции
        создать метод * для вычислений (мин операций -, +, /, *)

        * Методы в Java - это законченная последовательность действий (инструкций), направленных на решение отдельной задачи. По сути это хорошо знакомые функции (они же процедуры, подпрограммы) более ранних, а не ООП языков. Только эти функции являются членами классов и для различения с обычными функциями, согласно терминологии объектно-ориентированного программирования функции-члены называются методами.
        В общем метод описывается (определяется) следующим образом:

        тип-возврат идентификатор-метода (параметры) {
        тело метода
            return возвратное-значение // если void, то инструкция return не обязательно
        }
*/
public class ConCalc {
    private double x1;
    private double x2;
    enum CalcOps { unknown, mul, div, sub, add };
    CalcOps ops;
    boolean isEnd = false;
    private Scanner scanner;

    public ConCalc() {
        scanner = new Scanner(System.in);
        x1 = 0;
        x2 = 0;
        ops = CalcOps.add;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double readArg() {
        return readArg(scanner.nextLine());
    }

    // избыточность для универсальности, чтобы можно было парсить входные данные из строк
    private double readArg(String s) {
        if (s.equalsIgnoreCase("EXIT")) {
            isEnd = true;
            return 0;
        } else {
        //TODO неплохо бы обработать exception
        return Double.parseDouble(s);
        }
    }

    public void readOps() {
        readOps(scanner.nextLine());
    }

    public void readOps(String ops) {
        if (ops.equalsIgnoreCase("EXIT")) {
            isEnd = true;
            return;
        }
        if (ops.equalsIgnoreCase("*")) {
            this.ops = CalcOps.mul;
            return;
        }
        if (ops.equalsIgnoreCase("/")) {
            this.ops = CalcOps.div;
            return;
        }
        if (ops.equalsIgnoreCase("+")) {
            this.ops = CalcOps.add;
            return;
        }
        if (ops.equalsIgnoreCase("-")) {
            this.ops = CalcOps.sub;
            return;
        }
        this.ops = CalcOps.unknown;
    }

    public double calc() {
        return this.calc(this.x1, this.x2, this.ops);
    }

    // можно будет вызывать и так
    public double calc(double x1, double x2, CalcOps operation) {
        this.setX1(x1);
        this.setX2(x2);
        ops = operation;
        switch ( operation ) {
            case add : {
                return x1 + x2;
            }
            case sub : {
                return x1 - x2;
            }
            case mul : {
                return x1 * x2;
            }
            case div : {
                return x2 == 0 ? Double.NaN : x1 / x2;
            }
            default: {
                return Double.NaN;
            }
        }
    }

    public String getOpsToString() {
        switch ( this.ops ) {
            case mul : {
                return "*";
            }
            case div : {
                return "/";
            }
            case add : {
                return "+";
            }
            case sub : {
                return "-";
            }
            default : {
                return "unknown";
            }
        }
    }

    public static void main(String[] args) {
        ConCalc calc = new ConCalc();
        if (args.length == 3) {
            calc.setX1(calc.readArg(args[0]));
            calc.setX2(calc.readArg(args[2]));
            calc.readOps(args[1]);
            System.out.print("Вычисляем: " + calc.getX1() + " " + calc.getOpsToString() + " " + calc.getX2() + " = ");
            System.out.println(calc.calc());
            calc.isEnd = true;
        } else {
            System.out.println("Консольный калькулятор. Формат вызова: ConCalc операнд1 операция операнд2");
            System.out.println("    Пример: ConCalc 2 / 3.1415926");
            System.out.println(" для завершения работы введите 'exit'");
        }
//        Scanner scanner = new Scanner(System.in);
        while (!calc.isEnd) {
            System.out.print("Введите первый аргумент (число): ");
            calc.setX1(calc.readArg());
            if (!calc.isEnd) {
                System.out.print("Введите операцию (+, -, *, /): ");
                calc.readOps();
            }
            if (!calc.isEnd) {
                System.out.print("Введите второй аргумент (число): ");
                calc.setX2(calc.readArg());
            }
            if (!calc.isEnd) {
                System.out.print("Вычисляем: " + calc.getX1() + " " + calc.getOpsToString() + " " + calc.getX2() + " = ");
                System.out.println(calc.calc());
            }
        }
    }
}
