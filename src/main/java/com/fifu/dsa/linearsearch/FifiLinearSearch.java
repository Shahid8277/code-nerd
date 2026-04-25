package com.fifu.dsa.linearsearch;

public class FifiLinearSearch {

    public static void main(String[] args) {
        int[] elements = {42, 68, 1, 45, 10, 8, 24};
        searchFifu(elements, 10);
    }

    public static searchFifu(int[] elements, int target) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == target){
                System.out.println("Element Found at Index : " + i);
            }
        }
        System.out.println("Element Not Found");
    }
}