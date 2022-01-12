package com.KomSoft.lection8;

public class Abonent {
    private long id;
    private String name;
    private String tariffPlan;
    private PhoneNumber phoneNumber;        // ссылк ана внутреннний класс

    public Abonent(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTariffPlan() {
        return tariffPlan;
    }

    public void setTariffPlan(String tariffPlan) {
        this.tariffPlan = tariffPlan;
    }

    public String getPhoneNumber() {
        if (phoneNumber != null) {
            return ("+" + phoneNumber.countryCode + "-" + phoneNumber.netCode + "-" + phoneNumber.number);
        } else {
            return "Phone number is empty";
        }
    }

    private class PhoneNumber {
        private int countryCode;
        private int netCode;
        private int number;

        public void setCountryCode(int countryCode) {
            // всякие проверки ....
            this.countryCode = countryCode;
        }

        public void setNetCode(int netCode) {
            this.netCode = netCode;
        }

        public int generateNumber() {
            int temp = new java.util.Random().nextInt(10_000_000);
            // проверки на совпадения и пр....
            number = temp;
            return number;
        }
    }

    public void obtainPhoneNumber(int countryCode, int netCode) {
        phoneNumber = new PhoneNumber();
        phoneNumber.setCountryCode(countryCode);
        phoneNumber.setNetCode(netCode);
        phoneNumber.generateNumber();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(100);
        stringBuilder.append("Abonent '" + name + "\'\n");
        stringBuilder.append(" ID - " + id + "\n");
        stringBuilder.append(" Tariff Plan - " + tariffPlan + "\n");
        stringBuilder.append(" Phone Number - " + getPhoneNumber() + "\n");
        return stringBuilder.toString();
    }
}
