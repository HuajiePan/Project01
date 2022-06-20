package com.atguigu.java;

import com.atguigu.bean.Customer;

import java.util.Arrays;

/**
 * @author shkstart
 * @create 2022-06-20 11:24
 */
public class TemplatesTest {


    // 模板六：prsf
    private static final Customer cust = new Customer();

    // 模板一：psvm
    public static void main(String[] args) {


        // 模板二：
        System.out.println("hello!");
        // 变形：
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TemplatesTest.main");
        System.out.println("args = " + args);
        int num1 = 10;
        System.out.println("num1 = " + num1);
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("sbc");

        // 模板三：fori
        String[] arr = new String[]{"a","b","c","d"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // 变形：iter
        for (String s : arr) {
            System.out.println(s);
        }
        // 变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        // 模板四：list.for

    }


}
