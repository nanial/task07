package by.training.arraytwodimension.task05.service;

import java.util.Arrays;

public class PrintRow {

    public void printEvenRow(int [][] arr){

        for (int i = 0; i < arr.length; i += 2) {

            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
