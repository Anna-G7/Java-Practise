package org.example;

public class TakeALoan {
    public static void main(String[] args) {
        takeALoan(20);
        takeALoan(27);
        takeALoan(67);
    }


        static void takeALoan(int age) {
            if (age < 20) {
                System.out.println("no- too yoang");
            } else if (age >= 20 && age <= 65) {
                System.out.println("Congrats!");
            }else {
                System.out.println("no-too old");
            }

    }
}
