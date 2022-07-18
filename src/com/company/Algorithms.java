package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

public class Algorithms {


    public static void main(String[] args){
        String [] words =new String[23];
        List<String>word=new ArrayList<>();
         word.add("5555");
        System.out.println(word.get(0));
        System.out.println(words.length);

        Optional<String>check=Optional.ofNullable(words[5]);
        if(check.isPresent()){

        }
        System.out.println("no word available");
    }


}
