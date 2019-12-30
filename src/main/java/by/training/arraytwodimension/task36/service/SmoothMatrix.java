package by.training.arraytwodimension.task36.service;

public class SmoothMatrix {

    public double[][] smooth(int[][] matrix) {

        int tmp;
        double[][] resultMatrix = new double[5][6];

        for (int i = 0; i < matrix.length; i++) {

            int count = 0;
            int sum = 0;

            for (int j = 0; j < matrix[i].length; j++) {

                if ((i + 1) < matrix.length) {

                    sum += matrix[i + 1][j];
                    count++;
                }

                if ((j + 1) < matrix[i].length) {

                    sum += matrix[i][j + 1];
                    count++;
                }
                if ((i - 1) >= 0) {

                    sum += matrix[i - 1][j];
                    count++;

                }
                if ((j - 1) >= 0) {

                    sum += matrix[i][j - 1];
                    count++;
                }
                resultMatrix[i][j] = sum / count;
                count = 0;
                sum = 0;
            }
        }

        return resultMatrix;
    }

}

