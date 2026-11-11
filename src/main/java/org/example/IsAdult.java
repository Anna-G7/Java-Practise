package org.example;

public class IsAdult {
    public static void main(String[] args) {
        System.out.println(isAdult(17));
        System.out.println(isAdult(18));
        System.out.println(isAdult(19)) ;
    }
    static boolean isAdult( int age) {
        if (age >= 18) {
            return true;
        }else {
            return false;
        }
    }
}
