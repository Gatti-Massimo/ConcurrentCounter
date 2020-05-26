package com.company;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\nImplementation of 2 concurrent counters using threads\n");

        Counter count1 = new Counter(1000,"1) Counter: ");
        Counter count2 = new Counter(2000,"2) Counter: ");

        count1.start();
        count2.start();
    }
}
