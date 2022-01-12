package com.KomSoft.lection9.annotation.logic;

import com.KomSoft.lection9.annotation.SecurityLevelEnum;
import java.lang.reflect.Method;

public class SecurityLogic {
    public void onInvoke(SecurityLevelEnum levelEnum, Method method, Object[] args) {
        StringBuilder argsString = new StringBuilder();
        for(Object arg : args) {
            argsString.append(arg.toString()).append(" :");
        }
        argsString.setLength(argsString.length() - 1);
        System.out.print(String.format("Method %S was invoked with parameters : %s", method.getName(), argsString));

        switch (levelEnum) {
            case LOW : {
                System.out.println("  Low level of security checks: " + levelEnum);
                break;
            }
            case NORMAL: {
                System.out.println("  Normal level of security checks: " + levelEnum);
                break;
            }
            case HIGH: {
                System.out.println("  High level of security checks: " + levelEnum);
                break;
            }
        }
    }
}
