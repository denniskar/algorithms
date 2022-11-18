package com.company;

import java.util.ArrayList;
import java.util.List;

public class DataSearchi {

    public static  void  main (String[]args){
//        String names ="denod # id pg rmmrmmr___88888 #";
//       String value=names.substring(0,names.lastIndexOf("_")).replace("_","");
//        System.out.println(value);



        String  num = "151";
        StringBuilder ch = new StringBuilder();
        for (int i = num.length()-1; i >= 0; i--) {
            ch.append(num.charAt(i)) ;

        }
        if (num.equalsIgnoreCase(ch.toString()) ) {
            System.out.println("it is palindrom");
        } else {
            System.out.println("it is not polindrom");
        }

}}
