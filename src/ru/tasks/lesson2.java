package ru.tasks;

public class lesson2 {

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Double.POSITIVE_INFINITY);
        System.out.println(Double.NEGATIVE_INFINITY);

        System.out.println((short) Integer.MAX_VALUE);
        System.out.println((short) Integer.MIN_VALUE);

        System.out.println(Float.POSITIVE_INFINITY);
        System.out.println(Float.NEGATIVE_INFINITY);

        System.out.println((long) Float.POSITIVE_INFINITY);

        Integer i = 1;
        Float f = 2f;
        int j = (int) (i + f);
        float k = i + f;
        System.out.println(j);
        System.out.println(k);

        System.out.println((new MyClass()).str);
        System.out.println((new MyClass()).c);


        getStr("111");
        getStr("222", "333");
    }

    public static void getStr(String str) {
        System.out.println(str);
    }

    public static void getStr(String str1, String str2) {
        System.out.println(str1 + str2);
    }

    /*
    public String getStr(String str1, String str2) {
        return str1 + str2;
    }
    */
}
