package com.pb.iskra.hw8;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        Auth auth = new Auth();
        Scanner scan = new Scanner(System.in);

        String login;
        String password;
        String confirmPassword;

        System.out.println("Для регистрации введите логин");
        login = scan.nextLine();
        System.out.println("Для регистрации введите пароль");
        password = scan.nextLine();

        System.out.println("Для регистрации введите проверочный пароль");
        confirmPassword = scan.nextLine();


        try {
            auth.signUp(login, password, confirmPassword);

        } catch (WrongLoginException e) {
            System.out.println("Логин не может сождержать кириллицу или символы. Должен быть от 5-20 символов");
            e.printStackTrace();
        } catch (WrongPasswordException e2) {
            System.out.println("Невалидный пароль");
            e2.printStackTrace();
        }
        System.out.println();

        System.out.println("Теперь давайте войдем в кабинет");
        System.out.println("Введите логин");
        login = scan.nextLine();
        System.out.println("Введите пароль");
        password = scan.nextLine();

        try {
            auth.singIn(login, password);

        } catch (WrongLoginException e) {
            System.out.println("Неправильный логин или пароль");
            e.printStackTrace();
        } catch (WrongPasswordException e2) {
            System.out.println("Неправильный логин или пароль");
            e2.printStackTrace();
        }

    }
}
