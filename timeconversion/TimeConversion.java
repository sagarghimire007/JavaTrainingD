package com.java.timeconversion;

public class TimeConversion {
    final int sec = 60;
    public void convertMinuteIntoSecond(int a){
        System.out.println(a * 60 + "seconds");
    }

    public int incrementNumberBy1(int a){
        return ++a;
    }
    // checks whether two number are equals or not
    public boolean areTwoNumberEquals(int x, int y) {
        return (x == y ? true : false);
    }

    public String helloName(String name){
        return ("Hello " + name);
        }
    }