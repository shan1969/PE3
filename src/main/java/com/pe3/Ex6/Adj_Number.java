package com.pe3.Ex6;

import java.util.Scanner;

public class Adj_Number {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //size of array;
        int array[] = new int[n];

        //Accepting value for elements of array
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }

        //Creation of Object for Adj_Number class
        Adj_Number an = new Adj_Number();
        boolean res = an.areConsecutives(array, n);
        if (res)
            System.out.println("Consecutive Numbers");
        else
            System.out.println("Non Consecutive Numbers");

    }

    // Function to check if elements are consecutive
    public  boolean areConsecutives(int array[], int n) {
        // Find minimum element in array
        // Find minimum element in array
        int first_term = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            if (array[j] < first_term)
                first_term = array[j];
        }

        // Calculate AP sum
        int ap_sum = (n * (2 * first_term + (n - 1) * 1)) / 2;


        // Calculate given array sum
        int arr_sum = 0;
        for (int i = 0; i < n; i++)
            arr_sum += array[i];

        // Compare both sums and return
        return ap_sum == arr_sum;
    }

}
