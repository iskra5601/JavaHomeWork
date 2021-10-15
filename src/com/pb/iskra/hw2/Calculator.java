package com.pb.iskra.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       int operand1;
       int operand2;
       String sing;

        System.out.println("Введите цифру");
        operand1 = scan.nextInt();

        System.out.println("Введите знак арифметической операции");
        sing = scan.next();

        System.out.println("Введите цифру");
        operand2 = scan.nextInt();


        switch (sing) {
            case "+":
                System.out.println("Сложение:" + (operand1 + operand2));
                break;
            case "-":
                System.out.println("Вычитание:" + (operand1 - operand2));
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.print("Ошибка. Не нужно делить на 0. Хотите взорвать вселенную?");}
                    else { System.out.println("Деление:" + (operand1 / operand2));
                }
                break;
            case "*":
                System.out.println("Умножение:" + (operand1 * operand2));
                break;
            default:
                System.out.println("Что то пошло не так(");

    }
    }
}
