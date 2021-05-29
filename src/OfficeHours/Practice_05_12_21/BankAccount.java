package OfficeHours.Practice_05_12_21;

public class BankAccount {

         String accountHolderName;
         public int pin;
         double balance;
         long accountNumber;

         public double getBalance(int inputPin ) {
             if (pin == inputPin) {
                 return balance;
             }
             return-1;
         }



    }




