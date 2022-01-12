package com.KomSoft.lection10;

public class CoinTechnicalException extends Exception{
    public CoinTechnicalException() {

    }

    public CoinTechnicalException(String message, Throwable exception) {
        super(message, exception);
    }

    public CoinTechnicalException(String message) {

    }
    public CoinTechnicalException(Throwable exception) {
        super(exception);
    }
}
