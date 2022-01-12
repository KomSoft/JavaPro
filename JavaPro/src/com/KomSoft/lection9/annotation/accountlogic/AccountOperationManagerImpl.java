package com.KomSoft.lection9.annotation.accountlogic;


import com.KomSoft.lection9.annotation.BankingAnnotation;
import com.KomSoft.lection9.annotation.SecurityLevelEnum;

public class AccountOperationManagerImpl implements AccountOperationManager {
    @Override
    @BankingAnnotation(securityLevel = SecurityLevelEnum.HIGH)
    public double depositInCash(int accountNumber, int amount) {
        return 0;
    }

    @Override
    @BankingAnnotation(securityLevel = SecurityLevelEnum.HIGH)
    public boolean withdraw(int accountNumber, int amount) {
        return true;
    }

    @Override
    @BankingAnnotation(securityLevel = SecurityLevelEnum.LOW)
    public boolean convert(double amount) {
        return false;
    }

    @Override
    @BankingAnnotation
    public boolean transfer(int accountNumber, double amount) {
        return false;
    }
}
