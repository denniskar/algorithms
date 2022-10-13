package com.company;

import java.util.HashMap;
import java.util.Map;

public class DynamicProgramming {
    public static void main(String[] args) throws InterruptedException {
      //  memoization : caching
       // System.out.println( foo(3));
        Map<Integer,Integer> values=new HashMap<>();
        //System.out.println(nthTermFibonacci(9,values));
        DynamicProgramming dynamicProgramming=new DynamicProgramming();
        dynamicProgramming.method2();
        dynamicProgramming.method2();
    }

    private void method2() {
        int r=0;
        System.out.println("method2");
        r ++;
        System.out.println(r);
    }

    private static void methoq1() throws InterruptedException {
        Thread.sleep(10000L);
        System.out.println("method 1");
    }

    static int foo(int n){
        if(n<=1){
            return 1 ;
        }
        return  foo(n-1)   ;
    }
    static  Integer nthTermFibonacci(int n, Map<Integer, Integer> values){
        if(values.containsKey(n)){
            return values.get(n);
        }
        return values.put(n,nthTermFibonacci(n-1, values)+nthTermFibonacci(n-2, values));
    }


}
