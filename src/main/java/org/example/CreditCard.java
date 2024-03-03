package org.example;

public class CreditCard {




    public long get_cardNumber() {
        return _cardNumber;
    }



    public String get_lastUsableDate() {
        return _lastUsableDate;
    }

    public String get_userName() {
        return _userName;
    }

    public int get_securityNumber() {
        return _securityNumber;
    }
    private  long _cardNumber;
    private String _userName;

    private int _securityNumber;

    private String _lastUsableDate;


    public CreditCard(long a_cardNumber,String a_userName, int a_securitNumber, String a_lastUsableDate ){
        _cardNumber = a_cardNumber;
        _userName = a_userName;
        _lastUsableDate = a_lastUsableDate;
        _securityNumber = a_securitNumber;
    }


}
