package com.java.ParameterConstructor;

import com.java.ConstructorNovember29.Constructor;

public class ParameterConstructor {
    // instance variable
    public int id;
    public String name ;

    //constructor
    ParameterConstructor(int id, String name){
        this.id = id;
        this.name = name;
        System.out.println("Id is "+id +" and Name is "+name);
    }

    public static void main(String[] args) {
        ParameterConstructor p = new ParameterConstructor(1, "sagar");
    }
}
