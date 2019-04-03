package com.itheima02;

import java.util.Scanner;

/*
5. 在main方法中

5.1  创建Car对象并赋值，并调用showCar()、runInRoad()方法，键盘录入并提示

      "请输入乘坐XXX的人数"，xxx为Car的品牌，并接收用户输出。

 调用takePassager(num)方法

5.2  创建Boat对象并赋值，调用runInRoad（）方法 ，键盘录入并提示

"请输入乘坐XXX的人数"，xxx为Boat的品牌，并接收用户输出。

 调用takePassager(num)方法
 */
public class Test02 {
    public static void main(String[] args) {
        Car car = new Car("宝马", "红色", 5);
        car.showCar();
        car.runInRoad();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入乘坐" + car.getBrand() + "的人数");
        int a = sc.nextInt();
        car.takePassager(a);

        Boat boat=new Boat("航海一号","白色");
        boat.runInRoad();
        System.out.println("请输入乘坐" + boat.getBrand() + "的人数");
        int b = sc.nextInt();
        boat.takePassager(b);

        System.out.println("测试一下");
    }
}
