package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = {4, 12, 4, 78, 7, -1};
        bubbleSortArray(arr);
    }

    public static int[] bubbleSortArray(int[] arr) {
        int notEqual = 0;
        int temp;
        while (true) {
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    notEqual++;
                }
            }
            if (notEqual == 0) {
                break;
            }
            notEqual = 0;
        }
       for (int item: arr) {
           System.out.println(item);
       }
        return arr;
    }
}
