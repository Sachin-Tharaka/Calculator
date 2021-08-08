package com.sachin.calculator;

public class Calculator {
    int num1,num2;

    public Calculator(int a, int b){
        this.num1 = a;
        this.num2 = b;

    }

    public int Addition(){
        return num1 + num2;
    }

    public int Subtraction(){
        return num1 - num2;

    }

    public int Multiplication(){
        return num1 * num2;

    }

    public double Division(){
        return num1 / num2;

    }


}
