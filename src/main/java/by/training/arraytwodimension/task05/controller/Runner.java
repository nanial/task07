package by.training.arraytwodimension.task05.controller;

//Дана матрица. Вывести на экран все четные строки, то есть с четными номерами.

import by.training.arraytwodimension.task05.service.PrintRow;

class Runner {
    public static void main(String[] args) {
        new PrintRow().printEvenRow(new int[][]{{1, 2, 6}, {5, 9, 6}, {19, 25, 14}});
    }
}
