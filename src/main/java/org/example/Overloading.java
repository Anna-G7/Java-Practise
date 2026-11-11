package org.example;

public class Overloading {
    public static void main(String[] args) {
        System.out.println(sum(5, 2));
        System.out.println(sum(5, 1, 4));
    }
    static double sum(int x, int y) {
        return (x / y);
    }
    static int sum(int x, int y, int z) {
        return (x + y + z);
    }
}
