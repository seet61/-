package ru.tasks.task2008;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) {
        try{
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(in.readLine());
            int count = Integer.parseInt(st.nextToken());
            if (count < 1 || count > 10001) {
                throw new Exception("bad count");
            }
            int weight = Integer.parseInt(st.nextToken());
            if (weight < 1|| weight > 10001) {
                throw new Exception("bad weight");
            }
            int total = 0;
            int sum = 0;
            st = new StringTokenizer(in.readLine());
            for (int i = 0; i < count; i++) {
                int cur = Integer.parseInt(st.nextToken());
                if (cur < 1 || cur > 10000) {
                    throw new Exception("bad cur");
                }
                if ((total + cur) < weight) {
                    total += cur;
                    sum += 1;
                }
            }
            System.out.print(sum + " " + total);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
