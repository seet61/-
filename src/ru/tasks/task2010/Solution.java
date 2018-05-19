package ru.tasks.task2010;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int step = 0;
        Set<Integer> dividers = new HashSet<>();
        while (a > 0 && a < Math.pow(10, 7) + 1 && b > 0 && b < Math.pow(10, 7) + 1) {
            if (a <= b) {
                b -= a;
                if (b > 0) {
                    dividers.add(b);
                }
            } else {
                a -= b;
                if (a > 0) {
                    dividers.add(a);
                }
            }
            step += 1;
        }
        System.out.print(step);
        for (int div : dividers) {
            System.out.print(" " + div);
        }
    }
}
