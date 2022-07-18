package com.company;

import java.util.Arrays;

public class BubbleSort {


    void sortt(int array[]) {
        Bubble.hi(array);


    }

    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main (String[] args){
        BubbleSort bubbleSort=new BubbleSort();
        int array[] ={1,3,2,6,4,3,13,10};
        bubbleSort.sortt(array);
        System.out.println("Sorted array");
        bubbleSort.printArray(array);
    }

}
