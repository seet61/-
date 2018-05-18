package ru.tasks.task2021;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int count = Integer.parseInt(st.nextToken());
        if (count < 1 || count > 100) {
            throw new Exception("bad count");
        }
        List list = Arrays.asList(in.readLine().split(" "));
        for (int i = 0; i < 2; i++) {
            String str = Collections.max(list).toString();
            for (int j = 0; j < count; j++) {
                if (list.get(j).equals(str)) {
                    list.set(j, String.valueOf(Integer.parseInt(str) / 2));
                }
            }
        }
        System.out.println(list.toString());
    }
}
