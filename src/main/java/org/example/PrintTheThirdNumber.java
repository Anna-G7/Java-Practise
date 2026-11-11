package org.example;

public class PrintTheThirdNumber {
    public static void main(String[] args) {
        printTheThirdNumber(0);
    }
    static void printTheThirdNumber(int i) {
        while (i <= 10) {
            System.out.println(i);
            i += 3;
        }
    }

}
