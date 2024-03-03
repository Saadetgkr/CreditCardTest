package org.example;

import java.util.Arrays;

public class CreditCardTester {
    public CreditCardTester() {

    }

    public boolean TestResult(CreditCard a_creditCard){

        if(isSecurityNumberProper(a_creditCard.get_securityNumber()) && isCardNumberProper( a_creditCard.get_cardNumber()) && isDateProper(a_creditCard.get_lastUsableDate()) && isNameProper(a_creditCard.get_userName()) )
        {
            System.out.println("Test passed.");
            return true;
        }
        else{

            System.out.println("Test failed.");
            return false;
        }

    }

    private boolean isSecurityNumberProper(int a_securityNumber){



            if (a_securityNumber >= 0 && a_securityNumber < 1000) {
                return true;
            }

        return false;
    }
        private boolean isNameProper(String a_name)
        {
        return     a_name.toCharArray().length>0;
        }

        private boolean isCardNumberProper(long a_cardNumber){
            return Math.pow(10,15)< a_cardNumber && a_cardNumber< Math.pow(10,16);
    }

    private  boolean isDateProper(String a_date){

        return true;

    }


}
