package com.company;

import java.util.Random;

public class Assigno {
    static Random rand = new Random();
    public static void main (String []arg){
        int k=20;
        for(int i=0;i<k;i++){
            System.out.println(rand.nextInt(1));
        }
    }
}
