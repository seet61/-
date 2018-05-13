package ru.tasks.task2009;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.print("Введите размерность массива чисел: ");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        System.out.println("Вводите числа массива: ");
        scanner.nextLine();
        List str = Arrays.asList(scanner.nextLine().split(" "));
        int sum = 0;

        for (int i = 1; i < count; ) {
            sum += Integer.parseInt(str.get(i - 1).toString());
            i = (int) Math.pow(2, i);
        }

        System.out.println("Результат: " + sum);
    }
}
