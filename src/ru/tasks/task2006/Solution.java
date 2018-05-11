package ru.tasks.task2006;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.print("Введите длину в см: ");

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int inch = length / 3;
        int subLength = length - inch * 3;
        int foot = 0;

        if (subLength == 2) {
            inch += 1;
        }

        if (inch > 12) {
            foot = inch / 12;
            inch -= (foot * 12);
        }

        System.out.println("foot: " + foot + " inch: " + inch);
    }
}
