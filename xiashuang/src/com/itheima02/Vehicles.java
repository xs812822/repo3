package com.itheima02;
/*
5. 在main方法中

5.1  创建Car对象并赋值，并调用showCar()、runInRoad()方法，键盘录入并提示

      "请输入乘坐XXX的人数"，xxx为Car的品牌，并接收用户输出。

 调用takePassager(num)方法

5.2  创建Boat对象并赋值，调用runInRoad（）方法 ，键盘录入并提示

"请输入乘坐XXX的人数"，xxx为Boat的品牌，并接收用户输出。

 调用takePassager(num)方法
 */
public class Vehicles {
    /*
    1. 定义交通工具类（Vehicles），包含满参、空参构造和以下成员变量

    品牌 brand （String类型）

    颜色 color （String类型）

成员方法showInfo()，在方法内输出"我的牌子为：xxx，颜色为：YYY"

”xxx为brand值，YYY为color值。
     */

    private String brand;
    private String color;
    public void showInfo(){
        System.out.println("我的牌子为：" + brand + "，颜色为：" + color);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Vehicles(String brand, String color) {

        this.brand = brand;
        this.color = color;
    }

    public Vehicles() {

    }
}
