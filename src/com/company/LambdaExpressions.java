package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LambdaExpressions {
    static public void main(String[] args){
      LambdaInterface tt=()->8*6;
        int x= tt.data();
        System.out.println(x);
      value(tt,3);


      LambdaExpressions2 lambdaExpressions2=()->{
          Books books=new Books();
          books.setAuthor("Dennis");
          return books;
      };

        System.out.println(lambdaExpressions2.manuplate());
        List<String> names = new ArrayList<String>();
        names.add("Jai");
        names.add("Mahesh");
        names.add("Ajay");
        names.add("Hemant");
        names.add("Vishal");
       names.stream().filter((y)->y.startsWith("J")).forEach(System.out::println);

       int []age={1,5,6,8,13,2,7};
       String [] namess={"dennis","peter"};
        List<String>gg=Arrays.asList(namess);

       Arrays.stream(age).filter((s)->s%2==0).forEach(System.out::println);
       long  value= Arrays.stream(age).count();
        System.out.println("conunt"+value);
        IntStream.range(1,20).forEach(System.out::println);
    }
    public static void  value(LambdaInterface op ,int r){
            op.data();
    }
}
