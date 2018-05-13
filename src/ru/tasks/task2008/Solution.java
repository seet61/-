package ru.tasks.task2008;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.print("Введите количество предметов и грузоподъемность: ");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int weight = scanner.nextInt();
        int total = 0;
        int sum = 0;
        System.out.print("Вводите грузоподъемность грузов: ");
        for (int i = 0; i < count; i++) {
            int cur = scanner.nextInt();
            if (total + cur < weight) {
                total += cur;
                sum += 1;
            }
        }
        System.out.println("Результат: " + sum + " " + total);
    }
}
