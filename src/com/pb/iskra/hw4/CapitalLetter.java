package com.pb.iskra.hw4;

import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите умную фразу:");
        String wisdom = scan.nextLine();
        System.out.println(wisdomFirst(wisdom));
    }

    public static String wisdomFirst(String wisdom) {
        StringBuilder sb = new StringBuilder(wisdom);
        for (int i = 0; i < sb.length(); i++) {
            if (i == 0 || sb.charAt(i - 1) == ' ')
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
        }
        return sb.toString();
    }

}



