package ru.tasks.task2011;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int age = Integer.parseInt(st.nextToken());

        if (age < 7) {
            System.out.println("preschool child");
        } else if (7 <= age && age <= 17) {
            System.out.println("schoolchild " + (age - 6));
        } else if (18 <= age && age <= 22) {
            System.out.println("student " + (age - 17));
        } else {
            System.out.println("specialist");
        }
    }
}
