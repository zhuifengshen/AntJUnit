package com.test.junit;

/**
 * Created with IntelliJ IDEA.
 * User: Devin     Date: 2016/12/8 17:10
 * More wonderful content please pay attention to -> http://zhangchuzhao.site
 */

public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int subtact(int a, int b){
        return a - b;
    }
    public int multiply(int a, int b){
        return a * b;
    }
    public int divide(int a, int b){
        if (b == 0){
            throw new ArithmeticException("被除数不能为0");
        }
        return a / b;
    }
}
