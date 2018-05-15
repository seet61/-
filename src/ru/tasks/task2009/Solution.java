package ru.tasks.task2009;

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
        int count = Integer.parseInt(st.nextToken());

        List str = new ArrayList();
        st = new StringTokenizer(in.readLine());
        for (int i = 1; i < count; i++) {
            str.add(Integer.parseInt(st.nextToken()));
        }

        int sum = 0;

        for (int i = 1; i < count; ) {
            sum += (int) str.get(i - 1);
            i = (int) Math.pow(2, i);
        }

        System.out.println("Результат: " + sum);
    }
}
