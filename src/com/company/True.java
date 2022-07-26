package com.company;

import java.util.*;

public class True {
    public  static void main(String[]args){
         Integer []nums={3,4,5,1,3,4, 7,7,4,2,7,17};
        Map<Integer,Integer>data=new HashMap<>();

        int count = 1;
        for (Integer nn:nums) {


           if (!data.containsKey(nn)) {
               data.put(nn, count);
           } else {
               int newCount = data.get(nn) + 1;
               data.put(nn, newCount);
           }

        }
        System.out.println(data);
        ArrayList<Integer> store = new ArrayList<>(data.keySet());
        System.out.println(data.get(store.get(store.size()-1)));
    }
}
