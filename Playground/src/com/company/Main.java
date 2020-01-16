package com.company;
import java.util.Scanner;
import java.util.Hashtable;
import java.util.Enumeration;

public class Main {
    public static void main(String[] args) {

    }


    public static int singleNumber(int[] A) {
        Hashtable<Integer, Integer> h =
                new Hashtable<Integer, Integer>();
        for(int i=0; i< A.length; i++){
            h.put(A[i], 1);
        }


        System.out.println(h);

        return 0;
    }

}