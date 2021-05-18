package com.epam.automatio;
import java.util.Random;
import java.util.Scanner;

public class OptionalTask2 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int N = 0;
        while (N<2 || N>5) {
            System.out.println("Введите матрицу от 2x2 до 5x5, выбрав от 2 до 5:");
            N = scan.nextInt();
        }
        int M = 0;
        System.out.println("Введите диапозон чисел матрицы:");
        M = scan.nextInt();
        Random random = new Random();
        int[][] mat = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                mat[i][j] = random.nextInt(M);
            }
        }
        System.out.println("Матрица:");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        int temp = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                for (int k = 0; k < mat[i].length; k++) {
                    for (int l = 0; l < mat[k].length; l++) {
                        if (mat[k][l] > mat[i][j]){
                            temp = mat[k][l];
                            mat[k][l] = mat[i][j];
                            mat[i][j] = temp;
                        }
                    }
                }
            }
        }
        System.out.println("Упорядоченная матрица: ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
