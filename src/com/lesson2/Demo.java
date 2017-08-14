package com.lesson2;

public class Demo
{
    public static void main(String[] args)
    {
        Tank tank = new Tank();
        tank.setColor("Green");
        tank.setCrew(2);
        tank.setMaxSpeed(30);

        tank.printTankInfo();
    }
}
