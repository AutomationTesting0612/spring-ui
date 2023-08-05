package com.spring.orm1.springOrm1.recurssion;

public class Fact {

    public static int fact(int n) {

        if(n==1 || n==0) {
           return 1;
        }
        return n*fact(n-1);

    }

    public static void main(String[] args) {

        int n=5;

        System.out.println("the fact num of : " + n  + " is: " + fact(n));

    }
}
