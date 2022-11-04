package com.company;

public class Test {

    public static void main(String[] args) {
        int num=60;
        System.out.println(fib(num));
    }

    private static int  fib(int num) {
        if(num <=2){
            return 1;
        }
        return fib(num-1)+fib(num-2);
    }
}
