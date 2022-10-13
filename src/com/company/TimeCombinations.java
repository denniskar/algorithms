package com.company;

import java.util.*;

public class TimeCombinations {

    public static void main (String []arg){
        List<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        TimeCombinations  timeCombinations=new TimeCombinations();
        Set<String>b=new HashSet<>();
        for(int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                int v=list.get(i);
                int y=list.get(j);

                System.out.println(list);
                if(j<3) {
                    list.set(j, list.get(j + 1));
                    list.set(j+1,y);
                }

                list.set(j,v);
                System.out.println("S"+list);
             b.add(timeCombinations.getTimes(list.get(0), list.get(1), list.get(2), list.get(3) ));
//                list.removeAll(list);
//                list.add(1);
//                list.add(2);
//                list.add(3);
//                list.add(4);

            }

        }
        System.out.println(b);


    }

    private String getTimes(int a, int b, int c, int d) {
        List<String>list= new ArrayList<>();
        if(a<3){
            if(b<10){
                if(c<6){
                    if(d<10){
                       return ("" +a+b+":"+c+d);
                    }
                }
            }
        }
        return "";
    }


}
