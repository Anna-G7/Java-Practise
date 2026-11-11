package NotReadyYet;

import java.util.Scanner;

public class Ii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("შეიყვანეთ სასურველი მნიშვნელობა. თუ შეიყვანთ 0 -ს, პროცესი დასრულდება");
        for (int number = scanner.nextInt(); number != 0; number = scanner.nextInt()) {
            System.out.println("თქვენ შეიყვანეთ " + number);
        }
        System.out.println("თქვენ შეიყვანეთ 0 და პროცესი დასრულდა");
        scanner.close();
    }}
