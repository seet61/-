package ru.tasks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class lesson3 {
    Set set = new HashSet();
    List list = new ArrayList();

    public static void main(String[] args) {
        Set set = new HashSet();
        System.out.println(System.nanoTime());
        set.add("1");
        System.out.println(System.nanoTime());
    }
}
