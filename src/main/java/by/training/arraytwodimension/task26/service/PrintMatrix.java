package by.training.arraytwodimension.task26.service;

import java.util.Arrays;

public class PrintMatrix {

    public void printMatrix(int[][] matrix){

        for (int [] i : matrix){
            System.out.println(Arrays.toString(i));
        }
    }
    public void printSumNegative(int[][] matrix){

        for (int [] i : matrix){
            System.out.println(Arrays.toString(i) + " sum of negative elements is " +
                    new OperationMatrix().sumNegative(i));
        }
    }
}
