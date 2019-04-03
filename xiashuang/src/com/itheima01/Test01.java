package com.itheima01;


import java.util.Arrays;
import java.util.Scanner;

/*
定义一个String 类型的数组 ，长度为5。循环录入5个字符串，加入String数组中，
打印String数组。将String数组按照自然顺序排序，打印排序后的数组。

 */
public class Test01 {
    public static void main(String[] args) {
        String[] arr = new String[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入第" + (i + 1) + "个字符串");
            String str = sc.next();
            arr[i] = str;
        }
        System.out.print("原数组为：");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
        System.out.print("排序后为：");
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
