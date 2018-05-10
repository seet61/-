package ru.tasks.task2002;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите размерность массива чисел: ");

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        String[] sl = scanner.nextLine().split(" ");
        int sum = 0;

        while (!(sl.length >= count)) {
            System.out.println("Вводите числа массива: ");
            sl = scanner.nextLine().split(" ");
        }

        for (int i = 0; i < sl.length; i++) {
            sum += Integer.parseInt(sl[i].toString());
        }
        System.out.println("Результат: " + sum);

    }
}
