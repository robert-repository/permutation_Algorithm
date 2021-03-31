package com.company;

public class Permute {
    public static void permute(int[] intArray, int start) {
        for(int i = start; i < intArray.length; i++){
            int temp = intArray[start];
            intArray[start] = intArray[i];
            intArray[i] = temp;
            permute(intArray, start + 1);
            intArray[i] = intArray[start];
            intArray[start] = temp;
        }
        if (start == intArray.length - 1) {
            System.out.println(java.util.Arrays.toString(intArray));
        }
    }

    public static void main(String[] args){
        int[] intArr = {1, 2, 3,5};
        permute(intArr, 0);
    }
}
