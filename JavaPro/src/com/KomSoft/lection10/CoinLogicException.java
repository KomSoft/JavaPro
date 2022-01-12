package com.KomSoft.lection10;

public class CoinLogicException extends CoinException{
    public CoinLogicException() {

    }

    public CoinLogicException(String message, Throwable exception) {
        super(message, exception);
    }

    public CoinLogicException(String message) {

    }
    public CoinLogicException(Throwable exception) {
        super(exception);
    }
}
