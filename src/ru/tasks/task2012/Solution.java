package ru.tasks.task2012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int a1 = Integer.parseInt(st.nextToken());
        int b1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(in.readLine());
        int a2 = Integer.parseInt(st.nextToken());
        int b2 = Integer.parseInt(st.nextToken());

        if ((a1 >= 1) && (a1 <= 1001) && (b1 >= 1) && (b1 <= 1001) && (a2 >= 1) && (a2 <= 1001) && (b2 >= 1) && (b2 <= 1001)) {
            if ((((a1 + a2) == b1) && (b1 == b2)) ||
                    (((a1 + b2) == b1) && (b1 == a2)) ||
                    (((b1 + a2) == a1) && (a1 == b2)) ||
                    (((b1 + b2) == a1) && (a1 == a2))) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }
}
