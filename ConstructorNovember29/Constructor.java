package com.java.ConstructorNovember29;

public class Constructor {
    Constructor()
    {
        System.out.println("This is non parameterized constructor");
    }
    public class ParameterizedConstructor{
        public int id;
        public String name;
        ParameterizedConstructor(int id, String name){

        }
    }

    public static void main(String[] args) {
        Constructor c = new Constructor();
    }
}
