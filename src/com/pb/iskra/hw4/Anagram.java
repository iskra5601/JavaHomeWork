package com.pb.iskra.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите фразу:");
        String comparison1 = scan.nextLine();
        System.out.println("Введите фразу для сравнение :");
        String comparison2 = scan.nextLine();

         comparison2 = comparison2.replaceAll("[,.-]", "");

        String comparison3 = comparison1.toUpperCase();
        String comparison4 = comparison2.toUpperCase();


        char[] sp = comparison3.toCharArray();
        char[] sp1 = comparison4.toCharArray();
        Arrays.sort(sp);
        Arrays.sort(sp1);

        if (anagram_checker(sp, sp1)) {
            System.out.println("Да, это анаграмма.");
        } else {
            System.out.println("Нет. Это не аннаграмма");
        }

    }

    public static boolean anagram_checker(char[] sp, char[] sp1) {
        for (int i = 0; i < sp.length; i++) {

            boolean isLetter = Character.isLetter(sp[i]);
            if (isLetter == false) continue;

            if (sp[i] != sp1[i]) {
                return false;
            }
        }
        return true;
    }


}
