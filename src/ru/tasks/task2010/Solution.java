package ru.tasks.task2010;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        System.out.print("Введите два числа: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int step = 0;
        Set dividers = new HashSet();
        while (a > 0 && b > 0) {
            System.out.println(a + " " + b);
            if (a > b) {
                a -=b;
                if (a > 0) {
                    dividers.add(a);
                }
            } else {
                b -=a;
                if (b > 0) {
                    dividers.add(b);
                }
            }
            step += 1;
        }
        System.out.println("Результат: " + step + " " + dividers.toString());
    }
}
