package com.company;

public class RecursionPractice {

    public static void main(String[] args) {
        RecursionPractice recursionPractice=new RecursionPractice();
        System.out.println( recursionPractice.sum(7));
    }
    public int  sum(int i){
        if(i<=2){
            return 1;
        }

        return (sum(i-1)+sum(i-2));
    }
}

