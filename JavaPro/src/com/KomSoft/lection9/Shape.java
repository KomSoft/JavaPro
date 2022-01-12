package com.KomSoft.lection9;

public enum Shape {
    RECTANGLE, TRIANGLE, CIRCLE, NEW;

    public double defineSquare(double ... x) {
        switch (this) {
            case RECTANGLE:  return x[0] * x[1];
            case TRIANGLE: return x[0] * x[1] / 2;
            case CIRCLE: return Math.pow(x[0], 2) * Math.PI;
            default: throw new EnumConstantNotPresentException(this.getDeclaringClass(), this.name());
        }
    }

/*
//    !!! -> работает в поздних версиях Java
    public double defineSquare2(double ... x) {
        double result = switch (this) {
            case TRIANGLE -> {return x[0] * x[1] / 2};
            case CIRCLE -> {return Math.pow(x[0], 2) * Math.PI;}
            case RECTANGLE -> {return x[0] * x[1];}
            default: {throw new EnumConstantNotPresentException(this.getDeclaringClass(), this.name());}
        }
    }
*/

}
