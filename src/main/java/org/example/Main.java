package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        TestData testData = new TestData();

        CreditCardTester creditCardTester = new CreditCardTester();

        List  correctCreditCards =new ArrayList() ;
        List wrongCreditCards =  new ArrayList();


        for (int i = 0; i < testData.CorrectCardNumbers.length; i++) {

            for (int k=0; k<testData.CorrectSecurityNumbers.length;k++){

                for (int j =0 ;j<testData.CorrectDates.length; j++){

                    for (int s =0;s<testData.CorrectUserNames.length; s++){

                        correctCreditCards.add(new CreditCard(testData.CorrectCardNumbers[i],testData.CorrectUserNames[s],testData.CorrectSecurityNumbers[k],testData.CorrectDates[j]));
                    }

                }

            }

        }
        for (int i = 0; i < testData.WrongCardNumbers.length; i++) {

            for (int k=0; k<testData.WrongSecurityNumbers.length;k++){

                for (int j =0 ;j<testData.WrongDates.length; j++){

                    for (int s =0;s<testData.WrongUserNames.length; s++){

                        wrongCreditCards.add(new CreditCard(testData.WrongCardNumbers[i],testData.WrongUserNames[s],testData.WrongSecurityNumbers[k],testData.WrongDates[j]));
                    }
                }

            }

        }

        CreditCard creditCard1 = new CreditCard(2222222222222222l, "bffd", 254, "1.2.2023");

        for(int i=0;i<wrongCreditCards.size();i++){

           boolean isOkey = creditCardTester.TestResult((CreditCard) wrongCreditCards.get(i));
           if(!isOkey) {
               System.out.println("Test worked correctly.");
           }
           else {
               System.out.println("Test worked wrong.");
           }

           }

        for(int i=0;i<correctCreditCards.size();i++){

            boolean isOkey = creditCardTester.TestResult((CreditCard) correctCreditCards.get(i));
            if(isOkey) {
                System.out.println("Test worked correctly.");
            }
            else {
                System.out.println("Test worked wrong.");
            }

        }
        }}



