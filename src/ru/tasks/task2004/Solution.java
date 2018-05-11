package ru.tasks.task2004;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.print("Введите номер года: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        while (!(year >= 1000) || !(year <= 2100)) {
            System.out.print("Введите номер года: ");
            year = scanner.nextInt();
        }

        if (year % 4 == 0) {
            if ((year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        } else {
            System.out.println(0);
        }
    }
}
