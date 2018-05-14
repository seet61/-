package ru.tasks.task2021;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        System.out.print("Введите размерность массива чисел: ");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        System.out.print("Вводите числа массива: ");
        scanner.nextLine();
        List list = Arrays.asList(scanner.nextLine().split(" "));
        for (int i = 0; i < 2; i++) {
            String str = Collections.max(list).toString();
            for (int j = 0; j < count; j++) {
                if (list.get(j).equals(str)) {
                    list.set(j, String.valueOf(Integer.parseInt(str) / 2));
                }
            }
        }
        System.out.println("Результат: " + list.toString());
    }
}
