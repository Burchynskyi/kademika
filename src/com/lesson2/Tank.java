package com.lesson2;

public class Tank
{
    private String color;
    private int crew;
    private  int maxSpeed;

    public void printTankInfo()
    {
        System.out.println("Current tank info");
        System.out.println("Color: " + color);
        System.out.println("Crew: " + crew);
        System.out.println("maxSpeed: " + maxSpeed + " km/h");}

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public int getCrew()
    {
        return crew;
    }

    public void setCrew(int crew)
    {
        this.crew = crew;
    }

    public int getMaxSpeed()
    {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed)
    {
        this.maxSpeed = maxSpeed;
    }
}
