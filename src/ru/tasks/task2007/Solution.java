package ru.tasks.task2007;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int number = Integer.parseInt(st.nextToken());

        String str = (Integer.toBinaryString(number));
        int degree = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == '0') {
                degree += 1;
            } else if (str.charAt(i) == '1') {
                break;
            }
        }
        System.out.println(degree);
    }
}
