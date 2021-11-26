package com.java.breakstatement;

public class BreakStatement {
    public void breakCase(){
        for(int i = 0 ; i < 10; i++){
            if(i == 3){
                break;
            }
            System.out.println(i);
        }
    }
    public void typeCasting(){
        double a = 9.456;
        int d = (int)a;
        System.out.println(d);
    }
}
