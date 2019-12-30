package by.training.arraytwodimension.task26.controller;

//С клавиатуры вводится двумерный массив чисел размерностью nxm.
// Выполнить с массивом следующие действия:
//а) вычислить сумму отрицательных элементов в каждой строке;+
//б) определить максимальный элемент в каждой строке;+
//в) переставить местами максимальный и минимальный элементы матрицы.+
import by.training.arraytwodimension.task26.service.OperationMatrix;
import by.training.arraytwodimension.task26.service.PrintMatrix;
import by.training.arraytwodimension.task26.service.Reader;

public class Runner {

    public static void main(String[] args) {

        Reader reader = new Reader();
        PrintMatrix pm = new PrintMatrix();
        int [][] matrix = reader.fillMatrix(reader.readMatrix());
        OperationMatrix om = new OperationMatrix();
        System.out.println("Min element is " + om.minElement(matrix));
        System.out.println("Max element is " + om.maxElement(matrix));
        pm.printMatrix(matrix);
        System.out.println();
        pm.printMatrix(om.changeMaxMin(matrix));
        System.out.println();
        pm.printSumNegative(matrix);
    }
}
