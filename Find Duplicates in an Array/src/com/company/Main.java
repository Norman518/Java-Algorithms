package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        singleNumber(new int[]{1,3,4,2,1,2,4});
    }

    public static ArrayList<Integer> singleNumber(int[] A) {
        Hashtable<Integer, Integer> h =
                new Hashtable<>();
        ArrayList<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            h.merge(A[i], 1, Integer::sum);
        }


        for (Integer key : h.keySet()) {
            if (h.get(key) > 1) {
                duplicates.add(key);
            }
        }
        Collections.sort(duplicates);
return duplicates;
    }
}