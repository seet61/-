package ru.tasks.task2015;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int a = Integer.parseInt(st.nextToken());

        int k = 0;
        List<Integer> list = new ArrayList<>();

        if ((a >= 1) && (a <= 10000)) {
            for (int i = 2; i < a; i++) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        k += 1;
                    }
                }
                if (k == 0) {
                    list.add(i);
                } else {
                    k = 0;
                }
            }
        }
        for (int val : list) {
            System.out.println(val);
        }
    }
}
