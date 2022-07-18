package com.company;

import java.util.Arrays;

public class BubblePractice {

    public static void main (String[] args){

        int [] number={10,45,9,8,7,6,90,5,4,3,87,6,52,1};
        Sort(number);
        System.out.println(Arrays.toString(number));
    }

    private static void Sort(int[] number) {
        Bubble.hi(number);

    }


}
