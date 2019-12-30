package by.training.arraytwodimension.task26.service;

public class OperationMatrix {

    public int sumNegative(int [] rowMatrix){

        int sumEven = 0;
        for (int i : rowMatrix){
            if(i < 0){
                sumEven += i;
            }
        }
        return sumEven;
    }

    public int maxRowElement(int [] rowMatrix){

        int maxElement = 0;

        for (int i : rowMatrix){

            if(maxElement < i){
                maxElement = i;
            }
        }
        return maxElement;
    }
    public int minElement(int [][] matrix){

        int minElement = 0;

        for (int i = 0; i < matrix.length; i++){
            for(int j = 0; j <matrix[i].length; j++){

                if(minElement > matrix[i][j]){
                    minElement = matrix[i][j];
                }
            }
        }
        return minElement;
    }
    public int maxElement(int [][] matrix){

        int maxElement = 0;

        for (int i = 0; i < matrix.length; i++){
            for(int j = 0; j <matrix[i].length; j++){

                if(maxElement < matrix[i][j]){
                    maxElement = matrix[i][j];
                }
            }
        }
        return maxElement;
    }
    public int[][] changeMaxMin(int [][] matrix) {

        int max = this.maxElement(matrix);
        int min = this.minElement(matrix);

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] == max) {

                    matrix[i][j] = min;
                }
                else if (matrix[i][j] == min) {

                    matrix[i][j] = max;
                }
            }
        }
        return matrix;
    }
}
