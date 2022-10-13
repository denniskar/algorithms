package com.company;

public class DataTest {
    public static void main(String[] args) {
            int num=7;

        System.out.println(Math.min((findIfprime(num) - num), (num - findPre(num))));

    }
    static int findIfprime(int num){
        num ++;
        for(int i=2;i<num;i++){
            if (num % i == 0) {
                num++;
                i=2;
            }

        }
        return num;
    }

    static int findPre(int num){
        num --;
        for(int i=2;i<num;i++){
            if (num % i == 0) {
                num--;
                i=2;
            }

        }
        return num;
    }
}
