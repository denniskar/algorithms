package com.company;

import java.util.HashSet;
import java.util.Set;

public class SumSum {
    public  static  void  main (String[]args){
        int [] nums={2,9,23,1,56,4,15,30};
        Set<Integer>stored=new HashSet<>();
        int sum =45;
        for (Integer nn:nums
             ) {
            int temp =sum-nn;
            if(stored.contains(temp)){
                System.out.println(""+nn+" "+temp);
            }
            stored.add(nn);
        }
    }
}
