import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkFive {
    public static void main(String[] args) {
        getSumNumb();
        getChessBoard();
        getSum();
        getDiagonal();
        getMultiplicationMatrix();
    }
    public static void getSumNumb (){
        /* Task 1
        Создать двухмерный массив из целых чисел.
        С помощью циклов "пройти" по всему массиву и увеличить каждый
        элемент на заданное число. Пусть число, на которое будет
        увеличиваться каждый элемент, задается из консоли
         */
        int [][] array1 = {
                {1, 2, 5, 2},
                {4, -4, 4, 8},
                {3, 4, -1, 2}
        };
        System.out.println(Arrays.deepToString(array1));
        System.out.println("введите число на которое хотите увеличить массив: ");
        Scanner scanner = new Scanner(System.in);
        int numb = scanner.nextInt();
        scanner.close();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++){
                array1[i][j] += numb;
            }
        }
        System.out.println(Arrays.deepToString(array1));
    }
    public static void getChessBoard(){
        /* task 2
        Шахматная доска
         */
        char [][] board = new char[8][8];
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j <board[i].length; j++){
                board[i][j] = ((i+j) % 2 == 0) ? 'W' : 'B';
            }
        }
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j ++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void getSum(){
        /*task 4
        Создайте двумерный массив целых чисел. Выведите на консоль сумму
        всех элементов массива.
         */
        int [][] numbs = {
                {1, 2, 2, 1},
                {4, 1, 1, 1},
                {-2, -6, -5}
        };
        int sum = 0;
        for (int i = 0; i < numbs.length; i++){
            for (int j = 0; j < numbs[i].length; j++){
                sum += numbs[i][j];
            }
        }
        System.out.println(Arrays.deepToString(numbs));
        System.out.println("Сумма элементов данного массива :" + sum);
    }

    public static void getDiagonal (){
        /* Task 5
        Создайте двумерный массив. Выведите на консоль диагонали массива.
         */
        int [][] numbs = {
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4}
        };
        System.out.println("Главная диагональ :");
        for (int i = 0; i < numbs.length; i++){
            for (int j = 0; j < numbs[i].length; j++){
                if ( i == j ) {
                    System.out.print(numbs[i][j] + " ");
                }
            }
        }
        System.out.println();
        System.out.println("Побочная диагональ :");
        for (int i = 0; i < numbs.length; i++){
            for (int j = 0; j < numbs[i].length; j++){
                if (i + j == numbs.length - 1){
                    System.out.print(numbs[i][j] + " ");
                }
            }
        }
        System.out.println();
    }

    public static void getMultiplicationMatrix(){
        /* Task 3
        Умножение двух матриц
        Создайте два массива целых чисел размером 3х3 (две
        матрицы). Напишите программу для умножения двух матриц.
        Первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
        Второй массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
        Ожидаемый результат: 1 2 3 1 1 1 0 0 0
         */
        // !! КОД РАБОТАЕТ ИМЕННО ДЛЯ ТАКОГО ТИПА МАТРИЦ
        // ЕСЛИ НУЖНО МОГУ ПЕРЕДЕЛАТЬ СОГЛАСНО АРИФМЕТИЧЕСКИМ ПРАВИЛАМ НА РАЗНЫЙ РАЗМЕР МАТРИЦ
        int [][] numbs1 = {
                {1,0,0,0},
                {0,1,0,0},
                {0,0,0,0}
        };
        int [][] numbs2 = {
                {1,2,3},
                {1,1,1},
                {0,0,0},
                {0,0,0}
        };
        int [][] numbs3 = new int [3][3];

        for (int i = 0; i < numbs1.length; i++){
            for (int j = 0; j < numbs2[i].length; j++){
                for (int k = 0; k < numbs1[i].length; k++){
                    numbs3[i][j] += numbs1[i][k] * numbs2[k][j];
                }
            }

        }
        System.out.println(Arrays.deepToString(numbs3));
    }
}