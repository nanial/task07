package by.training.arraytwodimension.task36.controller;

//Операция сглаживания матрицы дает новую матрицу того же размера,
// каждый элемент которой получается как среднее арифметическое
// соседей соответствующего элемента исходной матрицы.
// Построить результат сглаживания заданной матрицы

import by.training.arraytwodimension.task26.service.PrintMatrix;
import by.training.arraytwodimension.task26.service.Reader;
import by.training.arraytwodimension.task36.service.SmoothMatrix;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {

        PrintMatrix pm = new PrintMatrix();
        int [][] matrix = new Reader().fillMatrix(new int[5][6]);
        pm.printMatrix(matrix);
        System.out.println();
        double [][] resMatrix = new SmoothMatrix().smooth(matrix);

         for (double [] i : resMatrix){
             System.out.println(Arrays.toString(i));
         }

         

    }
}
