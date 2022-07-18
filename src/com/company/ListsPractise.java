package com.company;

import java.util.*;

public class ListsPractise {

    public static void main (String[] args){

        String [] aryy={"dennis","peter","data","remove"};

        List<String> names= Arrays.asList(aryy);
        System.out.println("data testing"+names);

        //arraylist
        //sets
        //maps
        //tree
        //vector
        List<String>nnn=new ArrayList<>();
     ////   Collections.addAll(nnn,"EE","EEE");
        nnn.set(0,"isaac");
   //   nnn.add("yy");
      //  nnn.add("yi");
        System.out.println(nnn);
        Collections.reverse(names);
        System.out.println(names);
    List<String>data=new ArrayList<>();
        for(int i= aryy.length;i>0;i--){
              data.add(aryy[i-1]);
        }
        System.out.println("data values ="+data
        );
String you="here is the data required ";
List<Character>nn=new ArrayList<>();
  char[]hi=you.toCharArray();
        for (Character d:hi
             ) {
            nn.add(d);
        }
Collections.reverse(nn);
        ListIterator<Character> ne=nn.listIterator();
        while (ne.hasNext()){
            System.out.println(ne.next());
        }
    }




}
