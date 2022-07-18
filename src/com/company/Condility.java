package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Condility {

    public static void main (String[]arg){
        //lowest integer that is not present ;
           int count=1;
           int [] values={1,-3,2,4};
        List<Integer>input=new ArrayList<>();
           Arrays.stream(values).sorted().forEach(input::add);
        for (Integer datas:input
             ) {
                if(datas==count){
                    count ++;
                }

        }
            System.out.println(count);
    }

}
