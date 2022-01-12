package com.KomSoft.lection9.run;

import com.KomSoft.lection9.annotation.accountlogic.AccountOperationManager;
import com.KomSoft.lection9.annotation.accountlogic.AccountOperationManagerImpl;
import com.KomSoft.lection9.annotation.logic.SecurityFactory;

public class AnnotationRunner {
    public static void main(String[] args) {
        AccountOperationManager account = new AccountOperationManagerImpl();
        // "регистрация " класса для вкл аннотации в обработку
        AccountOperationManager securityAccount = SecurityFactory.createSecurityObject(account);
        securityAccount.depositInCash(101255, 6);
        securityAccount.withdraw(561654, 2);
        securityAccount.convert(200);
        securityAccount.transfer(65168468, 300);
    }
}
