package org.example;

public class CheckScore {
    public static void main(String[] args) {
        checkScore(95);
        checkScore(75);
        checkScore(40);
        checkScore(150);
        checkScore(-5);
        checkScore(0);

    }

    static void checkScore(int score) {
        if (score < 0 || score > 100){
            System.out.println("Invalid score");
        }else if (score >= 90) {
            System.out.println("Excellent");
        }else if (score >= 60) {
            System.out.println("Good");
        }else {
            System.out.println("Try again");
        }




//        if (score >= 90 && score <= 100) {
//            System.out.println("Exellent!");
//        }else if (score >= 60 && score <= 89){
//            System.out.println("Good!");
//        } else if (score < 60 && score >= 0) {
//            System.out.println("Try again.");
//        }else {
//            System.out.println("Invalid score.");
//        }
    }
}
