package com.lesson1;

public class GreetingService
{
    public static void main(String[] args)
    {
        if (args.length == 1)
        {
            System.out.println("Hello " + args[0]);
        }
        else
        {
            System.out.println("Please enter one argument.");
        }
    }
}