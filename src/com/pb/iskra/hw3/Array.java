package com.pb.iskra.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Объявляем Scanner
        int sum = 0;
        int size = 3;
        int array[] = new int[size]; // Создаём массив int размером в size
        int positive = 0;
        System.out.println("Ведите элементы массива:");

        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        System.out.print("Вот элементы массива:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]); // Выводим на экран, полученный массив
        }
        for (int b = 0; b < size; b++) {
            sum = sum + array[b];
        } // сумма
        System.out.print("Сумма элементов в массиве:" + sum); // Выводим на экран, полученный массив
        for (int i = 0; i < size; i++) {
            if (array[i] > 0)
                positive++ ;

        }
            System.out.print("Позитивные элементы:" + positive);



        }
    }

