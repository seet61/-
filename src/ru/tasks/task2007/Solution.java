package ru.tasks.task2007;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.print("Введите число: ");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println(Integer.toBinaryString(number));

        String str = (Integer.toBinaryString(number));
        int degree = 0;
        for (int i = str.length()-1; i >= 0; i--) {
            if (str.charAt(i) == '0') {
                degree += 1;
            } else if (str.charAt(i) == '1') {
                break;
            }
        }
        System.out.println(degree);
    }
}
