package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {


    public static  void main (String[] args){

        streams();

    }

    private static void streams() {

        List numbers= Arrays.asList(2,5,4,43,4,5,7);
  numbers.stream().map(x->x.toString()).collect(Collectors.toList());
   numbers.forEach(System.out::println);
    }

}
