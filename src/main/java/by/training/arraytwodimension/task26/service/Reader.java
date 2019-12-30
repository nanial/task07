package by.training.arraytwodimension.task26.service;

import java.util.Random;
import java.util.Scanner;

public class Reader {

    public int[][] readMatrix() {

        int column;
        int row;

        try (@SuppressWarnings("") Scanner scan = new Scanner(System.in)) {

            System.out.println("Insert dimension of column :");

            while (!scan.hasNextInt()) {
                System.out.println("Insert dimension of column :");
                scan.next();
            }
            column = scan.nextInt();

            System.out.println("Insert dimension of row :");

            while (!scan.hasNextInt()) {
                System.out.println("Insert dimension of row :");
                scan.next();
            }
            row = scan.nextInt();
        }
        int [][] matrix = new int[row][column];
        return matrix;
    }

    public int [][] fillMatrix(int [][] matrix){

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = new Random().nextInt(20) - 10;
            }
        }
        return matrix;
    }
}
