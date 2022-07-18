package com.company;

public class Practises {

    public static void main (String[] args){
       new Practises().search();
    }
    public void search(){
        int [] array={1,12,13,30,60,61,75,83,90,101};
        int number =9;
        int first=0;
              int last =array.length-1;
             int ind= passData(first,last,number,array);
        System.out.println("the number is at position   "+  ind);

    }
    private int passData(int first, int last, int number, int[] array) {
               if(last>=first){
                      int mid=first +(last-first)/2;
                      if (number==array[mid]){
                          return mid ;
                      }
                       if (array[mid] >number){
                          return passData(first,mid-1,number,array);
                       }
                   return  passData(mid+1,last,number,array);
               }
        return -1;
    }

}
