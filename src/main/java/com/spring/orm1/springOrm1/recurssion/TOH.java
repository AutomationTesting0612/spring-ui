package com.spring.orm1.springOrm1.recurssion;

public class TOH {

    public static void toh(int n, char from_rod, char to_rod, char using_rod) {

        if(n>0) {
            toh(n-1,from_rod,using_rod,to_rod);
            System.out.println("Moving disc " + n + " from rod : " + from_rod + " to rod : " + to_rod);
            toh(n-1,using_rod,to_rod,from_rod);
        }


    }

    public static void main(String[] args) {
        int n=3;
        toh(n,'A','C', 'B');

    }
}
