package ru.tasks.task2003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int count = Integer.parseInt(st.nextToken());
        int sum = 0;
        st = new StringTokenizer(in.readLine());

        for (int i = 0; i < count; i++) {
            if (i == 0 || (i % 2 == 0)) {
                sum += Integer.parseInt(st.nextToken());
            } else {
                sum -= Integer.parseInt(st.nextToken());
            }

        }
        System.out.println(sum);
    }
}
