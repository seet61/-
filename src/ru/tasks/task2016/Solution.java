package ru.tasks.task2016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if (a >= -100 && a <= 100 && b >= -100 && b <= 100 && c >= -100 && c <= 100) {
            double D = Math.pow(b, 2) - 4 * a * c;
            if (D > 0d) {
                System.out.println(2);
            } else if (D == 0d) {
                System.out.println(1);
            } else {
                System.out.println(-1);
            }
        }
    }
}
