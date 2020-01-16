package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        String string = "abcdcd";
        singleNumber(string);
    }

    public static Character singleNumber(String s) {
        HashMap<Character, Integer> h = new HashMap<>();
        int i, length;
        Character c;
        length = s.length();
        for (i = 0; i < length; i++) {
            c = s.charAt(i);
            if (h.containsKey(c)) {
                h.put(c, h.get(c) + 1);
            } else {
                h.put(c, 1);
            }
        }
        for (char key : h.keySet()) {
            if (h.get(key) == 1) {
                return key;
            }
        }
        return null;
    }
}
