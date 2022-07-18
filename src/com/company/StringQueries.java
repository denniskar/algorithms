package com.company;

import com.sun.deploy.util.StringUtils;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringQueries {

    public static void  main( String [] arg){
        String text = "I will come and meet you at the woods 123woods and all the woods";
     //new StringQueries().record();
        Set<String> tokens = new HashSet<>();
        tokens.add("123woods");
        tokens.add("woods");
String datas="woods";
        String patternString = "\\b(" + StringUtils.join(Collections.singleton(datas), "|") + ")\\b";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);
        //System.out.println(matcher.find(Integer.parseInt(matcher.group(1))));
//        Set<String> finals = new HashSet<>();
//        while (matcher.find()) {
//            finals.add(matcher.group(1));
//            System.out.println(matcher.group(1));
//        }


        Random rand = new Random();
       List<String>list=Arrays.asList( "nakuru","NAIROBI","KISUMU","Muranga","West Pokot");

        StringBuilder s = new StringBuilder();
        s.append("\n");
        for (String value : list) {
            s.append(value.toUpperCase()).append("\n");
        }

        System.out.println("please reply with "+s.toString());

         String str= "this";
        String[] words = str.split("\\s+");
        System.out.println(words.length);
        System.out.println(list.get(rand.nextInt(list.size())));
        for (String names:list) {
            if(list.size()>=2){
                  if(names.equalsIgnoreCase("psv")){
                      System.out.println(4);
                  }
            }
        }

        String named="i ama the boss ladyyyyyyyyyyy09090";
        String namex="lady";
        if(named.toLowerCase().contains(namex.toLowerCase())){
            System.out.println("namex");

        }

        System.out.println(new StringQueries().testing());



        System.out.println(new StringQueries().test());
        }
    public boolean test() {
        String string = "I will come and meet you at the 123woods";
        String keyword = "123woods";

        Boolean found = Arrays.asList(string.split(" ")).contains(keyword);
        return found;
    }
public String record (){

    List <String> namez=Arrays.asList();
    namez.add("trt");

    if(namez.contains("q")){


    }
if(namez.isEmpty()){

    System.out.println("i am the hreo");
}
    for (String nam:namez
    ) {

        System.out.println("NEMR"+nam);
        return nam;
    }
       return "" ;
}


public String testing(){
        List <String>list=new ArrayList<>();
       list.add("dennis");
        list.add("daniel");
        list.add("kimz");


    for (String lic:list
         ) {
        System.out.println(lic);
        isaac(lic);
       // return lic;

    }
    System.out.println(list);
   String str="nairobi. here! ";
        return str.replaceAll("[^a-zA-Z0-9]", " ");
}

    private void isaac(String lic) {
        System.out.println("ytyt"+lic);
    }


}




