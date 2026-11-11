package org.example;

public class Void1 {
    public static int div(int x, int y) {
        return x / y;
    }


    public static void main(String[] args) {
        int d = div(100, 20);
        System.out.println(d);

        int a = 100;
        int b = 2;
        int dd = div(a, b);
        System.out.println(dd);
    }
}
