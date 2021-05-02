package com.company;

import java.util.Arrays;

public class Main {
    static int[] arrFor6 = {1, 1, 3, 3, 1, 1};
    static int[] arrFor7 = {0, 1, 2, 3, 4};
    public static void main(String[] args) {
        arrayForEx1();
        arrayForEx2();
        arrayForEx3();
        arrayForEx4();
        arrayForEx5();

        System.out.println(arrayForEx6(arrFor6));
        arrayForEx7(arrFor7, -2);
    }

    private static void arrayForEx1() {
        int[] arr = {0, 1, 1, 0, 1, 0, 1, 1};
        System.out.println("Задание 1.\nНачальный массив: " + Arrays.toString( arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }

        }
        System.out.println("Конечный массив:  " + Arrays.toString(arr) + "\n");
    }

    private static void arrayForEx2() {
        // 0 3 6 9 12 15 18 21
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }
        System.out.println("Задание 2: " + Arrays.toString(arr) + "\n");
    }

    private static void arrayForEx3() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Задание 3.\nНачальный массив: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
           if(arr[i] < 6){
               arr[i] = arr[i] * 2;
           }
        }
        System.out.println("Конечный массив: " + Arrays.toString(arr) + "\n");
    }

    private static void arrayForEx4() {
        System.out.println("Задание 4:");
        int[][] arr = new  int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = 0;
                if (i == j || i == (arr.length - j - 1)){
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static void arrayForEx5() {
        int[] arr = {1, 5, 3, 2, 11, 4, 0, 2, 4, 8, 9, 1};
        System.out.println("\nЗадание 5:\nМассив: " + Arrays.toString(arr));
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Максимальное значение в массиве: " + max + "\nМинимальное значение в массиве: " + min);
    }

    private static boolean arrayForEx6(int[] arr){
        System.out.println("\nЗадание 6.\nЕсть ли в массиве место, в котором сумма левой и правой части массива равны? \nМассив: " + Arrays.toString(arr));
        int summStart = 0;
        int summAll = 0;
        boolean c = false;
        for (int i = 0; i < arr.length; i++) {
            summAll = summAll + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            summStart = summStart + arr[i];
            int summEnd = summAll - summStart;
            if (summEnd == summStart) {
                c = true;
            }
        }
            return c;
    }


    private static void arrayForEx7(int[] arr, int n) {
        System.out.println("\nЗадание 7.\nПервоначальный массив:         " + Arrays.toString(arr));
        int shiftNomber = 0;
        if(n > 0) {
            while (shiftNomber < n) {
                int temp = arr[0];
                for (int i = 0; i < arr.length; i++) {
                    if (i < arr.length - 1) {
                        arr[i] = arr[i + 1];

                    }
                    if (i == arr.length - 1) {
                        arr[arr.length - 1] = temp;

                    }
                }
                shiftNomber++;
            }

        }
        if(n < 0) {

            while (shiftNomber > n) {
                int temp = arr[arr.length - 1];
                for (int i = arr.length - 1; i >= 0; i--) {
                    if (i > 0) {
                        arr[i] = arr[i - 1];

                    }
                    if (i == 0) {
                        arr[0] = temp;
                    }
                }
                shiftNomber--;
            }
        }
        System.out.println("Конечный массив со сдвигом " + n + ": " + Arrays.toString(arr));

    }

}
