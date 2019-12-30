package by.training.arraytwodimension.task36.service;

public class SmoothMatrix {

    public int[][] smooth (int [][] matrix){

        int tmp;
        int[][] resultMatrix = matrix;

        for(int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                tmp = 0;

                if (i > 0) {
                    tmp += matrix[i - 1][j];
                    if (j > 0) {
                        tmp += matrix[i - 1][j - 1];
                    }
                    if (j < (matrix.length - 1))
                        tmp += matrix[i - 1][j + 1];
                }

                if (i < matrix.length - 1) {
                    tmp += matrix[i + 1][j];
                    if (j > 0) {
                        tmp += matrix[i + 1][j - 1];
                    }
                    if (j < matrix[i].length - 1) {
                        tmp += matrix[i + 1][j + 1];
                    }
                }

                if (j > 0) {
                    tmp += matrix[i][j - 1];
                }
                if (j < matrix[i].length - 1) {
                    tmp += matrix[i][j + 1];
                }

                resultMatrix[i][j] = tmp;
            }

        }
        return resultMatrix;
    }
}
