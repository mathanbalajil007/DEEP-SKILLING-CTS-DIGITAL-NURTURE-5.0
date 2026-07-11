package com;

public class Calculator {
    public int add(int a,int b){
        if(a<0 || b<0) throw new IllegalArgumentException("Numbers are negative");
        return a+b;
    }
    public boolean isEven(int num){
        if(num%2==0) return true;
        return false;
    }
    public int sumOfNaturalNumbers(int n){
        return n*(n+1)/2;
    }

}
