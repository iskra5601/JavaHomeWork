package com.pb.iskra.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int operand1;

        System.out.println("Введите цифру");
        operand1 = scan.nextInt();

        if (operand1 >= 0 & operand1<15)  {
            System.out.print("Число в периоде от 0  до 14");}
        if (operand1 >= 15 & operand1<=35) {
            System.out.print("Число в периоде от 15  до 35");}
        if (operand1 >= 36 & operand1<=50) {
            System.out.print("Число в периоде от 36  до 50");}
        if (operand1 >= 51 & operand1<=100) {
            System.out.print("Число в периоде от 51  до 100");}
        if (operand1 < 0 )
            System.out.print("Ошибка. Число вышло за рамки заданных периодов");
        if (operand1 >= 101 ) {
            System.out.print("Ошибка. Число вышло за рамки заданных периодов");}
    }
}
