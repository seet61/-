package ru.tasks.task2013;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int count = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();
        int sum = 0;

        st = new StringTokenizer(in.readLine());
        for (int i = 0; i < count; i++) {
            int val = Integer.parseInt(st.nextToken());
            if (val >= 1 && val <= 10000) {
                list.add(val);
            }
        }

        int min = Collections.min(list);
        for (int val: list) {
            if (val == min) {
                sum += 1;
            }
        }

        System.out.println(sum);
    }
}
