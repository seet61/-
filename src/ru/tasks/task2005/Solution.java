package ru.tasks.task2005;

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
        List nums = new ArrayList();

        st = new StringTokenizer(in.readLine());
        for (int i = 0; i < count; i++) {
            nums.add(Integer.parseInt(st.nextToken()));
        }
        System.out.println(nums.indexOf(Collections.min(nums)) + 1);
    }
}
