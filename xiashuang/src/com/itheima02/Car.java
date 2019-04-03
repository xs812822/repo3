package com.itheima02;

/*
3. 定义汽车类（Car），继承Vehicles类，实现Run接口，包含满参、空参构造和以下成员变量

座位 seats （int 类型）
定义成员方法showCar（），在方法内输出"我是小汽车，我有xxx座位"，xxx为seats 的值，调用showInfo()方法。
重写runInRoad()方法，输出“我跑在马路上”
重写takePassager(int num)方法，在方法内做比较，
如果num大于seats座位数，就输出"人太多了，装不下，只能装：XXX人"，
如果num 小于等于seats座位数，就输出"车子有XXX座位，可以装下！"，xxx为seats数量
 */
public class Car extends Vehicles implements Run {
    private int seats;

    public Car() {
    }

    public Car(String brand, String color, int seats) {

        super(brand, color);
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void runInRoad() {
        System.out.println("我跑在马路上");
    }

    @Override
    public void takePassager(int num) {
        if (num > seats) {
            System.out.println("人太多了，装不下，只能装：" + seats + "人");
        } else if (num < seats) {
            System.out.println("车子有" + seats + "座位，可以装下！");
        }
    }

    public void showCar() {
        System.out.println("我是小汽车，我有" + seats + "座位");
        super.showInfo();
    }
}
