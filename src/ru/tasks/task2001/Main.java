package ru.tasks.task2001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите размерность массива чисел: ");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int sum = 0;
        System.out.print("Вводите числа массива: ");
        for (int i = 0; i < count; i++) {
            sum += scanner.nextInt();
        }
        System.out.println("Результат: " + sum);
    }
}
