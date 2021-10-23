package com.pb.iskra.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Объявляем Scanner
        int sum = 0;
        int size = 10;
        int array[] = new int[size]; // Создаём массив int размером в size
        int positive = 0;
        boolean isSorted = false;
        int buf;
        System.out.println("Ведите элементы массива:");

        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        System.out.print("Вот элементы массива:");
        for (int i = 0; i < size; i++) {
            System.out.println(" " + array[i]); // Выводим на экран, полученный массив
        }
        for (int b = 0; b < size; b++) {
            sum = sum + array[b];
        } // сумма
        System.out.println("Сумма элементов в массиве:" + sum); // Выводим на экран, полученный массив
        for (int i = 0; i < size; i++) {
            if (array[i] > 0)
                positive++;

        }
        System.out.println("Позитивные элементы:" + positive);


        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] < array[i+1])

                {
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }

            }

        }
        System.out.print("Отсортированный массив:");
        for (int i = 0; i < size; i++) {
            System.out.println("" + array[i]); // Выводим на экран, отсортерованный массив
        }
    }
}




