package org.example;


public class SkipTheFifthSymbol {
    public static void main(String[] args) {
        skipTheFifthSymbol("DzaliAn rtulia");
        }
    static void skipTheFifthSymbol(String x) {
        for (int i = 0; i < x.length(); i++){
            if (i==5)
                continue;
            System.out.println(x.charAt(i));
        }
    }
}
