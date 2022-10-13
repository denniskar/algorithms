package com.company;

public class NextPrimeNmber {
    public static void main(String[] args) {
        int num =10200;

       if( checkIfprime(num)==1) {
           System.out.println(Math.min((nextPrimeNumber(num) - num), (num - previousPrimeNumber(num))));
       }else {
           System.out.println(0);
       }
    }

    private static int checkIfprime(int number) {
        int isPrime=0;
        for (int i=2;i<number;i++){
            if (number % i == 0) {
                isPrime = 1;
                break;
            }
        }
        return isPrime;

    }

    private static int previousPrimeNumber(int number) {
         number--;
        for (int i=2;i<number;i++){
            if(number%i==0){
                number --;
            }
        }
        return number;
    }

    private static int nextPrimeNumber(int number) {
        number++;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                number++;
            }

        }
        return number;
    }

}
