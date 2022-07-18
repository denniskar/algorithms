package com.company;

public class SpecialCharacters {

    public static void  main (String[] args){
        String name= "12E'4631.jpg,?!mur-ang'a!......";
        String newName = name.replaceAll("[^\\w' ]", " ");
        System.out.println("dennis");
        System.out.println(newName);
    }
}
