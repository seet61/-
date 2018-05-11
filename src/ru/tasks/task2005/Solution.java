package ru.tasks.task2005;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.print("Введите размерность массива чисел: ");

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        List nums = new ArrayList();

        for (int i = 0; i < count; i++) {
            nums.add(scanner.nextInt());
        }
        System.out.println("Результат: " + (nums.indexOf(Collections.min(nums)) + 1));

    }
}
