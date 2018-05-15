package ru.tasks.task2006;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int length = Integer.parseInt(st.nextToken());
        int inch = length / 3;
        int subLength = length - inch * 3;
        int foot = 0;

        if (subLength == 2) {
            inch += 1;
        }

        if (inch > 12) {
            foot = inch / 12;
            inch -= (foot * 12);
        }

        System.out.println(foot + " " + inch);
    }
}
