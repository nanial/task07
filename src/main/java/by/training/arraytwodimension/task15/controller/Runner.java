package by.training.arraytwodimension.task15.controller;

import java.util.Arrays;
import java.util.Random;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
//n  0    0 ...0
//0 n-1 ..0 ...0
//0  0 n-2.....0
//0  0 ........0
//0  0...0  2  0
//0  0......0  1

public class Runner {

    public static void main(String[] args) {

        int n = new Random().nextInt(10);
        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (i == j) {

                    arr[i][j] = arr.length - j;
                }
            }
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
