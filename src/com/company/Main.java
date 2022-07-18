package com.company;

public class Main {

    public static void main(String[] args) {
	int disks=5;
    towerofhonoi(disks,"A","B","C");
    results();
    }

    public static void towerofhonoi(int disks, String left, String middle ,String right ){

        if (disks == 1) {
            System.out.println("move  1 " + "from " + left + " to " + right);
        } else {
            towerofhonoi(disks-1,left,right,middle);
            System.out.println("move "+ disks + " from "+ left +" to "+ right);
                 towerofhonoi(disks-1,middle,left,right);

        }
    }

    public int binarySearch(int[]arry,int first,int last){
        int x=54;
        if(last>=first) {
           int middle = first + (last-first) / 2;
           // int middle=(last-first)/2;
            if (x == arry[middle]) {
                return middle;
            }
            if (arry[middle]>x) {
                return binarySearch(arry, first, middle-1);
            } else {
                return binarySearch(arry, middle + 1,last);
            }
        }

        return -1;
    }

    public static void results(){
        int[]n={1,3,5,6,7,8,34,45,54,55};
        int first =0;
        int last =n.length;
       int ans= new Main().binarySearch(n,first,last-1);
        System.out.println(ans);

        Sudoku sudoku=new Sudoku();

    }
}