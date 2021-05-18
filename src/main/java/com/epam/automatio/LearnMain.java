package com.epam.automatio;
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class LearnMain {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите имя");// Main Task 1
        String s1 = in.next();
        System.out.println("Привет! " + s1);
        ArrayAction action = new ArrayAction();// Main Task 2
        int[] a;
        a = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println("\nАргументы КС в обратном порядке:");
        int n = a.length;
        for (int i = 0; i < n / 2; i++) {
            int temp;
            temp = a[n - i - 1];
            a[n - i - 1] = a[i];
            a[i] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println("\n");// Main Task 3
        System.out.println("Количество случайных чисел с переходом на новую строку:");
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(rand.nextInt(10));
        }
        System.out.println("Количество случайных чисел без перехода на новую строку:");
        for (int i = 0; i < 10; i++) {
            System.out.print(rand.nextInt(10));
        }
        System.out.println("\n");// Main Task 4
        int s[] = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < s.length; i++) {
            sum += s[i];
        }
        System.out.print("Сумма равна:" + sum);
        System.out.println("\n");// Main Task 5
        System.out.println("Введите месяц:");
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        System.out.println(solve(N));
    }
        public static String solve ( int N){
            System.out.println("Данное число соответствует месяцу:");
            String[] month = {"", "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
            if (N > 0 && N < month.length) return month[N];
            return "Месяц не найден!";
        }
}
