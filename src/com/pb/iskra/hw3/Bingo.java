package com.pb.iskra.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
public static void main(String[] args) {
    System.out.println("Угадайте число от 0 до 100");
    System.out.println("Для выхода из программы введите - 999.");


    int attempt = 0;
    Random random = new Random();

    int number = random.nextInt(101);      // Задуманное число.Вывел специаяльно. Чтобы легче проверить.
    int operand1;
    System.out.println("загаданное число: " + number + ":");
    Scanner scan = new Scanner(System.in);

    while (true) {
        attempt++;
        System.out.println("Попытка " + attempt + ":");
        operand1 = scan.nextInt();

        if (operand1 == 999) {
            break;

        }
        if (operand1 > number) {
            System.out.println("Загаданное число больше введенного!");}
            if (operand1 < number) {
                System.out.println("Загаданное число меньше введенного!");}

                if (operand1 == number) {
                    System.out.println("Бинго! Вы угадали с " + attempt + " попытки!");
                    break;
                }

            }

            System.out.println("Конец игры!");
        }
    }