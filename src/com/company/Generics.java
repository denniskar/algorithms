package com.company;

public class Generics <T>{

    public void genericTest( T data){
        System.out.println(data);
    }

    public static  void main (String[] args){
        new Generics<>().genericTest("kkkkk");
        Students students= new Students();


    }
}



