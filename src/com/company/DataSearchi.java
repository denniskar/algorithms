package com.company;

public class DataSearchi {

    public static  void  main (String[]args){
        String names ="denod # id pg rmmrmmr___88888 #";
       String value=names.substring(0,names.lastIndexOf("_")).replace("_","");
        System.out.println(value);
    }
}
