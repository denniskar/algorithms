package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTriplets {

    public  static void main(String[]args){
        Integer[]an={7,4,0};
        Integer[]bb ={9,1,9};

        List<Integer> a=Arrays.asList(an);
        List<Integer> b=Arrays.asList(bb);
        List<Integer> results=new ArrayList<>();
        results.add(0);
        results.add(0);
        int count =1;
        int counted=1;
        for(int i=0;i<3;i++){
            if(a.get(i)>b.get(i)){
                results.set(0,count);
                count ++;
            }else if(a.get(i)<b.get(i)) {
                results.set(1,counted);
                counted ++;
            }


        }
        System.out.println(results);
    }
}
