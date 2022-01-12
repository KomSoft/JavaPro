package com.KomSoft.lection10;

public class CoinRunner {

//    public void doAction(String value) throws CoinTechnicalException {
public void doAction(String value) throws CoinLogicException {
        Coin ob = new Coin();
        try {
            double d = Double.parseDouble(value);
            ob.setDiameter(d);
/*
        } catch (NumberFormatException e) {
            throw new CoinTechnicalException("incorrect symbol in string", e);
        } catch (CoinLogicException e) {
            System.err.println(e.getCause());
        }
*/
        } catch (CoinException e) {
            throw e;
        }
    }


    public static void main(String[] args) {

    }
}
