package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] array = {3.8, -6.7, -72.8, -0.9, 5.5, -2.3, 8.0, 1.1, 2.6, -9.5, -7.9, 4.2};

        double sum = 0;
        int count = 0;
        boolean testTo = false;

        for (double i : array) {
            if (i < 0) {
                testTo = true;
            } else if (testTo && i > 1) {
                count++;
                sum = sum + i;
                System.out.println(i);
            }
        }
        System.out.println("Среднее арифметичское; " + sum / count);


        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    double sort = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = sort;
                }
                System.out.println(Arrays.toString(array));
            }
        }
    }
}