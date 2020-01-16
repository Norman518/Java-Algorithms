package com.company;

import java.util.Hashtable;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        singleNumber(new int[]{1, 2, 3, 4, 1, 2, 4, 3, 5});
    }

    public static int singleNumber(int[] numbers) {
        Hashtable<Integer, Integer> h = new Hashtable<>();
        for (int number : numbers) {
            h.merge(number, 1, Integer::sum);
        }

        Set<Integer> hset = h.keySet();
        for (Integer key : hset) {
            if (h.get(key) == 1) {
                System.out.println((key));
                return key;
            }
        }

        return 0;
    }
}