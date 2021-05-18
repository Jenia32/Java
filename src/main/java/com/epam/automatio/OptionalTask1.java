package com.epam.automatio;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class OptionalTask1 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = 0;
        while (N<1 || N>20) { // Ограничил для удобства просмотра, конечно, можно задать какой угодно!), while для более точного ввода пользователем
            System.out.println("Введите количество элементов массива от 1 до 20:");
            N = scan.nextInt();
            }
        Random random = new Random();
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = random.nextInt(100);
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]){
                max=numbers[i];
            }
        }
        System.out.println("\nМаксимальное значение:" +max);
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]){
                min = numbers[i];
            }
        }
        System.out.println("\nМинимальное значение:" +min);
        double avg = 0;
        for (int i = 0; i < numbers.length; i++){
            avg += (double) numbers[i]/numbers.length;
        }
        System.out.printf("\nСреднее значение: %.2f", avg);
        int mustMin = 0;
    }
}
// С остальным заданием тяжеловато... (С java 1-й месяц знакомлюсь, синтаксис понятен (в целом), был небольшой опыт с DevC++)
