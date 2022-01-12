package com.KomSoft.lection10;

public class CoinException extends Exception{
    public CoinException() {

    }

    public CoinException(String message, Throwable exception) {
        super(message, exception);
    }

    public CoinException(String message) {

    }
    public CoinException(Throwable exception) {
        super(exception);
    }
}
